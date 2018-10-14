package cn.edu.cmu.service;

import cn.edu.cmu.dao.SjjlZtMapper;
import cn.edu.cmu.domain.SjjlZt;
import cn.edu.cmu.domain.SjjlZtParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SjjlZtServiceImpl extends BaseService<SjjlZt, SjjlZtParams, SjjlZtMapper> implements SjjlZtService {


    @Override
    public List list(SjjlZt SjjlZt) {
        SjjlZtParams ex = new SjjlZtParams();
        if(SjjlZt != null){
            SjjlZtParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(SjjlZt.getGjnr())){
                c.andGjnrLike("%"+SjjlZt.getGjnr()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }
}
