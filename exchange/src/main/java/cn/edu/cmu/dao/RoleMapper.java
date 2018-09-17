package cn.edu.cmu.dao;

import cn.edu.cmu.domain.Role;
import cn.edu.cmu.domain.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(RoleExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(RoleExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String roleId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(Role record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(Role record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<Role> selectByExample(RoleExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    Role selectByPrimaryKey(String roleId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(Role record);
}