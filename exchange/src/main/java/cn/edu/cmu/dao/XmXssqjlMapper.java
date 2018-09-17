package cn.edu.cmu.dao;

import cn.edu.cmu.domain.XmXssqjl;
import cn.edu.cmu.domain.XmXssqjlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XmXssqjlMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(XmXssqjlExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(XmXssqjlExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String sqjlId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(XmXssqjl record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(XmXssqjl record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<XmXssqjl> selectByExample(XmXssqjlExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    XmXssqjl selectByPrimaryKey(String sqjlId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") XmXssqjl record, @Param("example") XmXssqjlExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") XmXssqjl record, @Param("example") XmXssqjlExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(XmXssqjl record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(XmXssqjl record);
}