package cn.edu.cmu.framework.cache;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/9/22 19:06
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class DMCache {
    private static Logger logger = Logger.getLogger(DMCache.class);

    //代码表 Cache
    private static Map<String ,List> tableCache = new HashMap<String , List>();


    private static void clear(){
        tableCache.clear();
    }

    /**
     * 初始化
     * @param tableName
     * @param list
     */
    public static void init(String tableName,List list){
        clear();
        tableCache.put(tableName,list);
    }

    /**
     * 获取缓存
     * @param tableName
     * @return
     */
    public static List getTableList(String tableName){
        List list = tableCache.get(tableName.toUpperCase());

        if(list == null){
            list = new ArrayList();
        }

        return list;
    }






}
