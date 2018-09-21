package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.Hzxy;
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
public class HzxyServiceImplTest extends SpringIOC {

    HzxyService service;

    @Before
    public  void init(){
        service = ac.getBean(HzxyService.class);
    }
    //保存
    @Test
    public void save() {
        Hzxy hzxy = new Hzxy(CmuStringUtil.UUID(),"01", "01",new Date(),new Date(), "01",null,null);
        boolean success = service.insert(hzxy);
        System.out.println("Hzxy:"+hzxy);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "611eece2fe8244fa8e1729e9a8d3417a";
        Hzxy hzxy = service.queryById(keyId);
        System.out.println(hzxy);
        Assert.assertTrue(hzxy!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        Hzxy hzxyParam = new Hzxy();
        hzxyParam.setXymc("01");
        List<Hzxy> hzxys = service.list(hzxyParam);
        for (Hzxy hzxy : hzxys ) {
            System.out.println(hzxy);
        }
        Assert.assertTrue(hzxys.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "611eece2fe8244fa8e1729e9a8d3417a";
        Hzxy hzxy = service.queryById(keyId);
        System.out.println("更新前:"+hzxy);
        hzxy.setXymc("02");
        boolean success = service.updateById(hzxy);
        System.out.println("success:"+success);
        Hzxy newHzxy = service.queryById(keyId);
        System.out.println("更新后:"+newHzxy);
        Assert.assertTrue(newHzxy.getXymc().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        Hzxy hzxy = new Hzxy(keyId,"01", "01",new Date(),new Date(), "01",null,null);
        boolean success = service.insert(hzxy);
        System.out.println("保存成功："+success);
        Hzxy queryHzxy = service.queryById(keyId);
        System.out.println("插入后查询"+queryHzxy);
        queryHzxy.setValid("0");
        queryHzxy.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryHzxy);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}