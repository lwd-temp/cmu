package cn.edu.cmu.dao;

import cn.edu.cmu.domain.XmXssqjl;
import cn.edu.cmu.domain.XmXssqjlParams;
import cn.edu.cmu.framework.web.BaseMapper;

import java.util.List;

public interface XmXssqjlMapperExt extends BaseMapper<XmXssqjlParams> {
    XmXssqjl  listYsqxmxh(String xh);
}