package cn.edu.cmu.dao;

import cn.edu.cmu.base.SpringIOC;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Author: jshand
 * @Date: 2018/10/31 22:53
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class XsMapperTest extends SpringIOC {

    @Test
    public void listxs() {

        XsMapper dao = ac.getBean(XsMapper.class);

        Map param = new HashMap();
        param.put("unitId","1110000");
        param.put("order","xh");
        //param.put("xm","·");

        List list = dao.listxs(param);
        System.out.println("list.size() :  "+list.size());
        for (Object o : list) {
            System.out.println(o);
        }
    }
}