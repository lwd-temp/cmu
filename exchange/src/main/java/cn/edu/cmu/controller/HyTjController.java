package cn.edu.cmu.controller;

import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.HyTjService;
import cn.edu.cmu.vo.HytjVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/10/16 21:17
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Controller
@RequestMapping("/hytj")
public class HyTjController extends BaseController {


    @Autowired
    HyTjService hyTjService;


    @RequestMapping("/list")
    @ResponseBody
    public Map list(HytjVo hytjVo,
                    @RequestParam(defaultValue = "hybh", required = false)String orderCol,
                    @RequestParam(defaultValue = "desc", required = false)String orderType,
                    @RequestParam(defaultValue = "1", required = false) Integer page,
                    @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {

        logger.debug("HytjVo:" + hytjVo);

        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = hyTjService.selectList(hytjVo, orderCol, orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo, list);
    }


}
