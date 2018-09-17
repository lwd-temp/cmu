package cn.edu.cmu.dao;

import cn.edu.cmu.domain.HySbrymd;
import cn.edu.cmu.domain.HySbrymdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HySbrymdMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(HySbrymdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(HySbrymdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String mdid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(HySbrymd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(HySbrymd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<HySbrymd> selectByExample(HySbrymdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    HySbrymd selectByPrimaryKey(String mdid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") HySbrymd record, @Param("example") HySbrymdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") HySbrymd record, @Param("example") HySbrymdExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(HySbrymd record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(HySbrymd record);
}