package cn.edu.cmu.service;

import cn.edu.cmu.domain.WbjdZj;
import cn.edu.cmu.domain.WbjdZjParams;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.WbglVO;

import java.util.List;


public interface WbjdZjService extends IBaseService<WbjdZj, WbjdZjParams> {
    public List list(Object... conditions) throws Exception;
    public boolean update(WbglVO vo) throws Exception;
}

