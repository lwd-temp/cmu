package cn.edu.cmu.service;

import cn.edu.cmu.domain.Role;
import cn.edu.cmu.domain.RoleMenu;
import cn.edu.cmu.domain.RoleParams;
import cn.edu.cmu.framework.web.IBaseService;

import java.util.List;


public interface RoleService extends IBaseService<Role, RoleParams> {

    public List<RoleMenu> getRoleMenuIds(String roleId) throws  Exception;

    public boolean grantMenuUpdate(String roleId,String[] menuIds);
}

