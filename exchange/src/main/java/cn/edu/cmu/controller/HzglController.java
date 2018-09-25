package cn.edu.cmu.controller;
import cn.edu.cmu.domain.Contact;
import cn.edu.cmu.domain.Hz;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.HzService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/hzgl")
public class HzglController extends BaseController {

    @Autowired
    HzService hzService;


    /**
     * 分页查询
     * @param condition 查询条件
     * @param orderCol 排序字段
     * @param orderType 排序方式 asc desc
     * @param page   分页对象页号，即想查询第几页
     * @param rows   分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(String condition, //一个 查询条件
                    String orderCol,    // 排序 字段   order by   【name】
                    String orderType,// 排序 类型  asc   desc
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("condition:"+condition);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = hzService.list(condition,orderCol,orderType);
        logger.debug("list:"+list);
        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map add(Hz hz ) throws Exception {
        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(hz.getHzid())){
            String keyId = CmuStringUtil.UUID();
            hz.setHzid(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }

        logger.debug("待保存的 hz:"+hz);
        boolean success =false;
        if(isEdit){
            success = hzService.updateById(hz);
        }else{
            success = hzService.insert(hz);
        }

        logger.debug("保存 hz 结果 :"+success);

        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success,hz);
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

        Hz hz = hzService.queryById(id);

        model.addAttribute("hz",hz);

        return "hzgl/hzgl_edit";
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

        boolean success = hzService.deleteById(id);

        return super.ajaxStatus(success);
    }
}
