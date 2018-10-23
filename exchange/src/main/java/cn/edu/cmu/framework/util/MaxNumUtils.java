package cn.edu.cmu.framework.util;

import cn.edu.cmu.service.MaxCodeService;

/**
 * @Author: jshand
 * @Date: 2018/10/1 16:03
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class MaxNumUtils {




    public static  String getMaxNum(String key,int year, int limit) throws Exception {

        MaxCodeService service = WebAppContextUtils.getBean(MaxCodeService.class);
        long max = service.getMaxCode(key, (long)year);


        if(limit-String.valueOf(max).length()<0){
            throw new Exception("长度超过限定的个数");
        }

        int append = limit-String.valueOf(max).length();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < append; i++) {
            sb.append("0");
        }
        sb.append(String.valueOf(max));

        return sb.toString();
    }
}
