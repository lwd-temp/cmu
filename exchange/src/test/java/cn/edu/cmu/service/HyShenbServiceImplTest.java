package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.HyShenb;
import cn.edu.cmu.framework.util.CmuStringUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


/**
 * Service层的测试类
 *
 * 增加删改查
 */
public class HyShenbServiceImplTest extends SpringIOC {

    HyShenbService service;

    @Before
    public  void init(){
        service = ac.getBean(HyShenbService.class);
    }
    //保存
    @Test
    public void save()throws Exception {
//        HyShenb hyShenb = new HyShenb(CmuStringUtil.UUID(), "3e0b62966c6347d49729316edfa79fda","01","01","01","hybh",new  Date(),"01","01","01","01","01","01","01","01","01", null,null);
//        boolean success = service.insert(hyShenb);
//        System.out.println("HyShenb:"+hyShenb);
//        System.out.println("success:"+success);
//        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() throws Exception{
        String keyId = "db7922e1e7fc4da79e6158fbf8025640";
        HyShenb hyShenb = service.queryById(keyId);
        System.out.println(hyShenb);
        Assert.assertTrue(hyShenb!=null);
    }
    //根据条件查询
    @Test
    public void list() throws Exception{
        HyShenb hyShenbParam = new HyShenb();
        hyShenbParam.setZbdw("01");
        List<HyShenb> hyShenbs = service.list(hyShenbParam);
        for (HyShenb hyShenb : hyShenbs ) {
            System.out.println(hyShenb);
        }
        Assert.assertTrue(hyShenbs.size()>0);
    }
    //更新
    @Test
    public void update() throws Exception{
        String keyId = "db7922e1e7fc4da79e6158fbf8025640";
        HyShenb hyShenb = service.queryById(keyId);
        System.out.println("更新前:"+hyShenb);
        hyShenb.setZbdw("02");
        boolean success = service.updateById(hyShenb);
        System.out.println("success:"+success);
        HyShenb newHyShenb = service.queryById(keyId);
        System.out.println("更新后:"+newHyShenb);
        Assert.assertTrue(newHyShenb.getZbdw().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById()throws Exception {
        String keyId = CmuStringUtil.UUID();
//        HyShenb hyShenb = new HyShenb(keyId, "3e0b62966c6347d49729316edfa79fda","01","01","01","hybh",new  Date(),"01","01","01","01","01","01","01","01","01", null,null);
//        boolean success = service.insert(hyShenb);
//        System.out.println("保存成功："+success);
//        HyShenb queryHyShenb = service.queryById(keyId);
//        System.out.println("插入后查询"+queryHyShenb);
//        queryHyShenb.setValid("0");
//        queryHyShenb.setCreateTime(new Date());
//        success = service.updateByIdAllColumn(queryHyShenb);
//        System.out.println("删除成功："+success);
//        Assert.assertTrue(success);
    }
}