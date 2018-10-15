package cn.edu.cmu.controller;
import cn.edu.cmu.domain.WbjdZj;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.WbjdGjService;
import cn.edu.cmu.service.WbjdZjService;
import cn.edu.cmu.vo.WbglVO;
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
@RequestMapping("/wbzj")
public class WbjdZjController extends BaseController {

    @Autowired
    WbjdZjService WbjdZjService;

    //@Autowired
    //WbjdZjSxryService wbjdZjSxryService; 需要新建总结随行人员表

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
    public Map list(WbjdZj WbjdZj,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1", required = false) Integer page,
                    @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {
        logger.debug("condition:" + WbjdZj);
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        List list = WbjdZjService.list(WbjdZj, orderCol, orderType);
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
        boolean success = WbjdZjService.deleteById(id);
        return super.ajaxStatus(success);
    }
}