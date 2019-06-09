package cn.edu.cmu.framework.threadpool;

import cn.edu.cmu.framework.util.WeChartUtils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/***
 * @pj: cmu
 * @author : jshand
 * @date: 2019/6/9
 * @time: 21:43
 * @site: http://314649444.iteye.com
 * @desc：系统多线程资源集中池
 */
public class SysThreadPoolRunner {


    private SysThreadPoolRunner(){}
    /**
     * 线程池
     */
    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 1, TimeUnit.HOURS,  new ArrayBlockingQueue<Runnable>(5));


    /**
     * 提交到线程池
     * @param command
     */
    public static void submit(Runnable command){
        executor.submit(command);
    }


}
