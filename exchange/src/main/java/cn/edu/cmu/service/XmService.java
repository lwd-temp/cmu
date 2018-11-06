package cn.edu.cmu.service;

import cn.edu.cmu.domain.Xm;
import cn.edu.cmu.domain.XmParams;
import cn.edu.cmu.domain.XmXssqjl;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.XmVo;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;


public interface XmService extends IBaseService<Xm, XmParams> {

    boolean save(XmVo xmVo, HttpSession session) throws Exception;

    List listMcDistinct();

    List listNjDistinct();

    List<Map> listZy();

    List listSqXm(Xm xm, HttpSession session) throws Exception;

    XmXssqjl initSqPage(HttpSession session);

    List<Map> initGjdq(String id);

    boolean saveSq(XmXssqjl jl, String[] fileid, String[] clsm);
}

