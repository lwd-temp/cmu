package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.WbjdZj;
import cn.edu.cmu.framework.util.CmuStringUtil;
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
public class WbjdZjServiceImplTest extends SpringIOC {

    WbjdZjService service;
    @Before
    public  void init(){
        service = ac.getBean(WbjdZjService.class);
    }
    //保存
    @Test
    public void save() throws Exception{
        WbjdZj WbjdZj = new WbjdZj(CmuStringUtil.UUID(),"01","01", BigDecimal.valueOf(1.34),"01",new  Date(),new  Date(), "01",
                "01","01","01","01", "01",BigDecimal.valueOf(1.34), "01","01","01","01",new  Date(), "01","01",
                "01","01","01","01","01","01","01","01","01","01","01", null,null);
        boolean success = service.insert(WbjdZj);
        System.out.println("WbjdZj:"+WbjdZj);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey()throws Exception {
        String keyId = "e6a186552a5a4707a3d80d98e2d5f50b";
        WbjdZj WbjdZj = service.queryById(keyId);
        System.out.println(WbjdZj);
        Assert.assertTrue(WbjdZj!=null);
    }
    //根据条件查询
    @Test
    public void list() throws Exception{
        WbjdZj WbjdZjParam = new WbjdZj();
        WbjdZjParam.setDbtmc("0");
        List<WbjdZj> WbjdZjs = service.list(WbjdZjParam);
        for (WbjdZj WbjdZj : WbjdZjs ) {
            System.out.println(WbjdZj);
        }
        Assert.assertTrue(WbjdZjs.size()>0);
    }
    //更新
    @Test
    public void update()throws Exception {
        String keyId = "e6a186552a5a4707a3d80d98e2d5f50b";
        WbjdZj WbjdZj = service.queryById(keyId);
        System.out.println("更新前:"+WbjdZj);
        WbjdZj.setDbtmc("02");
        boolean success = service.updateById(WbjdZj);
        System.out.println("success:"+success);
        WbjdZj newWbjdZj = service.queryById(keyId);
        System.out.println("更新后:"+newWbjdZj);
        Assert.assertTrue(newWbjdZj.getDbtmc().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() throws Exception{
        String keyId = CmuStringUtil.UUID();
        WbjdZj WbjdZj = new WbjdZj(keyId,"01","01", BigDecimal.valueOf(1.34),"01",new  Date(),new  Date(), "01",
                "01","01","01","01", "01",BigDecimal.valueOf(1.34), "01","01","01","01",new  Date(), "01","01",
                "01","01","01","01","01","01","01","01","01","01","01", null,null);
        boolean success = service.insert(WbjdZj);
        System.out.println("保存成功："+success);
        WbjdZj queryWbjdZj = service.queryById(keyId);
        System.out.println("插入后查询"+queryWbjdZj);
        queryWbjdZj.setValid("0");
        queryWbjdZj.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryWbjdZj);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}