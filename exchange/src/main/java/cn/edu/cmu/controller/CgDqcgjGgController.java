package cn.edu.cmu.controller;
import cn.edu.cmu.dao.UnicUnitMapperExt;
import cn.edu.cmu.domain.CgDqcgj;
import cn.edu.cmu.domain.CgRwzxqkfk;
import cn.edu.cmu.domain.UnicUnit;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.CgDqcgjGgService;
import cn.edu.cmu.service.CgDqcgjService;
import cn.edu.cmu.service.CgTzjhService;
import cn.edu.cmu.vo.CgrwzxqkfkVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired; ;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cgglgg")
public class CgDqcgjGgController extends BaseController {

    @Autowired
    CgDqcgjService cgDqcgjService;

    @Autowired
    CgTzjhService cgTzjhService;

    @Autowired
    CgDqcgjGgService cgDqcgjGgService;

    @Autowired
    UnicUnitMapperExt unicUnitService;
    /**
     * 分页查询
     *
     * @param cgRwzxqkfk      查询条件
     * @param orderCol  排序字段
     * @param orderType 排序方式 asc desc
     * @param page      分页对象页号，即想查询第几页
     * @param rows      分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(CgrwzxqkfkVo cgRwzxqkfk,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1", required = false) Integer page,
                    @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        List list = cgDqcgjGgService.list(cgRwzxqkfk, orderCol, orderType);
        return super.pagingInfo(pageInfo, list);
    }

    /**
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toEdit")
    public String toEdit(Model model,String rwfkid) throws Exception {
        CgRwzxqkfk cgRwzxqkfk = cgDqcgjGgService.queryById(rwfkid);
        model.addAttribute("cgRwzxqkfk", cgRwzxqkfk);
        return "cggl/cggl_gg_fk_edit";
    }

    /**
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/add")
    public String add(Model model,String cgid) throws Exception {
        CgDqcgj cgDqcgj = cgDqcgjService.queryById(cgid);
        CgRwzxqkfk cgRwzxqkfk = new CgRwzxqkfk();
        if(cgDqcgj!=null) {
            cgRwzxqkfk.setTzdw("中国医科大学");//出访单位
            cgRwzxqkfk.setTzzw(cgDqcgj.getZw());//团长职务
            cgRwzxqkfk.setSsejdw(cgDqcgj.getSsejdw());//二级单位
            //查询二级单位
            String ejdwid = cgDqcgj.getSsejdw();
            UnicUnit unicUnit = unicUnitService.queryMcById(ejdwid);
            String ssejdwMc = unicUnit.getName();
            cgRwzxqkfk.setTzzdw(ssejdwMc);//团长二级单位名称
            cgRwzxqkfk.setCgid(cgDqcgj.getCgid());//Cgid
            cgRwzxqkfk.setTzxm(cgDqcgj.getXm());//团长姓名
            cgRwzxqkfk.setCfgjdq(cgDqcgj.getCfgj());//出访国家
        }
        model.addAttribute("cgRwzxqkfk", cgRwzxqkfk);
        return "cggl/cggl_gg_fk_add";
    }

    /**
     * @param cgRwzxqkfk
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map save(CgRwzxqkfk cgRwzxqkfk) throws Exception {
        logger.info("保存 短期出国反馈 信息 :" + cgRwzxqkfk);
        boolean success = cgDqcgjGgService.saveorupdate(cgRwzxqkfk);
        logger.debug("保存 短期出国反馈 结果 :" + success);
        return super.ajaxStatus(success, cgRwzxqkfk);
    }


    /**
     * 上传文件成功后更新短期出国申请中 归档id
     * @param fileId
     * @param rwfkid
     */
    @ResponseBody
    @RequestMapping("/updateUploadId")
    public Map updateUploadId(String fileId, String rwfkid) throws Exception {
        CgRwzxqkfk cgRwzxqkfk = cgDqcgjGgService.queryById(rwfkid);

        CgDqcgj cgDqcgj = cgDqcgjService.queryById(cgRwzxqkfk.getCgid());
        cgDqcgj.setCfzjbgid(fileId);
        boolean success = cgDqcgjService.updateById(cgDqcgj);
        return super.ajaxStatus(success);
    }


    /**
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/fkCgsqWord")
    public String fkCgsqWord(Model model,String rwfkid) throws Exception {
        CgRwzxqkfk cgRwzxqkfk = cgDqcgjGgService.queryById(rwfkid);
        model.addAttribute("cgRwzxqkfk", cgRwzxqkfk);
        return "cggl/cggl_gg_fk_edit";
    }


}