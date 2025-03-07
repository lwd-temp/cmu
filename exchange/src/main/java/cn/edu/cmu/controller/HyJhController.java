package cn.edu.cmu.controller;

import cn.edu.cmu.domain.HyJh;
import cn.edu.cmu.domain.HyRymd;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.HyJhService;
import cn.edu.cmu.vo.HyjhVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hyjh")
public class HyJhController extends BaseController {

    @Autowired
    HyJhService hyJhService;



    /**
     * 分页查询
     * @param hyJh 查询条件
     * @param orderCol 排序字段
     * @param orderType 排序方式 asc desc
     * @param page   分页对象页号，即想查询第几页
     * @param rows   分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(HyJh hyJh,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("condition:"+hyJh);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = hyJhService.list(hyJh,orderCol,orderType);

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param hyjhVo
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map save(HyjhVO hyjhVo ) throws Exception {


        boolean success = hyJhService.save(hyjhVo);

        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success,hyjhVo);
    }

    /**
     * 跳转到修改页面
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toEdit")
    public String toEdit(String id,Model model) throws Exception {

        HyJh hyJh = hyJhService.queryById(id);
        List<HyRymd> ryList = hyJhService.rymcList(id);

        model.addAttribute("hyJh",hyJh);
        model.addAttribute("ryList",ryList);

        return "gjhy/gjhy_jh_edit";
    }
    /**
     * 根据id删除角色
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/delById")
    @ResponseBody
    public Map delById(String id) throws Exception {

        boolean success = hyJhService.deleteById(id);

        return super.ajaxStatus(success);
    }



}
