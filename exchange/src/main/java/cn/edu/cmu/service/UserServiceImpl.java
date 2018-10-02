package cn.edu.cmu.service;

import cn.edu.cmu.dao.UserMapper;
import cn.edu.cmu.domain.User;
import cn.edu.cmu.domain.UserParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/*
*
 * <p><b>Project:</b>  		《ssm-0726》</p>
 * <p><b>Title:</b>   		UserServiceImpl</p>
 * <p><b>Description:</b> 	Description  </p>
 * <p><b>Company:</b>		www.neusoft.com.cn </p>
 * <p><b>Site:</b>			http://314649444.iteye.com/  </p>
 * 
 * @date 2018-7-26   下午2:04:03
 * @author 东软，张金山
*/

@Service
public class UserServiceImpl extends BaseService<User,UserParams,UserMapper> implements UserService {


    @Override
    public List list(User user) {
        UserParams ex = new UserParams();
        if(user != null){//如果 User不等于 null 说明可能穿条件了

            //(username like   and  )  ()
            UserParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(user.getUserName())){//此处 拼接的事 Username的 like条件，其他字段一样
                c.andUserNameLike("%"+user.getUserName()+"%");
            }
            UserParams.Criteria otherc = ex.createCriteria();
            if(StringUtils.isNotEmpty(user.getPassword())){//此处 拼接的事 Username的 like条件，其他字段一样
                otherc.andUserNameLike("%"+user.getPassword()+"%");
            }
            ex.or(otherc);
        }

        return dao.selectByExample(ex);

    }

    @Override
    public List list(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        UserParams params = new UserParams();
        UserParams.Criteria c = params.createCriteria();
        if(conditions != null && conditions.length>0 && conditions[0] != null){//如果 User不等于 null 说明可能穿条件了
            User user = (User) conditions[0];

            if(StringUtils.isNotEmpty(user.getUserName())){//此处 拼接的事 Username的 like条件，其他字段一样
               c.andUserNameLike("%"+user.getUserName()+"%");
            }

            super.addOrderBy(params,conditions);
        }

        return dao.selectByExample(params);

    }




}
