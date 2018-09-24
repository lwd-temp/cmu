package cn.edu.cmu.controller;

import cn.edu.cmu.domain.Role;
import cn.edu.cmu.domain.RoleMenu;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.RoleService;
import com.alibaba.fastjson.JSON;
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
@RequestMapping("/sys/role")
public class RoleController extends BaseController {

    @Autowired
    RoleService roleService;


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
    public Map list(String condition,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("condition:"+condition);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = roleService.list(condition,orderCol,orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param role
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map add(Role role ) throws Exception {
        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(role.getRoleId())){
            String keyId = CmuStringUtil.UUID();
            role.setRoleId(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }

        logger.debug("待保存的 role:"+role);
        boolean success =false;
        if(isEdit){
            success = roleService.updateById(role);
        }else{
            success = roleService.insert(role);
        }

        logger.debug("保存 user 结果 :"+success);

        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success,role);
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

        Role role = roleService.queryById(id);

        model.addAttribute("role",role);

        return "power/role/role_edit";
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

        boolean success = roleService.deleteById(id);

        return super.ajaxStatus(success);
    }


    /**
     * 跳转到授权页面
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toGrant")
    public String toGrant(String id,Model model) throws Exception {

        List<RoleMenu> rms = roleService.getRoleMenuIds(id);
        String roleMenuArray = JSON.toJSONString(rms);
        model.addAttribute("roleMenuArray",roleMenuArray);
        model.addAttribute("roleId",id);

        return "power/role/role_menu_grant";
    }


    /**
     * 给角色授权菜单
     * @param ids
     * @return
     * @throws Exception
     */
    @RequestMapping("/grantMenu")
    @ResponseBody
    public Map grantMenu(String roleId,String[] ids) throws Exception {

       boolean success = roleService.grantMenuUpdate(roleId,ids);

       return super.ajaxStatus(success);
    }

}
