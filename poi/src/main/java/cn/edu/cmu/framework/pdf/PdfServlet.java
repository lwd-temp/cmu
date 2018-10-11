package cn.edu.cmu.framework.pdf;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * @Author: jshand
 * @Date: 2018/10/11 21:33
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class PdfServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setHeader("content-disposition", "attachment;filename=info.pdf");
        ServletOutputStream os = response.getOutputStream();

        Map<String, Object> variables = new HashMap<String, Object>(3);


        List<String> names = new ArrayList<String>();
        names.add("金山1212");
        names.add("银山1212");
        names.add("Leo1212");
        variables.put("names", names);


        String template = "pdf_template.html";


        try {
            PdfUtils.fixedHtml2Pdf(template,variables,os);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
