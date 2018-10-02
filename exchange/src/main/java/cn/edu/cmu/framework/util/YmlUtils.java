package cn.edu.cmu.framework.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/9/22 20:11
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class YmlUtils {
    //yml 每次都加载会很慢，增加缓存
    private static Map cache = new HashMap();

    public static Object getProperty(String key){
        return getProperty(key,"/application.yml");
    }

    public static Object getProperty(String key,String fileName){
        String value = null;
        org.yaml.snakeyaml.Yaml yaml = new org.yaml.snakeyaml.Yaml();
        //如果读入Map,这里可以是Mapj接口,默认实现为LinkedHashMap
        Map entity = yaml.loadAs(YmlUtils.class.getResourceAsStream(fileName), Map.class);

        /*entity = (Map) entity.get("sys");
        System.out.println(entity.getClass());

        String object = (String) entity.get("cache");
        System.out.println(object);

        if(1 ==1 ){
            return null;
        }*/

        if(entity == null){
            return null;
        }

        if(!key.contains(".")){//如果不包含点 则直接按照key返回value
            cache.put(key,entity.get(key));
            return cache.get(key);
        }
        String beforeKey =key.substring(0,key.lastIndexOf("."));
        String lastKey =key.substring(key.lastIndexOf(".")+1 ,key.length());
        String[] beforeKeys = beforeKey.split("\\.");

        for (String item:beforeKeys) {
            try {
                entity = (Map) entity.get(item);
                if(entity == null){
                    return null;
                }
            } catch (ClassCastException e) {
                //e.printStackTrace();
                return null;
            }
        }
        cache.put(lastKey,entity.get(lastKey));
        return cache.get(lastKey);

    }

    public static void main(String[] args) {
        String key = "afafaf.bcdef.gggggg";

       /* sys:
        cache:
        mapperbeans*/
        System.out.println(YmlUtils.getProperty("sys.cache.mapperbeans"));
    }


}
