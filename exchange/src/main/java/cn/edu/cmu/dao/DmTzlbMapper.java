package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmTzlb;
import cn.edu.cmu.domain.DmTzlbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmTzlbMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmTzlbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmTzlbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmTzlb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmTzlb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmTzlb> selectByExample(DmTzlbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmTzlb selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmTzlb record, @Param("example") DmTzlbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmTzlb record, @Param("example") DmTzlbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmTzlb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmTzlb record);
}