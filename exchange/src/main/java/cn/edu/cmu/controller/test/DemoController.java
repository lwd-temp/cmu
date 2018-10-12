package cn.edu.cmu.controller.test;

import cn.edu.cmu.framework.util.PdfUtils;
import org.apache.log4j.Logger;
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
@RequestMapping("/demo")
public class DemoController {
    Logger logger = Logger.getLogger(DemoController.class);

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
    public void downloadPdf(HttpServletResponse response) throws IOException {

        response.setHeader("content-disposition", "attachment;filename=info.pdf");
        ServletOutputStream os = response.getOutputStream();

        //变量
        Map<String, Object> variables = new HashMap<String, Object>(3);
        List<String> names = new ArrayList<String>();
        names.add("金山1212");
        names.add("银山1212");
        names.add("Leo1212");
        variables.put("names", names);

        String template = "demo/template.html";


        try {
            PdfUtils.fixedHtml2Pdf(template,variables,os);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
