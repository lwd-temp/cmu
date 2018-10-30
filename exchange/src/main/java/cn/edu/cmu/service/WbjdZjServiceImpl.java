package cn.edu.cmu.service;
import cn.edu.cmu.dao.WbjdGjMapper;
import cn.edu.cmu.dao.WbjdZjMapper;
import cn.edu.cmu.dao.WbjdZjMapperExt;
import cn.edu.cmu.dao.WbjdZjSxryMapper;
import cn.edu.cmu.domain.*;
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
            if(StringUtils.isNotEmpty(jdsq.getZqrxm())){
                c1.andZqrxmLike("%"+jdsq.getZqrxm()+"%");
                c2.andZqrxmLike("%"+jdsq.getZqrxm()+"%");
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
    public boolean saveOrupdate(WbglVO vo) throws Exception {
        WbjdZj wbjdZj = vo.getWbjdZj();
        String[] cfgbIds = vo.getCfgbIds();
        List<WbjdZjSxry> sxr = vo.getZjsxr();
        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(wbjdZj.getZjid())){
            String keyId = CmuStringUtil.UUID();
            wbjdZj.setZjid(keyId);
            dao.insertSelective(wbjdZj);
        }else{
            dao.updateByPrimaryKeySelective(wbjdZj);
        }
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
