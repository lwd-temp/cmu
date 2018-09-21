package cn.edu.cmu.service;

import cn.edu.cmu.dao.XmJlzjbgMapper;
import cn.edu.cmu.domain.XmJlzjbg;
import cn.edu.cmu.domain.XmJlzjbgParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class XmJlzjbgServiceImpl extends BaseService<XmJlzjbg, XmJlzjbgParams, XmJlzjbgMapper> implements XmJlzjbgService {


    @Override
    public List list(XmJlzjbg XmJlzjbg) {
        XmJlzjbgParams ex = new XmJlzjbgParams();
        if(XmJlzjbg != null){
            XmJlzjbgParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(XmJlzjbg.getSqjlId())){
                c.andSqjlIdLike("%"+XmJlzjbg.getSqjlId()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
