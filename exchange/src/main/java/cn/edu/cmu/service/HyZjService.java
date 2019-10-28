package cn.edu.cmu.service;

import cn.edu.cmu.domain.HyZj;
import cn.edu.cmu.domain.HyZjParams;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.HyShenbVo;

import java.util.List;


public interface HyZjService extends IBaseService<HyZj, HyZjParams> {

    List<HyShenbVo> queryByJbxx();

}

