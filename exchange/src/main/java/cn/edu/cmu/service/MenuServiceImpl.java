package cn.edu.cmu.service;

import cn.edu.cmu.dao.MenuMapper;
import cn.edu.cmu.domain.Menu;
import cn.edu.cmu.domain.MenuParams;
import cn.edu.cmu.framework.web.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuServiceImpl extends BaseService<Menu, MenuParams, MenuMapper> implements MenuService {


    @Override
    public List list(Menu Menu) {
        return dao.selectByExample(null);
    }
}
