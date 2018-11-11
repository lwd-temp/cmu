package cn.edu.cmu.service;

import cn.edu.cmu.dao.ForeignTeacherMapper;
import cn.edu.cmu.domain.ForeignTeacher;
import cn.edu.cmu.domain.ForeignTeacherParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.ArrayUtils;
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
public class ForeignTeacherServiceImpl extends BaseService<ForeignTeacher, ForeignTeacherParams, ForeignTeacherMapper> implements ForeignTeacherService {


    @Override
    public List list(ForeignTeacher foreignTeacher) {
        ForeignTeacherParams ex = new ForeignTeacherParams();
        if (foreignTeacher != null) {
            ForeignTeacherParams.Criteria c = ex.createCriteria();
            /*if(StringUtils.isNotEmpty(foreignTeacher.get教师姓名())){
                c.and教师姓名Like("%"+foreignTeacher.get教师姓名()+"%");
            }*/
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        ForeignTeacherParams params = new ForeignTeacherParams();
        ForeignTeacherParams.Criteria c1 = params.createCriteria();
        ForeignTeacherParams.Criteria c2 = params.or();
        if (conditions != null && conditions.length > 0 && conditions[0] != null) {
            ForeignTeacher foreignTeacher = (ForeignTeacher) conditions[0];

            if (StringUtils.isNotEmpty(foreignTeacher.getJsm())) {
                c1.andJsmEqualTo("%" + foreignTeacher.getJsm() + "%");
            }
            //暂时好像没有外文名字字段后期如果出现多个名字，就需要用到第二个Criteria的or的关系
            //if (StringUtils.isNotEmpty(foreignTeacher.getName())) {
            //    c2.andNameLike("%" + foreignTeacher.getName() + "%");
            //}


            super.addOrderBy(params, conditions);
        }

        return dao.selectByExample(params);
    }

    @Override
    public boolean deleteMulti(String[] ids) throws Exception {
        if(ArrayUtils.isNotEmpty(ids)){
            for (String id : ids) {
                deleteById(id);
            }
            return true;
        }


        return false;
    }
}
