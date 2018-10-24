package cn.edu.cmu.controller;
import cn.edu.cmu.domain.CgDqcgj;
import cn.edu.cmu.domain.CgRwzxqkfk;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.CgDqcgjGgService;
import cn.edu.cmu.service.CgDqcgjService;
import cn.edu.cmu.service.CgTzjhService;
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
@RequestMapping("/cgglgg")
public class CgDqcgjGgController extends BaseController {

    @Autowired
    CgDqcgjService cgDqcgjService;

    @Autowired
    CgTzjhService cgTzjhService;

    @Autowired
    CgDqcgjGgService cgDqcgjGgService;

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
    public Map list(CgRwzxqkfk cgRwzxqkfk,
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
        return "cggl/cggl_gg_fk";
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
        boolean success = cgDqcgjGgService.updateById(cgRwzxqkfk);
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
}