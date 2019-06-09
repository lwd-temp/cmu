package cn.edu.cmu.quartz;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/***
 * @pj: cmu
 * @author : jshand
 * @date: 2019/6/9
 * @time: 19:53
 * @site: http://314649444.iteye.com
 * @desc：测试线程池
 */
public class ThreadPoolExecutorTest {

    private static int i = 0;

    @Test
    public void test(){
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 200, TimeUnit.MILLISECONDS,  new ArrayBlockingQueue<Runnable>(5));

        executor.submit(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <30 ; j++) {
                    try {
                        System.out.println("1  第【"+j+"】个任务");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        executor.submit(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <30 ; j++) {
                    try {
                        System.out.println("2  第【"+j+"】个任务");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        executor.submit(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <30 ; j++) {
                    try {
                        System.out.println("3  第【"+j+"】个任务");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        executor.submit(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <30 ; j++) {
                    try {
                        System.out.println("4  第【"+j+"】个任务");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        executor.submit(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <30 ; j++) {
                    try {
                        System.out.println("5  第【"+j+"】个任务");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <30 ; j++) {
                    try {
                        System.out.println("6  第【"+j+"】个任务");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <30 ; j++) {
                    try {
                        System.out.println("7  第【"+j+"】个任务");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        executor.submit(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <30 ; j++) {
                    try {
                        System.out.println("8  第【"+j+"】个任务");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        executor.submit(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <30 ; j++) {
                    try {
                        System.out.println("9  第【"+j+"】个任务");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        while(true){
            try {
                Thread.sleep(999);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


}
