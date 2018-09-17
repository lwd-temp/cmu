package cn.edu.cmu.dao;

import cn.edu.cmu.domain.DmZzsk;
import cn.edu.cmu.domain.DmZzskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmZzskMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(DmZzskExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(DmZzskExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(DmZzsk record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(DmZzsk record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<DmZzsk> selectByExample(DmZzskExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    DmZzsk selectByPrimaryKey(String code);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") DmZzsk record, @Param("example") DmZzskExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") DmZzsk record, @Param("example") DmZzskExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(DmZzsk record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(DmZzsk record);
}