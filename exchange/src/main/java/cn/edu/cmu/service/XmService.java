package cn.edu.cmu.service;

import cn.edu.cmu.domain.Xm;
import cn.edu.cmu.domain.XmParams;
import cn.edu.cmu.framework.web.IBaseService;
import cn.edu.cmu.vo.XmVo;

import javax.servlet.http.HttpSession;


public interface XmService extends IBaseService<Xm, XmParams> {

    boolean save(XmVo xmVo, HttpSession session) throws Exception;
}

