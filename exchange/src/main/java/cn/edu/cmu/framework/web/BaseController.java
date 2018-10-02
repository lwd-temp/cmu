package cn.edu.cmu.framework.web;

import com.github.pagehelper.Page;
import org.apache.log4j.Logger;

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




}
