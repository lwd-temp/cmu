package cn.edu.cmu.pdf;

import cn.edu.cmu.framework.pdf.HtmlGenerator;
import cn.edu.cmu.framework.pdf.PdfGenerator;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class PdfTest {
    @Test
    public void generatePDF() throws Exception {

        Date now = new Date();
        String time1 = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm").format(now);
        String time2 = new SimpleDateFormat("yyyy-MM-dd@HH_ss_mm").format(now);
        String outputFile = "D:\\"+time2+".pdf";

        System.out.println("生成pdf文件："+outputFile);
        OutputStream out = new FileOutputStream(outputFile);

        Map<String, Object> variables = new HashMap<String, Object>(3);

        List<String> names = new ArrayList<String>();
        names.add("Tom1212");
        names.add("Amy1212");
        names.add("Leo1212");

        variables.put("names", names);

        String htmlStr = HtmlGenerator.generate("template.html", variables);

        PdfGenerator.generatePlus(htmlStr, out);


    }
}
