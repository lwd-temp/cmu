package cn.edu.cmu.service;

import cn.edu.cmu.dao.CgjhGbMapper;
import cn.edu.cmu.domain.CgjhGb;
import cn.edu.cmu.domain.CgjhGbParams;
import cn.edu.cmu.framework.web.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/2 9:09
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Service
public class CgjhGbServiceImpl extends BaseService<CgjhGb, CgjhGbParams, CgjhGbMapper> implements  CgjhGbService {
    @Override
    public List list(CgjhGb cgjhGb) throws Exception {
        CgjhGbParams params = new CgjhGbParams();
        CgjhGbParams.Criteria criteria = params.createCriteria();
        criteria.andJhidEqualTo(cgjhGb.getJhid());
        List list = dao.selectByExample(params);

        return list;
    }
}
