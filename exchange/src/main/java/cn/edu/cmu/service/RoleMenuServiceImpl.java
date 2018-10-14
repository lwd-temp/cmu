package cn.edu.cmu.service;

import cn.edu.cmu.dao.RoleMenuMapper;
import cn.edu.cmu.domain.RoleMenu;
import cn.edu.cmu.domain.RoleMenuParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleMenuServiceImpl extends BaseService<RoleMenu, RoleMenuParams, RoleMenuMapper> implements RoleMenuService {


    @Override
    public List list(RoleMenu RoleMenu) {
        RoleMenuParams ex = new RoleMenuParams();
        if(RoleMenu != null){
            RoleMenuParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(RoleMenu.getMenuId())){
                c.andMenuIdEqualTo(RoleMenu.getMenuId());
            }
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }
}
