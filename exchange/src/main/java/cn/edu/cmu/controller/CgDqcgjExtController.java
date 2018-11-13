package cn.edu.cmu.controller;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.util.PdfUtils;
import cn.edu.cmu.framework.util.WebAppContextUtils;
import cn.edu.cmu.service.CgDqcgjGgService;
import cn.edu.cmu.service.CgDqcgjService;
import cn.edu.cmu.service.CgTzjhService;
import cn.edu.cmu.service.UnicUnitService;
import com.deepoove.poi.XWPFTemplate;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
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
    @Autowired
    CgDqcgjGgService cgDqcgjGgService;


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
        CgDqcgj cgDqcgj = cgDqcgjService.queryById(id);

        //先把申请表信息更新到表中
        if(sqbsm!=null&&sqbsm!=""){
            String sqbsmnew=new String(sqbsm.getBytes("ISO-8859-1"), "UTF-8");
            cgDqcgj.setSqbsm(sqbsmnew);
            cgDqcgjService.updateByIdAllColumn(cgDqcgj);
        }

        //查询二级单位
        String ejdwid = cgDqcgj.getSsejdw();
        UnicUnit unicUnit = unicUnitService.queryMcById(ejdwid);
        String ssejdwMc = unicUnit.getName();

        //查询团组信息
        String tzid = cgDqcgj.getTzid();
        String tzh=" ";
        String tzmc=" ";
        System.err.println(tzid);
        CgTzjh cgTzjh = cgTzjhService.queryById(tzid);
        if (cgTzjhService.queryById(tzid)!=null){

            tzh = cgTzjh.getTzh();
            tzmc = cgTzjh.getTzmc();

        }


        //性别
        String xb = cgDqcgjService.selectXb(cgDqcgj.getXb());
        //出访类型
        String cglx = cgDqcgjService.selectCglx(cgDqcgj.getCglx());
        //出访目的
        String cfmd = cgDqcgjService.selectCfmd(cgDqcgj.getCfmd());

        cgDqcgj.setXb(xb);
        cgDqcgj.setCglx(cglx);
        cgDqcgj.setCfmd(cfmd);
        String csrq = "";
        String cfjsrq ="";
        String cfksrq = "";

        if(cgDqcgj.getCsrq()!=null){
            csrq = new SimpleDateFormat("yyyy-MM-dd").format(cgDqcgj.getCsrq()).toString();
        }
        if(cgDqcgj.getCfjsrq()!=null){
            cfjsrq = new SimpleDateFormat("yyyy-MM-dd").format(cgDqcgj.getCfjsrq()).toString();
        }
        if(cgDqcgj.getCfksrq()!=null){
            cfksrq = new SimpleDateFormat("yyyy-MM-dd").format(cgDqcgj.getCfksrq()).toString();
        }

        //返回值
        String template = "cgdqcgj/cgdqcgjExtTemplate.html";
        Map<String, Object> variables = new HashMap<String, Object>(5);

        variables.put("csrq", csrq);
        variables.put("cfjsrq", cfjsrq);
        variables.put("cfksrq", cfksrq);
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

    @RequestMapping("/downloadword")
    public void downloadword(HttpServletResponse response, HttpServletRequest request, String rwfkid) throws Exception {
        String application = WebAppContextUtils.REAL_CONTEXT_PATH;
        FileInputStream is = new FileInputStream(new File(application + "/download_template/word/cggl.docx"));
        XWPFTemplate template = XWPFTemplate.compile(is);
        HashMap<String, Object> data = new HashMap<String, Object>();
        CgRwzxqkfk cgRwzxqkfk = new CgRwzxqkfk();
        cgRwzxqkfk = cgDqcgjGgService.queryById(rwfkid);
        data.put("tzdw", cgRwzxqkfk.getTzdw());
        data.put("cfgjdq", cgRwzxqkfk.getCfgjdq());
        data.put("tzxm", cgRwzxqkfk.getTzxm());
        data.put("tzzdw", cgRwzxqkfk.getTzzdw());
        data.put("tzzw", cgRwzxqkfk.getTzzw());
        data.put("pzcfrw", cgRwzxqkfk.getPzcfrw());
        data.put("pzcfts", cgRwzxqkfk.getPzcfts());
        data.put("sjcfrs", cgRwzxqkfk.getSjcfrs());
        data.put("sjcfts", cgRwzxqkfk.getSjcfts());
        data.put("rwpjwh", cgRwzxqkfk.getRwpjwh());

        if(cgRwzxqkfk.getRjsj()!=null){
            data.put("rjsj", new SimpleDateFormat("yyyy-MM-dd").format(cgRwzxqkfk.getRjsj()).toString());
        }else{
            data.put("rjsj", cgRwzxqkfk.getRjsj());
        }
        data.put("cfbt", cgRwzxqkfk.getCfbt());
        data.put("rwzxqk", cgRwzxqkfk.getRwzxqk());
        data.put("rwwwcnr", cgRwzxqkfk.getRwwwcnr());

        template.render(data);
        response.reset();
        response.setContentType("application/x-msdownload");
        response.setHeader("Content-Type", "application/octet-stream");
        String agent = request.getHeader("User-Agent").toUpperCase(); //获得浏览器信息并转换为大写
        String fileName = "导出word.doc";
        if (agent.indexOf("MSIE") > 0 || (agent.indexOf("GECKO")>0 && agent.indexOf("RV:11")>0)) {  //IE浏览器和Edge浏览器
            fileName = URLEncoder.encode(fileName, "UTF-8");
        } else {  //其他浏览器
            fileName = new String(fileName.getBytes("UTF-8"), "iso-8859-1");
        }
        response.setHeader("content-disposition", "attachment;filename=" + fileName);
        ServletOutputStream os = response.getOutputStream();
        template.write(os);
        os.flush();
        os.close();
        template.close();
    }
}
