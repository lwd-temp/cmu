package cn.edu.cmu.dao;

import cn.edu.cmu.base.SpringIOC;
import org.junit.Test;

import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/2 20:27
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class MapperExtTest extends SpringIOC {


    @Test
    public void testExtMapper(){
        CgTzjhMapperExt dao = ac.getBean(CgTzjhMapperExt.class);

        List list = dao.selectByExampleTranslateCode(null);
        System.out.println(list.size());
    }
}
