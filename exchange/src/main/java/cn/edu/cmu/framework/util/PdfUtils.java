package cn.edu.cmu.framework.util;

import cn.edu.cmu.framework.pdf.HtmlGenerator;
import cn.edu.cmu.framework.pdf.PdfGenerator;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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


    /**
     * 使用PDF模板生成 PDF
     */
    public static void outPdfWidthPdfTemp(String template, Map<String,String> variables, OutputStream out) throws IOException, DocumentException {
        // 模板路径
        // 生成的新文件路径
        PdfReader reader;
        ByteArrayOutputStream bos;
        PdfStamper stamper;

        template = template.replace('\\',File.separatorChar);

        //ByteArrayOutputStream bosMemary = new ByteArrayOutputStream();

        /*使用中文字体 */
        BaseFont bf = BaseFont.createFont(WebAppContextUtils.REAL_CLASS_PATH + File.separator+"ttc"+File.separator+"simsun.ttf",BaseFont.IDENTITY_H,BaseFont.EMBEDDED);
        //BaseFont bf = BaseFont.createFont("SimSun,0","",BaseFont.EMBEDDED);
        ArrayList<BaseFont> fontList = new ArrayList<BaseFont>();
        fontList.add(bf);

        try {
            reader = new PdfReader(WebAppContextUtils.REAL_CONTEXT_PATH  +template);// 读取pdf模板
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);

            AcroFields form = stamper.getAcroFields();
            AcroFields fields = stamper.getAcroFields();
            fields.setSubstitutionFonts(fontList);//设置字体列表

            Iterator<String> it = form.getFields().keySet().iterator();
            while (it.hasNext()) {
                String name = it.next().toString();
                //System.out.println(name);
                form.setField(name, variables.get(name));
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



            //将内存中的byte数据发送给 response的 OutPutStream
            //byte[] outBytes = bosMemary.toByteArray();
            //out.write(outBytes);
            //out.flush();
            //out.close();

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








}
