package cn.edu.cmu.service;

import cn.edu.cmu.dao.WbjdZjMapper;
import cn.edu.cmu.domain.WbjdZj;
import cn.edu.cmu.domain.WbjdZjParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WbjdZjServiceImpl extends BaseService<WbjdZj, WbjdZjParams, WbjdZjMapper> implements WbjdZjService {


    @Override
    public List list(WbjdZj WbjdZj) {
        WbjdZjParams ex = new WbjdZjParams();
        if(WbjdZj != null){
            WbjdZjParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(WbjdZj.getDbtmc())){
                c.andDbtmcLike("%"+WbjdZj.getDbtmc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
