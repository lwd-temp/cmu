package cn.edu.cmu.service;

import cn.edu.cmu.dao.DmGbMapper;
import cn.edu.cmu.dao.HzxyGbMapper;
import cn.edu.cmu.dao.HzxyMapper;
import cn.edu.cmu.domain.Hzxy;
import cn.edu.cmu.domain.HzxyGb;
import cn.edu.cmu.domain.HzxyGbParams;
import cn.edu.cmu.domain.HzxyParams;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseService;
import cn.edu.cmu.vo.HzxyVo;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class JlxyServiceImpl extends BaseService<Hzxy, HzxyParams, HzxyMapper> implements JlxyService {


    @Autowired
    HzxyGbMapper hzxyGbMapper;
    @Autowired
    DmGbMapper dmGbMapper;




    @Override
    public boolean insertSave(HzxyVo hzxyVo) {

        Hzxy hzxy = hzxyVo.getHzxy();
        hzxy.setXyid(CmuStringUtil.UUID());
        int count = dao.insertSelective(hzxy);



        List<String> list = null;
        if(hzxyVo.getGbs()!=null){
            list = Arrays.asList(hzxyVo.getGbs());
        }

        HzxyGb hzxyGb = null;
        if(!CollectionUtils.isEmpty(list)){
            for (int i = 0; i < list.size(); i++) {
                String gbxy =list.get(i);
                hzxyGb = new HzxyGb();
                hzxyGb.setGbid(CmuStringUtil.UUID());
                hzxyGb.setGjdm(gbxy);
                hzxyGb.setXyid(hzxy.getXyid());
                hzxyGbMapper.insertSelective(hzxyGb);
            }
        }
        return count>0;
    }




    @Override
    public boolean updateSave(HzxyVo hzxyVo) {
        //合作协议 主表 更新 一条数据

        Hzxy hzxy = hzxyVo.getHzxy();
        int count = dao.updateByPrimaryKeySelective(hzxy);

        //删除国别表
        HzxyGbParams gbParam = new HzxyGbParams();
        gbParam.createCriteria().andXyidEqualTo(hzxy.getXyid());
        hzxyGbMapper.deleteByExample(gbParam);

        //国别关联表  多条数据
        List<String> list = null;
        if(hzxyVo.getGbs()!=null){
            list = Arrays.asList(hzxyVo.getGbs());
        }

        HzxyGb hzxyGb = null;
        if(!CollectionUtils.isEmpty(list)){
            for (int i = 0; i < list.size(); i++) {
                String gbxy =list.get(i);
                hzxyGb = new HzxyGb();
                hzxyGb.setGbid(CmuStringUtil.UUID());
                hzxyGb.setGjdm(gbxy);
                hzxyGb.setXyid(hzxy.getXyid());
                hzxyGbMapper.insertSelective(hzxyGb);
            }
        }

       return count>0;
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
        HzxyParams.Criteria c = params.createCriteria();

        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            Hzxy hzxy = (Hzxy) conditions[0];
            if(StringUtils.isNotEmpty(hzxy.getXymc())){

                c.andXymcLike("%"+hzxy.getXymc()+"%");//先按照这个查询，如果有多个条件 就在该这
            }
            super.addOrderBy(params,conditions);//排序
        }
        return dao.selectByExample(params);
    }
}
