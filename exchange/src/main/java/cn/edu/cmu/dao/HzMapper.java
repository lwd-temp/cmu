package cn.edu.cmu.dao;

import cn.edu.cmu.domain.Hz;
import cn.edu.cmu.domain.HzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HzMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(HzExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(HzExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String hzid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(Hz record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(Hz record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<Hz> selectByExample(HzExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    Hz selectByPrimaryKey(String hzid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") Hz record, @Param("example") HzExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") Hz record, @Param("example") HzExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(Hz record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(Hz record);
}