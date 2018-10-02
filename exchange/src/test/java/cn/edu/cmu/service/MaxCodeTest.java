package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import org.junit.Test;

/**
 * @Author: jshand
 * @Date: 2018/10/1 16:59
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class MaxCodeTest extends SpringIOC {


    @Test
    public void testMaxCode(){

        MaxCodeService service = ac.getBean(MaxCodeService.class);
        long maxCode = service.getMaxCode("cgtzh", 2018L);

        System.out.println(maxCode);

    }
}
