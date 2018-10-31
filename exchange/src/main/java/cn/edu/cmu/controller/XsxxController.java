package cn.edu.cmu.controller;

import cn.edu.cmu.domain.Contact;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.XsxxService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/10/31 22:33
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Controller
@RequestMapping("/xsxx")
public class XsxxController extends BaseController {

    @Autowired
    XsxxService xsxxService;

    @RequestMapping("/list")
    @ResponseBody
    public Map list( @RequestParam(required = true)String unitId,
                     @RequestParam(defaultValue = "",required = false) String xm,
                     @RequestParam(defaultValue = "xh",required = false) String orderCol,
                     @RequestParam(defaultValue = "desc",required = false)String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("unitId:"+unitId);
        logger.debug("xm:"+xm);
        Map param = new HashMap();
        param.put("unitId",unitId);
        param.put("xm",xm);
        param.put("order",orderCol+"  "+orderType);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = xsxxService.list(param);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }



    @RequestMapping("/selectXs")
    public String selectXs(){

        return "xs/xs_list";

    }


}
