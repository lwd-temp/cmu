package cn.edu.cmu.service;

import cn.edu.cmu.dao.ContactMapper;
import cn.edu.cmu.domain.Contact;
import cn.edu.cmu.domain.ContactParams;
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
public class ContactServiceImpl extends BaseService<Contact, ContactParams, ContactMapper> implements ContactService {


    @Override
    public List list(Contact contact) {
        ContactParams ex = new ContactParams();
        if(contact != null){
            ContactParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(contact.getGzdw())){
                c.andGzdwLike("%"+contact.getGzdw()+"%");
            }
        }
        return dao.selectByExample(ex);
    }


    @Override
    public List list(Object... conditions) throws Exception {
        ContactParams params = new ContactParams();
        if(conditions != null && conditions.length>0){//如果 User不等于 null 说明可能穿条件了
            String condition = (String) conditions[0];

            if(StringUtils.isNotEmpty(condition)){//此处 拼接的事 Username的 like条件，其他字段一样
                ContactParams.Criteria c = params.createCriteria();
                c.andNameLike("%"+condition+"%");
            }
            super.addOrderBy(params,conditions);
        }

        return dao.selectByExample(params);
    }
}
