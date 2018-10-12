package cn.edu.cmu.service;

import cn.edu.cmu.dao.HyMapperExt;
import cn.edu.cmu.dao.HyZjMapper;
import cn.edu.cmu.domain.HyShenb;
import cn.edu.cmu.domain.HyShenbParams;
import cn.edu.cmu.domain.HyZj;
import cn.edu.cmu.domain.HyZjParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HyZjServiceImpl extends BaseService<HyZj, HyZjParams, HyZjMapper> implements HyZjService {

    @Autowired
    HyMapperExt hyExtDao;

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


    @Override
    public List list(Object... conditions) throws Exception {
        HyShenbParams params = new HyShenbParams();
        HyShenbParams.Criteria c1 = params.createCriteria();
        HyShenbParams.Criteria c2= params.or();
        c1.andStatusEqualTo("01");//并且通过才查询
        c2.andStatusEqualTo("04");//通过审核的会议申请

        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            HyShenb hysb = (HyShenb) conditions[0];

            if(StringUtils.isNotEmpty(hysb.getZbdw())){
                c1.andZbdwLike("%"+hysb.getZbdw()+"%");
            }
            if(StringUtils.isNotEmpty(hysb.getCbdw())){

                c2.andCbdwLike("%"+hysb.getCbdw()+"%");

            }
            super.addOrderBy(params,conditions);
        }

        return hyExtDao.selectZjByExample(params);
    }
}
