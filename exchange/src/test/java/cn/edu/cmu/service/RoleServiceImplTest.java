package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.Role;
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
public class RoleServiceImplTest extends SpringIOC {

    RoleService service;

    @Before
    public  void init(){
        service = ac.getBean(RoleService.class);
    }
    //保存
    @Test
    public void save() {
        Role role = new Role(CmuStringUtil.UUID(),"01",null,null);
        boolean success = service.insert(role);
        System.out.println("Role:"+role);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "7cd757d6508e4f31a2a2318d06a68c5a";
        Role role = service.queryById(keyId);
        System.out.println(role);
        Assert.assertTrue(role!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        Role roleParam = new Role();
        roleParam.setRoleName("01");
        List<Role> roles = service.list(roleParam);
        for (Role role : roles ) {
            System.out.println(role);
        }
        Assert.assertTrue(roles.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "7cd757d6508e4f31a2a2318d06a68c5a";
        Role role = service.queryById(keyId);
        System.out.println("更新前:"+role);
        role.setRoleName("02");
        boolean success = service.updateById(role);
        System.out.println("success:"+success);
        Role newRole = service.queryById(keyId);
        System.out.println("更新后:"+newRole);
        Assert.assertTrue(newRole.getRoleName().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        Role role = new Role(keyId,"01",null,null);
        boolean success = service.insert(role);
        System.out.println("保存成功："+success);
        Role queryRole = service.queryById(keyId);
        System.out.println("插入后查询"+queryRole);
        queryRole.setValid("0");
        queryRole.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryRole);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}