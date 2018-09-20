package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.CgSqlx;
import cn.edu.cmu.framework.utils.CmuStringUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


/**
 * Service层的测试类
 *
 * 增加删改查
 */
public class CgSqlxServiceImplTest extends SpringIOC {
    CgSqlxService service;
    @Before
    public  void init(){
        service = ac.getBean(CgSqlxService.class);
    }
    //根据条件查询
    @Test
    public void list() {
        CgSqlx cgSqlxParam = new CgSqlx();
        cgSqlxParam.setCode("1");
        List<CgSqlx> cgSqlxs = service.list(cgSqlxParam);
        for (CgSqlx cgSqlx : cgSqlxs ) {
            System.out.println(cgSqlx);
        }
        Assert.assertTrue(cgSqlxs.size()>0);
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        CgSqlx cgSqlx = new CgSqlx();
        boolean success = service.insert(cgSqlx);
        System.out.println("保存成功："+success);
        CgSqlx  queryCgSqlx = service.queryById(keyId);
        System.out.println("插入后查询"+queryCgSqlx);
        success = service.deleteById(keyId);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }

    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "7144f867cb9d41988cb95a3fa0bea9ef";
        CgSqlx cgSqlx = service.queryById(keyId);
        System.out.println(cgSqlx);
        Assert.assertTrue(cgSqlx!=null);

    }
    //保存
    @Test
    public void save() {
        CgSqlx cgSqlx = new CgSqlx("1","name",null,null);
        boolean success = service.insert(cgSqlx);
        System.out.println("cgSqlx:"+cgSqlx);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //更新
    @Test
    public void update() {
        String keyId = "7144f867cb9d41988cb95a3fa0bea9ef";
        CgSqlx cgSqlx = service.queryById(keyId);
        System.out.println("更新前:"+cgSqlx);
        cgSqlx.setCode("1");
        boolean success = service.updateById(cgSqlx);
        System.out.println("success:"+success);

        CgSqlx newcgSqlx = service.queryById(keyId);
        System.out.println("更新后:"+newcgSqlx);

        Assert.assertTrue(newcgSqlx.getCode().contains("1"));
    }
}