package cn.edu.cmu.service;
import cn.edu.cmu.dao.*;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseService;
import cn.edu.cmu.vo.WbglVO;
import com.github.pagehelper.StringUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


@Service
public class WbjdZjServiceImpl extends BaseService<WbjdZj, WbjdZjParams, WbjdZjMapper> implements WbjdZjService {

    @Autowired
    private WbjdZjSxryMapper wbjdZjSxryMapper;

    @Autowired
    private WbZjLpMapper wbZjLpMapper;

    @Autowired
    private WbjdGjMapper wbjdGjMapper;
    @Autowired
    private WbjdZjMapperExt wbjdZjMapperExt;


    @Override
    public List list(Object... conditions) throws Exception {
        WbjdSqParams params = new WbjdSqParams();
        WbjdSqParams.Criteria c1 = params.createCriteria();
        WbjdSqParams.Criteria c2 = params.or();

        c1.andStatusEqualTo("04");//并且通过才查询
        c2.andStatusEqualTo("04");//通过审核的会议申请

        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            WbjdSq jdsq = (WbjdSq) conditions[0];
            if(StringUtils.isNotEmpty(jdsq.getZqlxrxm())){
                c1.andZqlxrxmLike("%"+jdsq.getZqlxrxm()+"%");
                c2.andZqlxrxmLike("%"+jdsq.getZqlxrxm()+"%");
            }
            if(StringUtils.isNotEmpty(jdsq.getDbtmc())){
                c1.andDbtmcLike("%"+jdsq.getDbtmc()+"%");
                c2.andDbtmcLike("%"+jdsq.getDbtmc()+"%");
            }
            super.addOrderBy(params,conditions);
        }
        return wbjdZjMapperExt.selectZjByExample(params);
    }


    @Override
    public List list(WbjdZj wbjdZj) throws Exception {
        WbjdZjParams ex = new WbjdZjParams();
        if(wbjdZj != null){
            WbjdZjParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(wbjdZj.getZqlxrxm())){
                c.andZqlxrxmLike("%"+wbjdZj.getZqlxrxm()+"%");
            }
            if(StringUtils.isNotEmpty(wbjdZj.getDbtmc())){
                c.andDbtmcLike("%"+wbjdZj.getDbtmc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }



    @Override
    public boolean saveOrupdate(WbglVO vo) throws Exception {
        boolean isEdit = false;//是否修改标志
        WbjdZj wbjdZj = new WbjdZj();
        wbjdZj = vo.getWbjdZj();
        String[] cfgbIds = vo.getCfgbIds();
        List<WbjdZjSxry> sxr = vo.getZjsxr();
        List<WbjdLp> lpList = vo.getLp();
        if(StringUtil.isEmpty(wbjdZj.getZjid())){
            String keyId = CmuStringUtil.UUID();
            wbjdZj.setZjid(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }
        //无论新增，还是修改，需要再成员表中维护主外键关系
        if((!CollectionUtils.isEmpty(sxr)) ){
            for (WbjdZjSxry r : sxr) {
                r.setLfid(wbjdZj.getZjid());//设置外键团组计划id
            }
        }



        if((!CollectionUtils.isEmpty(lpList)) ){
            for (WbjdLp lp : lpList) {
                lp.setLfid(wbjdZj.getZjid());//设置外键团组计划id
            }
        }


        if(isEdit){ //修改
            dao.updateByPrimaryKeySelective(wbjdZj);
            //从表先删后查
            deleteSxr(wbjdZj);
            //删完后添加从表数据
            insertSxr(sxr);

            //礼品从表信息，先删后插
            deleteLp(wbjdZj);

            insertLp(lpList,wbjdZj);

            //国别先删除后插入
            deleteGb(wbjdZj.getZjid());
            //删完后添加从表国别数据
            insertGb(wbjdZj.getZjid(),cfgbIds);

        }else{ //添加
            dao.insertSelective(wbjdZj);
            insertSxr(sxr);
            insertLp(lpList,wbjdZj);//礼品从表
            insertGb(wbjdZj.getZjid(),cfgbIds);
        }
        return true;
    }


    /**
     * 删除总结的 礼品信息
     * @param wbjdZj
     */
    private void deleteLp(WbjdZj wbjdZj) {
        WbZjLpParams param = new WbZjLpParams();
        param.createCriteria().andZjidEqualTo(wbjdZj.getZjid());
        wbZjLpMapper.deleteByExample(param);
    }


    /**
     * 删除完成后重新添加礼品信息
     * @param lpList
     */
    private void insertLp(List<WbjdLp> lpList,WbjdZj wbjdZj) throws InvocationTargetException, IllegalAccessException {
        for (WbjdLp wbjdLp : lpList) {
            WbZjLp lp = new WbZjLp();
            BeanUtils.copyProperties(lp,wbjdLp);
            lp.setId(CmuStringUtil.UUID());
            lp.setZjid(wbjdZj.getZjid());
            wbZjLpMapper.insertSelective(lp);
        }
    }


    /**
     * 查询礼品信息
     * @param id
     * @return
     */
    @Override
    public List<WbjdLp> queryLiPinList(String id) {
        WbZjLpParams params = new WbZjLpParams();
        params.createCriteria().andZjidEqualTo(id);
//        return wbjdLpMapper.selectByExample(params);
        return wbZjLpMapper.selectByExample(params);
    }
    //删除对应的随行成员
    private void deleteSxr(WbjdZj wbjdZj){
        WbjdZjSxryParams params = new WbjdZjSxryParams();
        params.createCriteria().andLfidEqualTo(wbjdZj.getZjid());
        List oldSxrs = wbjdZjSxryMapper.selectByExample(params);
        if(!CollectionUtils.isEmpty(oldSxrs)) {
            for (Object obj : oldSxrs) {
                WbjdZjSxry oldSxr = (WbjdZjSxry)obj;
                wbjdZjSxryMapper.deleteByPrimaryKey(oldSxr.getRyid());
            }
        }
    }
    //添加对应的随行成员
    private void insertSxr(List<WbjdZjSxry> sxr){
        if(!CollectionUtils.isEmpty(sxr)) {
            for (WbjdZjSxry r : sxr) {
                r.setRyid(CmuStringUtil.UUID());
                wbjdZjSxryMapper.insertSelective(r);
            }
        }
    }
    //删除对应的国别
    private void deleteGb(String zjid) {
        WbjdGjParams params = new WbjdGjParams();
        params.createCriteria().andLfidEqualTo(zjid);
        List oldGbs = wbjdGjMapper.selectByExample(params);
        if(!CollectionUtils.isEmpty(oldGbs)) {
            for (Object obj : oldGbs) {
                WbjdGj oldGb = (WbjdGj)obj;
                wbjdGjMapper.deleteByPrimaryKey(oldGb.getGjid());
            }
        }
    }
    //插入新的国别
    private void insertGb(String zjid, String[] cfgbIds) {
        if(!ArrayUtils.isEmpty(cfgbIds)) {
            for (String gbDm : cfgbIds) {
                WbjdGj gb = new WbjdGj(CmuStringUtil.UUID(), gbDm, zjid, null, null);
                wbjdGjMapper.insertSelective(gb);
            }
        }
    }



}
