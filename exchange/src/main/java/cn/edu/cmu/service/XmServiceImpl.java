package cn.edu.cmu.service;

import cn.edu.cmu.dao.XmMapper;
import cn.edu.cmu.domain.Xm;
import cn.edu.cmu.domain.XmParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class XmServiceImpl extends BaseService<Xm, XmParams, XmMapper> implements XmService {


    @Override
    public List list(Xm Xm) {
        XmParams ex = new XmParams();
        if(Xm != null){
            XmParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(Xm.getXmmc())){
                c.andXmmcLike("%"+Xm.getXmmc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
