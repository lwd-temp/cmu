package cn.edu.cmu.service;

import cn.edu.cmu.dao.WbjdGjMapper;
import cn.edu.cmu.dao.WbjdGjMapperExt;
import cn.edu.cmu.domain.WbjdGj;
import cn.edu.cmu.domain.WbjdGjParams;
import cn.edu.cmu.framework.web.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class WbjdGjServiceImpl extends BaseService<WbjdGj, WbjdGjParams, WbjdGjMapper> implements  WbjdGjService {

    @Autowired
    private WbjdGjMapperExt wbjdGjMapperExt;

    @Override
    public List list(WbjdGj wbjdGj) throws Exception {
        WbjdGjParams params = new WbjdGjParams();
        WbjdGjParams.Criteria criteria = params.createCriteria();
        criteria.andLfidEqualTo(wbjdGj.getLfid());
        List list = dao.selectByExample(params);
        return list;
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }

    @Override
    public List selectdGjExtPdf(String id) throws Exception {
        return wbjdGjMapperExt.selectdGjExtPdf(id);
    }
}
