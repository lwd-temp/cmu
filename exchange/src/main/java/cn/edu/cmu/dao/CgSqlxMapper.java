package cn.edu.cmu.dao;

import cn.edu.cmu.domain.CgSqlx;
import cn.edu.cmu.domain.CgSqlxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgSqlxMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(CgSqlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(CgSqlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(CgSqlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(CgSqlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<CgSqlx> selectByExample(CgSqlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    CgSqlx selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") CgSqlx record, @Param("example") CgSqlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") CgSqlx record, @Param("example") CgSqlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(CgSqlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(CgSqlx record);
}