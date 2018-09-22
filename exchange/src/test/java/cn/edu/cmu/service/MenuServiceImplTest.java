package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.Menu;
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
public class MenuServiceImplTest extends SpringIOC {

    MenuService service;

    @Before
    public  void init(){
        service = ac.getBean(MenuService.class);
    }
    //保存
    @Test
    public void save() {
        Menu menu = new Menu(CmuStringUtil.UUID(),"01","01","01","01","01",null,null);
        boolean success = service.insert(menu);
        System.out.println("Menu:"+menu);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "de05ce34c9a343eaa5e08244d1e93425";
        Menu menu = service.queryById(keyId);
        System.out.println(menu);
        Assert.assertTrue(menu!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        Menu menuParam = new Menu();
        menuParam.setMenuName("0");
        List<Menu> menus = service.list(menuParam);
        for (Menu menu : menus ) {
            System.out.println(menu);
        }
        Assert.assertTrue(menus.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "de05ce34c9a343eaa5e08244d1e93425";
        Menu menu = service.queryById(keyId);
        System.out.println("更新前:"+menu);
        menu.setMenuName("02");
        boolean success = service.updateById(menu);
        System.out.println("success:"+success);
        Menu newMenu = service.queryById(keyId);
        System.out.println("更新后:"+newMenu);
        Assert.assertTrue(newMenu.getMenuName().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        Menu menu = new Menu(keyId,"01","01","01","01","01",null,null);
        boolean success = service.insert(menu);
        System.out.println("保存成功："+success);
        Menu queryMenu = service.queryById(keyId);
        System.out.println("插入后查询"+queryMenu);
        queryMenu.setValid("0");
        queryMenu.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryMenu);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}