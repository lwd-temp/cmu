package cn.edu.cmu.service;

import cn.edu.cmu.dao.ZyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/24 0:13
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Service
public class ZyServiceImpl implements ZyService {

    @Autowired
    ZyMapper dao;


    @Override
    public List<String> selectZyList() {
        return dao.selectZyList();
    }
}
