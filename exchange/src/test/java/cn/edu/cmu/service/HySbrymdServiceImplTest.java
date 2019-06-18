package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.HySbrymd;
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
public class HySbrymdServiceImplTest extends SpringIOC {

    HySbrymdService service;

    @Before
    public  void init(){
        service = ac.getBean(HySbrymdService.class);
    }
    //保存
    @Test
    public void save()throws Exception {
        HySbrymd hySbrymd = new HySbrymd(CmuStringUtil.UUID(), "01","01","01","01","01","01","01","01","01",null,null);
        boolean success = service.insert(hySbrymd);
        System.out.println("HySbrymd:"+hySbrymd);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey()throws Exception {
        String keyId = "88459d2616e241e99c3a07188d2ab597";
        HySbrymd hySbrymd = service.queryById(keyId);
        System.out.println(hySbrymd);
        Assert.assertTrue(hySbrymd!=null);
    }
    //根据条件查询
    @Test
    public void list() throws Exception{
        HySbrymd hySbrymdParam = new HySbrymd();
        hySbrymdParam.setXm("01");
        List<HySbrymd> hySbrymds = service.list(hySbrymdParam);
        for (HySbrymd hySbrymd : hySbrymds ) {
            System.out.println(hySbrymd);
        }
        Assert.assertTrue(hySbrymds.size()>0);
    }
    //更新
    @Test
    public void update() throws Exception{
        String keyId = "88459d2616e241e99c3a07188d2ab597";
        HySbrymd hySbrymd = service.queryById(keyId);
        System.out.println("更新前:"+hySbrymd);
        hySbrymd.setXm("02");
        boolean success = service.updateById(hySbrymd);
        System.out.println("success:"+success);
        HySbrymd newHySbrymd = service.queryById(keyId);
        System.out.println("更新后:"+newHySbrymd);
        Assert.assertTrue(newHySbrymd.getXm().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() throws Exception{
        String keyId = CmuStringUtil.UUID();
        HySbrymd hySbrymd = new HySbrymd(keyId,"01","01","011","01","01","01","011","01","01",null,null);
        boolean success = service.insert(hySbrymd);
        System.out.println("保存成功："+success);
        HySbrymd queryHySbrymd = service.queryById(keyId);
        System.out.println("插入后查询"+queryHySbrymd);
        queryHySbrymd.setValid("0");
        queryHySbrymd.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryHySbrymd);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}