package cn.edu.cmu.quartz.schedule;

import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;


public class JobManager implements InitializingBean {

    /**
     * 任务调度器
     */
    private Scheduler scheduler ;

    /**
     * Spring 容器中配置的调度任务
     */
    List<ScheduleJob> jobs = new ArrayList();

    /**
     * 任务中的扩展信息Key
     */
    private static final String JOBDATA_MAP_SCHEDULE_JOB = "scheduleJob";

    /**
     * 线程安全的 整数自增器
     */
    private static final AtomicInteger atomicInteger = new AtomicInteger();


    /**
     * 默认初始化调度器，并初始化调度任务
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化，将配置的任务 使用调度器调度....");
        init();

    }


    private ScheduleJob getJob(String jobGroup,String jobName) throws SchedulerException {
        JobKey jobKey = JobKey.jobKey(jobName, jobGroup);

        //得到任务详情
        JobDetail jobDetail = scheduler.getJobDetail(jobKey);
        //得到自定义任务对象
        ScheduleJob job = (ScheduleJob) jobDetail.getJobDataMap().get(JOBDATA_MAP_SCHEDULE_JOB);

        return job;
    }
    public void init(){
        for (ScheduleJob job : jobs) {
            job.setJobId(String.valueOf(atomicInteger.incrementAndGet()));
            try {
                addTask(job);
                System.out.println("添加定时任务成功，任务："+job.getJobName()+","+job.getDesc()+",执行时机："+job.getCronExpression());
            } catch (SchedulerException e) {
                System.out.println("初始化定时任务异常，任务调度出错");
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("初始化定时任务异常，找不到任务类");
                e.printStackTrace();
            }
        }
    }


    /**
     * 添加任务到调度器
     * @param job
     * @throws SchedulerException
     * @throws ClassNotFoundException
     */
    private void addTask(ScheduleJob job) throws SchedulerException, ClassNotFoundException {

        TriggerKey triggerKey = TriggerKey.triggerKey(job.getJobName(), job.getJobGroup());

        // 获取trigger，即在spring配置文件中定义的 bean id="myTrigger"
        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
        // 不存在，创建一个
        if (null == trigger) {

            JobDetail jobDetail = JobBuilder.newJob(job.getConcreteJob()).withIdentity(job.getJobName(), job.getJobGroup()).build();
            jobDetail.getJobDataMap().put(JOBDATA_MAP_SCHEDULE_JOB, job);

            // 表达式调度构建器
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
            //按新的cronExpression表达式构建一个新的trigger
            trigger = TriggerBuilder.newTrigger().withIdentity(job.getJobName(), job.getJobGroup()) .withSchedule(scheduleBuilder).build();

            scheduler.scheduleJob(jobDetail, trigger);

        } else {
            // Trigger已存在，那么更新相应的定时设置
            // 表达式调度构建器
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());

            // 按新的cronExpression表达式重新构建trigger
            trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();

            // 按新的trigger重新设置job执行
            scheduler.rescheduleJob(triggerKey, trigger);
        }
    }


    /**
     * 获取简单任务列表（自定义对象）
     * @return
     * @throws SchedulerException
     */
    public List<ScheduleJob> listSimpleJob() throws SchedulerException {

        GroupMatcher<JobKey> matcher = GroupMatcher.anyJobGroup();
        Set<JobKey> jobKeys = scheduler.getJobKeys(matcher);
        List<ScheduleJob> jobList = new ArrayList<ScheduleJob>();

        for (JobKey jobKey : jobKeys) {
            //得到任务详情
            JobDetail jobDetail = scheduler.getJobDetail(jobKey);
            //得到自定义任务对象
            ScheduleJob job = (ScheduleJob) jobDetail.getJobDataMap().get(JOBDATA_MAP_SCHEDULE_JOB);

            //得到触发器，获取任务对象
            List<? extends Trigger> triggers = scheduler.getTriggersOfJob(jobKey);
            if(triggers!=null && triggers.size()>0){//暂时只支持一个触发器
                Trigger tr = triggers.get(0);
                Trigger.TriggerState triggerState = scheduler.getTriggerState(tr.getKey());
                job.setJobStatus(triggerState.name());
            }
            jobList.add(job);
        }
        return jobList;

    }


    /**
     * 暂停任务
     * @param jobGroup
     * @param jobName
     * @throws SchedulerException
     */
    public void stop(String jobGroup,String jobName) throws SchedulerException {

        JobKey jobKey = JobKey.jobKey(jobName, jobGroup);

        scheduler.pauseJob(jobKey);
    }


    /**
     * 重启任务
     * @param jobGroup
     * @param jobName
     * @throws SchedulerException
     */
    public void reStart(String jobGroup,String jobName) throws SchedulerException {

        JobKey jobKey = JobKey.jobKey(jobName, jobGroup);
        scheduler.resumeJob(jobKey);
    }

    /**
     * 立即触发一次任务
     * @param jobGroup
     * @param jobName
     * @throws SchedulerException
     */
    public void startRightNow(String jobGroup,String jobName) throws SchedulerException {

        JobKey jobKey = JobKey.jobKey(jobName, jobGroup);
        scheduler.triggerJob(jobKey);
    }

    /**
     * 删除任务
     * @param jobGroup
     * @param jobName
     * @throws SchedulerException
     */
    public void delete(String jobGroup,String jobName) throws SchedulerException {

        JobKey jobKey = JobKey.jobKey(jobName, jobGroup);
        scheduler.deleteJob(jobKey);
    }


    /**
     * 根据group name 和表达式 重新调度任务
     * @param jobGroup
     * @param jobName
     * @param cron
     * @throws SchedulerException
     */
    public void rescheduleJob(String jobGroup,String jobName,String cron) throws SchedulerException {

        ScheduleJob job = getJob(jobGroup, jobName);
        job.setCronExpression(cron);

        TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);

        //获取trigger，即在spring配置文件中定义的 bean id="myTrigger"
        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);

        //表达式调度构建器
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cron);

        //按新的cronExpression表达式重新构建trigger
        trigger = trigger.getTriggerBuilder().withIdentity(triggerKey) .withSchedule(scheduleBuilder).build();

        //按新的trigger重新设置job执行
        scheduler.rescheduleJob(triggerKey, trigger);
    }


















    public List<ScheduleJob> getJobs() {
        return jobs;
    }

    public void setJobs(List<ScheduleJob> jobs) {
        this.jobs = jobs;
    }


    public Scheduler getScheduler() {
        return scheduler;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }
}
