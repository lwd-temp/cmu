package cn.edu.cmu.service;

import cn.edu.cmu.dao.HyRymdMapper;
import cn.edu.cmu.domain.HyRymd;
import cn.edu.cmu.domain.HyRymdParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HyRymdServiceImpl extends BaseService<HyRymd, HyRymdParams, HyRymdMapper> implements HyRymdService {


    @Override
    public List list(HyRymd HyRymd) {
        HyRymdParams ex = new HyRymdParams();
        if(HyRymd != null){
            HyRymdParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(HyRymd.getXm())){
                c.andXmLike("%"+HyRymd.getXm()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
