package cn.edu.cmu.service;

import cn.edu.cmu.domain.WbjdLp;
import cn.edu.cmu.domain.WbjdZj;
import cn.edu.cmu.domain.WbjdZjFj;
import cn.edu.cmu.domain.WbjdZjParams;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.WbglVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public interface WbjdZjService extends IBaseService<WbjdZj, WbjdZjParams> {
    public boolean saveOrupdate(WbglVO vo,HttpServletRequest request) throws Exception;


    List<WbjdLp> queryLiPinList(String zjid);

    public List<WbjdZjFj> queryWbjdZjFjs(String zjid)throws Exception;
}

