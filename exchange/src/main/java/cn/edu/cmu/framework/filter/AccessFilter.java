package cn.edu.cmu.framework.filter;

import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.util.YmlUtils;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        ignoreExt = (String) YmlUtils.getProperty("sys.access.ignore.ext");
        debug = Boolean.valueOf((Boolean)YmlUtils.getProperty("sys.debug.switch"));
        ignoreLogin = Boolean.valueOf((Boolean)YmlUtils.getProperty("sys.debug.ignoreLogin"));
    }

    private void noCache(HttpServletResponse response ){
        //禁止浏览器缓存所有动态页面
        response.setDateHeader("Expires", -1);
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");

    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        //禁用浏览器缓存
        noCache((HttpServletResponse) servletResponse);

        String contextPath = request.getContextPath();

        if(debug && ignoreLogin){
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }



        String uri = CmuStringUtil.REQUEST_URI(request);


        String ext = CmuStringUtil.REQUEST_EXTENSION_NAME(uri);
        if(ignoreExt.indexOf(ext) != -1){
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }

        if(debug){
            logger.debug("Access URI is : "+uri);
            logger.debug("Access ext is : "+ext);
        }

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }


}
