package cn.edu.cmu.dao;
import cn.edu.cmu.domain.WbjdSqParams;
import cn.edu.cmu.domain.WbjdZj;
import cn.edu.cmu.domain.WbjdZjParams;
import cn.edu.cmu.vo.WbjdZjVo;
import java.util.List;

public interface WbjdZjMapperExt {
    List<WbjdZjVo> selectZjByExample(WbjdSqParams params);

    public List<WbjdZj> selectByExampleTranslateCode(WbjdZjParams params);
}