package cn.edu.cmu.service;

import cn.edu.cmu.domain.HySbrymd;
import cn.edu.cmu.domain.HyShenb;
import cn.edu.cmu.domain.HyShenbParams;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.HysbVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


public interface HyShenbService extends IBaseService<HyShenb, HyShenbParams> {

    boolean save(HysbVO hysbVO) throws Exception;

    List<HySbrymd> rymcList(String id);

    void download(String id, HttpServletRequest request, HttpServletResponse response) throws IOException;
}

