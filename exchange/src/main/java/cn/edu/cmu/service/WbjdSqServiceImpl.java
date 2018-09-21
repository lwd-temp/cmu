package cn.edu.cmu.service;

import cn.edu.cmu.dao.WbjdSqMapper;
import cn.edu.cmu.domain.WbjdSq;
import cn.edu.cmu.domain.WbjdSqParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WbjdSqServiceImpl extends BaseService<WbjdSq, WbjdSqParams, WbjdSqMapper> implements WbjdSqService {


    @Override
    public List list(WbjdSq WbjdSq) {
        WbjdSqParams ex = new WbjdSqParams();
        if(WbjdSq != null){
            WbjdSqParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(WbjdSq.getDbtmc())){
                c.andDbtmcLike("%"+WbjdSq.getDbtmc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
