package cn.edu.cmu.controller;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.CgDqcgjService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/cggl")
public class CgDqcgjController extends BaseController {

    @Autowired
    CgDqcgjService cgDqcgjService;
    /**
     * 分页查询
     *
     * @param cgDqcgj      查询条件
     * @param orderCol  排序字段
     * @param orderType 排序方式 asc desc
     * @param page      分页对象页号，即想查询第几页
     * @param rows      分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(CgDqcgj cgDqcgj,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1", required = false) Integer page,
                    @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        List list = cgDqcgjService.list(cgDqcgj, orderCol, orderType);//demoList();
        return super.pagingInfo(pageInfo, list);
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
        boolean success = cgDqcgjService.deleteById(id);
        return super.ajaxStatus(success);
    }

    /**
     * @param cgDqcgj
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map save(CgDqcgj cgDqcgj) throws Exception {
        logger.info("保存 短期出国申请 信息 :" + cgDqcgj);
        boolean success = cgDqcgjService.insert(cgDqcgj);
        logger.debug("保存 短期出国申请 结果 :" + success);
        return super.ajaxStatus(success, cgDqcgj);
    }

    /**
     * 跳转到查询团组列表
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/selectTzList")
    public String selectTzList(Model model) throws Exception {
        /*List tzList = cgDqcgjService.selectTz();
        model.addAttribute("tzList", tzList);*/
        return "cggl/cggl_tz_list";
    }
}