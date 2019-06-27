package cn.edu.cmu.framework.filter;

import cn.edu.cmu.dao.*;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.UserContext;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.util.WebAppContextUtils;
import cn.edu.cmu.framework.util.YmlUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jasig.cas.client.authentication.AttributePrincipal;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/9/23 14:15
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class AccessFilter implements Filter {
    private Logger logger = Logger.getLogger(AccessFilter.class);
    private static String ignoreExt;
    private boolean debug = false;
    private boolean ignoreLogin = false;
    private String ignoreLoginUserId;
    private String ignoreLoginUserType;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        ignoreExt = (String) YmlUtils.getProperty("sys.access.ignore.ext");
        debug = Boolean.valueOf((Boolean) YmlUtils.getProperty("sys.debug.switch"));
        ignoreLogin = Boolean.valueOf((Boolean) YmlUtils.getProperty("sys.ignoreLogin.switch"));
        ignoreLoginUserId = (String) YmlUtils.getProperty("sys.ignoreLogin.userId");
        ignoreLoginUserType = (String) YmlUtils.getProperty("sys.ignoreLogin.userType");
        ignoreExt = (String) YmlUtils.getProperty("sys.access.ignore.ext");
    }

    private void noCache(HttpServletResponse response) {
        //禁止浏览器缓存所有动态页面
        response.setDateHeader("Expires", -1);
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");

    }


    /**
     * 次浏览器验证，在session中是否有用户信息,如果访问到此filter，说明已经登录或者是 debug模式，需要从request获取用户信息
     *
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();

        String uri = CmuStringUtil.REQUEST_URI(request);
        String ext = CmuStringUtil.REQUEST_EXTENSION_NAME(uri);


        //logger.debug("Access ext is : " + ext);

        //禁用浏览器缓存
        noCache((HttpServletResponse) servletResponse);
        try {
            validateSessionUserInfo(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        if (ignoreExt.indexOf(ext) == -1) { //不在忽略名单的扩展名
            logger.debug("Access URI is : " + uri);
        }

        String userType = (String) session.getAttribute(CmuConstants.SESSION.USER_TYPE);
        if (ignoreExt.indexOf(ext) == -1 && !userType.equals(CmuConstants.SESSION.USER_TYPE_JZG)) {
            logger.debug("非教职工登录，登录画面特殊处理...");
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    /**
     * 验证是否存在session中的用户新
     *
     * @param request
     * @param response
     */
    private void validateSessionUserInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();

        String sessionUserId = (String) session.getAttribute(CmuConstants.SESSION.USER_ID);

        //第一次访问系统，session中没有userid的内容
        if (StringUtils.isEmpty(sessionUserId)) {

            String loginUserType = null;
            //根据类型查询教职工、本科生、研究生信息
            if (ignoreLogin) {//本地测试，忽略登录过程
                sessionUserId = ignoreLoginUserId;
                loginUserType = ignoreLoginUserType;
            } else {
                AttributePrincipal principal = (AttributePrincipal) request.getUserPrincipal();
                if (principal == null) {
                    throw new Exception("请管理员配置统一登录信息");
                }
                Map<String, Object> attributes = principal.getAttributes();

                sessionUserId = principal.getName();
                loginUserType = String.valueOf(attributes.get("ID_TYPE"));
            }

            //根据用户id获取 用户主体 信息

            session.setAttribute(CmuConstants.SESSION.USER_TYPE, loginUserType);
            session.setAttribute(CmuConstants.SESSION.USER_ID, sessionUserId);

            queryUserBody(loginUserType, sessionUserId, session);
        }

        //将信息放到线程池中
        UserContext.setUserId(sessionUserId);

    }

    //根据用户类型 及id，查询用户信息
    private void queryUserBody(String loginUserType, String sessionUserId, HttpSession session) throws Exception {
        //教职工
        if (loginUserType.equals(CmuConstants.SESSION.USER_TYPE_JZG)) {
            logger.debug("获取教职工登录信息");
            queryJzgBody(loginUserType, sessionUserId, session);
        }
        //本科生
        if (loginUserType.equals(CmuConstants.SESSION.USER_TYPE_BKS)) {
            logger.debug("获取本科生登录信息");
            queryBksBody(loginUserType, sessionUserId, session);
        }


        //研究生
        if (loginUserType.equals(CmuConstants.SESSION.USER_TYPE_YJS)) {
            logger.debug("获取研究生登录信息");
            queryYjsBody(loginUserType, sessionUserId, session);
        }
    }

    /**
     * 查询研究生
     *
     * @param loginUserType
     * @param sessionUserId
     * @param session
     * @throws Exception
     */
    private void queryYjsBody(String loginUserType, String sessionUserId, HttpSession session) throws Exception {
        YjsXsjbsjxxMapper yjsDao = WebAppContextUtils.getBean(YjsXsjbsjxxMapper.class);
        YjsXsjbsjxxParams params = new YjsXsjbsjxxParams();
        params.createCriteria().andXhEqualTo(sessionUserId);

        List list = yjsDao.selectByExample(params);
        if (CollectionUtils.isEmpty(list)) {
            throw new Exception("根据学号[" + sessionUserId + "]，未查询到研究生信息..");
        }
        //学生
        YjsXsjbsjxx yjs = (YjsXsjbsjxx) list.get(0);

        //学籍
        YjsXjjbsjxxMapper yjsXjDao = WebAppContextUtils.getBean(YjsXjjbsjxxMapper.class);
        YjsXjjbsjxxParams xjjbsjxxParams = new YjsXjjbsjxxParams();
        xjjbsjxxParams.createCriteria().andXhEqualTo(sessionUserId);

        List xjList = yjsXjDao.selectByExample(xjjbsjxxParams);

        YjsXjjbsjxx xjDto = (YjsXjjbsjxx) xjList.get(0);


        session.setAttribute(CmuConstants.SESSION.USER_INFO_YJS, yjs);
        session.setAttribute(CmuConstants.SESSION.USER_NAME, yjs.getXm());
        session.setAttribute(CmuConstants.SESSION.USER_DEPT, xjDto.getYxsh());
    }

    /**
     * 查询本科生
     *
     * @param loginUserType
     * @param sessionUserId
     * @param session
     * @throws Exception
     */
    private void queryBksBody(String loginUserType, String sessionUserId, HttpSession session) throws Exception {
        BksXsjbsjxxMapper bksDao = WebAppContextUtils.getBean(BksXsjbsjxxMapper.class);
        BksXsjbsjxxParams params = new BksXsjbsjxxParams();
        params.createCriteria().andXhEqualTo(sessionUserId);

        List list = bksDao.selectByExample(params);
        if (CollectionUtils.isEmpty(list)) {
            throw new Exception("根据学号[" + sessionUserId + "]，未查询到本科生信息..");
        }
        BksXsjbsjxx bks = (BksXsjbsjxx) list.get(0);


        //学籍
        BksXjjbsjxxMapper bksXjDao = WebAppContextUtils.getBean(BksXjjbsjxxMapper.class);
        BksXjjbsjxxParams xjjbsjxxParams = new BksXjjbsjxxParams();
        xjjbsjxxParams.createCriteria().andXhEqualTo(sessionUserId);

        List xjList = bksXjDao.selectByExample(xjjbsjxxParams);

        BksXjjbsjxx xjDto = (BksXjjbsjxx) xjList.get(0);


        session.setAttribute(CmuConstants.SESSION.USER_INFO_BKS, bks);
        session.setAttribute(CmuConstants.SESSION.USER_NAME, bks.getXm());
        session.setAttribute(CmuConstants.SESSION.USER_DEPT, xjDto.getYxsh());

    }


    /**
     * 查询教职工
     *
     * @param loginUserType
     * @param sessionUserId
     * @param session
     * @throws Exception
     */
    private void queryJzgBody(String loginUserType, String sessionUserId, HttpSession session) throws Exception {
        JzgMapper jzgDao = WebAppContextUtils.getBean(JzgMapper.class);

        JzgParams params = new JzgParams();
        params.createCriteria().andGhEqualTo(sessionUserId);

        List list = jzgDao.selectByExample(params);
        if (CollectionUtils.isEmpty(list)) {
            throw new Exception("根据工号，未查询到教职工信息..");
        }
        Jzg jzg = (Jzg) list.get(0);
        session.setAttribute(CmuConstants.SESSION.USER_INFO_JZG, jzg);
        session.setAttribute(CmuConstants.SESSION.USER_NAME, jzg.getXm());
        session.setAttribute(CmuConstants.SESSION.USER_DEPT, jzg.getDwh());
    }

    @Override
    public void destroy() {

    }


    public void debugUser(HttpServletRequest request) {
        AttributePrincipal principal = (AttributePrincipal) request.getUserPrincipal();
        if (principal == null) {

        }
        String userID = principal.getName();

    }


}
