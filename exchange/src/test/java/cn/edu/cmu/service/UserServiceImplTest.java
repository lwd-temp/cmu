package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.User;
import cn.edu.cmu.framework.utils.CmuStringUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;


/**
 * Service层的测试类
 *
 * 增加删改查
 */
public class UserServiceImplTest extends SpringIOC {

    UserService service;

    @Before
    public  void init(){
        service = ac.getBean(UserService.class);//此处 放的 是 UserService的接口
    }

    //根据条件查询
    @Test
    public void list() {
        User userParam = new User();
        userParam.setUserName("admin");
        List<User> users = service.list(userParam);
        for (User user : users ) {
            System.out.println(user);
        }
        Assert.assertTrue(users.size()>0);
    }

    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        User user = new User(keyId, "testDelete",  "123456", new Date() ,new Date(), null,null);

        boolean success = service.insert(user);
        System.out.println("保存成功："+success);

        User queryUser = service.queryById(keyId);
        System.out.println("插入后查询到的User ："+queryUser);


        success = service.deleteById(keyId);
        System.out.println("删除成功："+success);

        Assert.assertTrue(success);

    }

    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "4cab1118867d44e4aea94213d0c543b4";
        User user = service.queryById(keyId);
        System.out.println(user);
        Assert.assertTrue(user!=null);

    }
    //保存
    @Test
    public void save() {
        User user = new User(CmuStringUtil.UUID(), "admin",  "123456", new Date() ,new Date(), null,null);

        boolean success = service.insert(user);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }


    //更新
    @Test
    public void update() {
        String keyId = "4cab1118867d44e4aea94213d0c543b4";
        User user = service.queryById(keyId);
        System.out.println("更新前:"+user);

        user.setUserName(user.getUserName()+"--update");
        user.setPassword(user.getPassword()+"--update");

        boolean success = service.updateById(user);
        System.out.println("success:"+success);

        User newUser = service.queryById(keyId);
        System.out.println("更新后:"+newUser);

        Assert.assertTrue(newUser.getUserName().contains("update")); //断言查询到更新后的 值 包含update

    }
}