package cn.edu.cmu.service;

import cn.edu.cmu.domain.HySbrymd;
import cn.edu.cmu.domain.HyShenb;
import cn.edu.cmu.domain.HyShenbParams;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.HysbVO;

import java.util.List;


public interface HyShenbService extends IBaseService<HyShenb, HyShenbParams> {

    boolean save(HysbVO hysbVO) throws Exception;

    List<HySbrymd> rymcList(String id);
}

