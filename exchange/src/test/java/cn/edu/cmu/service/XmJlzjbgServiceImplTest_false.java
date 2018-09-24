package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.XmJlzjbg;
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
public class XmJlzjbgServiceImplTest_false extends SpringIOC {

    XmJlzjbgService service;

    @Before
    public  void init(){
        service = ac.getBean(XmJlzjbgService.class);
    }
    //保存
    @Test
    public void save() throws Exception{
        XmJlzjbg xmJlzjbg = new XmJlzjbg(CmuStringUtil.UUID(),"be9cb34b22b0340a376756f064","485600be9cb34b20b0340a376756f064",null,null);
        boolean success = service.insert(xmJlzjbg);
        System.out.println("XmJlzjbg:"+xmJlzjbg);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() throws Exception{
        String keyId = "68489552a2b84486b6fa33467dd561e9";
        XmJlzjbg xmJlzjbg = service.queryById(keyId);
        System.out.println(xmJlzjbg);
        Assert.assertTrue(xmJlzjbg!=null);
    }
    //根据条件查询
    @Test
    public void list() throws Exception{
        XmJlzjbg xmJlzjbgParam = new XmJlzjbg();
        xmJlzjbgParam.setSqjlId("0");
        List<XmJlzjbg> xmJlzjbgs = service.list(xmJlzjbgParam);
        for (XmJlzjbg xmJlzjbg : xmJlzjbgs ) {
            System.out.println(xmJlzjbg);
        }
        Assert.assertTrue(xmJlzjbgs.size()>0);
    }
    //更新
    @Test
    public void update()throws Exception {
        String keyId = "68489552a2b84486b6fa33467dd561e9";
        XmJlzjbg xmJlzjbg = service.queryById(keyId);
        System.out.println("更新前:"+xmJlzjbg);
        xmJlzjbg.setSqjlId("02");
        boolean success = service.updateById(xmJlzjbg);
        System.out.println("success:"+success);
        XmJlzjbg newXmJlzjbg = service.queryById(keyId);
        System.out.println("更新后:"+newXmJlzjbg);
        Assert.assertTrue(newXmJlzjbg.getSqjlId().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById()throws Exception {
        String keyId = CmuStringUtil.UUID();
        XmJlzjbg xmJlzjbg = new XmJlzjbg(keyId,"01","01",null,null);
        boolean success = service.insert(xmJlzjbg);
        System.out.println("保存成功："+success);
        XmJlzjbg queryXmJlzjbg = service.queryById(keyId);
        System.out.println("插入后查询"+queryXmJlzjbg);
        queryXmJlzjbg.setValid("0");
        queryXmJlzjbg.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryXmJlzjbg);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}