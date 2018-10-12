package cn.edu.cmu.dao;

import cn.edu.cmu.domain.HyShenbParams;
import cn.edu.cmu.vo.HyShenbVo;

import java.util.List;

public interface HyMapperExt {

    List<HyShenbVo> selectZjByExample(HyShenbParams params);
}