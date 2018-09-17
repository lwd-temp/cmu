package cn.edu.cmu.dao;

import cn.edu.cmu.domain.Hzxy;
import cn.edu.cmu.domain.HzxyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HzxyMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(HzxyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(HzxyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String xyid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(Hzxy record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(Hzxy record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<Hzxy> selectByExample(HzxyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    Hzxy selectByPrimaryKey(String xyid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") Hzxy record, @Param("example") HzxyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") Hzxy record, @Param("example") HzxyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(Hzxy record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(Hzxy record);
}