package cn.edu.cmu.service;

import cn.edu.cmu.dao.CgDqcgjMapper;
import cn.edu.cmu.domain.CgDqcgj;
import cn.edu.cmu.domain.CgDqcgjParams;
import cn.edu.cmu.framework.web.BaseService;
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
public class CgDqcgjServiceImpl extends BaseService<CgDqcgj, CgDqcgjParams, CgDqcgjMapper> implements CgDqcgjService {

    @Override
    public List list(CgDqcgj cgDqcgj) {
        CgDqcgjParams ex = new CgDqcgjParams();
       /* if(cgDqcgj != null){
            CgDqcgjParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(cgDqcgj.getCfgj())){
                c.andCfgjLike("%"+cgDqcgj.getCfgj()+"%");
            }
        }*/
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }

}
