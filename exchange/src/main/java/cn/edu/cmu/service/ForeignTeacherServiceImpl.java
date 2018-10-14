package cn.edu.cmu.service;
import cn.edu.cmu.dao.ForeignTeacherMapper;
import cn.edu.cmu.domain.ForeignTeacher;
import cn.edu.cmu.domain.ForeignTeacherParams;
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
public class ForeignTeacherServiceImpl extends BaseService<ForeignTeacher, ForeignTeacherParams, ForeignTeacherMapper> implements ForeignTeacherService {


    @Override
    public List list(ForeignTeacher foreignTeacher) {
        ForeignTeacherParams ex = new ForeignTeacherParams();
        if(foreignTeacher != null){
            ForeignTeacherParams.Criteria c = ex.createCriteria();
            /*if(StringUtils.isNotEmpty(foreignTeacher.get教师姓名())){
                c.and教师姓名Like("%"+foreignTeacher.get教师姓名()+"%");
            }*/
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }
}
