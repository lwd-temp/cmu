package cn.edu.cmu.service;

import cn.edu.cmu.dao.HySbrymdMapper;
import cn.edu.cmu.domain.HySbrymd;
import cn.edu.cmu.domain.HySbrymdParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HySbrymdServiceImpl extends BaseService<HySbrymd, HySbrymdParams, HySbrymdMapper> implements HySbrymdService {


    @Override
    public List list(HySbrymd HySbrymd) {
        HySbrymdParams ex = new HySbrymdParams();
        if(HySbrymd != null){
            HySbrymdParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(HySbrymd.getXm())){
                c.andXmLike("%"+HySbrymd.getXm()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }
}
