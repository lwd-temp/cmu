package cn.edu.cmu.framework.pdf;

import cn.edu.cmu.framework.freemarker.FreemarkerConfiguration;
import freemarker.template.Template;

import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.Map;

public class HtmlGenerator {

	/**
	 * Generate html string.
	 * 
	 * @param template
	 *            the name of freemarker teamlate.
	 * @param variables
	 *            the data of teamlate.
	 * @return htmlStr
	 * @throws Exception
	 */
	public static String generate(String template, Map<String, Object> variables)
			throws Exception {
		Template tp = FreemarkerConfiguration.getTemplate(template);
		StringWriter stringWriter = new StringWriter();
		BufferedWriter writer = new BufferedWriter(stringWriter);
		tp.setEncoding("UTF-8");
		tp.process(variables, writer);
		String htmlStr = stringWriter.toString();
		writer.flush();
		writer.close();
		return htmlStr;
	}
}
