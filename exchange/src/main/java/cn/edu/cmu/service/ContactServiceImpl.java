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
}
