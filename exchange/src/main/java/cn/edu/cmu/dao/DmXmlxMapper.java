package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmXmlx;
import cn.edu.cmu.domain.DmXmlxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmXmlxMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmXmlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmXmlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmXmlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmXmlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmXmlx> selectByExample(DmXmlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmXmlx selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmXmlx record, @Param("example") DmXmlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmXmlx record, @Param("example") DmXmlxExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmXmlx record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmXmlx record);
}