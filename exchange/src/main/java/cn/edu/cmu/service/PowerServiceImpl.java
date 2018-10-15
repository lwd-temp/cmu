package cn.edu.cmu.service;

import cn.edu.cmu.dao.PowerMapper;
import cn.edu.cmu.dao.UserRoleMapper;
import cn.edu.cmu.domain.UserRole;
import cn.edu.cmu.domain.UserRoleParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: jshand
 * @Date: 2018/10/15 21:24
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Service
public class PowerServiceImpl implements  PowerService {

    @Autowired
    PowerMapper dao;

    @Autowired
    UserRoleMapper userRoleDao;


    /**
     * 给用户授权角色
     * @param userId
     * @param roleIds
     * @return
     */
    @Override
    public boolean grantUser(String userId, String[] roleIds){
        //先删除，后插入
        UserRoleParams params = new UserRoleParams();
        params.createCriteria().andUserIdEqualTo(userId);
        userRoleDao.deleteByExample(params);

        //插入
        if(roleIds!=null && roleIds.length>0){
            for (String roleId : roleIds) {
                UserRole userRole = new UserRole(userId,roleId,null,null);
                userRoleDao.insertSelective(userRole);
            }
        }

        return true;
    }


}
