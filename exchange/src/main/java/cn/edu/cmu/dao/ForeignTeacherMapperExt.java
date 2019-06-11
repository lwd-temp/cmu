package cn.edu.cmu.dao;

import cn.edu.cmu.domain.ForeignTeacher;
import cn.edu.cmu.domain.ForeignTeacherParams;

import java.util.List;

public interface ForeignTeacherMapperExt {

    public List<ForeignTeacher> selectByExampleTranslateCode(ForeignTeacherParams params);

}