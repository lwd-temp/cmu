package cn.edu.cmu.service;

import cn.edu.cmu.dao.JzgMapper;
import cn.edu.cmu.dao.JzgMapperExt;
import cn.edu.cmu.domain.Jzg;
import cn.edu.cmu.domain.JzgParams;
import cn.edu.cmu.framework.web.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/14 17:50
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Service
public class JzgServiceImpl extends BaseService<Jzg, JzgParams, JzgMapper> implements JzgService {

    @Autowired
    JzgMapperExt extDao;

    @Override
    public List list(Jzg jzg) throws Exception {
        return null;
    }

    @Override
    public List list(Object... conditions) throws Exception {
        //JzgParams params = new JzgParams();
        Jzg jzg = (Jzg) conditions[0];
        String orderByClause =  conditions[1] + " " +  conditions[2];

        HashMap map = new HashMap();
        map.put("jzg",jzg);
        map.put("orderByClause", orderByClause);
        return extDao.selectList(map);
    }

    /**
     * 根据工号查询是否存在
     * @param gh
     * @return
     */
    @Override
    public boolean validate(String gh) {

        JzgParams params = new JzgParams();
        params.createCriteria().andGhEqualTo(gh);

        return dao.countByExample(params)>0;
    }
}
