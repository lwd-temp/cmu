package cn.edu.cmu.service;

import cn.edu.cmu.dao.DmGbMapper;
import cn.edu.cmu.dao.HzxyGbMapper;
import cn.edu.cmu.dao.HzxyMapper;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class JlxyServiceImpl extends BaseService<Hzxy, HzxyParams, HzxyMapper> implements JlxyService {


    @Autowired
    HzxyGbMapper hzxyGbMapper;
    @Autowired
    DmGbMapper dmGbMapper;




    @Override
    public boolean insertSave(Hzxy hzxy) {
        hzxy.setValid("1");
        hzxy.setCreateTime(new Date());
        int count = dao.insert(hzxy);
        HzxyGb hzxyGb = new HzxyGb();
        hzxyGb.setXyid(hzxy.getXyid());
        List<String> list = new ArrayList();
        list =  hzxy.getGbs();
        //国别关联表  多条数据
        for (int i = 0; i < list.size(); i++) {
            String gbxy =list.get(i);
            hzxyGb.setGbid(CmuStringUtil.UUID());
            hzxyGb.setGjdm(gbxy);
            hzxyGb.setValid("1");
            hzxyGb.setCreateTime(new Date());
            hzxyGbMapper.insert(hzxyGb);
        }
        //合作协议 主表 保存 一条数据
        if(count>0){
            return true;
        }else{
            return false;
        }
    }




    @Override
    public boolean updateSave(Hzxy hzxy) {
        //合作协议 主表 更新 一条数据
        hzxy.setCreateTime(new Date());
        hzxy.setValid("1");
        int count = dao.updateByPrimaryKey(hzxy);

        //删除  关联表 数据
        HzxyGb hzxyGb = new HzxyGb();
        hzxyGb.setValid("0");
        hzxyGb.setXyid(hzxy.getXyid());
        hzxyGbMapper.deleteByxyId(hzxyGb);

        //国别关联表  多条数据
        List<String> list = new ArrayList();
        list =  hzxy.getGbs();
        //国别关联表  多条数据
        for (int i = 0; i < list.size(); i++) {
            String gbxy =list.get(i);
            hzxyGb.setGbid(CmuStringUtil.UUID());
            hzxyGb.setGjdm(gbxy);
            hzxyGb.setValid("1");
            hzxyGb.setCreateTime(new Date());
            hzxyGbMapper.insert(hzxyGb);
        }

        if(count>0){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public List list(Hzxy Hzxy) {
        HzxyParams ex = new HzxyParams();
        if(Hzxy != null){
            HzxyParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(Hzxy.getXymc())){
                c.andXymcLike("%"+Hzxy.getXymc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    //分页查询 调用的事这个
    //conditions  参数就叫这个就行， 意思是 多个条件，
    @Override
    public List list(Object... conditions) throws Exception {
        HzxyParams params = new HzxyParams();
        if(conditions != null && conditions.length>0){
            String condition = (String) conditions[0];
            if(StringUtils.isNotEmpty(condition)){
                HzxyParams.Criteria c = params.createCriteria();
                c.andXymcLike("%"+condition+"%");//先按照这个查询，如果有多个条件 就在该这
            }
            super.addOrderBy(params,conditions);//排序
        }
        return dao.selectByExample(params);
    }
}
