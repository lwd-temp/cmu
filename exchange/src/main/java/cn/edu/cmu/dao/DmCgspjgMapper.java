package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmCgspjg;
import cn.edu.cmu.domain.DmCgspjgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmCgspjgMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmCgspjgExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmCgspjgExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmCgspjg record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmCgspjg record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmCgspjg> selectByExample(DmCgspjgExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmCgspjg selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmCgspjg record, @Param("example") DmCgspjgExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmCgspjg record, @Param("example") DmCgspjgExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmCgspjg record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmCgspjg record);
}