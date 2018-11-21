package cn.edu.cmu.dao;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.ForeignTeacherParams;
import org.junit.Test;

import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/11/21 21:05
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class ForeignTeacherTest extends SpringIOC {


    @Test
    public void testValidate(){

        ForeignTeacherMapper dao = ac.getBean(ForeignTeacherMapper.class);

        System.out.println("\r\n\r\n\r\n\r\n");
        ForeignTeacherParams params = new ForeignTeacherParams();
        ForeignTeacherParams.Criteria c1 = params.createCriteria();
        //ForeignTeacherParams.Criteria c2 = params.or();
        c1.andTidLike("2%");
        c1.andTidLike("2%");
        //c2.andTidLike("2%");
        List list = dao.selectByExample(params);

        System.out.println(list.size());


    }
}
