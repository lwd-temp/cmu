package cn.edu.cmu.dao;

import cn.edu.cmu.domain.XmParams;
import cn.edu.cmu.framework.web.BaseMapper;
import cn.edu.cmu.vo.ZyVo;

import java.util.List;
import java.util.Map;

public interface ZyMapper {

    List<String> selectZyList();

    List<Map> selectZyListAll();

}