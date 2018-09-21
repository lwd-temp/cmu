package cn.edu.cmu.service;

import cn.edu.cmu.dao.MenuMapper;
import cn.edu.cmu.domain.Menu;
import cn.edu.cmu.domain.MenuParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuServiceImpl extends BaseService<Menu, MenuParams, MenuMapper> implements MenuService {


    @Override
    public List list(Menu Menu) {
        MenuParams ex = new MenuParams();
        if(Menu != null){
            MenuParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(Menu.getMenuName())){
                c.andMenuNameLike("%"+Menu.getMenuName()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
