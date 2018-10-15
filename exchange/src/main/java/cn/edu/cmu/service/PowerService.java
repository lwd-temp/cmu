package cn.edu.cmu.service;

/**
 * @Author: jshand
 * @Date: 2018/10/15 21:23
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public interface PowerService {

    boolean grantUser(String userId, String[] roleIds);
}
