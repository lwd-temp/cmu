package cn.edu.cmu.service;

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

import cn.edu.cmu.domain.CgDqcgj;
import cn.edu.cmu.domain.CgDqcgjParams;
import cn.edu.cmu.framework.web.IBaseService;

import java.util.List;

/**
 * 用户操作的 业务的抽象
 * @author jshand
 *
 */
public interface CgDqcgjService extends IBaseService<CgDqcgj, CgDqcgjParams> {
    public boolean saveOrUpdate(CgDqcgj cgDqcgj) throws Exception;

    public String selectXb(String xb);

    public String selectCglx(String cglx);

    public String selectCfmd(String cfmd);

    public List shlist(Object... conditions)throws Exception;

    public boolean shSave(CgDqcgj cgDqcgj);

}

