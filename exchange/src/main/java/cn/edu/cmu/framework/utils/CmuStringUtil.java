package cn.edu.cmu.framework.utils;

import java.util.UUID;

public class CmuStringUtil {

    public static String  UUID(){

        return  UUID.randomUUID().toString().replace("-","");
    }


}
