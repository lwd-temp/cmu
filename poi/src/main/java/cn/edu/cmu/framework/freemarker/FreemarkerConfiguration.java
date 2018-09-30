package cn.edu.cmu.framework.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.IOException;

public class FreemarkerConfiguration {
	private static Configuration config = null;

	/**
	 * Static initialization.
	 * 
	 * Initialize the configuration of Freemarker.
	 */
	static {
		config = new Configuration();
		config.setClassForTemplateLoading(FreemarkerConfiguration.class,
				"/template");
	}

	public static Configuration getConfiguation() {
		return config;
	}
	public static Template getTemplate(String template) throws IOException {
		return config.getTemplate(template);
	}
}
