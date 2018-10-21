package cn.edu.cmu.service;

import cn.edu.cmu.domain.Hzxy;
import cn.edu.cmu.domain.HzxyParams;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.HzxyVo;


public interface JlxyService extends IBaseService<Hzxy, HzxyParams> {

    public boolean updateSave(HzxyVo hzxyVo);
    public boolean insertSave(HzxyVo hzxyVo);

    boolean deleteMulti(String[] ids) throws Exception;
}

