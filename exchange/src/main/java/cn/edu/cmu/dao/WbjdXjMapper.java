package cn.edu.cmu.dao;

import cn.edu.cmu.domain.WbjdXj;
import cn.edu.cmu.domain.WbjdXjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WbjdXjMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(WbjdXjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(WbjdXjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String zjid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(WbjdXj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(WbjdXj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<WbjdXj> selectByExample(WbjdXjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    WbjdXj selectByPrimaryKey(String zjid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") WbjdXj record, @Param("example") WbjdXjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") WbjdXj record, @Param("example") WbjdXjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(WbjdXj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(WbjdXj record);
}