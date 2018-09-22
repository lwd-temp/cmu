package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.HyRymd;
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
public class HyRymdServiceImplTest extends SpringIOC {

    HyRymdService service;

    @Before
    public  void init(){
        service = ac.getBean(HyRymdService.class);
    }
    //保存
    @Test
    public void save() {
        HyRymd hyRymd = new HyRymd(CmuStringUtil.UUID(), "01", "01", "01", "01", "3e0b62966c6347d49729316edfa79fda", "01", null,null);
        boolean success = service.insert(hyRymd);
        System.out.println("HyRymd:"+hyRymd);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "394fb5ed07bd4e08841726eb5e914bf0";
        HyRymd hyRymd = service.queryById(keyId);
        System.out.println(hyRymd);
        Assert.assertTrue(hyRymd!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        HyRymd hyRymdParam = new HyRymd();
        hyRymdParam.setXm("01");
        List<HyRymd> hyRymds = service.list(hyRymdParam);
        for (HyRymd hyRymd : hyRymds ) {
            System.out.println(hyRymd);
        }
        Assert.assertTrue(hyRymds.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "394fb5ed07bd4e08841726eb5e914bf0";
        HyRymd hyRymd = service.queryById(keyId);
        System.out.println("更新前:"+hyRymd);
        hyRymd.setXm("02");
        boolean success = service.updateById(hyRymd);
        System.out.println("success:"+success);
        HyRymd newHyRymd = service.queryById(keyId);
        System.out.println("更新后:"+newHyRymd);
        Assert.assertTrue(newHyRymd.getXm().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        HyRymd hyRymd = new HyRymd(keyId, "01", "01", "01", "01", "3e0b62966c6347d49729316edfa79fda", "01", null,null);
        boolean success = service.insert(hyRymd);
        System.out.println("保存成功："+success);
        HyRymd queryHyRymd = service.queryById(keyId);
        System.out.println("插入后查询"+queryHyRymd);
        queryHyRymd.setValid("0");
        queryHyRymd.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryHyRymd);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}