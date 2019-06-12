package cn.edu.cmu.service;

import cn.edu.cmu.domain.WbjdLp;
import cn.edu.cmu.domain.WbjdSq;
import cn.edu.cmu.domain.WbjdSqParams;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.WbglVO;

import java.util.List;


public interface WbjdSqService extends IBaseService<WbjdSq, WbjdSqParams> {

    public boolean saveOrUpdate(WbglVO vo) throws Exception;
    public List shlist(Object... conditions) throws Exception;
    public boolean sh(WbjdSq wbjdSq,List sxryList,List gbDomainList) throws Exception;
    public WbjdSq selectSqExtPdf(String id) throws Exception;

    List<WbjdLp> queryLiPinList(String id);
}

