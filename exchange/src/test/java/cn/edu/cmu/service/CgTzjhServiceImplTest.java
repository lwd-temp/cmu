package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.CgTzjh;
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
public class CgTzjhServiceImplTest extends SpringIOC {
    CgTzjhService service;
    @Before
    public  void init(){
        service = ac.getBean(CgTzjhService.class);
    }
    //保存
    @Test
    public void save() throws Exception {
        CgTzjh CgTzjh = new CgTzjh(
                CmuStringUtil.UUID(),"01", "01","01","01","01","01","01","01","01",
                "01","01","01","01","01","01","01","01","01",
                BigDecimal.valueOf(1.34), "01",BigDecimal.valueOf(1.34),BigDecimal.valueOf(1.34) ,BigDecimal.valueOf(1.34) ,BigDecimal.valueOf(1.34) ,
                BigDecimal.valueOf(1.34) , "01",new Date(),"01", null, null);
        boolean success = service.insert(CgTzjh);
        System.out.println("CgTzjh:"+CgTzjh);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() throws Exception {
        String keyId = "5b47eb139d874a5c9dc80c909fdf4ee4";
        CgTzjh CgTzjh = service.queryById(keyId);
        System.out.println(CgTzjh);
        Assert.assertTrue(CgTzjh!=null);
    }
    //根据条件查询
    @Test
    public void list() throws Exception {
        //ALT+ENTER  前台页面接到的查询条件
        CgTzjh CgTzjhParam = new CgTzjh();
        CgTzjhParam.setCfdw("01");
        List<CgTzjh> CgTzjhs = service.list(CgTzjhParam);
        for (CgTzjh CgTzjh : CgTzjhs ) {
            System.out.println(CgTzjh);
        }
        Assert.assertTrue(CgTzjhs.size()>0);
    }
    //更新
    @Test
    public void update() throws Exception {
        String keyId = "5b47eb139d874a5c9dc80c909fdf4ee4";
        CgTzjh CgTzjh = service.queryById(keyId);
        System.out.println("更新前:"+CgTzjh);
        CgTzjh.setCfdw("02");
        boolean success = service.updateById(CgTzjh);
        System.out.println("success:"+success);
        CgTzjh newCgTzjh = service.queryById(keyId);
        System.out.println("更新后:"+newCgTzjh);
        Assert.assertTrue(newCgTzjh.getCfdw().contains("02")); //断言查询到更新后的 值 包含update
    }
    //根据主键删除
    @Test
    public void deleteById() throws Exception {
        String keyId = CmuStringUtil.UUID();
        CgTzjh CgTzjh = new CgTzjh(keyId, "01", "01","01","01","01","01","01","01","01","01","01","01","01","01","01","01","01","01",
                BigDecimal.valueOf(1.34), "01",BigDecimal.valueOf(1.34),BigDecimal.valueOf(1.34) ,BigDecimal.valueOf(1.34) ,BigDecimal.valueOf(1.34) ,
                BigDecimal.valueOf(1.34) , "01",new Date(),"01", null, null);
        boolean success = service.insert(CgTzjh);
        System.out.println("保存成功："+success);
        CgTzjh queryCgTzjh = service.queryById(keyId);
        System.out.println("插入后查询："+queryCgTzjh);
        CgTzjh.setValid("0");
        CgTzjh.setCreateTime(new Date());
        success = service.updateByIdAllColumn(CgTzjh);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}