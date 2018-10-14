package cn.edu.cmu.service;

import cn.edu.cmu.dao.HyYwMapper;
import cn.edu.cmu.domain.HyYw;
import cn.edu.cmu.domain.HyYwParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HyYwServiceImpl extends BaseService<HyYw, HyYwParams, HyYwMapper> implements HyYwService {


    @Override
    public List list(HyYw HyYw) {
        HyYwParams ex = new HyYwParams();
        if(HyYw != null){
            HyYwParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(HyYw.getSx())){
                c.andSxLike("%"+HyYw.getSx()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }
}
