package cn.edu.cmu.dao;

import cn.edu.cmu.domain.HyShenb;
import cn.edu.cmu.domain.HyShenbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HyShenbMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(HyShenbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(HyShenbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String sbid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(HyShenb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(HyShenb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<HyShenb> selectByExample(HyShenbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    HyShenb selectByPrimaryKey(String sbid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") HyShenb record, @Param("example") HyShenbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") HyShenb record, @Param("example") HyShenbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(HyShenb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(HyShenb record);
}