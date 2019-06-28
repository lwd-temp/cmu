package cn.edu.cmu.dao;


import cn.edu.cmu.domain.Contact;
import cn.edu.cmu.domain.ContactParams;

import java.util.List;

public interface ContactMapperExt {

    public List<Contact> selectByExampleTranslateCode(ContactParams params);
}