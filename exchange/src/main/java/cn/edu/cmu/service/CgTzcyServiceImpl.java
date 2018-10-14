package cn.edu.cmu.service;

import cn.edu.cmu.dao.CgTzcyMapper;
import cn.edu.cmu.domain.CgTzcy;
import cn.edu.cmu.domain.CgTzcyParams;
import cn.edu.cmu.framework.web.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/2 8:27
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Service
public class CgTzcyServiceImpl extends BaseService<CgTzcy, CgTzcyParams, CgTzcyMapper> implements  CgTzcyService {

    @Override
    public List list(CgTzcy cgTzcy) throws Exception {

        CgTzcyParams params = new CgTzcyParams();
        CgTzcyParams.Criteria criteria = params.createCriteria();
        criteria.andTzidEqualTo(cgTzcy.getTzid());
        List list = dao.selectByExample(params);

        return list;

    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }

}
