package cn.edu.cmu.mbg.gen.xml.sql;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.AbstractXmlElementGenerator;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;

/**
 * @Author: jshand
 * @Date: 2018/9/22 21:23
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class CmuExampleWhereClauseElementGenerator extends AbstractXmlElementGenerator {
    private boolean isForUpdateByExample;

    public CmuExampleWhereClauseElementGenerator(boolean isForUpdateByExample) {
        this.isForUpdateByExample = isForUpdateByExample;
    }

    @Override
    public void addElements(XmlElement parentElement) {
        XmlElement answer = new XmlElement("sql"); //$NON-NLS-1$

        if (isForUpdateByExample) {
            answer
                    .addAttribute(new Attribute(
                            "id", introspectedTable.getMyBatis3UpdateByExampleWhereClauseId())); //$NON-NLS-1$
        } else {
            answer.addAttribute(new Attribute(
                    "id", "Select_Example_Where_Clause")); //$NON-NLS-1$
        }

        context.getCommentGenerator().addComment(answer);

        //XmlElement whereElement = new XmlElement("where"); //$NON-NLS-1$
        XmlElement ifParamElement = new XmlElement("if"); //$NON-NLS-1$
        ifParamElement.addAttribute(new Attribute("test", "_parameter != null")); //$NON-NLS-1$ //$NON-NLS-2$



        //添加额外的 校验 开始...
        answer.addElement(new TextElement(" where valid = 1   "));

        answer.addElement(ifParamElement);


        //<if test="oredCriteria != null and  oredCriteria.size() > 0 " >
        XmlElement ifParamSizeElement = new XmlElement("if");
        ifParamSizeElement.addAttribute(new Attribute("test", " oredCriteria != null and  oredCriteria.size() > 0 "));

        ifParamElement.addElement(ifParamSizeElement);

        //<bind name="hasCriteria" value="false" />
        XmlElement bindElement = new XmlElement("bind");
        bindElement.addAttribute(new Attribute("name", "hasCriteria"));
        bindElement.addAttribute(new Attribute("value", "false"));
        ifParamSizeElement.addElement(bindElement);


        /**
         * <foreach collection="oredCriteria" item="criteria" >
         *         <if test="criteria.valid" >
         *             <bind name="hasCriteria" value="true" />
         *         </if>
         *       </foreach>
         */
        XmlElement forEachElement = new XmlElement("foreach");
        forEachElement.addAttribute(new Attribute("collection", "oredCriteria"));
        forEachElement.addAttribute(new Attribute("item", "criteria"));


        /**
         *         <if test="criteria.valid" >
         *             <bind name="hasCriteria" value="true" />
         *         </if>
         */
        XmlElement ifCriteriaValidElement = new XmlElement("if");
        ifCriteriaValidElement.addAttribute(new Attribute("test", "criteria.valid"));


        XmlElement bindHashCriteriaElement = new XmlElement("bind");
        bindHashCriteriaElement.addAttribute(new Attribute("name", "hasCriteria"));
        bindHashCriteriaElement.addAttribute(new Attribute("value", "true"));


        ifCriteriaValidElement.addElement(bindHashCriteriaElement);
        forEachElement.addElement(ifCriteriaValidElement);
        ifParamSizeElement.addElement(forEachElement);



        XmlElement hashCriteriaAppendElement = new XmlElement("if");
        hashCriteriaAppendElement.addAttribute(new Attribute("test", "hasCriteria"));
        hashCriteriaAppendElement.addElement(new TextElement(" and ( "));
        ifParamSizeElement.addElement(hashCriteriaAppendElement);





        XmlElement outerForEachElement = new XmlElement("foreach"); //$NON-NLS-1$
        if (isForUpdateByExample) {
            outerForEachElement.addAttribute(new Attribute(
                    "collection", "example.oredCriteria")); //$NON-NLS-1$ //$NON-NLS-2$
        } else {
            outerForEachElement.addAttribute(new Attribute(
                    "collection", "oredCriteria")); //$NON-NLS-1$ //$NON-NLS-2$
        }
        outerForEachElement.addAttribute(new Attribute("item", "criteria")); //$NON-NLS-1$ //$NON-NLS-2$
        outerForEachElement.addAttribute(new Attribute("separator", "or")); //$NON-NLS-1$ //$NON-NLS-2$



        ifParamSizeElement.addElement(outerForEachElement);


        XmlElement ifElement = new XmlElement("if"); //$NON-NLS-1$
        ifElement.addAttribute(new Attribute("test", "criteria.valid")); //$NON-NLS-1$ //$NON-NLS-2$
        outerForEachElement.addElement(ifElement);

        XmlElement trimElement = new XmlElement("trim"); //$NON-NLS-1$
        trimElement.addAttribute(new Attribute("prefix", "(")); //$NON-NLS-1$ //$NON-NLS-2$
        trimElement.addAttribute(new Attribute("suffix", ")")); //$NON-NLS-1$ //$NON-NLS-2$
        trimElement.addAttribute(new Attribute("prefixOverrides", "and")); //$NON-NLS-1$ //$NON-NLS-2$

        ifElement.addElement(trimElement);

        trimElement.addElement(getMiddleForEachElement(null));


        XmlElement hashCriteriaAppendEndElement = new XmlElement("if");
        hashCriteriaAppendEndElement.addAttribute(new Attribute("test", "hasCriteria"));
        hashCriteriaAppendEndElement.addElement(new TextElement(" )  "));
        ifParamSizeElement.addElement(hashCriteriaAppendEndElement);





        for (IntrospectedColumn introspectedColumn : introspectedTable
                .getNonBLOBColumns()) {
            if (stringHasValue(introspectedColumn
                    .getTypeHandler())) {
                trimElement
                        .addElement(getMiddleForEachElement(introspectedColumn));
            }
        }

        if (context.getPlugins()
                .sqlMapExampleWhereClauseElementGenerated(answer,
                        introspectedTable)) {
            parentElement.addElement(answer);
        }
    }

    private XmlElement getMiddleForEachElement(
            IntrospectedColumn introspectedColumn) {
        StringBuilder sb = new StringBuilder();
        String criteriaAttribute;
        boolean typeHandled;
        String typeHandlerString;
        if (introspectedColumn == null) {
            criteriaAttribute = "criteria.criteria"; //$NON-NLS-1$
            typeHandled = false;
            typeHandlerString = null;
        } else {
            sb.setLength(0);
            sb.append("criteria."); //$NON-NLS-1$
            sb.append(introspectedColumn.getJavaProperty());
            sb.append("Criteria"); //$NON-NLS-1$
            criteriaAttribute = sb.toString();

            typeHandled = true;

            sb.setLength(0);
            sb.append(",typeHandler="); //$NON-NLS-1$
            sb.append(introspectedColumn.getTypeHandler());
            typeHandlerString = sb.toString();
        }

        XmlElement middleForEachElement = new XmlElement("foreach"); //$NON-NLS-1$
        middleForEachElement.addAttribute(new Attribute(
                "collection", criteriaAttribute)); //$NON-NLS-1$
        middleForEachElement.addAttribute(new Attribute("item", "criterion")); //$NON-NLS-1$ //$NON-NLS-2$

        XmlElement chooseElement = new XmlElement("choose"); //$NON-NLS-1$
        middleForEachElement.addElement(chooseElement);

        XmlElement when = new XmlElement("when"); //$NON-NLS-1$
        when.addAttribute(new Attribute("test", "criterion.noValue")); //$NON-NLS-1$ //$NON-NLS-2$
        when.addElement(new TextElement("and ${criterion.condition}")); //$NON-NLS-1$
        chooseElement.addElement(when);

        when = new XmlElement("when"); //$NON-NLS-1$
        when.addAttribute(new Attribute("test", "criterion.singleValue")); //$NON-NLS-1$ //$NON-NLS-2$
        sb.setLength(0);
        sb.append("and ${criterion.condition} #{criterion.value"); //$NON-NLS-1$
        if (typeHandled) {
            sb.append(typeHandlerString);
        }
        sb.append('}');
        when.addElement(new TextElement(sb.toString()));
        chooseElement.addElement(when);

        when = new XmlElement("when"); //$NON-NLS-1$
        when.addAttribute(new Attribute("test", "criterion.betweenValue")); //$NON-NLS-1$ //$NON-NLS-2$
        sb.setLength(0);
        sb.append("and ${criterion.condition} #{criterion.value"); //$NON-NLS-1$
        if (typeHandled) {
            sb.append(typeHandlerString);
        }
        sb.append("} and #{criterion.secondValue"); //$NON-NLS-1$
        if (typeHandled) {
            sb.append(typeHandlerString);
        }
        sb.append('}');
        when.addElement(new TextElement(sb.toString()));
        chooseElement.addElement(when);

        when = new XmlElement("when"); //$NON-NLS-1$
        when.addAttribute(new Attribute("test", "criterion.listValue")); //$NON-NLS-1$ //$NON-NLS-2$
        when.addElement(new TextElement("and ${criterion.condition}")); //$NON-NLS-1$
        XmlElement innerForEach = new XmlElement("foreach"); //$NON-NLS-1$
        innerForEach
                .addAttribute(new Attribute("collection", "criterion.value")); //$NON-NLS-1$ //$NON-NLS-2$
        innerForEach.addAttribute(new Attribute("item", "listItem")); //$NON-NLS-1$ //$NON-NLS-2$
        innerForEach.addAttribute(new Attribute("open", "(")); //$NON-NLS-1$ //$NON-NLS-2$
        innerForEach.addAttribute(new Attribute("close", ")")); //$NON-NLS-1$ //$NON-NLS-2$
        innerForEach.addAttribute(new Attribute("separator", ",")); //$NON-NLS-1$ //$NON-NLS-2$
        sb.setLength(0);
        sb.append("#{listItem"); //$NON-NLS-1$
        if (typeHandled) {
            sb.append(typeHandlerString);
        }
        sb.append('}');
        innerForEach.addElement(new TextElement(sb.toString()));
        when.addElement(innerForEach);
        chooseElement.addElement(when);

        return middleForEachElement;
    }
}
