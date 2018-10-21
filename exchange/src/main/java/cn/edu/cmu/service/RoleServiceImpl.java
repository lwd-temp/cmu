package cn.edu.cmu.service;

import cn.edu.cmu.dao.PowerMapper;
import cn.edu.cmu.dao.RoleMapper;
import cn.edu.cmu.dao.RoleMenuMapper;
import cn.edu.cmu.domain.Role;
import cn.edu.cmu.domain.RoleMenu;
import cn.edu.cmu.domain.RoleMenuParams;
import cn.edu.cmu.domain.RoleParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl extends BaseService<Role, RoleParams, RoleMapper> implements RoleService {


    @Autowired
    private RoleMenuMapper roleMenuMapper;
    @Autowired
    private PowerMapper powerMapper;

    @Override
    public List list(Role Role) {
        RoleParams ex = new RoleParams();
        if (Role != null) {
            RoleParams.Criteria c = ex.createCriteria();
            if (StringUtils.isNotEmpty(Role.getRoleName())) {
                c.andRoleNameLike("%" + Role.getRoleName() + "%");
            }
        }
        return dao.selectByExample(ex);
    }


    @Override
    public List list(Object... conditions) throws Exception {
        RoleParams params = new RoleParams();
        RoleParams.Criteria c = params.createCriteria();
        if (conditions != null && conditions.length > 0 && conditions[0] != null) {
            Role role = (Role) conditions[0];

            if (StringUtils.isNotEmpty(role.getRoleName())) {
                c.andRoleNameLike("%" + role.getRoleName() + "%");
            }
            super.addOrderBy(params, conditions);
        }

        return dao.selectByExample(params);
    }

    @Override
    public List<RoleMenu> getRoleMenuIds(String roleId) throws Exception {
        RoleMenuParams param = new RoleMenuParams();
        param.createCriteria().andRoleIdEqualTo(roleId);

        List list = roleMenuMapper.selectByExample(param);
        return list;
    }

    @Override
    public boolean grantMenuUpdate(String roleId, String[] menuIds) {

        RoleMenuParams params = new RoleMenuParams();
        params.createCriteria().andRoleIdEqualTo(roleId);
        int delCount = roleMenuMapper.deleteByExample(params);
        int count = 0;
        for (String menuId : menuIds) {
            RoleMenu rm = new RoleMenu(roleId, menuId, null, null);
            count += roleMenuMapper.insertSelective(rm);
        }


        return count == menuIds.length;
    }

    @Override
    public List<String> selectUserRoles(String userId) {
        return powerMapper.selectUserRoles(userId);
    }

    @Override
    public boolean deleteMulti(String[] ids) throws Exception {


        if(ArrayUtils.isNotEmpty(ids)){
            for (String id : ids) {
               deleteById(id);
            }
            return true;
        }


        return false;
    }
}
