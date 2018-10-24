package cn.edu.cmu.service;
import cn.edu.cmu.dao.CgDqcgjMapper;
import cn.edu.cmu.dao.CgRwzxqkfkMapper;
import cn.edu.cmu.dao.CgTzjhMapper;
import cn.edu.cmu.dao.DmXbMapper;
import cn.edu.cmu.domain.CgDqcgj;
import cn.edu.cmu.domain.CgDqcgjParams;
import cn.edu.cmu.domain.CgRwzxqkfk;
import cn.edu.cmu.domain.DmXb;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseService;
import com.github.pagehelper.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    private CgRwzxqkfkMapper cgRwzxqkfkMapper;

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
    public String selectXb(String xb) {
        DmXb dmXb = (DmXb) dmXbMapper.selectByPrimaryKey(xb);
        return dmXb.getName();
    }

    @Override
    public String selectCglx(String cglx) {
        return null;
    }

    @Override
    public String selectCfmd(String cfmd) {
        return null;
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
        dao.updateByPrimaryKeySelective(cgDqcgj);
        if(cgDqcgj.getStatus().equals(CmuConstants.TZ_STAUTS.PASS)){
            CgRwzxqkfk cgRwzxqkfk = new CgRwzxqkfk();
            String keyId = CmuStringUtil.UUID();

            cgRwzxqkfk.setRwfkId(keyId);
            cgRwzxqkfk.setTzdw("中国医科大学");//出访单位
            cgRwzxqkfk.setTzzw(cgDqcgj.getZw());//团长职务
            cgRwzxqkfk.setCgid(cgDqcgj.getCgid());//Cgid
            cgRwzxqkfk.setTzxm(cgDqcgj.getXm());//团长姓名
            cgRwzxqkfk.setSsejdw(cgDqcgj.getSsejdw());//二级单位
            cgRwzxqkfk.setXb(cgDqcgj.getXb());//性别
            cgRwzxqkfk.setCfgjdq(cgDqcgj.getCfgj());//出访国家

            cgRwzxqkfkMapper.insertSelective(cgRwzxqkfk);
        }
        return true;
    }
}
