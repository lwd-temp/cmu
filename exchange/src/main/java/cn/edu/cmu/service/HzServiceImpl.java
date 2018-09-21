package cn.edu.cmu.service;

import cn.edu.cmu.dao.HzMapper;
import cn.edu.cmu.domain.Hz;
import cn.edu.cmu.domain.HzParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HzServiceImpl extends BaseService<Hz, HzParams, HzMapper> implements HzService {


    @Override
    public List list(Hz Hz) {
        HzParams ex = new HzParams();
        if(Hz != null){
            HzParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(Hz.getXm())){
                c.andXmLike("%"+Hz.getXm()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
