package cn.edu.cmu.framework.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: jshand
 * @Date: 2018/10/1 17:06
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class DateUtils {

    private static SimpleDateFormat sdfYMD = new SimpleDateFormat("yyyy-MM-dd");

    public static int getYear(){
        Calendar now =  Calendar.getInstance();
        return now.get(Calendar.YEAR);
    }

    public static String formYMD(Date date){
        if(date == null){
            return "";
        }
        return sdfYMD.format(date);
    }

    /**
     * 根据格式获取日期 字符串
     * @param pattern
     * @return
     */
    public static String formCurrentDate(String pattern){

        return new SimpleDateFormat(pattern).format(new Date());
    }




    public static void main(String[] args) {
        System.out.println(getYear());
    }

}
