package cn.edu.cmu.service;

import cn.edu.cmu.dao.XsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/10/31 23:14
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Service
public class XsxxServiceImpl implements  XsxxService {

    @Autowired
    XsMapper dao;



    @Override
    public List list(Map param) {
        return dao.listxs(param);
    }
}
