package cn.edu.cmu.service;
import cn.edu.cmu.dao.CgRwzxqkfkMapper;
import cn.edu.cmu.domain.CgRwzxqkfk;
import cn.edu.cmu.domain.CgRwzxqkfkParams;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CgDqcgjGgServiceImpl extends BaseService<CgRwzxqkfk, CgRwzxqkfkParams, CgRwzxqkfkMapper> implements CgDqcgjGgService {


    @Override
    public List list(CgRwzxqkfk cgRwzxqkfk) throws Exception {
        CgRwzxqkfkParams ex = new CgRwzxqkfkParams();
        if(cgRwzxqkfk != null){
            CgRwzxqkfkParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(cgRwzxqkfk.getCfgjdq())){
                c.andCfgjdqLike("%"+cgRwzxqkfk.getCfgjdq()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        CgRwzxqkfkParams params = new CgRwzxqkfkParams();
        CgRwzxqkfkParams.Criteria c = params.createCriteria();
        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            CgRwzxqkfk cgRwzxqkfk= (CgRwzxqkfk) conditions[0];
            if(StringUtils.isNotEmpty(cgRwzxqkfk.getCfgjdq())){
                c.andCfgjdqLike("%"+cgRwzxqkfk.getCfgjdq()+"%");
            }
            super.addOrderBy(params,conditions);
        }
        return dao.selectByExample(params);
    }

}
