package cn.edu.cmu.controller.test;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

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


}
