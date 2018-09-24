package cn.edu.cmu.framework.cache;

import cn.edu.cmu.framework.util.WebAppContextUtils;
import cn.edu.cmu.framework.util.YmlUtils;
import cn.edu.cmu.framework.web.BaseMapper;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;
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


    public static void clear(){
        tableCache.clear();
    }

    public static Map<String, List> getTableCache() {
        return tableCache;
    }

    /**
     * 初始化
     * @param tableName
     * @param list
     */
    public static void init(String tableName,List list){
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




    public static void initAllDmCache() {

        clear();//清空代码缓存


        String  allDmMapper = (String) YmlUtils.getProperty("sys.cache.mapperbeans");
        String[] mapperBeanNames = allDmMapper.split(",");//所有需要缓存的代码表 mapper的Bean对象名称
        int count = 0;

        for (String mybatisMapperBeanName: mapperBeanNames) {
            initDmCache(mybatisMapperBeanName);
            logger.info(String.format("=======初始化代码缓存 %d %s 完成",count++,mybatisMapperBeanName));

        }

    }

    /**
     * 初始化代码缓存
     */
    @SuppressWarnings(value="unchecked")
    private static void initDmCache(String mybatisMapperBeanName) {

        String tableName = "T_DM_"+mybatisMapperBeanName.toUpperCase().replace("MAPPER","").replace("DM","");

        BaseMapper mapper = (BaseMapper) WebAppContextUtils.getBean(mybatisMapperBeanName);
        List codeList = mapper.selectByExample(null);
        if(codeList!=null && codeList.size()>0){
            Class codeClass = codeList.get(0).getClass();
            List<Map<String,String>> cacheList = new ArrayList();
            for (Object bean:codeList) {
                try {
                    Method getCodeMethod = codeClass.getDeclaredMethod("getCode", null);
                    Method getNameMethod = codeClass.getDeclaredMethod("getName", null);
                    String code = (String) getCodeMethod.invoke(bean,null);
                    String name = (String) getNameMethod.invoke(bean,null);

                    Map<String,String> dm = new HashMap<String,String>();
                    dm.put(code,name);

                    cacheList.add(dm);
                } catch (Exception e) {
                    logger.error(String.format("=======初始化代码缓存时出错,表名称：%s",tableName));
                    e.printStackTrace();
                }
            }
            DMCache.init(tableName,cacheList);
        }

    }




}
