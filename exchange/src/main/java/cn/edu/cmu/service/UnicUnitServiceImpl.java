package cn.edu.cmu.service;

import cn.edu.cmu.dao.UnicUnitMapper;
import cn.edu.cmu.dao.UnicUnitMapperExt;
import cn.edu.cmu.domain.UnicUnit;
import cn.edu.cmu.domain.UnicUnitParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/14 18:04
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Service
public class UnicUnitServiceImpl extends BaseService<UnicUnit, UnicUnitParams, UnicUnitMapper> implements  UnicUnitService {


    @Autowired
    private UnicUnitMapperExt unicUnitMapperExt;

    @Override
    public List list(UnicUnit unicUnit) throws Exception {
        UnicUnitParams params = new UnicUnitParams();
        UnicUnitParams.Criteria c1 = params.createCriteria();
        if(StringUtils.isEmpty(unicUnit.getBelongUnit())){
            unicUnit.setBelongUnit("9000000");
        }

        c1.andBelongUnitEqualTo(unicUnit.getBelongUnit());

        return dao.selectByExample(params);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }

    @Override
    public UnicUnit queryMcById(String ejdwid) {
        UnicUnit unicUnit = new UnicUnit();
        unicUnit = unicUnitMapperExt.queryMcById(ejdwid);
        return unicUnit;
    }
}
