package cn.edu.cmu.service;

import cn.edu.cmu.dao.HyShenbMapper;
import cn.edu.cmu.domain.HyShenb;
import cn.edu.cmu.domain.HyShenbParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HyShenbServiceImpl extends BaseService<HyShenb, HyShenbParams, HyShenbMapper> implements HyShenbService {


    @Override
    public List list(HyShenb HyShenb) {
        HyShenbParams ex = new HyShenbParams();
        if(HyShenb != null){
            HyShenbParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(HyShenb.getJbdw())){
                c.andJbdwLike("%"+HyShenb.getJbdw()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
