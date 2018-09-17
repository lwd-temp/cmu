package cn.edu.cmu.dao;

import cn.edu.cmu.domain.ForeignTeacher;
import cn.edu.cmu.domain.ForeignTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForeignTeacherMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(ForeignTeacherExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(ForeignTeacherExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(ForeignTeacher record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(ForeignTeacher record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<ForeignTeacher> selectByExample(ForeignTeacherExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") ForeignTeacher record, @Param("example") ForeignTeacherExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") ForeignTeacher record, @Param("example") ForeignTeacherExample example);
}