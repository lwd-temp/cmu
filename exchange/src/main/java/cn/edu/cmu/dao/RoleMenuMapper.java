package cn.edu.cmu.dao;

import cn.edu.cmu.domain.RoleMenuExample;
import cn.edu.cmu.domain.RoleMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(RoleMenuExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(RoleMenuExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(RoleMenuKey key);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(RoleMenuKey record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(RoleMenuKey record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<RoleMenuKey> selectByExample(RoleMenuExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") RoleMenuKey record, @Param("example") RoleMenuExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") RoleMenuKey record, @Param("example") RoleMenuExample example);
}