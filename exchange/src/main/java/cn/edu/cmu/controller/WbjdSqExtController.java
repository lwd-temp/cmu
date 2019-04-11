package cn.edu.cmu.controller;

import cn.edu.cmu.domain.WbjdGj;
import cn.edu.cmu.domain.WbjdSq;
import cn.edu.cmu.domain.WbjdSxry;
import cn.edu.cmu.framework.util.PdfUtils;
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
public class WbjdSqExtController {
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


        ServletOutputStream os = response.getOutputStream();


        response.reset();
        response.setContentType("application/x-msdownload");
        response.setHeader("Content-Type", "application/octet-stream");
        String agent = request.getHeader("User-Agent").toUpperCase(); //获得浏览器信息并转换为大写
        String fileName = String.format("%s.pdf",wbjdSq.getDbtmc());
        if (agent.indexOf("MSIE") > 0 || (agent.indexOf("GECKO")>0 && agent.indexOf("RV:11")>0)) {  //IE浏览器和Edge浏览器
            fileName = URLEncoder.encode(fileName, "UTF-8");
        } else {  //其他浏览器
            fileName = new String(fileName.getBytes("UTF-8"), "iso-8859-1");
        }
        response.setHeader("content-disposition", "attachment;filename=" + fileName);


        WbjdSxry queryWbjdSxry = new WbjdSxry();
        queryWbjdSxry.setLfid(id);
        List sxryList = wbjdSxryService.list(queryWbjdSxry);
        List<WbjdGj> gblist = wbjdGjService.selectdGjExtPdf(id);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gblist.size(); i++) {
            sb.append(gblist.get(i).getLfjdgjid()).append("/");
        }
        String gb = sb.toString().substring(0,sb.toString().length()-1);
        String lfsjStart="";
        String lfsjEnd="";
        if(wbjdSq.getLfsjStart()!=null){
            lfsjStart = new SimpleDateFormat("yyyy-MM-dd").format(wbjdSq.getLfsjStart()).toString();
        }
        if(wbjdSq.getLfsjEnd()!=null){
            lfsjEnd = new SimpleDateFormat("yyyy-MM-dd").format(wbjdSq.getLfsjEnd()).toString();
        }
        //还没有画样式
        System.err.println(lfsjStart);
        System.err.println(lfsjEnd);
        String template = "wbgl/wbglExtTemplate.html";
        Map<String, Object> variables = new HashMap<String, Object>(3);
        variables.put("lfsjStart", lfsjStart);
        variables.put("lfsjEnd", lfsjEnd);
        variables.put("wbjdSq", wbjdSq);
        variables.put("sxryList", sxryList);
        variables.put("gb", gb);

        try {
            PdfUtils.fixedHtml2Pdf(template,variables,os);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
