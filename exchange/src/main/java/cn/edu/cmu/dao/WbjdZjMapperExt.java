package cn.edu.cmu.dao;
import cn.edu.cmu.domain.WbjdSqParams;
import cn.edu.cmu.vo.WbjdZjVo;
import java.util.List;

public interface WbjdZjMapperExt {
    List<WbjdZjVo> selectZjByExample(WbjdSqParams params);
}