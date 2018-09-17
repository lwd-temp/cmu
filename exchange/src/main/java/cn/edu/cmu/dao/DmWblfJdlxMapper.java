package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmWblfJdlx;
import cn.edu.cmu.domain.DmWblfJdlxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmWblfJdlxMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmWblfJdlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmWblfJdlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmWblfJdlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmWblfJdlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmWblfJdlx> selectByExample(DmWblfJdlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmWblfJdlx selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmWblfJdlx record, @Param("example") DmWblfJdlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmWblfJdlx record, @Param("example") DmWblfJdlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmWblfJdlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmWblfJdlx record);
}