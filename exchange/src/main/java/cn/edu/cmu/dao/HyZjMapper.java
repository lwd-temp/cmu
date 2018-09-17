package cn.edu.cmu.dao;

import cn.edu.cmu.domain.HyZj;
import cn.edu.cmu.domain.HyZjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HyZjMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(HyZjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(HyZjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String zjid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(HyZj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(HyZj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<HyZj> selectByExample(HyZjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    HyZj selectByPrimaryKey(String zjid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") HyZj record, @Param("example") HyZjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") HyZj record, @Param("example") HyZjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(HyZj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(HyZj record);
}