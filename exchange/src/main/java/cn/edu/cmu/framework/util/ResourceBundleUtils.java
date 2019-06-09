package cn.edu.cmu.framework.util;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/***
 * @pj: cmu
 * @author : jshand
 * @date: 2019/6/9
 * @time: 21:14
 * @site: http://314649444.iteye.com
 * @desc：属性资源文件读取工具类
 */
public class ResourceBundleUtils {
    private static final ResourceBundle bundle = ResourceBundle.getBundle("bundle/Resources");


    public static String getString(String key){
        return getString(key,null);
    }

    public static String getString(String key,String... formatData){

        String value = null;
        value =  bundle.getString(key);

        /**
         * 如果需要格式化 ，则使用字符串格式化
         */
        if(formatData != null){
            MessageFormat mf = new MessageFormat(value);
            value = mf.format(formatData);
        }

        return value;

    }

    public static void main(String[] args) {

        System.out.println(ResourceBundleUtils.getString("ifs.wechat.hz.bntx.title"));//【通知】护照半年到期提醒
        System.out.println(ResourceBundleUtils.getString("ifs.wechat.hz.bntx.description"));//国际事务部通知
        System.out.println(ResourceBundleUtils.getString("ifs.wechat.hz.bntx.content"));//尊敬的老师您好，您的护照还有半年即将超期，请知晓中文
    }



}
