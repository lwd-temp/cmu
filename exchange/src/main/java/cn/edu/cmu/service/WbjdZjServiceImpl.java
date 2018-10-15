package cn.edu.cmu.service;

import cn.edu.cmu.dao.WbjdGjMapper;
import cn.edu.cmu.dao.WbjdZjMapper;
import cn.edu.cmu.dao.WbjdZjSxryMapper;
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
public class WbjdZjServiceImpl extends BaseService<WbjdZj, WbjdZjParams, WbjdZjMapper> implements WbjdZjService {

    @Autowired
    private WbjdZjSxryMapper wbjdZjSxryMapper;
    @Autowired
    private WbjdGjMapper wbjdGjMapper;

    @Override
    public List list(Object... conditions) throws Exception {
        WbjdZjParams params = new WbjdZjParams();
        WbjdZjParams.Criteria c = params.createCriteria();
        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            WbjdZj jdsq = (WbjdZj) conditions[0];
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
    public List list(WbjdZj wbjdZj) throws Exception {
        WbjdZjParams ex = new WbjdZjParams();
        if(wbjdZj != null){
            WbjdZjParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(wbjdZj.getZqrxm())){
                c.andZqrxmLike("%"+wbjdZj.getZqrxm()+"%");
            }
            if(StringUtils.isNotEmpty(wbjdZj.getDbtmc())){
                c.andDbtmcLike("%"+wbjdZj.getDbtmc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    @Override
    public boolean update(WbglVO vo) throws Exception {
        WbjdZj wbjdZj = vo.getWbjdZj();
        String[] cfgbIds = vo.getCfgbIds();
        List<WbjdZjSxry> sxr = vo.getZjsxr();

        dao.updateByPrimaryKeySelective(wbjdZj);
        String zjid = wbjdZj.getZjid();
        //删除随行人
        deleteSxr(zjid);
        //新增随行人
        insertSxr(sxr,zjid);
        //删除国别
        deleteGb(zjid);
        //新增国别
        insertGb(zjid,cfgbIds);

        return true;
    }
    //删除对应的随行成员
    private void deleteSxr(String zjid){
        WbjdZjSxryParams params = new WbjdZjSxryParams();
        params.createCriteria().andLfidEqualTo(zjid);
        List oldSxrs = wbjdZjSxryMapper.selectByExample(params);
        if(!CollectionUtils.isEmpty(oldSxrs)) {
            for (Object obj : oldSxrs) {
                WbjdZjSxry oldSxr = (WbjdZjSxry)obj;
                wbjdZjSxryMapper.deleteByPrimaryKey(oldSxr.getRyid());
            }
        }
    }
    //添加对应的随行成员
    private void insertSxr(List<WbjdZjSxry> sxr, String zjid){
        if(!CollectionUtils.isEmpty(sxr)) {
            for (WbjdZjSxry r : sxr) {
                r.setRyid(CmuStringUtil.UUID());
                r.setLfid(zjid);
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
