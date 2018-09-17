package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmTzjb;
import cn.edu.cmu.domain.DmTzjbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmTzjbMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmTzjbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmTzjbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmTzjb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmTzjb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmTzjb> selectByExample(DmTzjbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmTzjb selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmTzjb record, @Param("example") DmTzjbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmTzjb record, @Param("example") DmTzjbExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmTzjb record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmTzjb record);
}