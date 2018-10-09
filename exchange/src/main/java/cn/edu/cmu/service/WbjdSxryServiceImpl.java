package cn.edu.cmu.service;

import cn.edu.cmu.dao.WbjdSxryMapper;
import cn.edu.cmu.domain.WbjdSxry;
import cn.edu.cmu.domain.WbjdSxryParams;
import cn.edu.cmu.framework.web.BaseService;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class WbjdSxryServiceImpl extends BaseService<WbjdSxry, WbjdSxryParams, WbjdSxryMapper> implements WbjdSxryService {


    @Override
    public List list(WbjdSxry WbjdSxry) {
        WbjdSxryParams ex = new WbjdSxryParams();
        WbjdSxryParams.Criteria c = ex.createCriteria();
        c.andLfidEqualTo(WbjdSxry.getLfid());
        List list = dao.selectByExample(ex);
        return list;
    }


}
