package cn.edu.cmu.word;

import com.deepoove.poi.XWPFTemplate;
import org.junit.Test;

import java.io.*;
import java.util.HashMap;

/**
 * @Author: jshand
 * @Date: 2018/9/30 14:08
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class TestWord {


    @Test
    public void hello() throws IOException {


        InputStream is = TestWord.class.getClassLoader().getResourceAsStream("template.docx");

        //FileInputStream is = new FileInputStream(new File("E:\\development\\workspace\\ideaworspace\\space2\\cmu\\poi\\src\\test\\resources\\template.docx"));

        int length = is.available();
        System.out.println("length :"+length);

        XWPFTemplate template = XWPFTemplate.compile(is);

        HashMap<String, Object> data = new HashMap<String, Object>();

        data.put("hymc", "中国共产党第十六次全国代表大会");
        data.put("jbrq", "2018-10-01");
        data.put("zbdw", "中国共产党");
        data.put("hydd", "北京市长安街1号，人民大会堂");

        template.render(data);

        FileOutputStream out = new FileOutputStream("out_template.docx");
        template.write(out);
        out.flush();
        out.close();
        template.close();

    }

}
