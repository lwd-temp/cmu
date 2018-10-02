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

    //分页查询 调用的是这个
    //conditions  参数就叫这个就行， 意思是 多个条件，
    @Override
    public List list(Object... conditions) throws Exception {
        HzParams params = new HzParams();
        HzParams.Criteria c = params.createCriteria();
        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            Hz hz = (Hz) conditions[0];
            if(StringUtils.isNotEmpty(hz.getXm())){
                c.andXmLike("%"+hz.getXm()+"%");//先按照这个查询，如果有多个条件 就在该这
            }
            super.addOrderBy(params,conditions);//排序
        }
        return dao.selectByExample(params);
    }
}