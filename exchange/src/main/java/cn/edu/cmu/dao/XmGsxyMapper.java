package cn.edu.cmu.dao;

import cn.edu.cmu.domain.XmGsxy;
import cn.edu.cmu.domain.XmGsxyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XmGsxyMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(XmGsxyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(XmGsxyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String proCollegId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(XmGsxy record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(XmGsxy record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<XmGsxy> selectByExample(XmGsxyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    XmGsxy selectByPrimaryKey(String proCollegId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") XmGsxy record, @Param("example") XmGsxyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") XmGsxy record, @Param("example") XmGsxyExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(XmGsxy record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(XmGsxy record);
}