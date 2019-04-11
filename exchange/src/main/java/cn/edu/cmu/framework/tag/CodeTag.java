package cn.edu.cmu.framework.tag;

import cn.edu.cmu.framework.cache.DMCache;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.jsp.JspException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/9/24 19:19
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class CodeTag extends  BaseTag {

    public String tabName = "";
    public String name = "";
    public String value = "";
    public String type="select";
    public List<String> valueList = null;

    public List<Map<String, String>> sourceList;

    private static  String optionFMT = "\t<option value='%s' %s >%s</option>\r\n";
    private static  String radioFMT = "\t<input   name=\"%s\"  id=\"%s_%d\"    %s  type=\"radio\" class=\"ace\" %s value=\"%s\" />  <span class=\"lbl\"> %s</span>\r\n";

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Map<String, String>> getSourceList() {
        return sourceList;
    }

    public void setSourceList(List<Map<String, String>> sourceList) {
        this.sourceList = sourceList;
    }


    @Override
    protected void tagHeader() throws IOException {
        if("select".equals(type)){
            String selectTagStartFMT = "<select id='%s' name='%s' class='form-control chosen-select'  %s>\r\n";
            super.writeln(String.format(selectTagStartFMT,  id, name, daValue));

            if(daValue.indexOf("multiple")==-1){//如果不是多选，默认让他有一个请选择
                super.writeln(String.format(optionFMT,  "", "",   "请选择"));
            }
        }
    }

    @Override
    protected void tagEnd() throws IOException {
        if ("select".equals(type)){
            super.writeln("</select>\r\n");
        }
    }



    @Override
    protected void tagContent() throws JspException, IOException {
        List<Map<String,String>> list = null;
        if(StringUtils.isNotEmpty(tabName)){
            list = DMCache.getTableList(tabName);
        }else{
            list = sourceList;
        }


        if(list == null || list.size()<=0){
            return;
        }
        // String radioFMT = "<input name=\"%s\"    type=\"radio\" class=\"ace\"  id=\"%s_%d\" value="%s"/>  <span class=\"lbl\"> %s</span>\r\n";
        int count = 1;



        for (Map<String,String> dm: list) {
            String dmCode = dm.keySet().iterator().next();
            String dmName = dm.get(dmCode);
            if("select".equals(type)){
                String isSelected = "";

                //选中状态，
                // 1 当前代码 和提供的值匹配，
                // 2  当前代码包含在按照分隔符拆分数组（'01','02'）  ['01','02']中
                // 3 当前代码在提供的 集合（list）值中
                boolean isSel = dmCode.equals(value) || containsValues(dmCode) || containsListValue(dmCode);
                isSelected = (isSel?"selected":"");

                super.writeln(String.format(optionFMT,  dmCode, isSelected,   dmName));
            }else if("radio".equals(type)){
                String checked = (dmCode.equals(value)?"checked":"");
                super.writeln(String.format(radioFMT,   name,  id, count++, checked,    daValue, dmCode, dmName));
            }
        }
    }

    private boolean containsValues(String dmCode) {
        String[] values = value.split(",");
        for (String s : values) {
            if(dmCode.equals(s)){
                return true;
            }

        }
        return false;
    }


    //判断 Value 是否在结合value中
    private boolean containsListValue(String value){
        if(valueList!=null && valueList.size()>0){
            for (int i = 0; i < valueList.size(); i++) {
                String itemValue = valueList.get(i);
                if(itemValue.equals(value)){
                    return true;
                }
            }
        }

        return false;
    }


    public List<String> getValueList() {
        return valueList;
    }

    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }
}
