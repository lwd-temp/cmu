package cn.edu.cmu.dao;

import cn.edu.cmu.domain.HzxyGb;
import cn.edu.cmu.domain.HzxyGbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HzxyGbMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(HzxyGbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(HzxyGbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String gbid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(HzxyGb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(HzxyGb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<HzxyGb> selectByExample(HzxyGbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    HzxyGb selectByPrimaryKey(String gbid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") HzxyGb record, @Param("example") HzxyGbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") HzxyGb record, @Param("example") HzxyGbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(HzxyGb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(HzxyGb record);
}