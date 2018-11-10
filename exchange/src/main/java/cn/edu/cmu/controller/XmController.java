package cn.edu.cmu.controller;

import cn.edu.cmu.domain.BksXsjbsjxx;
import cn.edu.cmu.domain.Xm;
import cn.edu.cmu.domain.XmXssbfj;
import cn.edu.cmu.domain.XmXssqjl;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.XmService;
import cn.edu.cmu.service.XmXssqjlService;
import cn.edu.cmu.service.XmXssqjlServiceImpl;
import cn.edu.cmu.vo.XmVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/xm")
public class XmController extends BaseController {

    @Autowired
    XmService xmService;

    @Autowired
    XmXssqjlService sqService;


    /**
     * 分页查询
     *
     * @param xm        查询条件
     * @param orderCol  排序字段
     * @param orderType 排序方式 asc desc
     * @param page      分页对象页号，即想查询第几页
     * @param rows      分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(Xm xm,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1", required = false) Integer page,
                    @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {

        logger.debug("condition:" + xm);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = xmService.list(xm, orderCol, orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo, list);
    }


    @RequestMapping("/listSqXm")
    @ResponseBody
    public Map listSqXm(Xm xm,
                        String orderCol,
                        String orderType,
                        @RequestParam(defaultValue = "1", required = false) Integer page,
                        @RequestParam(defaultValue = "10", required = false) Integer rows,
                        HttpSession session) throws Exception {

        logger.debug("condition:" + xm);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = xmService.listSqXm(xm, session);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo, list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     *
     * @param xmVo
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map save(XmVo xmVo, HttpSession session) throws Exception {

        logger.debug("待保存的 xmVo:" + xmVo);


        boolean success = xmService.save(xmVo, session);


        logger.debug("保存 xm 结果 :" + success);

        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success, xmVo);
    }


    /**
     * 跳转到修改页面
     *
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toEdit")
    public String toEdit(String id, Model model) throws Exception {

        Xm xm = xmService.queryById(id);
        model.addAttribute("xm", xm);

        List zyList = initZyList();
        model.addAttribute("zyList", zyList);


        return "xmgl/xmgl_edit";
    }

    /**
     * 跳转到添加页面
     *
     * @param model
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toAdd")
    public String toAdd(Model model) throws Exception {

        List zyList = initZyList();
        model.addAttribute("zyList", zyList);

        return "xmgl/xmgl_add";
    }


    /**
     * 初始化专业列表
     *
     * @return
     */
    private List<Map> initZyList() {
        List<Map> zyList = xmService.listZy();
        for (Map<String, String> map : zyList) {
            String code = map.get("code");
            String name = map.get("name");
            map.put(code, name);
            map.remove("code");
            map.remove("name");
        }
        return zyList;
    }

    /**
     * 根据id删除角色
     *
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/delById")
    @ResponseBody
    public Map delById(String id) throws Exception {

        boolean success = xmService.deleteById(id);

        return super.ajaxStatus(success);
    }

    /**
     * 根据id删除角色
     *
     * @param ids
     * @return
     * @throws Exception
     */
    @RequestMapping("/delMulti")
    @ResponseBody
    public Map delMulti(String[] ids) throws Exception {

        //boolean success = xmService.deleteMulti(ids);

        return super.ajaxStatus(false);
    }


    @RequestMapping("/listMc")
    @ResponseBody
    public Map listMc() throws Exception {
        List list = xmService.listMcDistinct();
        return super.ajaxStatus(true, list);
    }

    @RequestMapping("/listNj")
    @ResponseBody
    public Map listNj() throws Exception {
        List list = xmService.listNjDistinct();
        return super.ajaxStatus(true, list);
    }


    /**
     * @param id    项目id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toSbAdd")
    public String toSbAdd(String id, Model model, HttpSession session) throws Exception {

        Xm xm = xmService.queryById(id);
        //model.addAttribute("xm", xm);

        //初始化页面学生信息
        XmXssqjl sqjl = xmService.initSqPage(session);

        //初始化项目信息
        sqjl.setXmId(xm.getXmId());
        sqjl.setXmzm(xm.getXmzm());
        sqjl.setXmmc(xm.getXmmc());

        model.addAttribute("sqjl", sqjl);


        List<Map> gjdqList = xmService.initGjdq(id);

        model.addAttribute("gjdqList", gjdqList);


        return "xmgl/xmgl_sq";
    }


    /**
     * @param id      申报id
     * @param model
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/toSbEdit")
    public String toSbEdit(String id, Model model, HttpSession session) throws Exception {


        //初始化页面学生信息
        XmXssqjl sqjl = sqService.queryById(id);

        model.addAttribute("sqjl", sqjl);

        List<Map> gjdqList = xmService.initGjdq(sqjl.getXmId());

        model.addAttribute("gjdqList", gjdqList);


        List<XmXssbfj> fjList = xmService.querySbFjs(id);
        model.addAttribute("fjList", fjList);


        return "xmgl/xmgl_sq";
    }

    @RequestMapping("/toSbDetail")
    public String toSbDetail(String id, Model model, HttpSession session) throws Exception {


        //初始化页面学生信息
        XmXssqjl sqjl = sqService.queryById(id);

        model.addAttribute("sqjl", sqjl);

        List<Map> gjdqList = xmService.initGjdq(sqjl.getXmId());

        model.addAttribute("gjdqList", gjdqList);


        List<XmXssbfj> fjList = xmService.querySbFjs(id);
        model.addAttribute("fjList", fjList);


        return "xmgl/xmgl_sq_detail";
    }


    @RequestMapping("/saveSq")
    @ResponseBody
    public Map saveSq(XmXssqjl jl, String[] fileid, String[] clsm) throws Exception {

        logger.debug("待保存的项目申请  :" + jl);


        boolean success = xmService.saveSq(jl, fileid, clsm);


        logger.debug("保存 项目申请 结果 :" + success);

        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success, jl);
    }


    @RequestMapping("/listXmSqxs")
    @ResponseBody
    public Map listXmSqxs(XmXssqjl jl,
                          String orderCol,
                          String orderType,
                          @RequestParam(defaultValue = "1", required = false) Integer page,
                          @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {

        logger.debug("condition:" + jl);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = xmService.listXmSqxs(jl, orderCol, orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo, list);
    }


    @RequestMapping("/toCs")
    public String toCs(String id, Model model, HttpSession session) throws Exception {

        //初始化页面学生信息
        XmXssqjl sqjl = sqService.queryById(id);

        model.addAttribute("sqjl", sqjl);

        List<Map> gjdqList = xmService.initGjdq(sqjl.getXmId());

        model.addAttribute("gjdqList", gjdqList);


        List<XmXssbfj> fjList = xmService.querySbFjs(id);
        model.addAttribute("fjList", fjList);


        //已申请项目
        List<XmXssqjl> ysqxmList = sqService.listYsqxm(sqjl);
        model.addAttribute("ysqxmList", ysqxmList);

        return "xmgl/xmgl_sh_cs";
    }


    /**
     * 跳转到 复审页面
     * @param id
     * @param model
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/toFs")
    public String toFs(String id, Model model, HttpSession session) throws Exception {




        //初始化页面学生信息
        XmXssqjl sqjl = sqService.queryById(id);
        model.addAttribute("sqjl", sqjl);


        Xm xm = xmService.queryById(sqjl.getXmId());
        model.addAttribute("xm", xm);


        List<Map> gjdqList = xmService.initGjdq(sqjl.getXmId());
        model.addAttribute("gjdqList", gjdqList);


        List<XmXssbfj> fjList = xmService.querySbFjs(id);
        model.addAttribute("fjList", fjList);


        //已申请项目
        List<XmXssqjl> ysqxmList = sqService.listYsqxm(sqjl);
        model.addAttribute("ysqxmList", ysqxmList);




        double yzzje = 0;//已资助金额
        if(ysqxmList!=null) {
            for (XmXssqjl xmXssqjl : ysqxmList) {
                if ("02".equals(xmXssqjl.getConfirmStatus())) { //复审通过,其他的不应该有资助金额
                    yzzje += xmXssqjl.getZzje().doubleValue();
                }
            }
        }
        model.addAttribute("yzzje", yzzje);






        return "xmgl/xmgl_sh_fs";
    }





    /**
     * 初审 审核
     *
     * @param id
     * @param status
     * @return
     */
    @ResponseBody
    @RequestMapping("/xsshCs")
    public Map xsshCs(String id, String status) {
        System.out.println("id:" + id);
        System.out.println("status:" + status);

        boolean success = xmService.xsshCs(id, status);


        //此处需要根据 状态给学生发邮件


        return super.ajaxStatus(success);
    }


    /***
     * 学生项目 复审
     * @param jl
     * @return
     */
    @ResponseBody
    @RequestMapping("/xsshFs")
    public Map xsshFs(XmXssqjl jl) {

        boolean success = xmService.xsshFs(jl);


        //此处需要根据 状态给学生发邮件


        return super.ajaxStatus(success);
    }



    @ResponseBody
    @RequestMapping("/comfirmCs")
    public Map confirmCs(String id) {

        boolean success = xmService.confirmCs(id);

        //此处需要根据 状态给学生发邮件

        return super.ajaxStatus(success);
    }


}
