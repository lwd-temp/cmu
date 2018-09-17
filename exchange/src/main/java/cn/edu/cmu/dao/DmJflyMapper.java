package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmJfly;
import cn.edu.cmu.domain.DmJflyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmJflyMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmJflyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmJflyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmJfly record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmJfly record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmJfly> selectByExample(DmJflyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmJfly selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmJfly record, @Param("example") DmJflyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmJfly record, @Param("example") DmJflyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmJfly record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmJfly record);
}