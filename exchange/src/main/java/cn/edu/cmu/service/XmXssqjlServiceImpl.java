package cn.edu.cmu.service;

import cn.edu.cmu.dao.XmXssqjlMapper;
import cn.edu.cmu.dao.XmXssqjlMapperExt;
import cn.edu.cmu.domain.XmXssqjl;
import cn.edu.cmu.domain.XmXssqjlParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class XmXssqjlServiceImpl extends BaseService<XmXssqjl, XmXssqjlParams, XmXssqjlMapper> implements XmXssqjlService {

    @Autowired
    XmXssqjlMapperExt xmxssqjlmapperext;

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

    @Override
    public List<XmXssqjl> listYsqxm(XmXssqjl sqjl) {
        XmXssqjlParams param = new XmXssqjlParams();
        XmXssqjlParams.Criteria criteria = param.createCriteria();

        criteria.andXhEqualTo(sqjl.getXh());
        criteria.andSqjlIdNotEqualTo(sqjl.getSqjlId());
        //criteria.andStatusEqualTo("03");//初审通过
        criteria.andConfirmStatusEqualTo("02");//复审通过

        List list = dao.selectByExample(param);
        return list;
    }

    @Override
    public XmXssqjl listYsqxmxh(String xh) {
        XmXssqjl Ysqxmxh=xmxssqjlmapperext.listYsqxmxh(xh);
        return Ysqxmxh;
    }
}
