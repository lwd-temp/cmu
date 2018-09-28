package cn.edu.cmu.dao;

import cn.edu.cmu.domain.HzxyGb;
import cn.edu.cmu.domain.HzxyGbParams;
import cn.edu.cmu.framework.web.BaseMapper;

import java.util.Map;

public interface HzxyGbMapper extends BaseMapper<HzxyGbParams> {

    public  void  deleteByxyId(HzxyGb hzxyGb);



}