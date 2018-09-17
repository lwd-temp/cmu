package cn.edu.cmu.service;

import cn.edu.cmu.domain.User;
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


@Service
public class UserServiceImpl implements UserService {

    @Override
    public List list(String condition) {
        return null;
    }

    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public User selectByPrimaryKey(String userid) {
        return null;
    }

    @Override
    public boolean deleteById(String userid) {
        return false;
    }

   // @Autowired
    //UserDAO userDAO;
	
	//@Override
	/*public List list(String condition) {

        UserExample ex = new UserExample();
        if(StringUtils.isNotEmpty(condition)){//模糊查询
            UserExample.Criteria cr = ex.createCriteria();
            cr.andUsernameLike("%"+condition+"%");
        }
        ex.setOrderByClause(" userid+0 asc ");

		List list = userDAO.selectByExample(ex);
		return list;
	}
	
	
    @Override
    public boolean save(User user) {
        int count = 0;
	    if(StringUtils.isEmpty(user.getUserid())){
            count = userDAO.insert(user);
        }else{
            count = userDAO.updateByPrimaryKey(user);
        }
        return count>0;
    }

    @Override
    public User selectByPrimaryKey(String userid) {
        return userDAO.selectByPrimaryKey(userid);
    }

    @Override
    public boolean deleteById(String userid) {
        int count = userDAO.deleteByPrimaryKey(userid);
        return count>0;
    }*/

}
