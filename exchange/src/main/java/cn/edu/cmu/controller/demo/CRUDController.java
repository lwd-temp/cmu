package cn.edu.cmu.controller.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/cruddemo")
public class CRUDController {

    @ResponseBody
    @RequestMapping("/list")
    public Map list(@RequestParam(defaultValue ="1") Integer sEcho){
        List list = new ArrayList();

        Map info  = null;
        for (int i = 1; i <= 10; i++) {

            info = new HashMap();
            info.put("id",i+":"+i+":"+sEcho+":id");
            info.put("appName",i+":"+sEcho+":appName");
            info.put("apiKey",i+":"+sEcho+":apiKey");
            info.put("secretKey",i+":"+sEcho+":secretKey");
            info.put("createTime",new Date().getTime()+"");
            list.add(info);
        }


        Map map = new HashMap();
        map.put("sEcho",sEcho++);
        map.put("iTotalRecords",45);
        map.put("iTotalDisplayRecords",45);
        map.put("aData",list);
        return map;
    }


    public static void main(String[] args) {
        Properties props = System.getProperties();
        Set<Object> keySet = props.keySet();
        Iterator<Object> it = keySet.iterator();

        while(it.hasNext()){
            Object key = it.next();
            Object prop = props.get(key);
            System.out.println("key:"+key+"\tvalue:"+prop+"");
        }
    }

}
