package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmCfmd;
import cn.edu.cmu.domain.DmCfmdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmCfmdMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmCfmdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmCfmdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmCfmd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmCfmd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmCfmd> selectByExample(DmCfmdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmCfmd selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmCfmd record, @Param("example") DmCfmdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmCfmd record, @Param("example") DmCfmdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmCfmd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmCfmd record);
}