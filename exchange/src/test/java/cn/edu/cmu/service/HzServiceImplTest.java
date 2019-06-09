package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.Hz;
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
public class HzServiceImplTest extends SpringIOC {

    HzService service;

    @Before
    public  void init(){
        service = ac.getBean(HzService.class);
    }
    //保存
    @Test
    public void save() throws Exception{
        Hz hz = null;//new Hz(CmuStringUtil.UUID(), "hzhm" , "xm", "gender", "gj", new Date(), "csdd", new  Date(),"qfdd", new Date(), "fzjg","hzlx",new Date(), new Date(),new  Date(),"cfmd","cfnr","qzhm","status",null, null);

        boolean success = service.insert(hz);
        System.out.println("Hz:"+hz);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey()throws Exception{
        String keyId = "c8f98f57d4e54ee29e85ac849db01552";
        Hz hz = service.queryById(keyId);
        System.out.println(hz);
        Assert.assertTrue(hz!=null);
    }
    //根据条件查询
    @Test
    public void list() throws Exception{
        Hz hzParam = new Hz();
        hzParam.setXm("01");
        List<Hz> hzs = service.list(hzParam);
        for (Hz hz : hzs ) {
            System.out.println(hz);
        }
        Assert.assertTrue(hzs.size()>0);
    }
    //更新
    @Test
    public void update() throws Exception{
        String keyId = "c8f98f57d4e54ee29e85ac849db01552";
        Hz hz = service.queryById(keyId);
        System.out.println("更新前:"+hz);
        hz.setXm("02");
        boolean success = service.updateById(hz);
        System.out.println("success:"+success);
        Hz newHz = service.queryById(keyId);
        System.out.println("更新后:"+newHz);
        Assert.assertTrue(newHz.getXm().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById()throws Exception {
        String keyId = CmuStringUtil.UUID();
        Hz hz = null;//new Hz(keyId, "hzhm" , "xm", "gender", "gj", new Date(), "csdd", new  Date(),"qfdd", new Date(), "fzjg","hzlx",new Date(), new Date(),new  Date(),"cfmd","cfnr","qzhm","status",null, null);
        boolean success = service.insert(hz);
        System.out.println("保存成功："+success);
        Hz queryHz = service.queryById(keyId);
        System.out.println("插入后查询"+queryHz);
        queryHz.setValid("0");
        queryHz.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryHz);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }



    @Test
    public void halfYearRemind() {

        service.halfYearRemind();
    }
}