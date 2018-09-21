package cn.edu.cmu.service;

import cn.edu.cmu.dao.HzxyMapper;
import cn.edu.cmu.domain.Hzxy;
import cn.edu.cmu.domain.HzxyParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HzxyServiceImpl extends BaseService<Hzxy, HzxyParams, HzxyMapper> implements HzxyService {


    @Override
    public List list(Hzxy Hzxy) {
        HzxyParams ex = new HzxyParams();
        if(Hzxy != null){
            HzxyParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(Hzxy.getXymc())){
                c.andXymcLike("%"+Hzxy.getXymc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
