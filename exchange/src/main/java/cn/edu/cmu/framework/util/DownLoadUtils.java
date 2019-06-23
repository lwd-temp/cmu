package cn.edu.cmu.framework.util;

import org.xml.sax.InputSource;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
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


    /**
     * 输出到客户端
     * @param response
     * @param is
     */
    public static void writeToResponse(HttpServletResponse response, InputStream is){
        ServletOutputStream os = null;
        try {
            os = response.getOutputStream();
            int len = 0;
            byte[] bytes = new byte[1024];
            while((len = is.read(bytes)) != -1){
                os.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.flush();
                os.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }




}
