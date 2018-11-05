package cn.edu.cmu.service;
import cn.edu.cmu.dao.CgRwzxqkfkMapper;
import cn.edu.cmu.dao.CgRwzxqkfkMapperExt;
import cn.edu.cmu.domain.CgDqcgj;
import cn.edu.cmu.domain.CgDqcgjParams;
import cn.edu.cmu.domain.CgRwzxqkfk;
import cn.edu.cmu.domain.CgRwzxqkfkParams;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseService;
import com.github.pagehelper.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CgDqcgjGgServiceImpl extends BaseService<CgRwzxqkfk, CgRwzxqkfkParams, CgRwzxqkfkMapper> implements CgDqcgjGgService {

    @Autowired
    CgRwzxqkfkMapperExt cgRwzxqkfkMapperExt;

    @Override
    public List list(CgRwzxqkfk cgRwzxqkfk) throws Exception {
        CgRwzxqkfkParams ex = new CgRwzxqkfkParams();
        if(cgRwzxqkfk != null){
            CgRwzxqkfkParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(cgRwzxqkfk.getCfgjdq())){
                c.andCfgjdqLike("%"+cgRwzxqkfk.getCfgjdq()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions)  throws Exception{
        CgDqcgjParams params = new CgDqcgjParams();
        CgDqcgjParams.Criteria c1 = params.createCriteria();
        CgDqcgjParams.Criteria c2 = params.or();
        c1.andStatusEqualTo("04");//并且通过才查询
        c2.andStatusEqualTo("04");//通过审核的

        if (conditions != null && conditions.length > 0 && conditions[0] != null) {
            CgDqcgj cgDqcgj = (CgDqcgj) conditions[0];
            if (StringUtils.isNotEmpty(cgDqcgj.getCfgj())) {
                c1.andCfgjLike("%" + cgDqcgj.getCfgj() + "%");
                c2.andCfgjLike("%" + cgDqcgj.getCfgj() + "%");
            }
            super.addOrderBy(params,conditions);
        }
        return cgRwzxqkfkMapperExt.selectZjByExample(params);
    }

    @Override
    public boolean saveorupdate(CgRwzxqkfk cgRwzxqkfk) {
        boolean isEdit = false;//是否修改标志

        if(StringUtil.isEmpty(cgRwzxqkfk.getRwfkId())){
            String keyId = CmuStringUtil.UUID();
            cgRwzxqkfk.setRwfkId(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }
        if(isEdit){ //修改
            dao.updateByPrimaryKeySelective(cgRwzxqkfk);
        }else{ //添加
            dao.insertSelective(cgRwzxqkfk);
        }
        return true;
    }
}
