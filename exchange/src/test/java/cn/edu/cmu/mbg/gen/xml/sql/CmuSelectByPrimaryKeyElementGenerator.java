//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.edu.cmu.mbg.gen.xml.sql;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.AbstractXmlElementGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Iterator;

public class CmuSelectByPrimaryKeyElementGenerator extends AbstractXmlElementGenerator {
    private static String VALID = "VALID";
    public CmuSelectByPrimaryKeyElementGenerator() {
    }

    public void addElements(XmlElement parentElement) {
        XmlElement answer = new XmlElement("select");
        answer.addAttribute(new Attribute("id", this.introspectedTable.getSelectByPrimaryKeyStatementId()));
        if (this.introspectedTable.getRules().generateResultMapWithBLOBs()) {
            answer.addAttribute(new Attribute("resultMap", this.introspectedTable.getResultMapWithBLOBsId()));
        } else {
            answer.addAttribute(new Attribute("resultMap", this.introspectedTable.getBaseResultMapId()));
        }

        String parameterType;
        if (this.introspectedTable.getRules().generatePrimaryKeyClass()) {
            parameterType = this.introspectedTable.getPrimaryKeyType();
        } else if (this.introspectedTable.getPrimaryKeyColumns().size() > 1) {
            parameterType = "map";
        } else {
            parameterType = ((IntrospectedColumn)this.introspectedTable.getPrimaryKeyColumns().get(0)).getFullyQualifiedJavaType().toString();
        }

        answer.addAttribute(new Attribute("parameterType", parameterType));
        this.context.getCommentGenerator().addComment(answer);
        StringBuilder sb = new StringBuilder();
        sb.append("select ");
        if (StringUtility.stringHasValue(this.introspectedTable.getSelectByPrimaryKeyQueryId())) {
            sb.append('\'');
            sb.append(this.introspectedTable.getSelectByPrimaryKeyQueryId());
            sb.append("' as QUERYID,");
        }

        answer.addElement(new TextElement(sb.toString()));
        answer.addElement(this.getBaseColumnListElement());
        if (this.introspectedTable.hasBLOBColumns()) {
            answer.addElement(new TextElement(","));
            answer.addElement(this.getBlobColumnListElement());
        }

        sb.setLength(0);
        sb.append("from ");
        sb.append(this.introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime());
        answer.addElement(new TextElement(sb.toString()));
        boolean and = false;
        Iterator i$ = this.introspectedTable.getPrimaryKeyColumns().iterator();

        while(i$.hasNext()) {
            IntrospectedColumn introspectedColumn = (IntrospectedColumn)i$.next();
            sb.setLength(0);
            if (and) {
                sb.append("  and ");
            } else {
                sb.append("where ");
                and = true;
            }

            sb.append(MyBatis3FormattingUtilities.getAliasedEscapedColumnName(introspectedColumn));
            sb.append(" = ");
            sb.append(MyBatis3FormattingUtilities.getParameterClause(introspectedColumn));
            answer.addElement(new TextElement(sb.toString()));
        }

        //附加自定义条件
        IntrospectedColumn deleteColumn = introspectedTable.getColumn(VALID);
        if(deleteColumn != null) {
            sb.setLength(0);
            sb.append("  and ");
            sb.append(MyBatis3FormattingUtilities
                    .getAliasedEscapedColumnName(deleteColumn));
            sb.append(" = 1");
            answer.addElement(new TextElement(sb.toString()));
        }


        if (this.context.getPlugins().sqlMapSelectByPrimaryKeyElementGenerated(answer, this.introspectedTable)) {
            parentElement.addElement(answer);
        }

    }
}
