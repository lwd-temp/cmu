package cn.edu.cmu.framework.util;

import cn.edu.cmu.framework.pdf.HtmlGenerator;
import cn.edu.cmu.framework.pdf.PdfGenerator;

import java.io.OutputStream;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/10/11 21:55
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class PdfUtils {


    public static void fixedHtml2Pdf(String template, Map variables, OutputStream os) throws Exception {
        String htmlStr = HtmlGenerator.generate(template, variables);

        PdfGenerator.generatePlus(htmlStr, os);
    }


}
