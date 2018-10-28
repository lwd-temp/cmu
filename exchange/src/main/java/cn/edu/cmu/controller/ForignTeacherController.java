package cn.edu.cmu.controller;

import cn.edu.cmu.domain.ForeignTeacher;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.ForeignTeacherService;
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

/**
 * @Author: jshand
 * @Date: 2018/10/28 13:22
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Controller
@RequestMapping("/wjjs")
public class ForignTeacherController  extends BaseController {


    @Autowired
    ForeignTeacherService foreignTeacherService;


    /**
     * 分页查询
     * @param foreignTeacher 查询条件
     * @param orderCol 排序字段
     * @param orderType 排序方式 asc desc
     * @param page   分页对象页号，即想查询第几页
     * @param rows   分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(ForeignTeacher foreignTeacher,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("foreignTeacher:"+foreignTeacher);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = foreignTeacherService.list(foreignTeacher,orderCol,orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param foreignTeacher
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map add(ForeignTeacher foreignTeacher ) throws Exception {
        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(foreignTeacher.getTid())){
            String keyId = CmuStringUtil.UUID();
            foreignTeacher.setTid(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }

        logger.debug("待保存的 foreignTeacher:"+foreignTeacher);
        boolean success =false;
        if(isEdit){
            success = foreignTeacherService.updateById(foreignTeacher);
        }else{
            success = foreignTeacherService.insert(foreignTeacher);
        }

        logger.debug("保存 foreignTeacher 结果 :"+success);

        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success,foreignTeacher);
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

        ForeignTeacher foreignTeacher = foreignTeacherService.queryById(id);

        model.addAttribute("teacher",foreignTeacher);

        return "jsgl/jsgl_edit";
    }
    /**
     * 根据id删除角色
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/delById")
    @ResponseBody
    public Map delById(String id) throws Exception {

        boolean success = foreignTeacherService.deleteById(id);

        return super.ajaxStatus(success);
    }

    /**
     * 删除多条
     * @param ids
     * @return
     * @throws Exception
     */
    @RequestMapping("/delMulti")
    @ResponseBody
    public Map delMulti(String[] ids) throws Exception {

        boolean success = foreignTeacherService.deleteMulti(ids);

        return super.ajaxStatus(success);
    }





}
