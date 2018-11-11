package cn.edu.cmu.framework.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/11/11 20:30
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class IcdcUtil {

    private static Map<String,String> bksXbMap = new HashMap();
    private static Map<String,String> yjsXbMap = new HashMap();

    static{
       /* 0 '02'
        1 '01'
        2 '02'
        3  -'02'
        男-->'01'
        女   '02'*/
        bksXbMap.put("0","02");
        bksXbMap.put("1","01");
        bksXbMap.put("2","02");
        bksXbMap.put("3","02");
        bksXbMap.put("男","01");
        bksXbMap.put("女","02");



        /*1  男
        01 思贝儿  女
        2  女*/
        yjsXbMap.put("1","01");
        yjsXbMap.put("2","02");
        yjsXbMap.put("01","02");


    }


    /**
     * 将核心库中的编码转换成本系统编码  --本科生
     * @param icdcCode
     */
    public static String translateBksXb(String icdcCode){
        return bksXbMap.get(icdcCode);
    }


    /**
     * 将核心库中的编码转换成本系统编码  ---研究生
     * @param icdcCode
     */
    public static String translateYjsXb(String icdcCode){
        return yjsXbMap.get(icdcCode);
    }
}
