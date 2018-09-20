package cn.edu.cmu.service;
import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.CgTzcy;
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
public class CgTzcyServiceImplTest extends SpringIOC {
    CgTzcyService service;
    @Before
    public  void init(){
        service = ac.getBean(CgTzcyService.class);
    }
    //保存
    @Test
    public void save() {
        CgTzcy cgTzcy = new CgTzcy(CmuStringUtil.UUID(), "01", "01", "01", "01", "01", null,null);
        boolean success = service.insert(cgTzcy);
        System.out.println("cgTzcy:"+cgTzcy);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "725bb88c57d44d3b8ad60cf9b879450e";
        CgTzcy cgTzcy = service.queryById(keyId);
        System.out.println(cgTzcy);
        Assert.assertTrue(cgTzcy!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        //ALT+ENTER  前台页面接到的查询条件
        CgTzcy cgTzcyParam = new CgTzcy();
        cgTzcyParam.setXm("01");
        List<CgTzcy> cgTzcys = service.list(cgTzcyParam);
        for (CgTzcy cgTzcy : cgTzcys ) {
            System.out.println(cgTzcy);
        }
        Assert.assertTrue(cgTzcys.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "725bb88c57d44d3b8ad60cf9b879450e";
        CgTzcy cgTzcy = service.queryById(keyId);
        System.out.println("更新前:"+cgTzcy);
        cgTzcy.setXm("02");
        boolean success = service.updateById(cgTzcy);
        System.out.println("success:"+success);
        CgTzcy newCgTzcy = service.queryById(keyId);
        System.out.println("更新后:"+newCgTzcy);
        Assert.assertTrue(newCgTzcy.getXm().contains("02")); //断言查询到更新后的 值 包含update
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        CgTzcy cgTzcy = new CgTzcy(keyId, "01", "01", "01", "01", "01", null,null);
        boolean success = service.insert(cgTzcy);
        System.out.println("保存成功："+success);
        CgTzcy queryCgTzcy = service.queryById(keyId);
        System.out.println("插入后查询："+queryCgTzcy);
        cgTzcy.setValid("0");
        cgTzcy.setCreateTime(new Date());
        success = service.updateByIdAllColumn(cgTzcy);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}