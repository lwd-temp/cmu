package cn.edu.cmu.service;

import cn.edu.cmu.dao.UserRoleMapper;
import cn.edu.cmu.domain.UserRole;
import cn.edu.cmu.domain.UserRoleParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserRoleServiceImpl extends BaseService<UserRole, UserRoleParams, UserRoleMapper> implements UserRoleService {


    @Override
    public List list(UserRole UserRole) {
        UserRoleParams ex = new UserRoleParams();
        if(UserRole != null){
            UserRoleParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(UserRole.getRoleId())){
                c.andRoleIdEqualTo("%"+UserRole.getRoleId()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }
}
