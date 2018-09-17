package cn.edu.cmu.dao;

import cn.edu.cmu.domain.XmMaxcodeExample;
import cn.edu.cmu.domain.XmMaxcodeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XmMaxcodeMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(XmMaxcodeExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(XmMaxcodeExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(XmMaxcodeKey key);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(XmMaxcodeKey record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(XmMaxcodeKey record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<XmMaxcodeKey> selectByExample(XmMaxcodeExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") XmMaxcodeKey record, @Param("example") XmMaxcodeExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") XmMaxcodeKey record, @Param("example") XmMaxcodeExample example);
}