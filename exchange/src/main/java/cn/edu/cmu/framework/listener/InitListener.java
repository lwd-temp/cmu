package cn.edu.cmu.framework.listener;

import cn.edu.cmu.framework.util.WebAppContextUtils;
import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitListener implements ServletContextListener{

    Logger logger = Logger.getLogger(InitListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        logger.info("=======初始化工程上下文  start ....");
        initRootPath(sce);
        logger.info("=======初始化工程上下文  end   ....");


    }


    /**
     * 初始化跟路径
     * @param sce
     */
    private void initRootPath(ServletContextEvent sce){

        ServletContext app = sce.getServletContext();
        String path = app.getContextPath();

        StringBuffer sb = new StringBuffer();
        sb.append("http://127.0.0.1/");
        sb.append(path);
        sb.append("/");

        app.setAttribute("rootPath",sb.toString());

        //工程实际目录
        String realContextPath = sce.getServletContext().getRealPath("/");
        logger.info("realContextPath :"+realContextPath);

        WebAppContextUtils.REAL_CONTEXT_PATH = realContextPath;
        app.setAttribute("realContextPath",realContextPath);


    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
