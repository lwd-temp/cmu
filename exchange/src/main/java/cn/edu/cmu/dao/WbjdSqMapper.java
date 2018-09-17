package cn.edu.cmu.dao;

import cn.edu.cmu.domain.WbjdSq;
import cn.edu.cmu.domain.WbjdSqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WbjdSqMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(WbjdSqExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(WbjdSqExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String lfid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(WbjdSq record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(WbjdSq record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<WbjdSq> selectByExample(WbjdSqExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    WbjdSq selectByPrimaryKey(String lfid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") WbjdSq record, @Param("example") WbjdSqExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") WbjdSq record, @Param("example") WbjdSqExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(WbjdSq record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(WbjdSq record);
}