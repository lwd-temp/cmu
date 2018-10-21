package cn.edu.cmu.service;

import cn.edu.cmu.domain.Menu;
import cn.edu.cmu.domain.MenuParams;
import cn.edu.cmu.framework.web.IBaseService;

import javax.servlet.http.HttpSession;
import java.util.List;


public interface MenuService extends IBaseService<Menu, MenuParams> {

    List userMenuList(HttpSession session);
}

