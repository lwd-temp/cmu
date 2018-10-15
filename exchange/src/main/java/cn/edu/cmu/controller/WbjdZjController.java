package cn.edu.cmu.controller;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.WbjdGjService;
import cn.edu.cmu.service.WbjdZjService;
import cn.edu.cmu.service.WbjdZjSxryService;
import cn.edu.cmu.vo.WbglVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
@RequestMapping("/wbzj")
public class WbjdZjController extends BaseController {

    @Autowired
    WbjdZjService wbjdZjService;

    @Autowired
    WbjdZjSxryService wbjdZjSxryService;

    @Autowired
    WbjdGjService wbjdGjService;

    /**
     * 分页查询
     * @param WbjdZj      查询条件
     * @param orderCol  排序字段
     * @param orderType 排序方式 asc desc
     * @param page      分页对象页号，即想查询第几页
     * @param rows      分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map zjlist(WbjdZj WbjdZj,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1", required = false) Integer page,
                    @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {
        logger.debug("condition:" + WbjdZj);
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        List list = wbjdZjService.list(WbjdZj, orderCol, orderType);
        return super.pagingInfo(pageInfo, list);
    }
    /**
     * 跳转到修改页面
     *
     * @param zjid
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toEdit")
    public String toEdit(String zjid, String type,Model model) throws Exception {
        WbjdZj wbjdZj = wbjdZjService.queryById(zjid);

        WbjdZjSxry queryWbjdZjSxry = new WbjdZjSxry();
        queryWbjdZjSxry.setLfid(zjid);
        List sxryList = wbjdZjSxryService.list(queryWbjdZjSxry);

        WbjdGj queryWbjdGj = new WbjdGj();
        queryWbjdGj.setLfid(zjid);
        List<WbjdGj> gbDomainList = wbjdGjService.list(queryWbjdGj);
        List gbCodeList = new ArrayList();
        for (WbjdGj gb : gbDomainList) {
            gbCodeList.add(gb.getLfjdgjid());
        }
        model.addAttribute("wbjdZj", wbjdZj);
        model.addAttribute("sxryList", sxryList);
        model.addAttribute("gbCodeList", gbCodeList);
        if ("zj".equals(type)) {
            return "wblfgl/wbgl_zj";
        }
        return "wblfgl/wbgl_zj_show";
    }
    /**
     * 根据id删除
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/delById")
    @ResponseBody
    public Map delById(String id) throws Exception {
        boolean success = wbjdZjService.deleteById(id);
        return super.ajaxStatus(success);
    }
    /**
     * 主从表，主表id为空，则新增，如果非空，则修改，从表数据先删后插
     *
     * @param vo
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map save(WbglVO vo) throws Exception {
        logger.info("保存 外宾来访申请【总结】 信息 :" + vo);
        boolean success = wbjdZjService.update(vo);
        logger.debug("保存 外宾来访申请 【总结】结果 :" + success);
        return super.ajaxStatus(success, vo);
    }

}