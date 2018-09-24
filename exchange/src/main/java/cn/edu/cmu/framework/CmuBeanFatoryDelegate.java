package cn.edu.cmu.framework;

import cn.edu.cmu.framework.cache.DMCache;
import cn.edu.cmu.framework.util.WebAppContextUtils;
import cn.edu.cmu.framework.util.YmlUtils;
import cn.edu.cmu.framework.web.BaseMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/9/22 21:01
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Component
public class CmuBeanFatoryDelegate implements ApplicationContextAware{

    Logger logger = Logger.getLogger(CmuBeanFatoryDelegate.class);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        WebAppContextUtils.setContext(applicationContext);
        initAllDmCache();
    }


    private void initAllDmCache() {
        String  allDmMapper = (String) YmlUtils.getProperty("sys.cache.mapperbeans");
        int count = 0;
        String[] mapperBeanNames = allDmMapper.split(",");//所有需要缓存的代码表 mapper的Bean对象名称
        for (String mybatisMapperBeanName: mapperBeanNames) {
            initDmCache(mybatisMapperBeanName);
            logger.info(String.format("=======初始化代码缓存 %d %s 完成",count++,mybatisMapperBeanName));

        }

    }

    /**
     * 初始化代码缓存
     */
    @SuppressWarnings(value="unchecked")
    private void initDmCache(String mybatisMapperBeanName) {

        String tableName = "T_DM_"+mybatisMapperBeanName.toUpperCase().replace("MAPPER","").replace("DM","");

        BaseMapper mapper = (BaseMapper)WebAppContextUtils.getBean(mybatisMapperBeanName);
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
