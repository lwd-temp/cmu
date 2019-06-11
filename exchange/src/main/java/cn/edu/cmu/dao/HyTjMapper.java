package cn.edu.cmu.dao;

import cn.edu.cmu.vo.HytjVo;

import java.util.List;
import java.util.Map;

public interface HyTjMapper {

    public List<HytjVo> selectList(Map param);

    public List selectListForDownload(Map map);
}