package cn.edu.cmu.controller;

import cn.edu.cmu.service.ZyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/24 0:14
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Controller
@RequestMapping("/zy")
public class ZyController {


    @Autowired
    ZyService zyService;

    @RequestMapping("/listZyMc")
    @ResponseBody
    public List<String> listZyMc(){


        return zyService.selectZyList();
    }

}
