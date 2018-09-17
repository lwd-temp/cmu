package cn.edu.cmu.dao;

import cn.edu.cmu.domain.Xm;
import cn.edu.cmu.domain.XmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XmMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(XmExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(XmExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String xmId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(Xm record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(Xm record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<Xm> selectByExample(XmExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    Xm selectByPrimaryKey(String xmId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") Xm record, @Param("example") XmExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") Xm record, @Param("example") XmExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(Xm record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(Xm record);
}