package cn.edu.cmu.dao;

import cn.edu.cmu.domain.XmJlzjbg;
import cn.edu.cmu.domain.XmJlzjbgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XmJlzjbgMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(XmJlzjbgExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(XmJlzjbgExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(XmJlzjbg record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(XmJlzjbg record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<XmJlzjbg> selectByExample(XmJlzjbgExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") XmJlzjbg record, @Param("example") XmJlzjbgExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") XmJlzjbg record, @Param("example") XmJlzjbgExample example);
}