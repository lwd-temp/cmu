package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmHzzt;
import cn.edu.cmu.domain.DmHzztExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmHzztMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmHzztExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmHzztExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmHzzt record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmHzzt record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmHzzt> selectByExample(DmHzztExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmHzzt selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmHzzt record, @Param("example") DmHzztExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmHzzt record, @Param("example") DmHzztExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmHzzt record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmHzzt record);
}