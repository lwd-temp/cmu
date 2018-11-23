package cn.edu.cmu.controller;

import cn.edu.cmu.domain.CgTzcy;
import cn.edu.cmu.domain.CgTzjh;
import cn.edu.cmu.domain.CgjhGb;
import cn.edu.cmu.domain.UnicUnit;
import cn.edu.cmu.framework.util.ExcelUtils;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.*;
import cn.edu.cmu.vo.CgtzjhVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cgjh")
public class CgTzjhController extends BaseController {

    @Autowired
    CgTzjhService cgTzjhService;

    @Autowired
    CgTzcyService cgTzcyService;

    @Autowired
    CgjhGbService cgjhGbService;

    @Autowired
    UnicUnitService unicUnitService;


    /**
     * 分页查询
     *
     * @param tzjh      查询条件
     * @param orderCol  排序字段
     * @param orderType 排序方式 asc desc
     * @param page      分页对象页号，即想查询第几页
     * @param rows      分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(CgTzjh tzjh,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1", required = false) Integer page,
                    @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {

        logger.debug("condition:" + tzjh);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = cgTzjhService.list(tzjh, orderCol, orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo, list);
    }


    /**
     * 【审核】分页查询
     *
     * @param tzjh      查询条件
     * @param orderCol  排序字段
     * @param orderType 排序方式 asc desc
     * @param page      分页对象页号，即想查询第几页
     * @param rows      分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/shlist")
    @ResponseBody
    public Map shlist(CgTzjh tzjh,
                      String orderCol,
                      String orderType,
                      @RequestParam(defaultValue = "1", required = false) Integer page,
                      @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {

        logger.debug("condition:" + tzjh);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = cgTzjhService.shlist(tzjh, orderCol, orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo, list);
    }

    /**
     * 【审核】分页查询
     *
     * @param tzjh      查询条件
     * @param orderCol  排序字段
     * @param orderType 排序方式 asc desc
     * @param page      分页对象页号，即想查询第几页
     * @param rows      分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/gllist")
    @ResponseBody
    public Map gllist(CgTzjh tzjh,
                      String orderCol,
                      String orderType,
                      @RequestParam(defaultValue = "1", required = false) Integer page,
                      @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {

        logger.debug("condition:" + tzjh);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = cgTzjhService.gllist(tzjh, orderCol, orderType);//demoList();

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
    public Map save(CgtzjhVO vo) throws Exception {

        logger.info("保存 团组计划 信息 :" + vo);


        boolean success = cgTzjhService.saveOrUpdate(vo);

        logger.debug("保存 团组计划 结果 :" + success);

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
        CgTzjh cgTzjh = cgTzjhService.queryById(id);

        CgTzcy queryCgTzcy = new CgTzcy();
        queryCgTzcy.setTzid(id);
        List cyList = cgTzcyService.list(queryCgTzcy);

        UnicUnit unicUnit = new UnicUnit();
        unicUnit.setBelongUnit("9000000");
        List list = unicUnitService.list(unicUnit);

        CgjhGb queryCgjhGb = new CgjhGb();
        queryCgjhGb.setJhid(id);
        List<CgjhGb> gbDomainList  = cgjhGbService.list(queryCgjhGb);

        List gbCodeList = new ArrayList();
        for (CgjhGb gb : gbDomainList) {
            gbCodeList.add(gb.getGjdm());
        }
        model.addAttribute("list", list);
        model.addAttribute("cyList", cyList);
        model.addAttribute("cgTzjh", cgTzjh);
        model.addAttribute("gbCodeList", gbCodeList);

        return "cgjh/cgjh_edit";
    }

    @RequestMapping("/show")
    public String show(String id, String type, Model model) throws Exception {

        CgTzjh cgTzjh = cgTzjhService.queryById(id);

        CgTzcy queryCgTzcy = new CgTzcy();
        queryCgTzcy.setTzid(id);
        List cyList = cgTzcyService.list(queryCgTzcy);

        UnicUnit unicUnit = new UnicUnit();
        unicUnit.setBelongUnit("9000000");
        List list = unicUnitService.list(unicUnit);

        CgjhGb queryCgjhGb = new CgjhGb();
        queryCgjhGb.setJhid(id);
        List<CgjhGb> gbDomainList = cgjhGbService.list(queryCgjhGb);
        List gbCodeList = new ArrayList();
        for (CgjhGb gb : gbDomainList) {
            gbCodeList.add(gb.getGjdm());
        }
        model.addAttribute("list", list);
        model.addAttribute("cgTzjh", cgTzjh);
        model.addAttribute("cyList", cyList);
        model.addAttribute("gbCodeList", gbCodeList);
        if ("sh".equals(type)) {
            return "cgjh/cgjh_show_sh";
        }
        return "cgjh/cgjh_show";
    }


    /**
     * 根据id删除角色
     *
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/delById")
    @ResponseBody
    public Map delById(String id) throws Exception {

        boolean success = cgTzjhService.deleteById(id);

        return super.ajaxStatus(success);
    }


    @ResponseBody
    @RequestMapping("/sh")
    public Map sh(String id, String status) {
        boolean success = cgTzjhService.sh(id, status);
        return super.ajaxStatus(success);
    }


    @RequestMapping("/download")
    public void export(CgTzjh tzjh, String orderCol, String orderType, HttpServletResponse response) throws Exception {

        String fzrxmnew=new String(tzjh.getFzrxm().getBytes("ISO-8859-1"), "UTF-8");
        tzjh.setFzrxm(fzrxmnew);
        List<CgTzjh> list = cgTzjhService.gllistExp(tzjh, orderCol, orderType);//demoList();

        logger.info(String.format("导出团组信息，共计: %d 条",(CollectionUtils.isEmpty(list)?0:list.size())));

        String downFileName = "tzgl.xls";
        response.setHeader("content-disposition", "attachment;filename="+downFileName);
        ServletOutputStream out = response.getOutputStream();

        String excelTempPath = "cgjh/cgjh_gl.xls";
        ExcelUtils.expExcel(list,excelTempPath,out);
    }

    /**
     * 跳转到添加页面
     *
     * @param model
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toAdd")
    public String toAdd(Model model) throws Exception {
        UnicUnit unicUnit = new UnicUnit();
        unicUnit.setBelongUnit("9000000");
        List list = unicUnitService.list(unicUnit);
        model.addAttribute("list", list);
        return "cgjh/cgjh_add";
    }



}
