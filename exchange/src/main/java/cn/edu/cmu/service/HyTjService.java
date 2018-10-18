package cn.edu.cmu.service;

import cn.edu.cmu.vo.HytjVo;

import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/16 21:39
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public interface HyTjService {
    public List<HytjVo> selectList(HytjVo param,String orderCol, String orderType);
}
