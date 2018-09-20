package cn.edu.cmu.service;
import cn.edu.cmu.dao.HyJhMapper;
import cn.edu.cmu.domain.HyJh;
import cn.edu.cmu.domain.HyJhParams;
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
public class HyJhServiceImpl extends BaseService<HyJh, HyJhParams, HyJhMapper> implements HyJhService {


    @Override
    public List list(HyJh hyJh) {
        HyJhParams ex = new HyJhParams();
        if(hyJh != null){
            HyJhParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(hyJh.getFzrxm())){
                c.andFzrLike("%"+hyJh.getFzrxm()+"%");
            }
        }
        return dao.selectByExample(ex);
    }
}
