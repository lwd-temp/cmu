package cn.edu.cmu.dao;

import cn.edu.cmu.domain.JzgParams;
import cn.edu.cmu.framework.web.BaseMapper;

import java.util.HashMap;
import java.util.List;

public interface JzgMapperExt extends BaseMapper<JzgParams> {
    public List selectList(HashMap map);
}