package cn.edu.cmu.service;

import cn.edu.cmu.domain.WbjdSq;
import cn.edu.cmu.domain.WbjdSqParams;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.WbglVO;



public interface WbjdSqService extends IBaseService<WbjdSq, WbjdSqParams> {

    public boolean saveOrUpdate(WbglVO vo) throws Exception;


}

