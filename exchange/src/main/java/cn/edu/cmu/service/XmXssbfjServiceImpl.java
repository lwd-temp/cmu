package cn.edu.cmu.service;

import cn.edu.cmu.dao.XmXssbfjMapper;
import cn.edu.cmu.domain.XmXssbfj;
import cn.edu.cmu.domain.XmXssbfjParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class XmXssbfjServiceImpl extends BaseService<XmXssbfj, XmXssbfjParams, XmXssbfjMapper> implements XmXssbfjService {


    @Override
    public List list(XmXssbfj XmXssbfj) {
        XmXssbfjParams ex = new XmXssbfjParams();
        if(XmXssbfj != null){
            XmXssbfjParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(XmXssbfj.getSqjlId())){
                c.andSqjlIdLike("%"+XmXssbfj.getSqjlId()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
