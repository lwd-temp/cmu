package cn.edu.cmu.service;

import cn.edu.cmu.dao.XmMapper;
import cn.edu.cmu.domain.Xm;
import cn.edu.cmu.domain.XmParams;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.util.DateUtils;
import cn.edu.cmu.framework.util.MaxNumUtils;
import cn.edu.cmu.framework.web.BaseService;
import cn.edu.cmu.vo.XmVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
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

    @Override
    public List list(Object... conditions) throws Exception {
        XmParams params = new XmParams();
        XmParams.Criteria c1 = params.createCriteria();
        XmParams.Criteria c2 = params.or();
        if (conditions != null && conditions.length > 0 && conditions[0] != null) {
            Xm xm = (Xm) conditions[0];

            if (StringUtils.isNotEmpty(xm.getXmcc())) {
                c1.andXmmcLike("%" + xm.getXmcc() + "%");
            }
            if(StringUtils.isNotEmpty(xm.getXmzm())){
                c2.andXmzmLike("%" + xm.getXmcc() + "%");
            }
            super.addOrderBy(params, conditions);
        }

        return dao.selectByExample(params);
    }

    @Override
    public boolean save(XmVo xmVo, HttpSession session) throws Exception {

        boolean success = false;
        boolean isEdit = false;
        Xm xm = xmVo.getXm();

        if(StringUtils.isEmpty(xm.getXmId())){
            //年度+90+4位流水号
            String xmbh = DateUtils.getYear() + "90" + MaxNumUtils.getMaxNum("xm",  DateUtils.getYear(), 4);
            String operatorCode = (String) session.getAttribute(CmuConstants.SESSION.USER_ID);
            logger.info("保存项目，生成项目编号,操作工号"+operatorCode+",项目编号："+xmbh);
            xm.setXmId(CmuStringUtil.UUID());
            xm.setXmbh(xmbh);
            xm.setOperatorCode(operatorCode);
        }

        if(isEdit){
            int count = dao.updateByPrimaryKeySelective(xm);
            success = count>0;
        }else{
            int count = dao.insertSelective(xm);
            success = count>0;
        }

        return success;
    }
}