package cn.edu.cmu.service;

import cn.edu.cmu.domain.Hz;
import cn.edu.cmu.domain.HzParams;
import cn.edu.cmu.framework.web.IBaseService;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


public interface HzService extends IBaseService<Hz, HzParams> {

    public void halfYearRemind();

    public void  qiTianTixing();

    public List hzlistExp(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
}

