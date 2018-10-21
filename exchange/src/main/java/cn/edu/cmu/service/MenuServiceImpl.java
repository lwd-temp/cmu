package cn.edu.cmu.service;

import cn.edu.cmu.dao.MenuMapper;
import cn.edu.cmu.dao.PowerMapper;
import cn.edu.cmu.domain.Menu;
import cn.edu.cmu.domain.MenuParams;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.web.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Service
public class MenuServiceImpl extends BaseService<Menu, MenuParams, MenuMapper> implements MenuService {

    @Autowired
    PowerMapper powerDao;

    @Override
    public List list(Menu Menu) {
        MenuParams param = new MenuParams();
        param.setOrderByClause(" sort asc ");
        return dao.selectByExample(param);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }


    /**
     * 获取用户菜单
     * @param session
     * @return
     */
    @Override
    public List userMenuList(HttpSession session) {
        List list = null;
        String userid = (String) session.getAttribute(CmuConstants.SESSION.USER_ID);


        list = powerDao.selectUserMenu(userid);

        if(list == null){
            list = new ArrayList();
        }

        return list;
    }
}
