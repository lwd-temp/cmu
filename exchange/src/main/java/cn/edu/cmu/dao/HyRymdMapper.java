package cn.edu.cmu.dao;

import cn.edu.cmu.domain.HyRymd;
import cn.edu.cmu.domain.HyRymdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HyRymdMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(HyRymdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(HyRymdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String mdid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(HyRymd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(HyRymd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<HyRymd> selectByExample(HyRymdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    HyRymd selectByPrimaryKey(String mdid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") HyRymd record, @Param("example") HyRymdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") HyRymd record, @Param("example") HyRymdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(HyRymd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(HyRymd record);
}