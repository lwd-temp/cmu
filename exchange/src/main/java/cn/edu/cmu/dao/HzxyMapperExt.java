package cn.edu.cmu.dao;



import cn.edu.cmu.domain.Hzxy;
import cn.edu.cmu.domain.HzxyParams;

import java.util.List;

public interface HzxyMapperExt {

    public List<Hzxy> selectByExampleTranslateCode(HzxyParams params);

}