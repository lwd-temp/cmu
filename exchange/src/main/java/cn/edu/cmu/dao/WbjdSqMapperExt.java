package cn.edu.cmu.dao;

import cn.edu.cmu.domain.WbjdSq;
import cn.edu.cmu.domain.WbjdSqParams;

import java.util.List;


public interface WbjdSqMapperExt {
    public WbjdSq  selectSqExtPdf (String lfid );

    public List<WbjdSq> selectByExampleTranslateCode(WbjdSqParams params);
}
