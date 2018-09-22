package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import org.junit.Before;


/**
 * Service层的测试类
 *
 * 增加删改查
 */
public class ForeignTeacherServiceImplTest extends SpringIOC {

    ForeignTeacherService service;

    @Before
    public  void init(){
        service = ac.getBean(ForeignTeacherService.class);
    }
    //保存
    /*@Test
    public void save() {
        ForeignTeacher foreignTeacher = new ForeignTeacher("01", "01","01","01","01","01",null,null);
        boolean success = service.insert(foreignTeacher);
        System.out.println("foreignTeacher:"+foreignTeacher);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "01";
        ForeignTeacher foreignTeacher = service.queryById(keyId);
        System.out.println(foreignTeacher);
        Assert.assertTrue(foreignTeacher!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        ForeignTeacher foreignTeacherParam = new ForeignTeacher();
        foreignTeacherParam.set教师姓名("01");
        List<ForeignTeacher> foreignTeachers = service.list(foreignTeacherParam);
        for (ForeignTeacher foreignTeacher : foreignTeachers ) {
            System.out.println(foreignTeacher);
        }
        Assert.assertTrue(foreignTeachers.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "01";
        ForeignTeacher foreignTeacher = service.queryById(keyId);
        System.out.println("更新前:"+foreignTeacher);
        foreignTeacher.set教师姓名("02");
        boolean success = service.updateById(foreignTeacher);
        System.out.println("success:"+success);
        ForeignTeacher newforeignTeacher = service.queryById(keyId);
        System.out.println("更新后:"+newforeignTeacher);
        Assert.assertTrue(newforeignTeacher.get教师姓名().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        ForeignTeacher foreignTeacher = new ForeignTeacher(keyId, "01","01","01","01","01",null,null);
        boolean success = service.insert(foreignTeacher);
        System.out.println("保存成功："+success);
        ForeignTeacher queryForeignTeacher = service.queryById(keyId);
        System.out.println("插入后查询"+queryForeignTeacher);
        queryForeignTeacher.setValid("0");
        queryForeignTeacher.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryForeignTeacher);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }*/
}