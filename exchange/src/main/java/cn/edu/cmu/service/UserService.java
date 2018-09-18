package cn.edu.cmu.service;

import cn.edu.cmu.domain.User;

import java.util.List;

/**
 * <p><b>Project:</b>  		《ssm-0726》</p>
 * <p><b>Title:</b>   		UserService</p>
 * <p><b>Description:</b> 	Description  </p>
 * <p><b>Company:</b>		www.neusoft.com.cn </p>
 * <p><b>Site:</b>			http://314649444.iteye.com/  </p>
 * 
 * @date 2018-7-26   下午2:03:19
 * @author 东软，张金山
 */
/**
 * 用户操作的 业务的抽象
 * @author jshand
 *
 */
public interface UserService {
	//按条件查询
	public List list(User user);

	//根据逐渐查询
    User selectByPrimaryKey(String userid);

    //添加用户
	boolean save(User user);

	//根据主键 更新 用户
	boolean update(User user);

    //根据主键删除
	boolean deleteById(String userid);
}

