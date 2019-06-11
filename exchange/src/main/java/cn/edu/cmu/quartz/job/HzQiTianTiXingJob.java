package cn.edu.cmu.quartz.job;

import cn.edu.cmu.framework.util.WebAppContextUtils;
import cn.edu.cmu.quartz.schedule.JobManager;
import cn.edu.cmu.quartz.schedule.ScheduleJob;
import cn.edu.cmu.service.HzService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/***
 * @pj: cmu
 * @author : jshand
 * @date: 2019/6/4
 * @time: 22:04
 * @site: http://314649444.iteye.com
 * @desc：2．归国之后七天内微信提醒老师归还
 */
public class HzQiTianTiXingJob implements Job {

    HzService hzService = null;


    public HzQiTianTiXingJob() {
        hzService = WebAppContextUtils.getBean(HzService.class);
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        //获得自定义job对象
        ScheduleJob job = JobManager.getJob(jobExecutionContext.getJobDetail());

        System.out.println(String.format("定时任务【%s】执行",job.getJobName()));

        hzService.qiTianTixing();
    }



}
