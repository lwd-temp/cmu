package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.CgRwzxqkfk;
import cn.edu.cmu.domain.User;
import cn.edu.cmu.framework.utils.CmuStringUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * Service层的测试类
 *
 * 增加删改查
 */
public class CgRwzxqkfkServiceImplTest extends SpringIOC {
    CgRwzxqkfkService service;
    @Before
    public  void init(){
        service = ac.getBean(CgRwzxqkfkService.class);//此处 放的 是 UserService的接口
    }
    //保存
    @Test
    public void save() {
        CgRwzxqkfk cgRwzxqkfk = new CgRwzxqkfk(CmuStringUtil.UUID(), "1","1","1","1",
                "1", BigDecimal.valueOf(1.34),BigDecimal.valueOf(1.34),BigDecimal.valueOf(1.34),BigDecimal.valueOf(1.34), new Date(),new  Date(),
                "1","1","1","1","1","1","1");
        boolean success = service.insert(cgRwzxqkfk);
        System.out.println("cgRwzxqkfk:"+cgRwzxqkfk);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "";
        CgRwzxqkfk cgRwzxqkfk = service.queryById(keyId);
        System.out.println(cgRwzxqkfk);
        Assert.assertTrue(cgRwzxqkfk!=null);

    }
    //根据条件查询
    @Test
    public void list() {
        CgRwzxqkfk cgRwzxqkfkParam = new CgRwzxqkfk();
        cgRwzxqkfkParam.setCfbt("");
        List<CgRwzxqkfk> cgRwzxqkfks = service.list(cgRwzxqkfkParam);
        for (CgRwzxqkfk cgRwzxqkfk : cgRwzxqkfks ) {
            System.out.println(cgRwzxqkfk);
        }
        Assert.assertTrue(cgRwzxqkfks.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "7144f867cb9d41988cb95a3fa0bea9ef";
        CgRwzxqkfk cgRwzxqkfk = service.queryById(keyId);
        System.out.println("更新前:"+cgRwzxqkfk);
        cgRwzxqkfk.setCfbt("2");
        boolean success = service.updateById(cgRwzxqkfk);
        System.out.println("success:"+success);
        CgRwzxqkfk newcgRwzxqkfk = service.queryById(keyId);
        System.out.println("更新后:"+newcgRwzxqkfk);
        Assert.assertTrue(newcgRwzxqkfk.getCfbt().contains("2")); //断言查询到更新后的 值 包含update
    }

    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        CgRwzxqkfk CgRwzxqkfk = new CgRwzxqkfk("1", "1", "1", "1", "1",
                "1", BigDecimal.valueOf(1.34), BigDecimal.valueOf(1.34), BigDecimal.valueOf(1.34), BigDecimal.valueOf(1.34), new Date(), new Date(),
                "1", "1", "1", "1", "1", "1", "1");
        User user = new User(keyId, "testDelete", "123456", new Date(), new Date(), null);
        boolean success = service.insert(CgRwzxqkfk);
        System.out.println("保存成功：" + success);
        CgRwzxqkfk queryCgRwzxqkfk = service.queryById(keyId);
        System.out.println("插入后查询到：" + queryCgRwzxqkfk);
        success = service.deleteById(keyId);
        System.out.println("删除成功：" + success);
        Assert.assertTrue(success);
    }
}