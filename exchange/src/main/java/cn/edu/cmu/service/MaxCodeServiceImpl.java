package cn.edu.cmu.service;

import cn.edu.cmu.dao.MaxCodeMapper;
import cn.edu.cmu.domain.MaxCode;
import cn.edu.cmu.domain.MaxCodeParams;
import cn.edu.cmu.framework.util.CmuStringUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/1 16:20
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Service
public class MaxCodeServiceImpl implements MaxCodeService {


    @Autowired
    MaxCodeMapper dao;

    @Override
    public synchronized long getMaxCode(String table, Long year) {

        MaxCodeParams params = new MaxCodeParams();
        MaxCodeParams.Criteria c = params.createCriteria();
        c.andTypeEqualTo(table);
        c.andYearEqualTo(year);
        List<Object> maxs = dao.selectByExample(params);
        long maxCode = 1;
        MaxCode domain = null;
        if(CollectionUtils.isEmpty(maxs)){
            domain = new MaxCode(CmuStringUtil.UUID(),table,year,maxCode,null,null);
            dao.insertSelective(domain);
        }else{
            domain = (MaxCode) maxs.get(0);
            maxCode = domain.getMaxcode();
            domain.setMaxcode(++maxCode);
            dao.updateByPrimaryKeySelective(domain);
        }


        return maxCode;
    }
}
