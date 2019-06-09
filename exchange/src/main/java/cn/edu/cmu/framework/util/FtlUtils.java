package cn.edu.cmu.framework.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;

/***
 * @pj: cmu
 * @author : jshand
 * @date: 2019/6/9
 * @time: 20:08
 * @site: http://314649444.iteye.com
 * @desc：FreeMarker工具类
 */
public class FtlUtils {

    private static Configuration config = new Configuration();
    static{
        config.setServletContextForTemplateLoading(WebAppContextUtils.getApplication(), "/bundle");
    }

    public static String getTemplate(Object root,String template){

        StringWriter sw = new StringWriter();
        try {
            Template tp = config.getTemplate(template, "UTF-8");

            tp.process(root,sw);

            return sw.toString();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }finally {
            if(sw != null){
                try {
                    sw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }



}
