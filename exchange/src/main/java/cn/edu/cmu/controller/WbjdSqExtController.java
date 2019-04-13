package cn.edu.cmu.controller;

import cn.edu.cmu.domain.WbjdGj;
import cn.edu.cmu.domain.WbjdSq;
import cn.edu.cmu.domain.WbjdSxry;
import cn.edu.cmu.framework.util.DateUtils;
import cn.edu.cmu.framework.util.PdfUtils;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.WbjdGjService;
import cn.edu.cmu.service.WbjdSqService;
import cn.edu.cmu.service.WbjdSxryService;
import cn.edu.cmu.service.WbjdZjService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: jshand
 * @Date: 2018/9/25 19:01
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Controller
@RequestMapping("/wbjdexp")
public class WbjdSqExtController extends BaseController {
    Logger logger = Logger.getLogger(WbjdSqExtController.class);
    @Autowired
    WbjdSqService wbjdSqService;
    @Autowired
    WbjdSxryService wbjdSxryService;
    @Autowired
    WbjdGjService wbjdGjService;
    @Autowired
    WbjdZjService wbjdZjService;

    @RequestMapping("/param1")
    public void param1(String name, Integer age){
        logger.info(String.format(" name is %s ",   name));
        logger.info(String.format(" age is %s ",    age));
    }
    @RequestMapping("/param2")
    public void param2(String name, Integer age, Date birthday){

        logger.info(String.format(" name2 is %s ",   name));
        logger.info(String.format(" age2 is %s ",    age));
        String bir = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(birthday).toString();
        logger.info(String.format(" birthday2 is %s ",bir));

    }

    @RequestMapping("/downloadPdf")
    public void downloadPdf(HttpServletResponse response, HttpServletRequest request, String id) throws Exception {

        //变量
        WbjdSq wbjdSq = wbjdSqService.selectSqExtPdf(id);
        String fileName = String.format("%s.pdf",wbjdSq.getDbtmc());

        super.getDownLoadFileName(request,response,fileName);


        //还没有画样式
        //String template = "wbgl/wbglExtTemplate.html";

        Map variables = new HashMap<String, String>();
        variables.put("dbtmc",wbjdSq.getDbtmc());//代表团名称
        variables.put("jdbm",wbjdSq.getJdbm());//接待部门
        variables.put("zqlxr",wbjdSq.getZqlxrxm());//主请联系人
        variables.put("zqlxr_dh",wbjdSq.getZqlxrdh());//主请人电话
        variables.put("lfrs", wbjdSq.getLfrs()!=null? String.valueOf(wbjdSq.getLfrs().longValue()) :"");//来访人数
        variables.put("nfwrq", DateUtils.formYMD(wbjdSq.getLfsjStart())+"/"+DateUtils.formYMD(wbjdSq.getLfsjEnd()));//拟访问日期
        variables.put("lfmd",wbjdSq.getLfmd());//来访目的
        variables.put("fwnr",wbjdSq.getFwcg());//访问内容
        variables.put("jfcc",wbjdSq.getJfly());//经费出处
        variables.put("yjtm",wbjdSq.getYjtm());//演讲题目

        //团长信息
        variables.put("tz_xm",wbjdSq.getTzxm());//姓名
        variables.put("tz_xb",wbjdSq.getTzxb());//性别
        variables.put("tz_gj",wbjdSq.getTzgj());//国家、地区
        variables.put("tz_csrq",DateUtils.formYMD(wbjdSq.getTzcsrq()));//出生日期
        variables.put("tz_gzdw",wbjdSq.getTzgzdw());//工作单位
        variables.put("tz_zc",wbjdSq.getTzzc());//职称
        variables.put("tz_zw",wbjdSq.getTzzw());//职务
        variables.put("zyjxsly",wbjdSq.getTzzy());//专业及学术领域


        WbjdSxry queryWbjdSxry = new WbjdSxry();
        queryWbjdSxry.setLfid(id);
        List<WbjdSxry> sxryList = wbjdSxryService.list(queryWbjdSxry);
        StringBuffer sxryxx = new StringBuffer();
        for (WbjdSxry wbjdSxry : sxryList) {
            sxryxx.append(wbjdSxry.getXm()+"  ");
            sxryxx.append(wbjdSxry.getZw()+"  ");
            sxryxx.append(wbjdSxry.getGj());
            sxryxx.append("\r\n");

        }
        variables.put("sxryxx",sxryxx.toString());//随性人员信息

        String YN_XLD = "Y".equals(wbjdSq.getYnYqxld())?"√":"×";
        String YN_BBSSGABM = "Y".equals(wbjdSq.getYnBbssgabm())?"√":"×";
        String YN_BBSSXCBM = "Y".equals(wbjdSq.getYnYqxld())?"√":"×";
        //
        //
        StringBuffer bz= new StringBuffer();
        bz.append("   【"+YN_XLD+"】是否邀请校领导\n" +
                  "   【"+YN_BBSSGABM+"】是否报备所属公安部门\n" +
                  "   【"+YN_BBSSXCBM+"】是否报备所属宣传部门");
        variables.put("bz",bz.toString());//备注

        try {
            String template = "download_template\\pdf\\wbgl\\wbglExtTemplate.pdf";

            ServletOutputStream os = response.getOutputStream();

            PdfUtils.outPdfWidthPdfTemp(template,variables,os);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
