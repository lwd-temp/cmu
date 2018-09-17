package cn.edu.cmu.dao;

import cn.edu.cmu.domain.XmXssbfj;
import cn.edu.cmu.domain.XmXssbfjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XmXssbfjMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(XmXssbfjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(XmXssbfjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String fjId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(XmXssbfj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(XmXssbfj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<XmXssbfj> selectByExample(XmXssbfjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    XmXssbfj selectByPrimaryKey(String fjId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") XmXssbfj record, @Param("example") XmXssbfjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") XmXssbfj record, @Param("example") XmXssbfjExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(XmXssbfj record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(XmXssbfj record);
}