package cn.edu.cmu.service;

import cn.edu.cmu.dao.ContactMapper;
import cn.edu.cmu.dao.ContactMapperExt;
import cn.edu.cmu.domain.Contact;
import cn.edu.cmu.domain.ContactParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
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

    @Autowired
    ContactMapperExt contactMapperExt;

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
        ContactParams.Criteria c = params.createCriteria();

        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            Contact contact = (Contact) conditions[0];

            if(StringUtils.isNotEmpty(contact.getName())){
                c.andNameLike("%"+contact.getName()+"%");
            }
            super.addOrderBy(params,conditions);
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

    /*
    国际交流联系人信息下载
     */
    @Override
    public List lxrlistExp(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ContactParams params=new ContactParams();
        ContactParams.Criteria c = params.createCriteria();

        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            Contact lxr = (Contact) conditions[0];

            if(StringUtils.isNotEmpty(lxr.getName())){
                c.andNameLike("%"+lxr.getName()+"%");
            }
            super.addOrderBy(params,conditions);
        }
        return contactMapperExt.selectByExampleTranslateCode(params);
    }
}
