package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.HzxyGb;
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
public class HzxyGbServiceImplTest extends SpringIOC {

    HzxyGbService service;

    @Before
    public  void init(){
        service = ac.getBean(HzxyGbService.class);
    }
    //保存
    @Test
    public void save() throws Exception{
        HzxyGb hzxyGb = new HzxyGb(CmuStringUtil.UUID(),"01","01","611eece2fe8244fa8e1729e9a8d3417a",null,null);
        boolean success = service.insert(hzxyGb);
        System.out.println("HzxyGb:"+hzxyGb);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey()throws Exception {
        String keyId = "e1f1f942fa874f52ac844f3fb8c757f9";
        HzxyGb hzxyGb = service.queryById(keyId);
        System.out.println(hzxyGb);
        Assert.assertTrue(hzxyGb!=null);
    }
    //根据条件查询
    @Test
    public void list() throws Exception{
        HzxyGb hzxyGbParam = new HzxyGb();
        hzxyGbParam.setGbmc("01");
        List<HzxyGb> hzxyGbs = service.list(hzxyGbParam);
        for (HzxyGb hzxyGb : hzxyGbs ) {
            System.out.println(hzxyGb);
        }
        Assert.assertTrue(hzxyGbs.size()>0);
    }
    //更新
    @Test
    public void update() throws Exception{
        String keyId = "e1f1f942fa874f52ac844f3fb8c757f9";
        HzxyGb hzxyGb = service.queryById(keyId);
        System.out.println("更新前:"+hzxyGb);
        hzxyGb.setGbmc("02");
        boolean success = service.updateById(hzxyGb);
        System.out.println("success:"+success);
        HzxyGb newHzxyGb = service.queryById(keyId);
        System.out.println("更新后:"+newHzxyGb);
        Assert.assertTrue(newHzxyGb.getGbmc().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() throws Exception{
        String keyId = CmuStringUtil.UUID();
        HzxyGb hzxyGb = new HzxyGb(keyId,"01","01","611eece2fe8244fa8e1729e9a8d3417a",null,null);
        boolean success = service.insert(hzxyGb);
        System.out.println("保存成功："+success);
        HzxyGb queryHzxyGb = service.queryById(keyId);
        System.out.println("插入后查询"+queryHzxyGb);
        queryHzxyGb.setValid("0");
        queryHzxyGb.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryHzxyGb);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}