package cn.edu.cmu.framework.pdf;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.CgDqcgj;
import cn.edu.cmu.framework.listener.InitListener;
import cn.edu.cmu.service.CgDqcgjService;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.*;
import freemarker.template.SimpleDate;
import org.junit.Before;
import org.junit.Test;
import org.xhtmlrenderer.pdf.ITextRenderer;

import javax.swing.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.Assert.*;

/**
 * @Author: jshand
 * @Date: 2019/4/12 23:48
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class PdfGeneratorTest /*extends SpringIOC */ {


    @Test
    public void generate() throws Exception {


        String template = "E:\\development\\workspace\\ideaworspace\\space2\\cmu\\exchange\\src\\main\\webapp\\download_template\\pdf\\cgdqcgj\\cgdqcgjExtTemplate.html";


        StringBuffer sb = new StringBuffer();

        FileInputStream fis = new FileInputStream(new File(template));
        byte[] bytes = new byte[1024];
        while (fis.read(bytes) != -1) {
            sb.append(new String(bytes));
        }
        fis.close();


        System.out.println(sb.toString());

        String path = "D:\\aaaa.pdf";
        FileOutputStream fos = new FileOutputStream(new File(path));

        PdfGenerator.generatePlus(sb.toString(), fos);
    }

    @Test
    public void generatePlus() {
    }


    @Test
    public void createPDFwithTemp() throws IOException, DocumentException {
        // 模板路径
        String templatePath = "D:\\pdf\\temp-01.pdf";
        // 生成的新文件路径
        String newPDFPath = "D:\\pdf\\1345.pdf";
        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;


        /*使用中文字体 */
        BaseFont bf = BaseFont.createFont("E:\\development\\workspace\\ideaworspace\\space2\\cmu\\exchange\\src\\main\\resources\\ttc\\simsun.ttc,1",
                BaseFont.IDENTITY_H,BaseFont.EMBEDDED);
        ArrayList<BaseFont> fontList = new ArrayList<BaseFont>();
        fontList.add(bf);

        try {
            out = new FileOutputStream(newPDFPath);// 输出流
            reader = new PdfReader(templatePath);// 读取pdf模板
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);

            AcroFields form = stamper.getAcroFields();
            AcroFields fields = stamper.getAcroFields();
            fields.setSubstitutionFonts(fontList);

            Object[] str = null;

            List list = new ArrayList();

            for (int i = 1; i <100 ; i++) {
                list.add("文字"+i);
            }
            str = list.toArray();

            int index = 0;

            java.util.Iterator<String> it = form.getFields().keySet().iterator();
            while (it.hasNext()) {
                String name = it.next().toString();
                System.out.println(name);
                form.setField(name, name+"-"+(++index));
            }
            stamper.setFormFlattening(true);// 如果为false那么生成的PDF文件还能编辑，一定要设为true
            stamper.close();

            Document doc = new Document();

            PdfCopy copy = new PdfCopy(doc, out);
            doc.open();
            int numOfPage = reader.getNumberOfPages();
            for (int i = 1; i < numOfPage+1; i++) {
                PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), i);
                copy.addPage(importPage);
            }

            doc.close();

        } catch (BadPdfFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }


    }


    @Test
    public void createPDFOnly() throws IOException, DocumentException {

        ITextRenderer iTextRenderer = new ITextRenderer();
        try {

            iTextRenderer.getFontResolver().addFont("E:\\development\\workspace\\ideaworspace\\space2\\cmu\\exchange\\src\\main\\resources\\ttc\\simsun.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        } catch (IOException e) {
            e.printStackTrace();
        }
        iTextRenderer.setDocument(new File("D:\\pdf\\index.html").toURI().toString());
        iTextRenderer.layout();
        String time = new SimpleDateFormat("HH_mm_ss").format(new Date());
        System.out.println("D:\\pdf\\"+time+".pdf");
        OutputStream fileOutputStream = new FileOutputStream("D:\\pdf\\"+time+".pdf");
        iTextRenderer.createPDF(fileOutputStream);
        iTextRenderer.finishPDF();



    }


}