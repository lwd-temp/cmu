package cn.edu.cmu.service;

import cn.edu.cmu.dao.UserMapper;
import cn.edu.cmu.domain.User;
import cn.edu.cmu.domain.UserExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

//ALT+ENTER  自动提示
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userDao;

    @Override
    public List list(User user) {
        UserExample ex = new UserExample();
        if(user != null){//如果 User不等于 null 说明可能穿条件了

            //(username like   and  )  ()
            UserExample.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(user.getUserName())){//此处 拼接的事 Username的 like条件，其他字段一样
                c.andUserNameLike("%"+user.getUserName()+"%");
            }
            UserExample.Criteria otherc = ex.createCriteria();
            if(StringUtils.isNotEmpty(user.getPassword())){//此处 拼接的事 Username的 like条件，其他字段一样
                otherc.andUserNameLike("%"+user.getPassword()+"%");
            }
            ex.or(otherc);
        }

        return userDao.selectByExample(ex);
    }

    @Override
    public User selectByPrimaryKey(String userid) {
        return null;
    }

    @Override
    public boolean save(User user) {
        //userDao.insert();//shiyong kongzhi  charu
        int count = userDao.insertSelective(user);//ruguo  shuxing   null  bu  charu

        return count>0;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean deleteById(String userid) {
        return false;
    }
}
