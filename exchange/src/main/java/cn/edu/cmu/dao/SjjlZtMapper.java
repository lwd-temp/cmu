package cn.edu.cmu.dao;

import cn.edu.cmu.domain.SjjlZt;
import cn.edu.cmu.domain.SjjlZtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SjjlZtMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(SjjlZtExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(SjjlZtExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String gjid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(SjjlZt record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(SjjlZt record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<SjjlZt> selectByExample(SjjlZtExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    SjjlZt selectByPrimaryKey(String gjid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") SjjlZt record, @Param("example") SjjlZtExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") SjjlZt record, @Param("example") SjjlZtExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(SjjlZt record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(SjjlZt record);
}