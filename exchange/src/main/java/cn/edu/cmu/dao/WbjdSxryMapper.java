package cn.edu.cmu.dao;

import cn.edu.cmu.domain.WbjdSxry;
import cn.edu.cmu.domain.WbjdSxryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WbjdSxryMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(WbjdSxryExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(WbjdSxryExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(WbjdSxry record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(WbjdSxry record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<WbjdSxry> selectByExample(WbjdSxryExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") WbjdSxry record, @Param("example") WbjdSxryExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") WbjdSxry record, @Param("example") WbjdSxryExample example);
}