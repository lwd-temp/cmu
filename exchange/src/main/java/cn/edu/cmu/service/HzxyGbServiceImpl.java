package cn.edu.cmu.service;

import cn.edu.cmu.dao.HzxyGbMapper;
import cn.edu.cmu.domain.HzxyGb;
import cn.edu.cmu.domain.HzxyGbParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HzxyGbServiceImpl extends BaseService<HzxyGb, HzxyGbParams, HzxyGbMapper> implements HzxyGbService {


    @Override
    public List list(HzxyGb HzxyGb) {
        HzxyGbParams ex = new HzxyGbParams();
        if(HzxyGb != null){
            HzxyGbParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(HzxyGb.getGbmc())){
                c.andGbmcLike("%"+HzxyGb.getGbmc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
