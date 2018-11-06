package cn.edu.cmu.dao;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.framework.cache.DMCache;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Author: jshand
 * @Date: 2018/11/4 11:34
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class ZyMapperTest extends SpringIOC {

    @Test
    public void selectZyListAll() {
        ZyMapper dao = ac.getBean(ZyMapper.class);

        List<Map> list  = dao.selectZyListAll();
        for (Map<String,String> map : list) {
            String code = map.get("code");
            String name = map.get("name");
            map.put(code,name);
            map.remove("code");
            map.remove("name");
        }
        for (Map<String,String> map : list) {
            System.out.println(map);
        }

        List<Map> xbList = DMCache.getTableList("t_dm_xb");
        for (Map map : xbList) {
            System.out.println(map);
        }



    }
}