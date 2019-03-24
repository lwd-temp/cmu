package cn.edu.cmu.service;

import cn.edu.cmu.domain.Xm;
import cn.edu.cmu.domain.XmParams;
import cn.edu.cmu.domain.XmXssbfj;
import cn.edu.cmu.domain.XmXssqjl;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.XmVo;

import javax.servlet.http.HttpSession;
import java.lang.reflect.InvocationTargetException;
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

    List<XmXssbfj> querySbFjs(String id);

    List listXmSqxs(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;

    boolean xsshCs(String id, String status) throws Exception;

    boolean confirmCs(String id) throws Exception;

    List listXmmx(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;

    boolean sqzf(String id);

    boolean xsshFs(XmXssqjl jl) throws Exception;

    boolean confirmFs(String id);

    List listYsqxm(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
}

