package cn.edu.cmu.service;

import cn.edu.cmu.dao.RoleMapper;
import cn.edu.cmu.domain.Role;
import cn.edu.cmu.domain.RoleParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl extends BaseService<Role, RoleParams, RoleMapper> implements RoleService {


    @Override
    public List list(Role Role) {
        RoleParams ex = new RoleParams();
        if(Role != null){
            RoleParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(Role.getRoleName())){
                c.andRoleNameLike("%"+Role.getRoleName()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
