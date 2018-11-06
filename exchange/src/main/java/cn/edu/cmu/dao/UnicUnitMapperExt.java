package cn.edu.cmu.dao;

import cn.edu.cmu.domain.UnicUnit;
import cn.edu.cmu.domain.UnicUnitParams;
import cn.edu.cmu.framework.web.BaseMapper;

import java.util.List;

public interface UnicUnitMapperExt{

    public UnicUnit queryMcById(String ejdwid);
    public List<UnicUnit> queryXsyx(UnicUnit unit);

}