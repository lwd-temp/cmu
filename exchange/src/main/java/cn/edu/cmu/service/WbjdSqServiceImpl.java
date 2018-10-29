package cn.edu.cmu.service;
import cn.edu.cmu.dao.*;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseService;
import cn.edu.cmu.vo.WbglVO;
import com.github.pagehelper.StringUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class WbjdSqServiceImpl extends BaseService<WbjdSq, WbjdSqParams, WbjdSqMapper> implements WbjdSqService {
    @Autowired
    private WbjdSxryMapper wbjdSxryMapper;

    @Autowired
    private WbjdGjMapper wbjdGjMapper;

    @Autowired
   private WbjdSqMapperExt wbjdSqMapperExt;

    @Autowired
    private WbjdZjMapper wbjdZjMapper;

    @Autowired
    private WbjdZjSxryMapper wbjdZjSxryMapper;

    @Override
    public List list(WbjdSq WbjdSq) {
        WbjdSqParams ex = new WbjdSqParams();
        if(WbjdSq != null){
            WbjdSqParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(WbjdSq.getZqrxm())){
                c.andZqrxmLike("%"+WbjdSq.getZqrxm()+"%");
            }
            if(StringUtils.isNotEmpty(WbjdSq.getDbtmc())){
                c.andDbtmcLike("%"+WbjdSq.getDbtmc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
    //分页查询
    @Override
    public List list(Object... conditions) throws Exception {
        WbjdSqParams params = new WbjdSqParams();
        WbjdSqParams.Criteria c = params.createCriteria();
        if(conditions != null && conditions.length>0 && conditions[0]!=null){ 
            WbjdSq jdsq = (WbjdSq) conditions[0];

            if(StringUtils.isNotEmpty(jdsq.getZqrxm())){
                c.andZqrxmLike("%"+jdsq.getZqrxm()+"%");
            }
            if(StringUtils.isNotEmpty(jdsq.getDbtmc())){
                c.andDbtmcLike("%"+jdsq.getDbtmc()+"%");
            }
            super.addOrderBy(params,conditions);
        }

        return dao.selectByExample(params);
    }
    @Override
    public List shlist(Object... conditions) throws Exception {
        WbjdSqParams params = new WbjdSqParams();
        WbjdSqParams.Criteria c = params.createCriteria();
        c.andStatusEqualTo(CmuConstants.TZ_STAUTS.REVIEW);
        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            WbjdSq jdsq = (WbjdSq) conditions[0];

            if(StringUtils.isNotEmpty(jdsq.getZqrxm())){
                c.andZqrxmLike("%"+jdsq.getZqrxm()+"%");
            }
            if(StringUtils.isNotEmpty(jdsq.getDbtmc())){
                c.andDbtmcLike("%"+jdsq.getDbtmc()+"%");
            }
            super.addOrderBy(params,conditions);
        }

        return dao.selectByExample(params);
    }

    @Override
    public boolean saveOrUpdate(WbglVO vo) throws Exception {
        boolean isEdit = false;//是否修改标志

        WbjdSq wbjdSq = new  WbjdSq();
        wbjdSq = vo.getWbjdSq();
        String[] cfgbIds = vo.getCfgbIds();
        List<WbjdSxry> sxr = vo.getSxr();
        if(StringUtil.isEmpty(wbjdSq.getLfid())){
            String keyId = CmuStringUtil.UUID();
            wbjdSq.setLfid(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }
        //无论新增，还是修改，需要再成员表中维护主外键关系
        if((!CollectionUtils.isEmpty(sxr)) ){
            for (WbjdSxry r : sxr) {
                r.setLfid(wbjdSq.getLfid());//设置外键团组计划id
            }
        }
        if(isEdit){ //修改
            dao.updateByPrimaryKeySelective(wbjdSq);
            //从表先删后查
            deleteSxr(wbjdSq);
            //删完后添加从表数据
            insertSxr(sxr);
            //国别先删除后插入
            deleteGb(wbjdSq);
            //删完后添加从表国别数据
            insertGb(wbjdSq,cfgbIds);

        }else{ //添加
            System.out.println(wbjdSq);

            dao.insertSelective(wbjdSq);
            insertSxr(sxr);
            insertGb(wbjdSq,cfgbIds);
        }
        return true;
    }
    //插入新的国别
    private void insertGb(WbjdSq wbjdSq, String[] cfgbIds) {
        if(!ArrayUtils.isEmpty(cfgbIds)) {
            for (String gbDm : cfgbIds) {
                WbjdGj gb = new WbjdGj(CmuStringUtil.UUID(), gbDm, wbjdSq.getLfid(), null, null);
                wbjdGjMapper.insertSelective(gb);
            }
        }
    }

    //删除对应的国别
    private void deleteGb(WbjdSq wbjdSq) {
        WbjdGjParams params = new WbjdGjParams();
        params.createCriteria().andLfidEqualTo(wbjdSq.getLfid());
        List oldGbs = wbjdGjMapper.selectByExample(params);
        if(!CollectionUtils.isEmpty(oldGbs)) {
            for (Object obj : oldGbs) {
                WbjdGj oldGb = (WbjdGj)obj;
                wbjdGjMapper.deleteByPrimaryKey(oldGb.getGjid());
            }
        }
    }
    //删除对应的随行成员
    private void deleteSxr(WbjdSq wbjdSq){
        WbjdSxryParams params = new WbjdSxryParams();
        params.createCriteria().andLfidEqualTo(wbjdSq.getLfid());
        List oldSxrs = wbjdSxryMapper.selectByExample(params);
        if(!CollectionUtils.isEmpty(oldSxrs)) {
            for (Object obj : oldSxrs) {
                WbjdSxry oldSxr = (WbjdSxry)obj;
                wbjdSxryMapper.deleteByPrimaryKey(oldSxr.getRyid());
            }
        }
    }
     //添加对应的随行成员
    private void insertSxr(List<WbjdSxry> sxr){
        if(!CollectionUtils.isEmpty(sxr)) {
            for (WbjdSxry r : sxr) {
                r.setRyid(CmuStringUtil.UUID());
                wbjdSxryMapper.insertSelective(r);
            }
        }
    }
    /**
     * 审核处理，根据id，更新状态
     * @return
     */
    @Override
    public boolean sh(WbjdSq wbjdSq,List sxryList,List gbDomainList)throws Exception {
        String zjid = CmuStringUtil.UUID();
        int count  = dao.updateByPrimaryKeySelective(wbjdSq);
        //新增到总结表中 ，申请的数据
        if(wbjdSq.getStatus().equals(CmuConstants.TZ_STAUTS.PASS)){
            insertWbjdZj(wbjdSq,zjid);
            insertWbjdZjSxry(sxryList,zjid);
            insertWbjdZjGb(gbDomainList,zjid);
        }

        return count>0  ;
    }

    private void insertWbjdZjGb(List<WbjdGj> cfgbIds, String zjid) {
        if(!CollectionUtils.isEmpty(cfgbIds)){
            for (WbjdGj r : cfgbIds) {
                WbjdGj gb = new WbjdGj();
                gb.setGjid(CmuStringUtil.UUID());
                gb.setLfjdgjid(r.getLfjdgjid());
                gb.setLfid(zjid);
                wbjdGjMapper.insertSelective(gb);
            }
        }
    }

    private void insertWbjdZjSxry(List<WbjdSxry> sxrs ,String zjid){
        if((!CollectionUtils.isEmpty(sxrs)) ){
            for (WbjdSxry r : sxrs) {
                WbjdZjSxry wbjdZjSxry = new WbjdZjSxry();
                wbjdZjSxry.setGj(r.getGj());
                wbjdZjSxry.setLfid(zjid);
                wbjdZjSxry.setRyid(CmuStringUtil.UUID());
                wbjdZjSxry.setXm(r.getXm());
                wbjdZjSxry.setZw(r.getZw());
                wbjdZjSxryMapper.insertSelective(wbjdZjSxry);
            }
        }
    }

    private void insertWbjdZj(WbjdSq wbjdSq,String zjid) {
        //审核通过 总结表新增一条数据
        /*WbjdZj wbjdZj = new WbjdZj();
        wbjdZj.setZjid(zjid);
        wbjdZj.setLfid(wbjdSq.getLfid());
        wbjdZj.setStatus(wbjdSq.getStatus());
        wbjdZj.setDbtmc(wbjdSq.getDbtmc());
        wbjdZj.setFwcg(wbjdSq.getFwcg());
        wbjdZj.setJdbm(wbjdSq.getJdbm());
        wbjdZj.setJdlx(wbjdSq.getJdlx());
        wbjdZj.setJfly(wbjdSq.getJfly());
        wbjdZj.setLfmd(wbjdSq.getLfmd());
        wbjdZj.setLfmdQt(wbjdSq.getLfmdQt());
        wbjdZj.setLfrs(wbjdSq.getLfrs());
        wbjdZj.setLfsj(wbjdSq.getLfsj());
        wbjdZj.setLp(wbjdSq.getLp());
        wbjdZj.setLpsl(wbjdSq.getLpsl());
        wbjdZj.setQkjl(wbjdSq.getQkjl());
        wbjdZj.setTlsjEnd(wbjdSq.getTlsjEnd());
        wbjdZj.setTlsjStart(wbjdSq.getTlsjStart());
        wbjdZj.setTzcsrq(wbjdSq.getTzcsrq());
        wbjdZj.setTzgj(wbjdSq.getTzgj());
        wbjdZj.setTzgzdw(wbjdSq.getTzgzdw());
        wbjdZj.setTzxb(wbjdSq.getTzxb());
        wbjdZj.setTzxm(wbjdSq.getTzxm());
        wbjdZj.setTzzw(wbjdSq.getTzzw());
        wbjdZj.setTzxsly(wbjdSq.getTzxsly());
        wbjdZj.setTzzy(wbjdSq.getTzzy());
        wbjdZj.setYjtm(wbjdSq.getYjtm());
        wbjdZj.setYqcg(wbjdSq.getYqcg());
        wbjdZj.setYqxx(wbjdSq.getYqxx());
        wbjdZj.setZqlxrdh(wbjdSq.getZqlxrdh());
        wbjdZj.setZqlxrxm(wbjdSq.getZqlxrxm());
        wbjdZj.setZqrdh(wbjdSq.getZqrdh());
        wbjdZj.setZqrxm(wbjdSq.getZqrxm());*//*
        //所有字段
        wbjdZjMapper.insertSelective(wbjdZj);*/
    }


    @Override
    public WbjdSq selectSqExtPdf(String id) throws Exception {
        return wbjdSqMapperExt.selectSqExtPdf(id);
    }
}

