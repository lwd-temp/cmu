package cn.edu.cmu.service;

import cn.edu.cmu.domain.WbjdZj;
import cn.edu.cmu.domain.WbjdZjParams;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.WbglVO;


public interface WbjdZjService extends IBaseService<WbjdZj, WbjdZjParams> {
    public boolean saveOrupdate(WbglVO vo) throws Exception;
}

