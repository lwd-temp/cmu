package cn.edu.cmu.controller;

import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/10/15 21:12
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Controller
@RequestMapping("/sys/power")
public class PowerController extends BaseController {

    @Autowired
    PowerService powerService;



    @RequestMapping("/grantUser")
    public @ResponseBody Map grantUser(String userId, String[] roleIds){

        logger.info("给用户授权用户id:["+userId+"]"+"角色id: "+ Arrays.toString(roleIds));
        System.out.println("userId : "+userId);
        if(roleIds!=null && roleIds.length >0){
            for (String roleId : roleIds) {
                System.out.println("roleId : "+roleId);
            }
        }
        boolean success = powerService.grantUser(userId , roleIds);

        return ajaxStatus(success);
    }



}
