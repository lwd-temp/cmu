package cn.edu.cmu.controller;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.*;
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
@RequestMapping("/wbjd")
public class WbjdSqController extends BaseController {

    @Autowired
    WbjdSqService wbjdSqService;

    @Autowired
    WbjdSxryService wbjdSxryService;

    @Autowired
    WbjdGjService wbjdGjService;

    @Autowired
    WbjdZjService wbjdZjService;

    /**
     * 分页查询
     *
     * @param wbjdSq      查询条件
     * @param orderCol  排序字段
     * @param orderType 排序方式 asc desc
     * @param page      分页对象页号，即想查询第几页
     * @param rows      分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(WbjdSq wbjdSq,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1", required = false) Integer page,
                    @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {

        logger.debug("condition:" + wbjdSq);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = wbjdSqService.list(wbjdSq, orderCol, orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo, list);
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
        logger.info("保存 外宾来访申请 信息 :" + vo);
        boolean success = wbjdSqService.saveOrUpdate(vo);
        logger.debug("保存 外宾来访申请 结果 :" + success);

        return super.ajaxStatus(success, vo);
    }
    /**
     * 跳转到修改页面
     *
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toEdit")
    public String toEdit(String id, Model model) throws Exception {
        WbjdSq wbjdSq = wbjdSqService.queryById(id);

        WbjdSxry queryWbjdSxry = new WbjdSxry();
        queryWbjdSxry.setLfid(id);
        List sxryList = wbjdSxryService.list(queryWbjdSxry);

        WbjdGj queryWbjdGj = new WbjdGj();
        queryWbjdGj.setLfid(id);
        List<WbjdGj> gbDomainList = wbjdGjService.list(queryWbjdGj);
        List gbCodeList = new ArrayList();
        for (WbjdGj gb : gbDomainList) {
            gbCodeList.add(gb.getLfjdgjid());
        }
        model.addAttribute("wbjdSq", wbjdSq);
        model.addAttribute("sxryList", sxryList);
        model.addAttribute("gbCodeList", gbCodeList);
        return "wblfgl/wbgl_edit";
    }
    /**
     * 根据id删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/delById")
    @ResponseBody
    public Map delById(String id) throws Exception {
        boolean success = wbjdSqService.deleteById(id);
        return super.ajaxStatus(success);
    }


    /**
     * 【审核】分页查询
     *
     * @param wbjdSq      查询条件
     * @param orderCol  排序字段
     * @param orderType 排序方式 asc desc
     * @param page      分页对象页号，即想查询第几页
     * @param rows      分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/shlist")
    @ResponseBody
    public Map shlist(WbjdSq wbjdSq,
                      String orderCol,
                      String orderType,
                      @RequestParam(defaultValue = "1", required = false) Integer page,
                      @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {
        logger.debug("condition:" + wbjdSq);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = wbjdSqService.shlist(wbjdSq, orderCol, orderType);//demoList();
        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo, list);
    }
    @RequestMapping("/show")
    public String show(String id, String type, Model model) throws Exception {
        WbjdSq wbjdSq = wbjdSqService.queryById(id);
        WbjdSxry queryWbjdSxry = new WbjdSxry();
        queryWbjdSxry.setLfid(id);
        List sxryList = wbjdSxryService.list(queryWbjdSxry);

        WbjdGj queryWbjdGj = new WbjdGj();
        queryWbjdGj.setLfid(id);
        List<WbjdGj> gbDomainList = wbjdGjService.list(queryWbjdGj);
        List gbCodeList = new ArrayList();
        for (WbjdGj gb : gbDomainList) {
            gbCodeList.add(gb.getLfjdgjid());
        }

        model.addAttribute("wbjdSq", wbjdSq);
        model.addAttribute("sxryList", sxryList);
        model.addAttribute("gbCodeList", gbCodeList);
        if ("sh".equals(type)) {
            return "wblfgl/wbgl_sp";
        }
        return "wblfgl/wbgl_show";
    }

    @ResponseBody
    @RequestMapping("/sh")
    public Map sh(WbglVO vo) throws Exception{
        WbjdSq wbjdSq = vo.getWbjdSq();
        String id = wbjdSq.getLfid();

        WbjdSq domain = wbjdSqService.queryById(id);
        domain.setStatus(wbjdSq.getStatus());
        WbjdSxry queryWbjdSxry = new WbjdSxry();
        queryWbjdSxry.setLfid(id);
        List sxryList = wbjdSxryService.list(queryWbjdSxry);

        WbjdGj queryWbjdGj = new WbjdGj();
        queryWbjdGj.setLfid(id);
        List<WbjdGj> gbDomainList = wbjdGjService.list(queryWbjdGj);

        boolean success = wbjdSqService.sh(domain,sxryList,gbDomainList);
        return super.ajaxStatus(success);
    }

    /**
     * 上传文件成功后更新协议表中 文件id
     * @param fileId
     * @param lfid
     */
    @ResponseBody
    @RequestMapping("/updateUploadId")
    public Map updateUploadId(String fileId, String lfid) throws Exception {
        WbjdZj wbjdZj = wbjdZjService.queryById(lfid);
        //wbjdZj.setUploadId(fileId);
        boolean success = wbjdZjService.updateById(wbjdZj);
        return super.ajaxStatus(success);
    }
}