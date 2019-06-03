package cn.edu.cmu.framework.util;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DownLoadUtils {


    public static void setDownLoadHeaders(HttpServletRequest request, HttpServletResponse response,String fileName) throws UnsupportedEncodingException {

        //response.setContentType("application/x-msdownload");
        response.setHeader("Content-Type", "application/octet-stream");

        //获得浏览器信息并转换为大写
        String agent = request.getHeader("User-Agent").toUpperCase();

        //IE浏览器和Edge浏览器
        if (agent.indexOf("MSIE") > 0 || (agent.indexOf("GECKO")>0 && agent.indexOf("RV:11")>0)) {
            fileName = URLEncoder.encode(fileName, "UTF-8");
        } else {  //其他浏览器
            fileName = new String(fileName.getBytes("UTF-8"), "iso-8859-1");
        }
        response.setHeader("content-disposition", "attachment;filename=" + fileName);
    }
}
