package cn.edu.cmu.service;

import cn.edu.cmu.dao.WbjdSxryMapper;
import cn.edu.cmu.domain.WbjdSxry;
import cn.edu.cmu.domain.WbjdSxryParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WbjdSxryServiceImpl extends BaseService<WbjdSxry, WbjdSxryParams, WbjdSxryMapper> implements WbjdSxryService {


    @Override
    public List list(WbjdSxry WbjdSxry) {
        WbjdSxryParams ex = new WbjdSxryParams();
        if(WbjdSxry != null){
            WbjdSxryParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(WbjdSxry.getXm())){
                c.andXmLike("%"+WbjdSxry.getXm()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
