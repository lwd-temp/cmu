package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmXmmc;
import cn.edu.cmu.domain.DmXmmcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmXmmcMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmXmmcExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmXmmcExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String xmId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmXmmc record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmXmmc record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmXmmc> selectByExample(DmXmmcExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmXmmc selectByPrimaryKey(String xmId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmXmmc record, @Param("example") DmXmmcExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmXmmc record, @Param("example") DmXmmcExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmXmmc record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmXmmc record);
}