package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmJhlx;
import cn.edu.cmu.domain.DmJhlxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmJhlxMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmJhlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmJhlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmJhlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmJhlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmJhlx> selectByExample(DmJhlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmJhlx selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmJhlx record, @Param("example") DmJhlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmJhlx record, @Param("example") DmJhlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmJhlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmJhlx record);
}