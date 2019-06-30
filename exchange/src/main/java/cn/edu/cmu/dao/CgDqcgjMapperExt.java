package cn.edu.cmu.dao;



import cn.edu.cmu.domain.CgDqcgj;
import cn.edu.cmu.domain.CgDqcgjParams;

import java.util.List;

public interface CgDqcgjMapperExt {

    public List<CgDqcgj> selectByExampleTranslateCode(CgDqcgjParams params);

}