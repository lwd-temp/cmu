package cn.edu.cmu.framework.util;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

public class CmuStringUtil {

    public static String  UUID(){

        return  UUID.randomUUID().toString().replace("-","");
    }


    /**
     * 获取最后一个斜杠 到末尾的访问路径
     * @param request
     * @return
     */
    public static String REQUEST_URI(HttpServletRequest request){
        String uri = request.getRequestURI();
        uri = uri.substring(uri.lastIndexOf("/")+1,uri.length());

        return uri;
    }


    /**
     * 得到请求的扩展名
     * 如 path为abc.png 返回值为 png
     * @param path
     * @return
     */
    public static String REQUEST_EXTENSION_NAME(String path){
        String ext = "";
        path = path.substring(path.lastIndexOf("/")+1);

        ext = path.substring(path.lastIndexOf(".")+1);

        return ext;
    }


    public static void main(String[] args) {
        String ext =  CmuStringUtil.REQUEST_EXTENSION_NAME("aafaff.adfafa.js");
        System.out.println(ext);
    }

}
