package cn.edu.cmu.service;

import cn.edu.cmu.dao.HyTjMapper;
import cn.edu.cmu.vo.HytjVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/10/16 21:40
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Service
public class HyTjServiceImpl implements   HyTjService {

    @Autowired
    HyTjMapper dao;

    @Override
    public List<HytjVo> selectList(HytjVo param,String orderCol, String orderType) {
        Map map = new HashMap();
        map.put("param",param);
        map.put("orderCol",orderCol);
        map.put("orderType",orderType);
        return dao.selectList(map);
    }

    @Override
    public List selectListForDownload(HytjVo hytjVo, String orderCol, String orderType) {
        Map map = new HashMap();
        map.put("param",hytjVo);
        map.put("orderCol",orderCol);
        map.put("orderType",orderType);
        return dao.selectListForDownload(map);
    }


}