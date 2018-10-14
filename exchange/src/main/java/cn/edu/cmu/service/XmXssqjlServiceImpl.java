package cn.edu.cmu.service;

import cn.edu.cmu.dao.XmXssqjlMapper;
import cn.edu.cmu.domain.XmXssqjl;
import cn.edu.cmu.domain.XmXssqjlParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class XmXssqjlServiceImpl extends BaseService<XmXssqjl, XmXssqjlParams, XmXssqjlMapper> implements XmXssqjlService {


    @Override
    public List list(XmXssqjl XmXssqjl) {
        XmXssqjlParams ex = new XmXssqjlParams();
        if(XmXssqjl != null){
            XmXssqjlParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(XmXssqjl.getXm())){
                c.andXmLike("%"+XmXssqjl.getXm()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }
}
