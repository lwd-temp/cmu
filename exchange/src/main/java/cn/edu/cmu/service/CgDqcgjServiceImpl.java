package cn.edu.cmu.service;
import cn.edu.cmu.dao.*;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.UserContext;
import cn.edu.cmu.framework.threadpool.SysThreadPoolRunner;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.util.ResourceBundleUtils;
import cn.edu.cmu.framework.util.WeChartUtils;
import cn.edu.cmu.framework.web.BaseService;
import com.github.pagehelper.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

@Service
public class CgDqcgjServiceImpl extends BaseService<CgDqcgj, CgDqcgjParams, CgDqcgjMapper> implements CgDqcgjService {

    @Autowired
    private CgDqcgjMapper cgDqcgjMapper;

    @Autowired
    private CgTzjhMapper cgTzjhMapper;

    @Autowired
    private DmXbMapper dmXbMapper;

    @Autowired
    private DmCfmdMapper dmCfmdMapper;

    @Autowired
    private DmCgSqlxMapper dmCgSqlxMapper;

    @Autowired
    private CgRwzxqkfkMapper cgRwzxqkfkMapper;

    @Autowired
    private CgDqcgjMapperExt cgDqcgjMapperExt;

    @Override
    public List list(CgDqcgj cgDqcgj) {
        CgDqcgjParams ex = new CgDqcgjParams();
        if(cgDqcgj != null){
            CgDqcgjParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(cgDqcgj.getCfgj())){
                c.andCfgjLike("%"+cgDqcgj.getCfgj()+"%");
            }
        }
        return dao.selectByExample(ex);
    }


    @Override
    public List list(Object... conditions) throws Exception {
        CgDqcgjParams params = new CgDqcgjParams();
        CgDqcgjParams.Criteria c = params.createCriteria();
        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            CgDqcgj cgDqcgj= (CgDqcgj) conditions[0];
            if(StringUtils.isNotEmpty(cgDqcgj.getCfgj())){
                c.andCfgjLike("%"+cgDqcgj.getCfgj()+"%");
            }
            super.addOrderBy(params,conditions);
        }
        return dao.selectByExample(params);
    }


    @Override
    public boolean saveOrUpdate(CgDqcgj cgDqcgj) throws Exception {
        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(cgDqcgj.getCgid())){
            String keyId = CmuStringUtil.UUID();
            cgDqcgj.setCgid(keyId);
            cgDqcgj.setOperator(UserContext.getUserId());
        }else{//如果存在id则说明是修改
            isEdit = true;
        }
        if(isEdit){ //修改
            dao.updateByPrimaryKeySelective(cgDqcgj);
        }else{ //添加
            dao.insertSelective(cgDqcgj);
        }
        return true;
    }


    @Override
    public String selectCglx(String cglx) {
        DmCgSqlx dmCgSqlx = (DmCgSqlx) dmCgSqlxMapper.selectByPrimaryKey(cglx);
        return dmCgSqlx.getName();
    }

    @Override
    public String selectCfmd(String cfmd) {
        DmCfmd dmCfmd = (DmCfmd) dmCfmdMapper.selectByPrimaryKey(cfmd);
        return dmCfmd.getName();
    }



    @Override
    public List shlist(Object... conditions) throws Exception{
        CgDqcgjParams params = new CgDqcgjParams();
        CgDqcgjParams.Criteria c = params.createCriteria();
        c.andStatusEqualTo(CmuConstants.TZ_STAUTS.REVIEW);
        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            CgDqcgj cgDqcgj= (CgDqcgj) conditions[0];
            if(StringUtils.isNotEmpty(cgDqcgj.getCfgj())){
                c.andCfgjLike("%"+cgDqcgj.getCfgj()+"%");
            }
            if(StringUtils.isNotEmpty(cgDqcgj.getXm())){
                c.andXmLike("%"+cgDqcgj.getXm()+"%");
            }
            super.addOrderBy(params,conditions);
        }
        return dao.selectByExample(params);
    }

    @Override
    public boolean shSave(CgDqcgj cgDqcgj) {
        cgDqcgj.setShrq(new Date());
        int count = dao.updateByPrimaryKeySelective(cgDqcgj);


        cgDqcgj = dao.selectByPrimaryKey(cgDqcgj.getCgid());
        if(CmuConstants.DQCGJ.STATUS_BACK.equals(cgDqcgj.getStatus())){

            String title =          ResourceBundleUtils.getString("ifs.wechat.dqcgj.shth.title");//【通知】短期出国境审核
            String description =    ResourceBundleUtils.getString("ifs.wechat.dqcgj.shth.description");//国际事务部通知
            String content =        ResourceBundleUtils.getString("ifs.wechat.dqcgj.shth.content");//尊敬的老师您好，您的短期出国境申请已退回，请知悉。

            SysThreadPoolRunner.submit(new WeChartUtils("", cgDqcgj.getOperator(), title, description, content));
        }

        return count>0;
    }

    /*
    短期出国境人员信息下载
     */
    @Override
    public List cggllistExp(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        CgDqcgjParams params = new CgDqcgjParams();
        CgDqcgjParams.Criteria c=params.createCriteria();
        c.andStatusEqualTo(CmuConstants.TZ_STAUTS.PASS);

        if (conditions != null && conditions.length > 0 && conditions[0] != null) {
            CgDqcgj cggl = (CgDqcgj) conditions[0];
//
            if (StringUtils.isNotEmpty(cggl.getCfgj())) {
                c.andCfgjLike("%" + cggl.getCfgj() + "%");
            }

            super.addOrderBy(params, conditions);
        }
        return cgDqcgjMapperExt.selectByExampleTranslateCode(params);

    }
}
