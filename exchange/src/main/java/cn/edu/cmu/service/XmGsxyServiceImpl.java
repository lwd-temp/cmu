package cn.edu.cmu.service;

import cn.edu.cmu.dao.XmGsxyMapper;
import cn.edu.cmu.domain.XmGsxy;
import cn.edu.cmu.domain.XmGsxyParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class XmGsxyServiceImpl extends BaseService<XmGsxy, XmGsxyParams, XmGsxyMapper> implements XmGsxyService {


    @Override
    public List list(XmGsxy XmGsxy) {
        XmGsxyParams ex = new XmGsxyParams();
        if(XmGsxy != null){
            XmGsxyParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(XmGsxy.getXymc())){
                c.andXymcLike("%"+XmGsxy.getXymc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
