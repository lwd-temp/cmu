package cn.edu.cmu.framework.util;

/**
 * @Author: jshand
 * @Date: 2019/4/15 0:24
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class OSUtils {



    public static boolean isWin(){
        String os = System.getProperty("os.name");

        return os.indexOf("Window")!=-1;
    }


}
