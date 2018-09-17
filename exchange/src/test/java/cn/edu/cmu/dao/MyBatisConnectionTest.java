package cn.edu.cmu.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * mybatis 连接测试类
 */
public class MyBatisConnectionTest {
    private String springmvcFile = "springmvc.xml";
    ClassPathXmlApplicationContext ac;

    @Before
    public  void init(){
        ac = new ClassPathXmlApplicationContext(springmvcFile);
    }

    @Test
    public void test_T_DM_CFMD(){
//        DmCfmdMapper mapper = ac.getBean(DmCfmdMapper.class);
//        List<DmCfmd> list = mapper.selectByExample(null);
//        for (DmCfmd dm:list  ) {
//            System.out.println(dm);
//        }
    }

}