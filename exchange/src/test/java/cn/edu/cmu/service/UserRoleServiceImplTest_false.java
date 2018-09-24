package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.UserRole;
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
public class UserRoleServiceImplTest_false extends SpringIOC {

    UserRoleService service;

    @Before
    public  void init(){
        service = ac.getBean(UserRoleService.class);
    }
    //保存
    @Test
    public void save() throws Exception{
        UserRole userRole = new UserRole("3d331604574846cb9032569a3759fe3e","7cd757d6508e4f31a2a2318d06a68c5a",null,null);
        boolean success = service.insert(userRole);
        System.out.println("UserRole:"+userRole);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() throws Exception{
        String keyId = "e6a186552a5a4707a3d80d98e2d5f50b";
        UserRole userRole = service.queryById(keyId);
        System.out.println(userRole);
        Assert.assertTrue(userRole!=null);
    }
    //根据条件查询
    @Test
    public void list()throws Exception {
        UserRole userRoleParam = new UserRole();
        userRoleParam.setRoleId("0");
        List<UserRole> userRoles = service.list(userRoleParam);
        for (UserRole userRole : userRoles ) {
            System.out.println(userRole);
        }
        Assert.assertTrue(userRoles.size()>0);
    }
    //更新
    @Test
    public void update() throws Exception{
        String keyId = "e6a186552a5a4707a3d80d98e2d5f50b";
        UserRole userRole = service.queryById(keyId);
        System.out.println("更新前:"+userRole);
        userRole.setRoleId("02");
        boolean success = service.updateById(userRole);
        System.out.println("success:"+success);
        UserRole newUserRole = service.queryById(keyId);
        System.out.println("更新后:"+newUserRole);
        Assert.assertTrue(newUserRole.getRoleId().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById()throws Exception{
        UserRole userRole = new UserRole("d538b9ce55a04737acd4ac3bef6903ed","7cd757d6508e4f31a2a2318d06a68c5a",null,null);
        boolean success = service.insert(userRole);
        System.out.println("保存成功："+success);
        UserRole queryUserRole = service.queryById("d538b9ce55a04737acd4ac3bef6903ed");
        System.out.println("插入后查询"+queryUserRole);
        queryUserRole.setValid("0");
        queryUserRole.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryUserRole);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}