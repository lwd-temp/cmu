package cn.edu.cmu.dao;

import cn.edu.cmu.domain.BksXjjbsjxxParams;
import cn.edu.cmu.framework.web.BaseMapper;

import java.util.List;

public interface BksXjjbsjxxMapperExt extends BaseMapper<BksXjjbsjxxParams> {
    List<String> selectNjxzDistinct();
}