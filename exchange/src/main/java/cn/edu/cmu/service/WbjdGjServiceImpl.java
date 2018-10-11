package cn.edu.cmu.service;

import cn.edu.cmu.dao.WbjdGjMapper;
import cn.edu.cmu.domain.WbjdGj;
import cn.edu.cmu.domain.WbjdGjParams;
import cn.edu.cmu.framework.web.BaseService;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class WbjdGjServiceImpl extends BaseService<WbjdGj, WbjdGjParams, WbjdGjMapper> implements  WbjdGjService {

    @Override
    public List list(WbjdGj wbjdGj) throws Exception {
        WbjdGjParams params = new WbjdGjParams();
        WbjdGjParams.Criteria criteria = params.createCriteria();
        criteria.andLfidEqualTo(wbjdGj.getLfid());
        List list = dao.selectByExample(params);
        return list;
    }
}
