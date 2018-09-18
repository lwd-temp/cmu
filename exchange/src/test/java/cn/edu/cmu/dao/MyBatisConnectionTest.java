package cn.edu.cmu.dao;

import cn.edu.cmu.base.SpringIOC;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * mybatis 连接测试类
 */
public class MyBatisConnectionTest extends SpringIOC {



    @Test
    public void test_T_DM_CFMD(){
        DmCfmdMapper dao = ac.getBean(DmCfmdMapper.class);
        List<Object> list = dao.selectByExample(null);
        for (Object dm:list  ) {
            System.out.println(dm);
        }
        //我断言 这个代码表应该有数据长度至少有两个
        Assert.assertTrue(list.size()>2);
    }

}