package cn.edu.cmu.controller;
import cn.edu.cmu.domain.CgDqcgj;
import cn.edu.cmu.domain.CgTzjh;
import cn.edu.cmu.domain.UnicUnit;
import cn.edu.cmu.framework.util.PdfUtils;
import cn.edu.cmu.service.CgDqcgjService;
import cn.edu.cmu.service.CgTzjhService;
import cn.edu.cmu.service.UnicUnitService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/cgglexp")
public class CgDqcgjExtController {
    Logger logger = Logger.getLogger(CgDqcgjExtController.class);

    @Autowired
    CgDqcgjService cgDqcgjService;
    @Autowired
    UnicUnitService unicUnitService;
    @Autowired
    CgTzjhService cgTzjhService;


    @RequestMapping("/downloadPdf")
    public void downloadPdf(HttpServletResponse response, HttpServletRequest request, String id,String sqbsm) throws Exception {
        response.reset();
        response.setContentType("application/x-msdownload");
        response.setHeader("Content-Type", "application/octet-stream");
        String agent = request.getHeader("User-Agent").toUpperCase(); //获得浏览器信息并转换为大写
        String fileName = "短期出国管理.pdf";
        if (agent.indexOf("MSIE") > 0 || (agent.indexOf("GECKO")>0 && agent.indexOf("RV:11")>0)) {  //IE浏览器和Edge浏览器
            fileName = URLEncoder.encode(fileName, "UTF-8");
        } else {  //其他浏览器
            fileName = new String(fileName.getBytes("UTF-8"), "iso-8859-1");
        }
        response.setHeader("content-disposition", "attachment;filename=" + fileName);
        ServletOutputStream os = response.getOutputStream();


        //还没有画页面
        //先把申请表信息更新到表中
        CgDqcgj cgDqcgj = cgDqcgjService.queryById(id);
        cgDqcgj.setSqbsm(sqbsm);
        cgDqcgjService.updateByIdAllColumn(cgDqcgj);

        //查询二级单位
        String ejdwid = cgDqcgj.getSsejdw();
        UnicUnit unicUnit = unicUnitService.queryMcById(ejdwid);
        String ssejdwMc = unicUnit.getName();

        //查询团组信息
        String tzid = cgDqcgj.getTzid();
        CgTzjh cgTzjh = cgTzjhService.queryById(tzid);
        String tzh = cgTzjh.getTzh();
        String tzmc = cgTzjh.getTzmc();

        //性别
        String xb = cgDqcgjService.selectXb(cgDqcgj.getXb());
        //出访类型
        //String cglx = cgDqcgjService.selectCglx(cgDqcgj.getCglx());
        //出访目的
        //String cfmd = cgDqcgjService.selectCfmd(cgDqcgj.getCfmd());

        cgDqcgj.setXb(xb);
        //cgDqcgj.setCglx(cglx);
        //cgDqcgj.setCfmd(cfmd);

        //返回值
        String template = "demo/cgdqcgjExtTemplate.html";
        Map<String, Object> variables = new HashMap<String, Object>(5);
        variables.put("tzh", tzh);
        variables.put("tzmc", tzmc);
        variables.put("ssejdwMc", ssejdwMc);
        variables.put("sqbsm", sqbsm);
        variables.put("cgDqcgj", cgDqcgj);

        try {
            PdfUtils.fixedHtml2Pdf(template,variables,os);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
