package cn.edu.cmu.framework;

import cn.edu.cmu.framework.cache.DMCache;
import cn.edu.cmu.framework.util.WebAppContextUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

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
        DMCache.initAllDmCache();
    }



}
