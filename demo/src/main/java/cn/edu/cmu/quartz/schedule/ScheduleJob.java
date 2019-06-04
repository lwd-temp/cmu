package cn.edu.cmu.quartz.schedule;

import org.quartz.Job;
import org.springframework.util.Assert;

public class ScheduleJob {

	/** 任务id */
	private String jobId;

	/** 任务名称 */
	private String jobName;

	/** 任务分组 */
	private String jobGroup;

	/** 任务状态 0禁用 1启用 2删除 */
	private String jobStatus;

	/** 任务运行时间表达式 */
	private String cronExpression;

	/** 任务描述 */
	private String desc;

	private String jobClassName;

	private Class<Job> concreteJob;

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getJobClassName() {
		return jobClassName;
	}

	public void setJobClassName(String jobClassName) throws ClassNotFoundException {
		Assert.isNull(this.jobClassName,"已经设置过，具体任务"+this.jobClassName);

		this.jobClassName = jobClassName;
		this.concreteJob = (Class<Job>) Class.forName(jobClassName);
	}

	public Class<Job> getConcreteJob() {
		return concreteJob;
	}

	public void setConcreteJob(Class<Job> concreteJob) {
		Assert.isNull(this.concreteJob,"已经设置过，具体任务"+this.concreteJob.getSimpleName());
		this.concreteJob = concreteJob;
		this.jobClassName = concreteJob.getName();
	}


	public static void main(String[] args) {
		Class<ScheduleJob> cl = ScheduleJob.class;
		System.out.println(cl.getName());
		System.out.println(cl.getSimpleName());
	}


}