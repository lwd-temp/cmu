package cn.edu.cmu.service;

import cn.edu.cmu.dao.XmGjdqMapper;
import cn.edu.cmu.domain.XmGjdq;
import cn.edu.cmu.domain.XmGjdqParams;
import cn.edu.cmu.framework.web.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class XmGjServiceImpl extends BaseService<XmGjdq, XmGjdqParams, XmGjdqMapper> implements  XmGjService {

    @Autowired
    private XmGjdqMapper xmGjdqMapper;

    @Override
    public List list(XmGjdq xmGjdq) throws Exception {
        XmGjdqParams params = new XmGjdqParams();
        XmGjdqParams.Criteria criteria = params.createCriteria();
        criteria.andXmidEqualTo(xmGjdq.getXmid());
        List list = dao.selectByExample(params);
        return list;
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }
}
