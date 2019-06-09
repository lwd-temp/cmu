package cn.edu.cmu.quartz.job;

import cn.edu.cmu.quartz.schedule.ScheduleJob;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;


/***
 * @author 金山
 * @date:
 * @time:
 * @site: http://314649444.iteye.com
 */
public class DemoJob implements Job {

	private static int count = 1;


	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {

		ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");

		String name = scheduleJob.getJobName();
		String group = scheduleJob.getJobGroup();
		String id = scheduleJob.getJobId();
		String des = scheduleJob.getDesc();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");

		String dateString = sd.format(new Date());
		System.out.println(count+++"    " +dateString +"    "+id+"   "+name+"   "+group+"   "+des+"exchange" );
	}
}