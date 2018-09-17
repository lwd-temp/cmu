package cn.edu.cmu.dao;

import cn.edu.cmu.domain.CgDqcgj;
import cn.edu.cmu.domain.CgDqcgjExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CgDqcgjMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(CgDqcgjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(CgDqcgjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String cgid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(CgDqcgj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(CgDqcgj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<CgDqcgj> selectByExample(CgDqcgjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    CgDqcgj selectByPrimaryKey(String cgid);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") CgDqcgj record, @Param("example") CgDqcgjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") CgDqcgj record, @Param("example") CgDqcgjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(CgDqcgj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(CgDqcgj record);
}