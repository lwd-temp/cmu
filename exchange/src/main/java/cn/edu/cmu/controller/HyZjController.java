package cn.edu.cmu.controller;

import cn.edu.cmu.domain.HyZj;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.HyZjService;
import cn.edu.cmu.vo.HyShenbVo;
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
@RequestMapping("/hyzj")
public class HyZjController extends BaseController {

    @Autowired
    HyZjService hyZjService;





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
    public Map list(HyShenbVo hyShenb,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("condition:"+hyShenb);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = hyZjService.list(hyShenb,orderCol,orderType);

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }





    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param hyzj
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map add(HyZj hyzj ) throws Exception {
        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(hyzj.getZjid())){
            String keyId = CmuStringUtil.UUID();
            hyzj.setZjid(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }

        logger.debug("待保存的 hyzj:"+hyzj);
        boolean success =false;
        if(isEdit){
            success = hyZjService.updateById(hyzj);
        }else{
            success = hyZjService.insert(hyzj);
        }

        logger.debug("保存 hyzj 结果 :"+success);

        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success,hyzj);
    }



    /**
     * 跳转到修改页面
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toEdit")
    public String toEdit(String id, Model model) throws Exception {

        HyZj hyzj = hyZjService.queryById(id);

        model.addAttribute("hyzj",hyzj);

        return "gjhy/gjhy_zj_edit";
    }


}
