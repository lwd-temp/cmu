package cn.edu.cmu.framework.util;

import org.apache.http.util.NetUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: jshand
 * @Date: 2019/3/23 14:29
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class WeChartUtilsTest {

    @Test
    public void sendWxMessage() {

        try {
            String sendUser = "";
            String receiveUser = "20171009";
            String title = "国际交流管理信息系统通知";
            String description = "请查收国际交流系统通知";
            String content = "请登录国际交流系统查看复核情况";

            String json = WeChartUtils.sendWxMessage(sendUser,receiveUser,title,description,content);

            System.out.println("json:"+json);

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}