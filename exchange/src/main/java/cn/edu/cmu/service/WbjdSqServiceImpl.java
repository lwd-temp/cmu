package cn.edu.cmu.service;
import cn.edu.cmu.dao.*;
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
public class WbjdSqServiceImpl extends BaseService<WbjdSq, WbjdSqParams, WbjdSqMapper> implements WbjdSqService {
    @Autowired
    private WbjdSxryMapper wbjdSxryMapper;

    @Autowired
    private WbjdGjMapper wbjdGjMapper;


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
    public boolean saveOrUpdate(WbglVO vo) throws Exception {
        boolean isEdit = false;//是否修改标志

        WbjdSq WbjdSq = vo.getWbjdSq();
        String[] cfgbIds = vo.getCfgbIds();
        List<WbjdSxry> sxr = vo.getSxr();
        if(StringUtil.isEmpty(WbjdSq.getLfid())){
            String keyId = CmuStringUtil.UUID();
            WbjdSq.setLfid(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }
        //无论新增，还是修改，需要再成员表中维护主外键关系
        if((!CollectionUtils.isEmpty(sxr)) ){
            for (WbjdSxry r : sxr) {
                r.setLfid(WbjdSq.getLfid());//设置外键团组计划id
            }
        }
        if(isEdit){ //修改
            dao.updateByPrimaryKeySelective(WbjdSq);
            //从表先删后查
            deleteSxr(WbjdSq);
            //删完后添加从表数据
            insertSxr(sxr);
            //国别先删除后插入
            deleteGb(WbjdSq);
            //删完后添加从表国别数据
            insertGb(WbjdSq,cfgbIds);

        }else{ //添加
            System.out.println(WbjdSq);
            dao.insertSelective(WbjdSq);
            insertSxr(sxr);
            insertGb(WbjdSq,cfgbIds);
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

}
