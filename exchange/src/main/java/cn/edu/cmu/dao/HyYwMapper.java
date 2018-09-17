package cn.edu.cmu.dao;

import cn.edu.cmu.domain.HyYw;
import cn.edu.cmu.domain.HyYwExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HyYwMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(HyYwExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(HyYwExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String ywid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(HyYw record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(HyYw record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<HyYw> selectByExample(HyYwExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    HyYw selectByPrimaryKey(String ywid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") HyYw record, @Param("example") HyYwExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") HyYw record, @Param("example") HyYwExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(HyYw record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(HyYw record);
}