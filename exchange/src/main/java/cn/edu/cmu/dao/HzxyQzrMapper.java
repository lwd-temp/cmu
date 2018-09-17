package cn.edu.cmu.dao;

import cn.edu.cmu.domain.HzxyQzr;
import cn.edu.cmu.domain.HzxyQzrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HzxyQzrMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(HzxyQzrExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(HzxyQzrExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String ryid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(HzxyQzr record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(HzxyQzr record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<HzxyQzr> selectByExample(HzxyQzrExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    HzxyQzr selectByPrimaryKey(String ryid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") HzxyQzr record, @Param("example") HzxyQzrExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") HzxyQzr record, @Param("example") HzxyQzrExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(HzxyQzr record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(HzxyQzr record);
}