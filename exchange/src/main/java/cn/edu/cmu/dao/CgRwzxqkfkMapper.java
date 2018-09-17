package cn.edu.cmu.dao;

import cn.edu.cmu.domain.CgRwzxqkfk;
import cn.edu.cmu.domain.CgRwzxqkfkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgRwzxqkfkMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(CgRwzxqkfkExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(CgRwzxqkfkExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String rwfkId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(CgRwzxqkfk record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(CgRwzxqkfk record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<CgRwzxqkfk> selectByExample(CgRwzxqkfkExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    CgRwzxqkfk selectByPrimaryKey(String rwfkId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") CgRwzxqkfk record, @Param("example") CgRwzxqkfkExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") CgRwzxqkfk record, @Param("example") CgRwzxqkfkExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(CgRwzxqkfk record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(CgRwzxqkfk record);
}