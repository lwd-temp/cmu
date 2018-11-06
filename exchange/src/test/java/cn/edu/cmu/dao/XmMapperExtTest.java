package cn.edu.cmu.dao;

import cn.edu.cmu.base.SpringIOC;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Author: jshand
 * @Date: 2018/11/5 21:09
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class XmMapperExtTest extends SpringIOC {

    @Test
    public void selectXmGb() {
        XmMapperExt dao = ac.getBean(XmMapperExt.class);
        String xmid = "014ccdee8e4b43b2b6974c6566d74090";
        List<Map> list = dao.selectXmGb(xmid);
        for (Map<String,String> map : list) {
            System.out.println(map);
            String code = map.get("code");
            String name = map.get("name");
            map.put(code,name);
            map.remove("code");
            map.remove("name");
        }

        for (Map map : list) {
            System.out.println(map);
        }
    }
}