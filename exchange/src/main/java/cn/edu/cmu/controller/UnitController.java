package cn.edu.cmu.controller;

import cn.edu.cmu.domain.Contact;
import cn.edu.cmu.domain.UnicUnit;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.UnicUnitService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("sys/unit")
public class UnitController extends BaseController {


    @Autowired
    private UnicUnitService unitService;

    /**
     *
     * @param unicUnit
     * @return
     * @throws Exception
     */
    @RequestMapping("/first/unit")
    @ResponseBody
    public List firstUnit(UnicUnit unicUnit) throws Exception {

        logger.debug("unicUnit:"+unicUnit);

        //查询
        List list = unitService.list(unicUnit);

        //返回带【分页】 的表格JSON 信息
        return list;
    }



    @RequestMapping("/list")
    @ResponseBody
    public Map list(UnicUnit unit,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("unit:"+unit);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        //List list = unitService.list(unit,orderCol,orderType);//demoList();

        List list = unitService.queryXsyx(unit);

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    @RequestMapping("/selectUnic")
    public String selectUnic(){

        /*var index = layer.newpage({
                area: ['1000px', ($(window).height()-10)+"px"],
        title:'选择申报的会议计划',
                content:'business/gjhy/gjhy_jh_list_select.jsp',
                        });*/

        return "unic/unic_list";

    }
    

}
