package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.XmXssqjl;
import cn.edu.cmu.domain.User;
import cn.edu.cmu.framework.utils.CmuStringUtil;
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
public class XmXssqjlServiceImplTest extends SpringIOC {

    XmXssqjlService service;

    @Before
    public  void init(){
        service = ac.getBean(XmXssqjlService.class);
    }
    //保存
    @Test
    public void save() {
        XmXssqjl xmXssqjl = new XmXssqjl(CmuStringUtil.UUID(),"01", "01","01","01","01","01","01","01","01","01","01","01","01","01","01", BigDecimal.valueOf(1.34),
                "01","01","01","01", null,null);
        boolean success = service.insert(xmXssqjl);
        System.out.println("XmXssqjl:"+xmXssqjl);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "03d424b544914747969656add5b104a7";
        XmXssqjl xmXssqjl = service.queryById(keyId);
        System.out.println(xmXssqjl);
        Assert.assertTrue(xmXssqjl!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        XmXssqjl xmXssqjlParam = new XmXssqjl();
        xmXssqjlParam.setXm("0");
        List<XmXssqjl> xmXssqjls = service.list(xmXssqjlParam);
        for (XmXssqjl xmXssqjl : xmXssqjls ) {
            System.out.println(xmXssqjl);
        }
        Assert.assertTrue(xmXssqjls.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "03d424b544914747969656add5b104a7";
        XmXssqjl xmXssqjl = service.queryById(keyId);
        System.out.println("更新前:"+xmXssqjl);
        xmXssqjl.setXm("02");
        boolean success = service.updateById(xmXssqjl);
        System.out.println("success:"+success);
        XmXssqjl newXmXssqjl = service.queryById(keyId);
        System.out.println("更新后:"+newXmXssqjl);
        Assert.assertTrue(newXmXssqjl.getXm().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        XmXssqjl xmXssqjl = new XmXssqjl(keyId,"01", "01","01","01","01","01","01","01","01","01","01","01","01","01","01", BigDecimal.valueOf(1.34),
                "01","01","01","01", null,null);
        boolean success = service.insert(xmXssqjl);
        System.out.println("保存成功："+success);
        XmXssqjl queryXmXssqjl = service.queryById(keyId);
        System.out.println("插入后查询"+queryXmXssqjl);
        queryXmXssqjl.setValid("0");
        queryXmXssqjl.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryXmXssqjl);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}