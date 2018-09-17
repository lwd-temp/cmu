package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmLfmd;
import cn.edu.cmu.domain.DmLfmdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmLfmdMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmLfmdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmLfmdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmLfmd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmLfmd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmLfmd> selectByExample(DmLfmdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmLfmd selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmLfmd record, @Param("example") DmLfmdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmLfmd record, @Param("example") DmLfmdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmLfmd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmLfmd record);
}