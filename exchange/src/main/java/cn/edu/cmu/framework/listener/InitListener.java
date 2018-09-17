package cn.edu.cmu.framework.listener;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitListener implements ServletContextListener{

    Logger logger = Logger.getLogger(InitListener.class);
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("初始化工程上下文 start ....");

        ServletContext app = sce.getServletContext();
        String path = app.getContextPath();

        StringBuffer sb = new StringBuffer();
        sb.append("http://127.0.0.1/");
        sb.append(path);
        sb.append("/");

        app.setAttribute("rootPath",sb.toString());

        logger.info("初始化工程上下文  end ....");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
