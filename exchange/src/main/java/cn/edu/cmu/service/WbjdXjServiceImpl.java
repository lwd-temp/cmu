package cn.edu.cmu.service;

import cn.edu.cmu.dao.WbjdXjMapper;
import cn.edu.cmu.domain.WbjdXj;
import cn.edu.cmu.domain.WbjdXjParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WbjdXjServiceImpl extends BaseService<WbjdXj, WbjdXjParams, WbjdXjMapper> implements WbjdXjService {


    @Override
    public List list(WbjdXj WbjdXj) {
        WbjdXjParams ex = new WbjdXjParams();
        if(WbjdXj != null){
            WbjdXjParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(WbjdXj.getDbtmc())){
                c.andDbtmcLike("%"+WbjdXj.getDbtmc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
