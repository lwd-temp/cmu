package cn.edu.cmu.dao;
import cn.edu.cmu.domain.CgDqcgjParams;
import cn.edu.cmu.vo.CgrwzxqkfkVo;
import java.util.List;

public interface CgRwzxqkfkMapperExt {
    List<CgrwzxqkfkVo> selectZjByExample(CgDqcgjParams params);
}