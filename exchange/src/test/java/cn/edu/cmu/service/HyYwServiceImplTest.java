package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.HyYw;
import cn.edu.cmu.framework.util.CmuStringUtil;
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
public class HyYwServiceImplTest extends SpringIOC {

    HyYwService service;

    @Before
    public  void init(){
        service = ac.getBean(HyYwService.class);
    }
    //保存
    @Test
    public void save() throws Exception {
        HyYw hyYw = new HyYw(CmuStringUtil.UUID(),"01","01",new  Date(),"01", null,null);
        boolean success = service.insert(hyYw);
        System.out.println("HyYw:"+hyYw);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() throws Exception {
        String keyId = "3d7c6de3f5b246feabf7d9fe76aa624b";
        HyYw hyYw = service.queryById(keyId);
        System.out.println(hyYw);
        Assert.assertTrue(hyYw!=null);
    }
    //根据条件查询
    @Test
    public void list() throws Exception {
        HyYw hyYwParam = new HyYw();
        hyYwParam.setSx("01");
        List<HyYw> hyYws = service.list(hyYwParam);
        for (HyYw hyYw : hyYws ) {
            System.out.println(hyYw);
        }
        Assert.assertTrue(hyYws.size()>0);
    }
    //更新
    @Test
    public void update() throws Exception {
        String keyId = "3d7c6de3f5b246feabf7d9fe76aa624b";
        HyYw hyYw = service.queryById(keyId);
        System.out.println("更新前:"+hyYw);
        hyYw.setSx("02");
        boolean success = service.updateById(hyYw);
        System.out.println("success:"+success);
        HyYw newHyYw = service.queryById(keyId);
        System.out.println("更新后:"+newHyYw);
        Assert.assertTrue(newHyYw.getSx().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() throws Exception {
        String keyId = CmuStringUtil.UUID();
        HyYw hyYw = new HyYw(keyId,"01","01",new  Date(),"01", null,null);
        boolean success = service.insert(hyYw);
        System.out.println("保存成功："+success);
        HyYw queryHyYw = service.queryById(keyId);
        System.out.println("插入后查询"+queryHyYw);
        queryHyYw.setValid("0");
        queryHyYw.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryHyYw);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}