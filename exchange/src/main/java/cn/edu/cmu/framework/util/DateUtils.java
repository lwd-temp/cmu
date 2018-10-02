package cn.edu.cmu.framework.util;

import java.util.Calendar;

/**
 * @Author: jshand
 * @Date: 2018/10/1 17:06
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class DateUtils {


    public static int getYear(){
        Calendar now =  Calendar.getInstance();
        return now.get(Calendar.YEAR);
    }


    public static void main(String[] args) {
        System.out.println(getYear());
    }

}
