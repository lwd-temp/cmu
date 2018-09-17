package cn.edu.cmu.dao;

import cn.edu.cmu.domain.HyJh;
import cn.edu.cmu.domain.HyJhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HyJhMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(HyJhExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(HyJhExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String jhid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(HyJh record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(HyJh record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<HyJh> selectByExample(HyJhExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    HyJh selectByPrimaryKey(String jhid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") HyJh record, @Param("example") HyJhExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") HyJh record, @Param("example") HyJhExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(HyJh record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(HyJh record);
}