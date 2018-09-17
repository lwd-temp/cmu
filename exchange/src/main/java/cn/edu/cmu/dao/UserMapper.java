package cn.edu.cmu.dao;

import cn.edu.cmu.domain.User;
import cn.edu.cmu.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String userId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    User selectByPrimaryKey(String userId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(User record);
}