package cn.edu.cmu.service;

import cn.edu.cmu.domain.XmXssqjl;
import cn.edu.cmu.domain.XmXssqjlParams;
import cn.edu.cmu.framework.web.IBaseService;

import java.util.List;


public interface XmXssqjlService extends IBaseService<XmXssqjl, XmXssqjlParams> {

    List<XmXssqjl> listYsqxm(XmXssqjl sqjl);
}

