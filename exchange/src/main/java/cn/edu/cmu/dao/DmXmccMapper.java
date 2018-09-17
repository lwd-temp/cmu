package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmXmcc;
import cn.edu.cmu.domain.DmXmccExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmXmccMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmXmccExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmXmccExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmXmcc record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmXmcc record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmXmcc> selectByExample(DmXmccExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmXmcc selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmXmcc record, @Param("example") DmXmccExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmXmcc record, @Param("example") DmXmccExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmXmcc record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmXmcc record);
}