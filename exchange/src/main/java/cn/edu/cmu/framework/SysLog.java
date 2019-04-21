package cn.edu.cmu.framework;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: jshand
 * @Date: 2019/4/21 16:56
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
@Component
@Aspect
public class SysLog {

    Logger logger = Logger.getLogger(SysLog.class);

    @Before(value="execution(* cn.edu.cmu.controller.*Controller.*(..))")
    public void beforeRun(JoinPoint joinPoint){
        if(logger.isInfoEnabled()){
            Signature st = joinPoint.getSignature();
            String ls = st.toLongString();  //public java.util.Map cn.edu.cmu.controller.UIController.dmCache()
            String ss = st.toShortString(); //UIController.dmCache()
            String ns = st.toString();      //Map cn.edu.cmu.controller.UIController.dmCache()

            String info = String.format("方法执行日志【Controller层】:%s",ns);
            logger.info(info);

        }
    }

}
