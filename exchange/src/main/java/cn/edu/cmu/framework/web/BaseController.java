package cn.edu.cmu.framework.web;

import com.github.pagehelper.Page;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseController {

    protected Logger logger = Logger.getLogger(this.getClass());

    public Map pagingInfo(Page pageInfo, List list){
        Map info = new HashMap();
        info.put("pages",pageInfo.getPages() );//总页数
        info.put("page",pageInfo.getPageNum());//当前页号
        info.put("count",pageInfo.getTotal());//总条数
        info.put("data",list); //数据
        return info;
    }
    public Map ajaxStatus(boolean success){
        return ajaxStatus(success,"",null);
    }


    public Map ajaxStatus(boolean success,String msg){
        return ajaxStatus(success,msg,null);
    }

    public Map ajaxStatus(boolean success,Object data){
         return ajaxStatus(success,"",data);
    }


    public Map ajaxStatus(boolean success,String msg,Object data){
        Map status = new HashMap();

        status.put("success",false);
        status.put("success",success);
        status.put("msg",msg);
        status.put("data",data);
        return status;
    }


    /**
     * 根据浏览器类型 设置文件名称
     * @param request
     * @param response
     * @param fileName
     * @throws UnsupportedEncodingException
     */
    public void getDownLoadFileName(HttpServletRequest request , HttpServletResponse response, String fileName) throws UnsupportedEncodingException {
        //response.setContentType("application/x-msdownload");
        response.setHeader("Content-Type", "application/octet-stream");
        String agent = request.getHeader("User-Agent").toUpperCase(); //获得浏览器信息并转换为大写

        if (agent.indexOf("MSIE") > 0 || (agent.indexOf("GECKO")>0 && agent.indexOf("RV:11")>0)) {  //IE浏览器和Edge浏览器
            fileName = URLEncoder.encode(fileName, "UTF-8");
        } else {  //其他浏览器
            fileName = new String(fileName.getBytes("UTF-8"), "iso-8859-1");
        }
        response.setHeader("content-disposition", "attachment;filename=" + fileName);
    }



}
