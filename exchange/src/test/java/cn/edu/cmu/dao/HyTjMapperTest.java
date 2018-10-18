package cn.edu.cmu.dao;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.vo.HytjVo;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/10/16 21:28
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class HyTjMapperTest extends SpringIOC {

    @Test
    public void selectList() {
        HyTjMapper dao = ac.getBean(HyTjMapper.class);


        //2018909029

        HytjVo voParam = new HytjVo();
        //voParam.setHybh("20189");
        //voParam.setHymc("会");
        voParam.setHylx("02");
        Map map = new HashMap();
        map.put("param",voParam);

        List<HytjVo> list = dao.selectList(map);

        for (HytjVo vo : list) {
            System.out.println(vo.getHybh()+"\t"+vo.getHymc()+"\t"+vo.getHylx());
        }
    }
}