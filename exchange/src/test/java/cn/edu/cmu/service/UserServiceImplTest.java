package cn.edu.cmu.service;
import cn.edu.cmu.domain.User;
import cn.edu.cmu.framework.utils.CmuStringUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.*;

public class UserServiceImplTest {

    private String springmvcFile = "springmvc.xml";
    ClassPathXmlApplicationContext ac;
    UserService service = null;

    @Before
    public  void init(){
        ac = new ClassPathXmlApplicationContext(springmvcFile);
        service = ac.getBean(UserService.class);//此处 放的 是 UserService的接口
    }


    @Test
    //根据条件查询
    public void list() {
        //ALT+ENTER
        //陈静该的
        //张金山改动
//        User user = new User();
//        user.setUserName("admin");
        List<User> users = service.list(null);
        for (User user : users ) {
            System.out.println(user);
        }
    }

    @Test
    //根据主键查询
    public void selectByPrimaryKey() {
        User user = service.selectByPrimaryKey("1");
        System.out.println(user);
    }

    @Test
    //保存
    public void save() {
        User user = new User(CmuStringUtil.UUID(), "admin",
                "123456", new Date() ,new Date(), null);

        boolean success = service.save(user);
        System.out.println("success:"+success);
    }

    @Test
    //更新
    public void update() {
    }

    @Test
    //根据主键删除
    public void deleteById() {
    }
}