package cn.edu.cmu.service;
import cn.edu.cmu.domain.WbjdGj;
import cn.edu.cmu.domain.WbjdGjParams;
import cn.edu.cmu.framework.web.IBaseService;

import java.util.List;

public interface WbjdGjService extends IBaseService<WbjdGj, WbjdGjParams> {
    public List selectdGjExtPdf(String id) throws Exception;
}
