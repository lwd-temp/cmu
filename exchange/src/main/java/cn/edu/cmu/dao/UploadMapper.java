package cn.edu.cmu.dao;

import cn.edu.cmu.domain.Upload;
import cn.edu.cmu.domain.UploadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(UploadExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(UploadExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String fileId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(Upload record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(Upload record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<Upload> selectByExample(UploadExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    Upload selectByPrimaryKey(String fileId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") Upload record, @Param("example") UploadExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") Upload record, @Param("example") UploadExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(Upload record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(Upload record);
}