package cn.edu.cmu.controller;

import cn.edu.cmu.framework.cache.DMCache;
import cn.edu.cmu.framework.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ui")
public class UIController extends BaseController {



    //http://127.0.0.1/ui/dm_cache
    @RequestMapping("/dm_cache")
    @ResponseBody
    public Map dmCache( ) throws Exception {
        Map<String, List> tableCache = DMCache.getTableCache();

        //返回带【分页】 的表格JSON 信息
        return tableCache;
    }

}
