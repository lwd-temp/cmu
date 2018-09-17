package cn.edu.cmu.dao;

import cn.edu.cmu.domain.CgTzcy;
import cn.edu.cmu.domain.CgTzcyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgTzcyMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(CgTzcyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(CgTzcyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String cyid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(CgTzcy record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(CgTzcy record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<CgTzcy> selectByExample(CgTzcyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    CgTzcy selectByPrimaryKey(String cyid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") CgTzcy record, @Param("example") CgTzcyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") CgTzcy record, @Param("example") CgTzcyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(CgTzcy record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(CgTzcy record);
}