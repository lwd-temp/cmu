package cn.edu.cmu.controller;

import cn.edu.cmu.domain.HyJh;
import cn.edu.cmu.domain.HyRymd;
import cn.edu.cmu.domain.HySbrymd;
import cn.edu.cmu.domain.HyShenb;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.HyJhService;
import cn.edu.cmu.service.HySbrymdService;
import cn.edu.cmu.service.HyShenbService;
import cn.edu.cmu.vo.HysbVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hysb")
public class HyShenbController extends BaseController {

    @Autowired
    HyJhService hyJhService;

    @Autowired
    HyShenbService hyShenbService;

    @Autowired
    HySbrymdService hySbrymdService;



    /**
     * 分页查询
     * @param hyShenb 查询条件
     * @param orderCol 排序字段
     * @param orderType 排序方式 asc desc
     * @param page   分页对象页号，即想查询第几页
     * @param rows   分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(HyShenb hyShenb,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("condition:"+hyShenb);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = hyShenbService.list(hyShenb,orderCol,orderType);

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param hysbVO
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map save(HysbVO hysbVO ) throws Exception {


        boolean success = hyShenbService.save(hysbVO);


        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success,hysbVO);
    }


    /**
     * 跳转到修改页面
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/jh2sb")
    public String jh2sb(String id,Model model) throws Exception {

        HyJh hyJh = hyJhService.queryById(id);
        List<HyRymd> ryList = hyJhService.rymcList(id);

        HyShenb hysb = new HyShenb();
        BeanUtils.copyProperties(hysb,hyJh);

        HySbrymd sbRy = null;
        List<HySbrymd> sbRymds = new ArrayList<HySbrymd>(0);

        for (HyRymd hyRymd : ryList) {
            sbRy = new HySbrymd();
            BeanUtils.copyProperties(sbRy,hyRymd);//计划人员名单，copy到申报人员名单中
            sbRymds.add(sbRy);
        }

        model.addAttribute("hysb",hysb);
        model.addAttribute("sbRymds",sbRymds);

        return "gjhy/gjhy_sb_add";
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

        HyShenb hysb = hyShenbService.queryById(id);
        List<HySbrymd> sbRymds = hyShenbService.rymcList(id);

        model.addAttribute("hysb",hysb);
        model.addAttribute("sbRymds",sbRymds);

        return "gjhy/gjhy_sb_edit";
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

        boolean success = hyShenbService.deleteById(id);

        return super.ajaxStatus(success);
    }



}
