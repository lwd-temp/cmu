package cn.edu.cmu.controller;

import cn.edu.cmu.domain.Jzg;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.JzgService;
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

@Controller
@RequestMapping("/sys/jzg")
public class JzgController extends BaseController {


    @Autowired
    private JzgService jzgService;
    /**
     * 分页查询
     * @param jzg 查询条件
     * @param orderCol 排序字段
     * @param orderType 排序方式 asc desc
     * @param page   分页对象页号，即想查询第几页
     * @param rows   分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(Jzg jzg,
                    @RequestParam(defaultValue = "gh",required = false )String orderCol,
                    @RequestParam(defaultValue = "asc",required = false ) String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("jzg:"+jzg);

        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = jzgService.list(jzg,orderCol,orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    /**
     * 验证工号 是否存在
     * @param gh
     * @return
     */
    @ResponseBody
    @RequestMapping("/validateGh")
    public Map validate(String gh){

        Map map = new HashMap();
        map.put("success",false);

        boolean success = jzgService.validate(gh);
        map.put("success",success);

        return map;
    }


}
