package cn.edu.cmu.framework.util;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @Author: jshand
 * @Date: 2018/9/22 19:29
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class WebAppContextUtils {

    private static ApplicationContext context = null;
    private static ServletContext application = null;
    public static  String REAL_CONTEXT_PATH = "";
    public static  String REAL_CLASS_PATH = "";


    public static void setContext(ApplicationContext context) {
        WebAppContextUtils.context = context;
    }

    public static ApplicationContext getContext() {
        return context;
    }

    /**
     * 获取Bean对象
     * @param classs
     * @param <T>
     * @return
     */
    public static <T> T  getBean(Class<T> classs){
        return context.getBean(classs);
    }

    public static Object  getBean(String beanName){
        return context.getBean(beanName);
    }


    public static ServletContext getApplication() {
        return application;
    }

    public static void setApplication(ServletContext application) {
        WebAppContextUtils.application = application;
    }
}
