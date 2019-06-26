package cn.edu.cmu.dao;


import cn.edu.cmu.domain.Hz;
import cn.edu.cmu.domain.HzParams;

import java.util.List;

public interface HzglMapperExt {

    public List<Hz> selectByExampleTranslateCode(HzParams params);

}