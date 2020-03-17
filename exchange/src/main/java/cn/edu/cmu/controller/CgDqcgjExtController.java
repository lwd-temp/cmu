package cn.edu.cmu.controller;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.cache.DMCache;
import cn.edu.cmu.framework.util.DownLoadUtils;
import cn.edu.cmu.framework.util.ExcelUtils;
import cn.edu.cmu.framework.util.PdfUtils;
import cn.edu.cmu.framework.util.WebAppContextUtils;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.CgDqcgjGgService;
import cn.edu.cmu.service.CgDqcgjService;
import cn.edu.cmu.service.CgTzjhService;
import cn.edu.cmu.service.UnicUnitService;
import com.deepoove.poi.XWPFTemplate;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cgglexp")
public class CgDqcgjExtController extends BaseController {
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
        //response.reset();


        sqbsm = URLDecoder.decode(sqbsm,"utf-8");

        String fileName = "短期出国管理.pdf";
        super.getDownLoadFileName(request,response,fileName);

        try {
            Map variables = initPDFDate(id,sqbsm);
            String template = "download_template\\pdf\\cgdqcgj\\cgdqcgjExtTemplate.pdf";

            ServletOutputStream os = response.getOutputStream();
            PdfUtils.outPdfWidthPdfTemp(template,variables,os);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Map initPDFDate(String id,String sqbsm) throws Exception {


        //返回值
        String template = "download_template\\pdf\\cgdqcgj\\temp-01.pdf";
        Map<String, String> variables = new HashMap<String, String>();


        CgDqcgj cgDqcgj = cgDqcgjService.queryById(id);
        //先把申请表信息更新到表中
        if(sqbsm!=null&&sqbsm!=""){
            cgDqcgj.setSqbsm(sqbsm);
            cgDqcgjService.updateByIdAllColumn(cgDqcgj);
        }

        //查询二级单位
        String ejdwid = cgDqcgj.getSsejdw();
        UnicUnit unicUnit = unicUnitService.queryMcById(ejdwid);

        //性别

        String csrq = "";
        String cfjsrq ="";
        String cfksrq = "";

        if(cgDqcgj.getCsrq()!=null){
            csrq = new SimpleDateFormat("yyyy-MM-dd").format(cgDqcgj.getCsrq()).toString();
        }
        if(cgDqcgj.getCfksrq()!=null){
            cfksrq = new SimpleDateFormat("yyyy-MM-dd").format(cgDqcgj.getCfksrq()).toString();
        }
        if(cgDqcgj.getCfjsrq()!=null){
            cfjsrq = new SimpleDateFormat("yyyy-MM-dd").format(cgDqcgj.getCfjsrq()).toString();
        }

        CgTzjh cgTzjh = cgTzjhService.queryById(cgDqcgj.getTzid());
        logger.info("cgDqcgj.getTzid()"+cgTzjh);
        if (cgTzjh!=null){
            variables.put("tzh"	,cgTzjh.getTzh());
        }
        variables.put("xm"	,	cgDqcgj.getXm());
        variables.put("xb"	,	DMCache.translateCode2Name("t_DM_XB",cgDqcgj.getXb()));//代码转名称
        variables.put("csrq"	,	csrq);
        variables.put("hj"	,	cgDqcgj.getHjszd());
        variables.put("csr"	,	cgDqcgj.getCsd());

        variables.put("hjszd"	,	cgDqcgj.getHjszd());
        variables.put("sfzh"	,	cgDqcgj.getSfzh());
        variables.put("ejssdw"	,	unicUnit.getName());
        variables.put("ks"	,	cgDqcgj.getKs());
        variables.put("zw"	,	cgDqcgj.getZw());
        variables.put("zc"	,	cgDqcgj.getZc());
        variables.put("lxdh"	,	cgDqcgj.getLxdh());
        variables.put("yx"	,	cgDqcgj.getEmail());
        variables.put("cfgj"	,	cgDqcgj.getCfgj());
        variables.put("rjcs"	,	cgDqcgj.getRjcs());
        variables.put("cfrq_start"	,	cfksrq);
        variables.put("cfrq_end"	,	cfjsrq);
        variables.put("cfmd"	,	cgDqcgj.getCfmd());
        variables.put("cfmdqt"	,	cgDqcgj.getCfmdQt());
        variables.put("yqr_xm_en"	,	cgDqcgj.getYqrXmEn());
        variables.put("yqr_zw_en"	,	cgDqcgj.getYqrZwEn());
        variables.put("yqr_dw_en"	,	cgDqcgj.getYqrDwEn());
        variables.put("yqr_dz_en"	,	cgDqcgj.getYqrXxdzEn());
        variables.put("yqr_dh_en"	,	cgDqcgj.getYqrDhEn());

        variables.put("yqr_xm_cn"	,	cgDqcgj.getYqrXm());
        variables.put("yqr_zw_cn"	,	cgDqcgj.getYqrZw());
        variables.put("yqr_dw_cn"	,	cgDqcgj.getYqrDw());
        variables.put("yqr_dz_cn"	,	cgDqcgj.getYqrXxdz());
        variables.put("yqr_dh_cn"	,	cgDqcgj.getYqrDh());

        variables.put("jfly"	,	cgDqcgj.getJfly());
        variables.put("jfysmx"	,	cgDqcgj.getJfysmx());
        variables.put("cfsc"	,	cgDqcgj.getCfsc());

        return variables;
    }


    @RequestMapping("/downloadword")
    public void downloadword(HttpServletResponse response, HttpServletRequest request, String rwfkid) throws Exception {
        String application = WebAppContextUtils.REAL_CONTEXT_PATH;
        FileInputStream is = new FileInputStream(new File(application + "/download_template/word/cggl/cggl.docx"));
        XWPFTemplate template = XWPFTemplate.compile(is);
        HashMap<String, Object> data = new HashMap<String, Object>();
        CgRwzxqkfk cgRwzxqkfk = new CgRwzxqkfk();
        cgRwzxqkfk = cgDqcgjGgService.queryById(rwfkid);
        data.put("tzdw", cgRwzxqkfk.getTzdw());
        data.put("cfgjdq", cgRwzxqkfk.getCfgjdq());
        data.put("tzxm", cgRwzxqkfk.getTzxm());
        data.put("tzzdw", cgRwzxqkfk.getTzzdw());
        data.put("hzhm", cgRwzxqkfk.getHzhm());
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
        if(cgRwzxqkfk.getYxqz()!=null){
            data.put("yxqz", new SimpleDateFormat("yyyy-MM-dd").format(cgRwzxqkfk.getYxqz()).toString());
        }else{
            data.put("yxqz", cgRwzxqkfk.getYxqz());
        }
        if(cgRwzxqkfk.getCjsj()!=null){
            data.put("cjsj", new SimpleDateFormat("yyyy-MM-dd").format(cgRwzxqkfk.getCjsj()).toString());
        }else{
            data.put("cjsj", cgRwzxqkfk.getCjsj());
        }
        if(cgRwzxqkfk.getQzsj()!=null){
            data.put("qzsj", new SimpleDateFormat("yyyy-MM-dd").format(cgRwzxqkfk.getQzsj()).toString());
        }else{
            data.put("qzsj", cgRwzxqkfk.getQzsj());
        }
        data.put("cfbt", cgRwzxqkfk.getCfbt());
        data.put("rwzxqk", cgRwzxqkfk.getRwzxqk());
        data.put("rwwwcnr", cgRwzxqkfk.getRwwwcnr());

        template.render(data);
        response.reset();
        response.setContentType("application/x-msdownload");
        response.setHeader("Content-Type", "application/octet-stream");
        String agent = request.getHeader("User-Agent").toUpperCase(); //获得浏览器信息并转换为大写
        String fileName = "辽宁省国家工作人员因公临时出国（境）出访情况报告.doc";
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

    @RequestMapping("/download")
    public void download(CgDqcgj cggl, String orderCol, String orderType, HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<CgDqcgj> list = cgDqcgjService.cggshllistExp(cggl, orderCol, orderType);
        logger.info(String.format("导出短期出国(境)人员审核信息，共计: %d 条",(CollectionUtils.isEmpty(list)?0:list.size())));

        String downFileName = "短期出国(境)人员审核信息.xls";

        DownLoadUtils.setDownLoadHeaders(request,response,downFileName);
        ServletOutputStream out = response.getOutputStream();

        String excelTempPath = "cggl/cggl.xls";
        ExcelUtils.expExcel(list,excelTempPath,out);
    }
}
