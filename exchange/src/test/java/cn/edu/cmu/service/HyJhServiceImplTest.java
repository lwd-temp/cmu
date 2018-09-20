package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.Contact;
import cn.edu.cmu.domain.HyJh;
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
public class HyJhServiceImplTest extends SpringIOC {

    HyJhService service;

    @Before
    public  void init(){
        service = ac.getBean(HyJhService.class);
    }
    //保存
    @Test
    public void save() {
        HyJh hyJh = new HyJh(CmuStringUtil.UUID(),"01","01","01","01","01", new Date(), "01","01",
                "01","01","01","01", null, null);
        boolean success = service.insert(hyJh);
        System.out.println("hyJh:"+hyJh);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "3e0b62966c6347d49729316edfa79fda";
        HyJh hyJh = service.queryById(keyId);
        System.out.println(hyJh);
        Assert.assertTrue(hyJh!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        HyJh hyJhParam = new HyJh();
        hyJhParam.setFzrxm("01");
        List<HyJh> hyJhs = service.list(hyJhParam);
        for (HyJh hyJh : hyJhs ) {
            System.out.println(hyJh);
        }
        Assert.assertTrue(hyJhs.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "3e0b62966c6347d49729316edfa79fda";
        HyJh hyJh = service.queryById(keyId);
        System.out.println("更新前:"+hyJh);
        hyJh.setFzrxm("02");
        boolean success = service.updateById(hyJh);
        System.out.println("success:"+success);
        HyJh newhyJh = service.queryById(keyId);
        System.out.println("更新后:"+newhyJh);
        Assert.assertTrue(newhyJh.getFzrxm().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        HyJh hyJh = new HyJh(keyId,"01","01","01","01","01", new Date(),
                "01","01","01","01","01","01", null, null);
        boolean success = service.insert(hyJh);
        System.out.println("保存成功："+success);
        HyJh queryHyJh = service.queryById(keyId);
        System.out.println("插入后查询"+queryHyJh);
        queryHyJh.setValid("0");
        queryHyJh.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryHyJh);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}