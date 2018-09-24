package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.CgDqcgj;
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
public class CgDqcgjServiceImplTest_false extends SpringIOC {

    CgDqcgjService service;

    @Before
    public  void init(){
        service = ac.getBean(CgDqcgjService.class);//此处 放的 是 UserService的接口
    }



    //保存
    @Test
    public void save() throws Exception {
        //有问题 shr  错误
        CgDqcgj CgDqcgj = new CgDqcgj(CmuStringUtil.UUID(), "cglx", "xm", "xb", new Date(), "csd", "hjszd", "sfzh",  "ssejdw", "ks", "zw", "zc", "lxdh" , "email" , new BigDecimal(10.0),
                "qtshrz" , "cfgj" , "rjcs" , "tzid" ,new Date(), new Date(), "cfmd" , "cfmdQt" , "yqrXm" , "yqrZw" , "yqrDw" ,
                "yqrXxdz" , "yqrDh" , "yqrXmEn" , "yqrZwEn" , "yqrDwEn" , "yqrXxdzEn" , "yqrDhEn" , "jfly" , "jfysmx" , new BigDecimal(15.0)
                , "sqbsm" , new Date(), "01" , "shjg" , "shry" , "shyj" , new Date(), "gdwjid" , "cfzjbgid" , null,null);
        boolean success = service.insert(CgDqcgj);
        System.out.println("CgDqcgj:"+CgDqcgj);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() throws Exception {
        String keyId = "7144f867cb9d41988cb95a3fa0bea9ef";
        CgDqcgj cgDqcgj = service.queryById(keyId);
        System.out.println(cgDqcgj);
        Assert.assertTrue(cgDqcgj!=null);

    }
    //根据条件查询
    @Test
    public void list() throws Exception {
        //ALT+ENTER  前台页面接到的查询条件
        CgDqcgj cgDqcgjParam = new CgDqcgj();
        cgDqcgjParam.setCfgj("中国");
        List<CgDqcgj> cgDqcgjs = service.list(cgDqcgjParam);
        for (CgDqcgj cgDqcgj : cgDqcgjs ) {
            System.out.println(cgDqcgj);
        }
        Assert.assertTrue(cgDqcgjs.size()>0);
    }
    //更新
    @Test
    public void update() throws Exception {
        String keyId = "7144f867cb9d41988cb95a3fa0bea9ef";
        CgDqcgj cgDqcgj = service.queryById(keyId);
        System.out.println("更新前:"+cgDqcgj);
        cgDqcgj.setCfgj("美国");
        boolean success = service.updateById(cgDqcgj);
        System.out.println("success:"+success);
        CgDqcgj newcgDqcgj = service.queryById(keyId);
        System.out.println("更新后:"+newcgDqcgj);
        Assert.assertTrue(newcgDqcgj.getCfgj().contains("update"));
    }
    //根据主键删除
    @Test
    public void deleteById() throws Exception {
        String keyId = CmuStringUtil.UUID();
        CgDqcgj cgDqcgj = new CgDqcgj();
        cgDqcgj.setCgid("123456");

        boolean success = service.insert(cgDqcgj);
        System.out.println("保存成功："+success);

        CgDqcgj queryCgDqcgj = service.queryById(keyId);
        System.out.println("插入后查询到的 ："+queryCgDqcgj);


        cgDqcgj.setValid("0");
        success = service.updateByIdAllColumn(cgDqcgj);

        Assert.assertTrue(success);

    }

}