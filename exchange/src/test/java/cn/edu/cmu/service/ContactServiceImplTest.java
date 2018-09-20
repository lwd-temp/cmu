package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.Contact;
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
public class ContactServiceImplTest extends SpringIOC {

    ContactService service;

    @Before
    public  void init(){
        service = ac.getBean(ContactService.class);
    }
    //保存
    @Test
    public void save() {
        Contact contact = new Contact(CmuStringUtil.UUID(),"01","01","01","01",
                "01","01","01","01",
                "01","01","01","01", "01",null,null);
        boolean success = service.insert(contact);
        System.out.println("contact:"+contact);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "e6a186552a5a4707a3d80d98e2d5f50b";
        Contact contact = service.queryById(keyId);
        System.out.println(contact);
        Assert.assertTrue(contact!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        Contact contactParam = new Contact();
        contactParam.setGzdw("0");
        List<Contact> contacts = service.list(contactParam);
        for (Contact contact : contacts ) {
            System.out.println(contact);
        }
        Assert.assertTrue(contacts.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "e6a186552a5a4707a3d80d98e2d5f50b";
        Contact contact = service.queryById(keyId);
        System.out.println("更新前:"+contact);
        contact.setGlxm("02");
        boolean success = service.updateById(contact);
        System.out.println("success:"+success);
        Contact newContact = service.queryById(keyId);
        System.out.println("更新后:"+newContact);
        Assert.assertTrue(newContact.getGlxm().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        Contact contact = new Contact(keyId,"01","01","01","01",
                "01","01","01","01",
                "01","01","01","01", "01",null,null);
        boolean success = service.insert(contact);
        System.out.println("保存成功："+success);
        Contact queryContact = service.queryById(keyId);
        System.out.println("插入后查询"+queryContact);
        queryContact.setValid("0");
        queryContact.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryContact);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }




}