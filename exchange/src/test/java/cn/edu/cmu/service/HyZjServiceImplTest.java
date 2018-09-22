package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.HyZj;
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
public class HyZjServiceImplTest extends SpringIOC {

    HyZjService service;

    @Before
    public  void init(){
        service = ac.getBean(HyZjService.class);
    }
    //保存
    @Test
    public void save() {
        HyZj hyZj = new HyZj(CmuStringUtil.UUID(),"01", "01","01","01","01","01", null,null);
        boolean success = service.insert(hyZj);
        System.out.println("HyZj:"+hyZj);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "fe4a4893ac6f46caafa4c4f60f684623";
        HyZj hyZj = service.queryById(keyId);
        System.out.println(hyZj);
        Assert.assertTrue(hyZj!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        HyZj hyZjParam = new HyZj();
        hyZjParam.setPjwh("01");
        List<HyZj> hyZjs = service.list(hyZjParam);
        for (HyZj hyZj : hyZjs ) {
            System.out.println(hyZj);
        }
        Assert.assertTrue(hyZjs.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "fe4a4893ac6f46caafa4c4f60f684623";
        HyZj hyZj = service.queryById(keyId);
        System.out.println("更新前:"+hyZj);
        hyZj.setPjwh("02");
        boolean success = service.updateById(hyZj);
        System.out.println("success:"+success);
        HyZj newHyZj = service.queryById(keyId);
        System.out.println("更新后:"+newHyZj);
        Assert.assertTrue(newHyZj.getPjwh().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        HyZj hyZj = new HyZj(keyId,"01", "01","01","01","01","01", null,null);
        boolean success = service.insert(hyZj);
        System.out.println("保存成功："+success);
        HyZj queryHyZj = service.queryById(keyId);
        System.out.println("插入后查询"+queryHyZj);
        queryHyZj.setValid("0");
        queryHyZj.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryHyZj);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}