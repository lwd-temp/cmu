package cn.edu.cmu.controller.demo;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import cn.edu.cmu.domain.User;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/demo/user")
public class UserDemoController extends BaseController {

    @Autowired
    private UserService userService;

    @ResponseBody //ajax 响应body内容，而不是响应jsp/html页面
    @RequestMapping("/list")
    public Map list(@RequestParam(defaultValue = "1") Integer sEcho ,
                    @RequestParam(defaultValue = "1") Integer iDisplayStart,
                    @RequestParam(defaultValue = "10") Integer pageSize,
                    String condition){
        //构造分页信息
        Page<Object> page = PageHelper.startPage((iDisplayStart+pageSize)/pageSize, pageSize);
        //分页查询
        List list = null;//userService.list(condition);
        //返回分页信息 json
        return pagingInfo(page,list,sEcho);

    }



    @ResponseBody //ajax 响应body内容，而不是响应jsp/html页面
    @RequestMapping("/save")
    public Map save(User user){
        //构造分页信息
        boolean success = userService.save(user);

        return ajaxStatus(success);

    }

    @RequestMapping("/edit")
    public String save(Model model, String userid)
    {
        //构造分页信息
        User user = userService.selectByPrimaryKey(userid);

        model.addAttribute("user",user);

        return "user/user_edit";

    }



    @ResponseBody
    @RequestMapping("/del")
    public Map del(String userid)
    {

        //构造分页信息
        boolean success = userService.deleteById(userid);

        return ajaxStatus(success);

    }
}
