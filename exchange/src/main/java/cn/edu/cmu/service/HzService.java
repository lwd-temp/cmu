package cn.edu.cmu.service;

import cn.edu.cmu.domain.Hz;
import cn.edu.cmu.domain.HzParams;
import cn.edu.cmu.framework.web.IBaseService;


public interface HzService extends IBaseService<Hz, HzParams> {

    public void halfYearRemind();

}

