package cn.edu.cmu.controller;

import cn.edu.cmu.domain.Menu;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.util.YmlUtils;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.MenuService;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sys/menu")
public class MenuController extends BaseController {

    @Autowired
    MenuService menuService;

    @RequestMapping("/list")
    @ResponseBody
    public List list( ) throws Exception {

        //查询
        List list = menuService.list(new Menu());

        return list;
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param menu
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map add(Menu menu ) throws Exception {
        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(menu.getMenuId())){
            String keyId = CmuStringUtil.UUID();
            menu.setMenuId(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }

        logger.debug("待保存的 contact:"+menu);
        boolean success =false;
        if(isEdit){
            success = menuService.updateById(menu);
        }else{
            success = menuService.insert(menu);
        }

        logger.debug("保存 user 结果 :"+success);

        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success,menu);
    }



    /**
     * 根据id删除菜单
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/delById")
    @ResponseBody
    public Map delById(String id) throws Exception {

        boolean success = menuService.deleteById(id);

        return super.ajaxStatus(success);
    }


    /**
     * 获取用户的权限id
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/umenu_list")
    public List umenuList(HttpSession session) throws Exception {

        List list = null;


        boolean debug = Boolean.valueOf((Boolean) YmlUtils.getProperty("sys.debug.switch"));
        String uName = (String) session.getAttribute(CmuConstants.SESSION.USER_NAME);
        if(debug){
            logger.info("debug模式，加载用户【"+uName+"】的菜单权限");
            list = menuService.list(new Menu());
        }else{
            list = menuService.userMenuList(session);
            logger.info("查询用户【"+uName+"】菜单权限，菜单条数："+list.size());
        }

        return list;
    }




}
