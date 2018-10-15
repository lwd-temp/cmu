package cn.edu.cmu.dao;

import cn.edu.cmu.domain.WbjdSq;

public interface WbjdSqMapperExt {
    public WbjdSq  selectSqExtPdf (String lfid );
    public String  selectGbExtPdf (String lfid );
}
