package cn.edu.cmu.service;

import cn.edu.cmu.dao.HzxyQzrMapper;
import cn.edu.cmu.domain.HzxyQzr;
import cn.edu.cmu.domain.HzxyQzrParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HzxyQzrServiceImpl extends BaseService<HzxyQzr, HzxyQzrParams, HzxyQzrMapper> implements HzxyQzrService {


    @Override
    public List list(HzxyQzr HzxyQzr) {
        HzxyQzrParams ex = new HzxyQzrParams();
        if(HzxyQzr != null){
            HzxyQzrParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(HzxyQzr.getXm())){
                c.andXmLike("%"+HzxyQzr.getXm()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
