package cn.edu.cmu.service;

import cn.edu.cmu.domain.Hzxy;
import cn.edu.cmu.domain.HzxyParams;
import cn.edu.cmu.framework.web.IBaseService;

import java.util.List;


public interface JlxyService extends IBaseService<Hzxy, HzxyParams> {

    public boolean updateSave(Hzxy hzxy);
    public boolean insertSave(Hzxy hzxy);
}

