package cn.edu.cmu.service;

import cn.edu.cmu.dao.RoleMapper;
import cn.edu.cmu.dao.RoleMenuMapper;
import cn.edu.cmu.domain.Role;
import cn.edu.cmu.domain.RoleMenu;
import cn.edu.cmu.domain.RoleMenuParams;
import cn.edu.cmu.domain.RoleParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl extends BaseService<Role, RoleParams, RoleMapper> implements RoleService {


    @Autowired
    private RoleMenuMapper roleMenuMapper;

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


    @Override
    public List list(Object... conditions) throws Exception {
        RoleParams params = new RoleParams();
        if(conditions != null && conditions.length>0){//如果 User不等于 null 说明可能穿条件了
            String condition = (String) conditions[0];

            if(StringUtils.isNotEmpty(condition)){//此处 拼接的事 Username的 like条件，其他字段一样

                RoleParams.Criteria c = params.createCriteria();
                c.andRoleNameLike("%"+condition+"%");
            }

            super.addOrderBy(params,conditions);
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
    public boolean grantMenuUpdate(String roleId,String[] menuIds) {

        RoleMenuParams params = new RoleMenuParams();
        params.createCriteria().andRoleIdEqualTo(roleId);
        int delCount = roleMenuMapper.deleteByExample(params);
        int count = 0;
        for(String menuId : menuIds){
            RoleMenu rm = new RoleMenu(roleId,menuId ,null,null);
            count += roleMenuMapper.insertSelective(rm);
        }



        return count == menuIds.length;
    }
}
