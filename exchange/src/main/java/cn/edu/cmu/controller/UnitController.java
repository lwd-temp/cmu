package cn.edu.cmu.controller;

import cn.edu.cmu.domain.UnicUnit;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.UnicUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("sys/unit")
public class UnitController extends BaseController {


    @Autowired
    private UnicUnitService unitService;

    /**d
     *
     * @param unicUnit
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public List list(UnicUnit unicUnit) throws Exception {

        logger.debug("unicUnit:"+unicUnit);

        //查询
        List list = unitService.list(unicUnit);

        //返回带【分页】 的表格JSON 信息
        return list;
    }

    

}
