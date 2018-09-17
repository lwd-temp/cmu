package cn.edu.cmu.dao;

import cn.edu.cmu.domain.UserRoleExample;
import cn.edu.cmu.domain.UserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(UserRoleExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(UserRoleExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(UserRoleKey key);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(UserRoleKey record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(UserRoleKey record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<UserRoleKey> selectByExample(UserRoleExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example);
}