package cn.edu.cmu.util;

import org.junit.Test;

public class TestUtils {

    @Test
    public void testMapper2Table(){

        String mybatisMapperBeanName = "dmCfmd";

        String tableName = mybatisMapperBeanName.toUpperCase().replace("MAPPER","").replace("DM","");

        System.out.println(tableName);
    }
}

