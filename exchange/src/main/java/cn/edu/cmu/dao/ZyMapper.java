package cn.edu.cmu.dao;

import cn.edu.cmu.domain.XmParams;
import cn.edu.cmu.framework.web.BaseMapper;

import java.util.List;

public interface ZyMapper extends BaseMapper<XmParams> {

    List<String> selectZyList();

}