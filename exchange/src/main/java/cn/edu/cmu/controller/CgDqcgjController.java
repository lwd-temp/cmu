package cn.edu.cmu.controller;
import cn.edu.cmu.domain.CgDqcgj;
import cn.edu.cmu.domain.CgTzjh;
import cn.edu.cmu.domain.Jzg;
import cn.edu.cmu.domain.UnicUnit;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.CgDqcgjService;
import cn.edu.cmu.service.CgTzjhService;
import cn.edu.cmu.service.UnicUnitService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cggl")
public class CgDqcgjController extends BaseController {

    @Autowired
    CgDqcgjService cgDqcgjService;

    @Autowired
    CgTzjhService cgTzjhService;

    @Autowired
    UnicUnitService unicUnitService;

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
        List list = cgDqcgjService.list(cgDqcgj, orderCol, orderType);
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
        boolean success = cgDqcgjService.saveOrUpdate(cgDqcgj);
        logger.debug("保存 短期出国申请 结果 :" + success);
        return super.ajaxStatus(success, cgDqcgj);
    }

    /**
     * 跳转到查询团组列表
     * @return
     * @throws Exception
     */
    @RequestMapping("/selectTzList")
    public String selectTzList() throws Exception {
        return "cggl/cggl_tz_list";
    }
    /**
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/add")
    public String add(Model model, HttpSession session) throws Exception {
        Jzg jzg = (Jzg)session.getAttribute(CmuConstants.SESSION.USER_INFO_JZG);
        String ejdwid = jzg.getEjdwh();
        UnicUnit unicUnit = unicUnitService.queryMcById(ejdwid);
        String ssejdwMc = unicUnit.getName();
        model.addAttribute("ssejdwMc", ssejdwMc);
        model.addAttribute("jzg", jzg);
        return "cggl/cggl_add";
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
        CgDqcgj cgDqcgj = cgDqcgjService.queryById(id);

        //查询二级单位
        String ejdwid = cgDqcgj.getSsejdw();
        UnicUnit unicUnit = unicUnitService.queryMcById(ejdwid);
        String ssejdwMc = unicUnit.getName();
        model.addAttribute("ssejdwMc", ssejdwMc);

        //查询团组信息
        String tzid = cgDqcgj.getTzid();
        CgTzjh cgTzjh = cgTzjhService.queryById(tzid);
        String tzh = cgTzjh.getTzh();
        String tzmc = cgTzjh.getTzmc();
        logger.info(cgDqcgj);
        model.addAttribute("tzh", tzh);
        model.addAttribute("tzmc", tzmc);
        model.addAttribute("cgdqcgj", cgDqcgj);
        return "cggl/cggl_edit";
    }

    /**
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/show")
    public String show(String id, Model model) throws Exception {
        CgDqcgj cgDqcgj = cgDqcgjService.queryById(id);
        //查询二级单位
        String ejdwid = cgDqcgj.getSsejdw();
        UnicUnit unicUnit = unicUnitService.queryMcById(ejdwid);
        String ssejdwMc = unicUnit.getName();
        model.addAttribute("ssejdwMc", ssejdwMc);
        //查询团组信息
        String tzid = cgDqcgj.getTzid();
        String tzh=" ";
        String tzmc=" ";
        System.err.println(tzid);
        CgTzjh cgTzjh = cgTzjhService.queryById(tzid);
        if (cgTzjhService.queryById(tzid)!=null){

            tzh = cgTzjh.getTzh();
            tzmc = cgTzjh.getTzmc();

        }
        logger.info(cgDqcgj);
        model.addAttribute("tzh", tzh);
        model.addAttribute("tzmc", tzmc);
        model.addAttribute("cgdqcgj", cgDqcgj);
        return "cggl/cggl_show";
    }

    /**
     * @param cgid
     * @return
     * @throws Exception
     */
    @RequestMapping("/sqbsm")
    public String sqbsm(String cgid, Model model) throws Exception {
        CgDqcgj cgDqcgj = cgDqcgjService.queryById(cgid);
        model.addAttribute("cgdqcgj", cgDqcgj);
        return "cggl/cggl_list_down";
    }


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
    @RequestMapping("/shlist")
    @ResponseBody
    public Map shlist(CgDqcgj cgDqcgj,
                      String orderCol,
                      String orderType,
                      @RequestParam(defaultValue = "1", required = false) Integer page,
                      @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        List list = cgDqcgjService.shlist(cgDqcgj, orderCol, orderType);
        return super.pagingInfo(pageInfo, list);
    }

    /**
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/sh")
    public String sh(String id, Model model) throws Exception {
        CgDqcgj cgDqcgj = cgDqcgjService.queryById(id);
        //查询二级单位
        String ejdwid = cgDqcgj.getSsejdw();
        UnicUnit unicUnit = unicUnitService.queryMcById(ejdwid);
        String ssejdwMc = unicUnit.getName();
        model.addAttribute("ssejdwMc", ssejdwMc);
        //查询团组信息
        String tzid = cgDqcgj.getTzid();
        CgTzjh cgTzjh = cgTzjhService.queryById(tzid);
        String tzh = cgTzjh.getTzh();
        String tzmc = cgTzjh.getTzmc();
        logger.info(cgDqcgj);
        model.addAttribute("tzh", tzh);
        model.addAttribute("tzmc", tzmc);
        model.addAttribute("cgdqcgj", cgDqcgj);
        return "cggl/cggl_sh";
    }

    /**
     * @param cgDqcgj
     * @return
     * @throws Exception
     */
    @RequestMapping("/shSave")
    @ResponseBody
    public Map shSave(CgDqcgj cgDqcgj) throws Exception {
        logger.info("保存 短期出国申请 信息 :" + cgDqcgj);
        boolean success = cgDqcgjService.shSave(cgDqcgj);
        logger.debug("保存 短期出国申请 结果 :" + success);
        return super.ajaxStatus(success, cgDqcgj);
    }
    /**
     * 上传文件成功后更新短期出国申请中 归档id
     * @param fileId
     * @param cgid
     */
    @ResponseBody
    @RequestMapping("/updateUploadId")
    public Map updateUploadId(String fileId, String cgid) throws Exception {

        CgDqcgj cgDqcgj = cgDqcgjService.queryById(cgid);
        cgDqcgj.setGdwjid(fileId);
        boolean success = cgDqcgjService.updateById(cgDqcgj);
        return super.ajaxStatus(success);
    }
}