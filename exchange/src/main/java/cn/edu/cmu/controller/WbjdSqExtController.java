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
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
    public void downloadPdf(HttpServletResponse response,String id) throws Exception {
        response.setHeader("content-disposition", "attachment;filename=INFO.pdf");
        ServletOutputStream os = response.getOutputStream();
        //变量
        WbjdSq wbjdSq = wbjdSqService.selectSqExtPdf(id);
        logger.info(wbjdSq);

        WbjdSxry queryWbjdSxry = new WbjdSxry();
        queryWbjdSxry.setLfid(id);
        List sxryList = wbjdSxryService.list(queryWbjdSxry);
        logger.info(sxryList);

        String gb ="中国，日本"; //wbjdSqService.selectGbExtPdf(id);
        logger.info(gb);

        //还没有画样式
        String template = "demo/wbglExtTemplate.html";
        Map<String, Object> variables = new HashMap<String, Object>(3);
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
