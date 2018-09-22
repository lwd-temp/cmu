package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.SjjlZt;
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
public class SjjlZtServiceImplTest extends SpringIOC {

    SjjlZtService service;

    @Before
    public  void init(){
        service = ac.getBean(SjjlZtService.class);
    }
    //保存
    @Test
    public void save() {
        SjjlZt sjjlZt = new SjjlZt(CmuStringUtil.UUID(),"01", new Date(), "01","01","01", null,null);
        boolean success = service.insert(sjjlZt);
        System.out.println("SjjlZt:"+sjjlZt);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "bfc64cee16ef4935a7f34a8b9f0ed2eb";
        SjjlZt sjjlZt = service.queryById(keyId);
        System.out.println(sjjlZt);
        Assert.assertTrue(sjjlZt!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        SjjlZt sjjlZtParam = new SjjlZt();
        sjjlZtParam.setGjnr("0");
        List<SjjlZt> sjjlZts = service.list(sjjlZtParam);
        for (SjjlZt sjjlZt : sjjlZts ) {
            System.out.println(sjjlZt);
        }
        Assert.assertTrue(sjjlZts.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "bfc64cee16ef4935a7f34a8b9f0ed2eb";
        SjjlZt sjjlZt = service.queryById(keyId);
        System.out.println("更新前:"+sjjlZt);
        sjjlZt.setGjnr("02");
        boolean success = service.updateById(sjjlZt);
        System.out.println("success:"+success);
        SjjlZt newSjjlZt = service.queryById(keyId);
        System.out.println("更新后:"+newSjjlZt);
        Assert.assertTrue(newSjjlZt.getGjnr().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        SjjlZt sjjlZt = new SjjlZt(keyId,"01", new Date(), "01","01","01", null,null);
        boolean success = service.insert(sjjlZt);
        System.out.println("保存成功："+success);
        SjjlZt querySjjlZt = service.queryById(keyId);
        System.out.println("插入后查询"+querySjjlZt);
        querySjjlZt.setValid("0");
        querySjjlZt.setCreateTime(new Date());
        success = service.updateByIdAllColumn(querySjjlZt);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}