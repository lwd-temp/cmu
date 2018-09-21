package cn.edu.cmu.service;
import cn.edu.cmu.dao.CgTzjhMapper;
import cn.edu.cmu.domain.CgTzjh;
import cn.edu.cmu.domain.CgTzjhParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
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
public class CgTzjhServiceImpl extends BaseService<CgTzjh, CgTzjhParams, CgTzjhMapper> implements CgTzjhService {

    //
    @Override
    public List list(CgTzjh cgTzjh) {
        CgTzjhParams ex = new CgTzjhParams();
        if(cgTzjh != null){
            CgTzjhParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(cgTzjh.getCfdw())){
                c.andCfdwLike("%"+cgTzjh.getCfdw()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
