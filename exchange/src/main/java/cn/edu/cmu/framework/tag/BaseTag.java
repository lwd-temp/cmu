package cn.edu.cmu.framework.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/9/24 19:16
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public abstract class BaseTag extends TagSupport  implements DynamicAttributes {



    protected PageContext pageContext;
    protected JspWriter out;
    protected Map dynamicAttribute ;
    protected StringBuffer daValue ;
    @Override
    public void setPageContext(PageContext pageContext) {
        this.pageContext=pageContext;
        out = pageContext.getOut();
        dynamicAttribute = new HashMap<String,String>();
        daValue = new StringBuffer();
    }

    @Override
    public  int doStartTag() throws JspException{
        try {
            //System.out.println("daValue : "+daValue);
            tagHeader();
            tagContent();
            tagEnd();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.doStartTag();
    }

    protected  void tagEnd() throws IOException {};

    protected  void tagHeader() throws IOException {};



    protected void writeln(String content) throws IOException {
        out.write(content);
    }


    @Override
    public int doEndTag() throws JspException {
        return super.doEndTag();
    }

    protected abstract void tagContent() throws JspException, IOException;


    @Override
    public void setDynamicAttribute(String s, String localName, Object value) throws JspException {
        dynamicAttribute.put(localName,value.toString());
        daValue.append(String.format(" %s='%s'",localName,value.toString()));
    }


}
