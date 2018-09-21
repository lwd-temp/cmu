package cn.edu.cmu.service;

import cn.edu.cmu.dao.HyZjMapper;
import cn.edu.cmu.domain.HyZj;
import cn.edu.cmu.domain.HyZjParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HyZjServiceImpl extends BaseService<HyZj, HyZjParams, HyZjMapper> implements HyZjService {


    @Override
    public List list(HyZj HyZj) {
        HyZjParams ex = new HyZjParams();
        if(HyZj != null){
            HyZjParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(HyZj.getPjwh())){
                c.andPjwhLike("%"+HyZj.getPjwh()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
