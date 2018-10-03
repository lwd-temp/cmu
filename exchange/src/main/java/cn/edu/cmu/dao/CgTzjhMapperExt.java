package cn.edu.cmu.dao;

import cn.edu.cmu.domain.CgTzjh;
import cn.edu.cmu.domain.CgTzjhParams;

import java.util.List;

public interface CgTzjhMapperExt  {

    public List<CgTzjh> selectByExampleTranslateCode(CgTzjhParams params);

}