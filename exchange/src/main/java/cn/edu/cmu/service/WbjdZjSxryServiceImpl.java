package cn.edu.cmu.service;
import cn.edu.cmu.dao.WbjdZjSxryMapper;
import cn.edu.cmu.domain.WbjdSxryParams;
import cn.edu.cmu.domain.WbjdZjSxry;
import cn.edu.cmu.domain.WbjdZjSxryParams;
import cn.edu.cmu.framework.web.BaseService;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class WbjdZjSxryServiceImpl extends BaseService<WbjdZjSxry, WbjdZjSxryParams, WbjdZjSxryMapper> implements WbjdZjSxryService {


    @Override
    public List list(WbjdZjSxry WbjdZjSxry) {
        WbjdZjSxryParams ex = new WbjdZjSxryParams();
        WbjdZjSxryParams.Criteria c = ex.createCriteria();
        c.andLfidEqualTo(WbjdZjSxry.getLfid());
        List list = dao.selectByExample(ex);
        return list;
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }


}
