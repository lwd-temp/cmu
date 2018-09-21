package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.HzxyQzr;
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
public class HzxyQzrServiceImplTest extends SpringIOC {

    HzxyQzrService service;

    @Before
    public  void init(){
        service = ac.getBean(HzxyQzrService.class);
    }
    //保存
    @Test
    public void save() {
        HzxyQzr hzxyQzr = new HzxyQzr(CmuStringUtil.UUID(),"01", "611eece2fe8244fa8e1729e9a8d3417a","01",null,null);
        boolean success = service.insert(hzxyQzr);
        System.out.println("HzxyQzr:"+hzxyQzr);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "8485978a68b84453949fd18561e9a22f";
        HzxyQzr hzxyQzr = service.queryById(keyId);
        System.out.println(hzxyQzr);
        Assert.assertTrue(hzxyQzr!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        HzxyQzr hzxyQzrParam = new HzxyQzr();
        hzxyQzrParam.setXm("01");
        List<HzxyQzr> hzxyQzrs = service.list(hzxyQzrParam);
        for (HzxyQzr hzxyQzr : hzxyQzrs ) {
            System.out.println(hzxyQzr);
        }
        Assert.assertTrue(hzxyQzrs.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "8485978a68b84453949fd18561e9a22f";
        HzxyQzr hzxyQzr = service.queryById(keyId);
        System.out.println("更新前:"+hzxyQzr);
        hzxyQzr.setXm("02");
        boolean success = service.updateById(hzxyQzr);
        System.out.println("success:"+success);
        HzxyQzr newHzxyQzr = service.queryById(keyId);
        System.out.println("更新后:"+newHzxyQzr);
        Assert.assertTrue(newHzxyQzr.getXm().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        HzxyQzr hzxyQzr = new HzxyQzr(keyId,"01", "611eece2fe8244fa8e1729e9a8d3417a","01",null,null);
        boolean success = service.insert(hzxyQzr);
        System.out.println("保存成功："+success);
        HzxyQzr queryHzxyQzr = service.queryById(keyId);
        System.out.println("插入后查询"+queryHzxyQzr);
        queryHzxyQzr.setValid("0");
        queryHzxyQzr.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryHzxyQzr);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}