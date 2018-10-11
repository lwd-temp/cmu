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
    private static Map<String, List> tableCache = new HashMap<String, List>();

    private static Map<String,String> tableCodeNameParis = new HashMap<>(0);


    public static void clear() {
        tableCache.clear();
    }

    public static Map<String, List> getTableCache() {
        return tableCache;
    }

    /**
     * 初始化
     *
     * @param tableName
     * @param list
     */
    public static void init(String tableName, List list) {
        tableCache.put(tableName, list);
    }

    /**
     * 获取缓存
     *
     * @param tableName
     * @return
     */
    public static List getTableList(String tableName) {
        List list = tableCache.get(getTableKey(tableName));

        if (list == null) {
            list = new ArrayList();
        }

        return list;
    }

    /**
     * 获取代码表 缓存 的 key  如果是 T_DM_XXX key为表明， 如果是T_DM_XXX_XX  咋XXX 部分后面的 下划线 去掉为 T_DM_XXXXX
     * @param tableName
     * @return
     */
    public static String getTableKey(String tableName){
        int splitKeyLength = tableName.split("_").length-1;
        String otherKey =tableName.substring(5).replace("_","");
        String key = splitKeyLength>=3?"t_dm_"+otherKey:tableName;

        return key.toUpperCase();
    }


    public static String translateCode2Name(String tableName, String code) {
        String key = tableName+"_"+code;
        if(tableCodeNameParis.containsKey(key)){
            return  tableCodeNameParis.get(key);
        }
        return null;

    }


    public static void initAllDmCache() {

        clear();//清空代码缓存


        String allDmMapper = (String) YmlUtils.getProperty("sys.cache.mapperbeans");
        String[] mapperBeanNames = allDmMapper.split(",");//所有需要缓存的代码表 mapper的Bean对象名称
        int count = 0;

        for (String mybatisMapperBeanName : mapperBeanNames) {
            initDmCache(mybatisMapperBeanName);
            logger.info(String.format("=======初始化代码缓存 %d %s 完成", count++, mybatisMapperBeanName));

        }

    }

    /**
     * 初始化代码缓存
     */
    @SuppressWarnings(value = "unchecked")
    private static void initDmCache(String mybatisMapperBeanName) {

        String tableName = "T_DM_" + mybatisMapperBeanName.toUpperCase().replace("MAPPER", "").replace("DM", "");

        BaseMapper mapper = (BaseMapper) WebAppContextUtils.getBean(mybatisMapperBeanName);
        List codeList = mapper.selectByExample(null);
        if (codeList != null && codeList.size() > 0) {
            Class codeClass = codeList.get(0).getClass();
            List<Map<String, String>> cacheList = new ArrayList();
            for (Object bean : codeList) {
                try {
                    Method getCodeMethod = codeClass.getDeclaredMethod("getCode", null);
                    Method getNameMethod = codeClass.getDeclaredMethod("getName", null);
                    String code = (String) getCodeMethod.invoke(bean, null);
                    String name = (String) getNameMethod.invoke(bean, null);

                    Map<String, String> dm = new HashMap<String, String>();
                    dm.put(code, name); //可以是code --value

                    tableCodeNameParis.put(tableName+"_"+code,name);

                    cacheList.add(dm);
                } catch (Exception e) {
                    logger.error(String.format("=======初始化代码缓存时出错,表名称：%s", tableName));
                    e.printStackTrace();
                }
            }
            DMCache.init(tableName, cacheList);
        }

    }


}
