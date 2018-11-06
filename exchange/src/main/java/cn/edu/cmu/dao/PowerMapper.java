package cn.edu.cmu.dao;

import cn.edu.cmu.domain.Menu;

import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/15 20:34
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public interface PowerMapper {
    
    List<String> selectUserRoles(String userId);

    List<Menu> selectUserMenu(String userId);

    List<Menu> selectUserMenuByRole(String roleId);

}
