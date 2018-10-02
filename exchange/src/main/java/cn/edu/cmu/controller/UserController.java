package cn.edu.cmu.controller;

import cn.edu.cmu.domain.User;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sys/user")
public class UserController extends BaseController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){

        return "hello";
    }


    /**
     * 分页查询
     * @param user 查询条件
     * @param orderCol 排序字段
     * @param orderType 排序方式 asc desc
     * @param page   分页对象页号，即想查询第几页
     * @param rows   分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(User user,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("condition:"+user);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = userService.list(user,orderCol,orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map add(User user ) throws Exception {
        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(user.getUserId())){
            String userid = CmuStringUtil.UUID();
            user.setUserId(userid);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }

        logger.debug("待保存的 user:"+user);
        boolean success =false;
        if(isEdit){
            success = userService.updateById(user);
        }else{
            success = userService.insert(user);
        }

        logger.debug("保存 user 结果 :"+success);


        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success,user);
    }

}
