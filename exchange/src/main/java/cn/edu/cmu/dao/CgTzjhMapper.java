package cn.edu.cmu.dao;

import cn.edu.cmu.domain.CgTzjh;
import cn.edu.cmu.domain.CgTzjhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgTzjhMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(CgTzjhExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(CgTzjhExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String tzid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(CgTzjh record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(CgTzjh record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<CgTzjh> selectByExample(CgTzjhExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    CgTzjh selectByPrimaryKey(String tzid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") CgTzjh record, @Param("example") CgTzjhExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") CgTzjh record, @Param("example") CgTzjhExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(CgTzjh record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(CgTzjh record);
}