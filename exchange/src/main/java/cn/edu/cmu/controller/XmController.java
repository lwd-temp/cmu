package cn.edu.cmu.controller;

import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.util.ExcelUtils;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.XmJlzjbgService;
import cn.edu.cmu.service.XmService;
import cn.edu.cmu.service.XmXssqjlService;
import cn.edu.cmu.service.XmXssqjlServiceImpl;
import cn.edu.cmu.vo.XmVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.*;

@Controller
@RequestMapping("/xm")
public class XmController extends BaseController {

    @Autowired
    XmService xmService;

    @Autowired
    XmXssqjlService sqService;

    @Autowired
    XmJlzjbgService zjService;


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


        Xm xm = xmService.queryById(sqjl.getXmId());
        model.addAttribute("xm", xm);




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


    /**
     * 列表显示申请项目的学生
     * @param jl
     * @param orderCol
     * @param orderType
     * @param page
     * @param rows
     * @return
     * @throws Exception
     */
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


    /**
     * 列表显示申请项目的学生明细
     * @param jl
     * @param orderCol
     * @param orderType
     * @param page
     * @param rows
     * @return
     * @throws Exception
     */
    @RequestMapping("/listXmmx")
    @ResponseBody
    public Map listXmmx(XmXssqjl jl,
                          String orderCol,
                          String orderType,
                          @RequestParam(defaultValue = "1", required = false) Integer page,
                          @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {

        logger.debug("condition:" + jl);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = xmService.listXmmx(jl, orderCol, orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo, list);
    }


    /**
     * 查询个人 已申请项目(学生端)
     * @param jl
     * @param orderCol
     * @param orderType
     * @param page
     * @param rows
     * @return
     * @throws Exception
     */
    @RequestMapping("/listYsqxm")
    @ResponseBody
    public Map listYsqxm(XmXssqjl jl,
                          String orderCol,
                          String orderType,
                          @RequestParam(defaultValue = "1", required = false) Integer page,
                          @RequestParam(defaultValue = "10", required = false) Integer rows,
                         HttpSession session) throws Exception {

        logger.debug("condition:" + jl);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询

        if(jl== null){
            jl = new XmXssqjl();
        }
        String xh = (String) session.getAttribute(CmuConstants.SESSION.USER_ID);
        jl.setXh(xh);//设置当前学生学号，只查询自己一复审通过，或者自费的项目，为了总结报告

        List list = xmService.listYsqxm(jl, orderCol, orderType);//demoList();

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


        //TODO 此处需要根据 状态给学生发邮件


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


        //TODO 此处需要根据 状态给学生发邮件


        return super.ajaxStatus(success);
    }


    /**
     * 初审确认
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/comfirmCs")
    public Map confirmCs(String id) {

        boolean success = xmService.confirmCs(id);

        //TODO 此处需要根据 状态给学生发邮件

        return super.ajaxStatus(success);
    }


    /**
     * 复审确认
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/comfirmFs")
    public Map comfirmFs(String id) {

        boolean success = xmService.confirmFs(id);

        //TODO 此处需要根据 状态给学生发邮件

        return super.ajaxStatus(success);
    }


    /**
     * 申请自费
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/sqzf")
    public Map sqzf(String id) {

        boolean success = xmService.sqzf(id);

        //TODO 此处需要根据 状态给学生发邮件

        return super.ajaxStatus(success);
    }






    @RequestMapping("/xmmx")
    public  void export(String xmid, HttpServletResponse response) throws Exception {

        XmXssqjlParams params = new XmXssqjlParams();
        XmXssqjlParams.Criteria c1 = params.createCriteria();
        XmXssqjlParams.Criteria c2 = params.or();

        c1.andXmIdEqualTo(xmid);
        c1.andConfirmStatusEqualTo("02");//已复审通过

        c2.andXmIdEqualTo(xmid);
        c2.andSelfPayEqualTo("Y");//或者申请自费

        List<XmXssqjl> list = sqService.listByParam(params);

        //转换自费代码
        for (XmXssqjl jl : list) {
            if("Y".equals(jl.getSelfPay())){
                jl.setSelfPay("自费");
            }

        }

        logger.debug("查询项目学生明细"+list.size());

        String downFileName = "mx.xls";
        response.setHeader("content-disposition", "attachment;filename="+downFileName);
        ServletOutputStream out = response.getOutputStream();

        String excelTempPath = "xmgl/xmgl_mx.xls";
        ExcelUtils.expExcel(list,excelTempPath,out);


    }



    /**
     * 上传总结
     * @param fileId
     * @param sqjlId
     */
    @ResponseBody
    @RequestMapping("/zj")
    public Map uploadXy(String fileId, String sqjlId) throws Exception {


        XmJlzjbg zjBg = new XmJlzjbg();
        zjBg.setZjid(CmuStringUtil.UUID());
        zjBg.setFileId(fileId);
        zjBg.setSqjlId(sqjlId);
        boolean success = zjService.insert(zjBg);

        return super.ajaxStatus(success);
    }


    @RequestMapping("/ckzj")
    public String uploadXy(String sqjlId,Model model) throws Exception {

        XmJlzjbgParams params = new XmJlzjbgParams();
        params.createCriteria().andSqjlIdEqualTo(sqjlId);

        List zjList = zjService.listByParam(params);
        model.addAttribute("zjList",zjList );

        return "xmgl/xmgl_ckzj";
    }



}
