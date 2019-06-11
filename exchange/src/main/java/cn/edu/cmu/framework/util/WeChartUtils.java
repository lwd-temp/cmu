package cn.edu.cmu.framework.util;

/**
 * @Author: jshand
 * @Date: 2019/3/21 17:43
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */

import cn.edu.cmu.dao.IfsWxlogMapper;
import cn.edu.cmu.domain.IfsWxlog;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.http.util.NetUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 微信工具类
 */
public class WeChartUtils extends Thread implements Runnable{

    private static Logger logger = Logger.getLogger(NetUtils.class);

    //private static String postUrl = "http://i.cmu.edu.cn/dcp/ifs";
    //private static String sysid = "wxpt_gjjl";
    //private static String key = "lbhunpuwgwaoanmbtsszqgrv";

    private static String postUrl = "";
    private static String sysid = "";
    private static String key = "";
    private static boolean sendSwitch = true;
    private static boolean debug = true;
    private static String debugReceiveUser = null;



    static {
        postUrl = (String) YmlUtils.getProperty("wx_interface.postUrl");
        sysid = (String) YmlUtils.getProperty("wx_interface.sysId");
        key = (String) YmlUtils.getProperty("wx_interface.key");
        sendSwitch = (Boolean) YmlUtils.getProperty("wx_interface.switch");
        debug = (Boolean) YmlUtils.getProperty("wx_interface.debug");
        debugReceiveUser = (String) YmlUtils.getProperty("wx_interface.debugReceiveUser");
    }


    private String sendUser;
    private String receiveUser;
    private String title;
    private String description;
    private String content;


    public WeChartUtils() {
    }

    public WeChartUtils(String sendUser, String receiveUser, String title, String description, String content) {
        this.sendUser = sendUser;
        this.receiveUser = receiveUser;
        this.title = title;
        this.description = description;
        this.content = content;
    }

    /**
     * 发送微信消息
     * @param sendUser
     * @param receiveUser
     * @param title
     * @param description
     * @param content
     * @return
     * @throws Exception
     *
     *
     * 参数列表:
     * 0) url中的红色部分不用动，复制粘贴即可。（sysid的值请联系东软进行分配）
     * 1）sendUser:发件人的用户学/工号 非必填
     * 2）receiveUser：收件人的学/工号 必填 可以多个 英文,分割
     * 3）description:摘要 非必填 –尽量精简，为了显示友好，太长我会截取。
     * 4）content:消息内容 非必填 需要做URLEncode（utf-8字符集）处理
     * 5) remindLink：处理页面url 非必填 需要做URLEncode（utf-8字符集）处理  //没有处理或者查看页面时此参数不传递
     * 6) tite:提示标题 必填
     * 7）unit:发文单位 –汉字  非必填
     *
     *
     *
     * 具体步骤：
     * 1.根据接口URL规范和参数列表拼接参数串，即这部分：module=remind&function=sendWxMessage
     * &sendUser=09901&receiveUser=20171009&title=这是一个标题&description=这里应该是个摘要&content=clobclobclobclobclobclobclobclobclobclobclobclobclobclobclobclobclobclobclob
     * &remindLink=http://www.sina.com&unit=信息管理处
     *
     * 2.把1中拼接好的参数串进行3DES加密，具体加密流程参考附件中的java代码样例IfsUtils.java和附件中的《东软v6平台接口加解密说明》。加解密需要的秘钥key（24位长度）请联系东软进行分配。
     *
     * 3.发POST请求，URL为http://i.cmu.edu.cn/dcp/ifs ，并添加两个请求参数:
     * a)sysid = 联系东软进行分配
     * b)param = 2中经过加密的参数串
     *
     *
     *
     */
    public static String sendWxMessage(String sendUser, String receiveUser, String title, String description, String content) throws Exception {


        logger.info("===============发送微信参数如下========================================");
        logger.info("debug开关:  "+debug);
        logger.info("debug模式下接受者:  "+debugReceiveUser);
        logger.info("sendUser:  "+sendUser);
        logger.info("receiveUser:   "+receiveUser);
        logger.info("title: "+title);
        logger.info("description:   "+description);
        logger.info("content:   "+content);
        logger.info("======================================================================");
        String param = genPostParam(sendUser,receiveUser,title,description,content);

        logger.info("param:"+param);

        return sendPost(param);
    }

    /**
     * 生成加密参数
     * @return
     * @throws Exception
     * @param sendUser
     * @param receiveUser
     * @param title
     * @param description
     * @param content
     */
    private static String genPostParam(String sendUser, String receiveUser, String title, String description, String content) throws Exception {

        String str = "module=remind&function=sendWxMessage&sendUser="+sendUser+"&receiveUser="+receiveUser+"&title="+title+"&description="+description+"&content="+content+"&unit=信息管理处";

        String strencode = IfsUtils.desEncode(str, key);

        return strencode;
    }


    /**
     * 发送请求
     * @param param
     * @return
     */
    private static String sendPost(String param) throws IOException {



        HttpClientBuilder builder = HttpClientBuilder.create();
        HttpClient client = builder.build();



        //设置发送的两个参数sysid,param
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("sysid",sysid));
        nvps.add(new BasicNameValuePair("param",param));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(nvps);

        //设置post请求
        HttpPost post = new HttpPost(postUrl);
        post.setEntity(entity);

        //解析响应结果
        HttpResponse response = client.execute(post);
        int statusCode = response.getStatusLine().getStatusCode();
        logger.info("statusCode:"+statusCode);

        String json = "";

        //如果200则解析返回的Entity
        if(statusCode == 200){
            //response.getEntity()

            json = EntityUtils.toString(response.getEntity());
            logger.debug("返回消息："+json);

        }else{
            logger.info("错误的请求响应："+statusCode+",url:"+postUrl);
            throw new IOException("错误的请求响应");
        }

        return json;
    }


    /**
     * 异步发起消息，并记录日志
     */

    public void sendWxMessageSync(){
        this.start();
    }




    @Override
    public void run() {

        if(!sendSwitch){//使用开关控制，是否允许环境发送微信消息
            logger.info("当前环境已关闭微信接口，暂不发送微信消息(如需打开请联系管理员)...");
            return;
        }

        if(debug){
            receiveUser = debugReceiveUser;
        }

        String json = null;
        try {

            json = WeChartUtils.sendWxMessage(sendUser,receiveUser,title,description,content);
        } catch (Exception e) {
            e.printStackTrace();
            json = e.getMessage();
        }

        IfsWxlog log = new IfsWxlog();
        log.setLogid(CmuStringUtil.UUID());
        log.setSendUser(sendUser);
        log.setReceiveUser(receiveUser);
        log.setReceiveName(receiveUser);
        log.setTitle(title);
        log.setDescription(description);
        log.setContent(content);
        log.setResult(json);

        IfsWxlogMapper wxlogDao = WebAppContextUtils.getBean(IfsWxlogMapper.class);

        int logCount = wxlogDao.insertSelective(log);

        logger.info("保存微信接口消息到DB："+(logCount>0));
    }
}
