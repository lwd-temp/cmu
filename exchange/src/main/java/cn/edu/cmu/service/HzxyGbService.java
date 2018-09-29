package cn.edu.cmu.service;

import cn.edu.cmu.domain.HzxyGb;
import cn.edu.cmu.domain.HzxyGbParams;
import cn.edu.cmu.framework.web.IBaseService;


public interface HzxyGbService extends IBaseService<HzxyGb, HzxyGbParams> {
    public  void  deleteByxyId(HzxyGb hzxyGb);
}

