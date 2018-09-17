package cn.edu.cmu.framework.web;

import com.github.pagehelper.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseController {


    public Map pagingInfo(Page page, List list,Integer sEcho){
        Map info = new HashMap();

        info.put("sEcho",sEcho++);
        info.put("iTotalRecords",page.getTotal());
        info.put("iTotalDisplayRecords",page.getTotal());
        info.put("aData",list);
        return info;
    }
 

    public Map ajaxStatus(boolean success){
        Map status = new HashMap();

        status.put("success",false);
        status.put("success",success);
        
        return status;
    }


}
