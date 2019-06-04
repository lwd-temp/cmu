package cn.edu.cmu.quartz.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.cmu.quartz.schedule.JobManager;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import cn.edu.cmu.quartz.schedule.ScheduleJob;

/**
 * 本类为前台交互类，可以管理任务的暂停，启动、立即执行一次、根据表达式重新调度等功能
 */
@Controller
@RequestMapping("/quartz")
public class QuartzController {

	private List<ScheduleJob> jobs = new ArrayList<ScheduleJob>();


	/**
	 * 定时任务 启动的 核心类，所有配置都在此类中配置，
	 * 维护了一个自定义的任务列表
	 */
	@Autowired
	private JobManager jobManager;

	/**
	 * 任务列表，作为入口查看任务执行情况
	 * @param model
	 * @return
	 * @throws SchedulerException
	 */
	@RequestMapping(value = "/quartzs", method = RequestMethod.GET)
	public String list(Model model) throws SchedulerException {

		List<ScheduleJob> jobList = jobManager.listSimpleJob();

 		model.addAttribute("allJobs", jobList);

		return "quartzs";
	}

	@ResponseBody
	@RequestMapping(value = "/json", method = RequestMethod.GET)
	public List jsonList(Model model) throws SchedulerException {

		List<ScheduleJob> jobList = jobManager.listSimpleJob();

		return jobList;
	}


	/**
	 * 添加任务
	 * @param job
	 * @throws SchedulerException
	 */


	// 链接到add页面时是GET请求，会访问这段代码
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(@ModelAttribute("job") ScheduleJob job) {
		return "add";
	}

	// 在具体添加用户时，是post请求，就访问以下代码
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add2(ScheduleJob job) throws IOException, SchedulerException {// 一定要紧跟Validate之后写验证结果类


		return "redirect:/quartz/quartzs";
	}

	@RequestMapping(value = "/{jobGroup}/{jobName}/stop", method = RequestMethod.GET)
	public String stop(@PathVariable String jobGroup, @PathVariable String jobName) throws SchedulerException {
		jobManager.stop(jobGroup,jobName);

		return "redirect:/quartz/quartzs";
	}

	@RequestMapping(value = "/{jobGroup}/{jobName}/reStart", method = RequestMethod.GET)
	public String reStart(@PathVariable String jobGroup, @PathVariable String jobName) throws SchedulerException {

		jobManager.reStart(jobGroup,jobName);

		return "redirect:/quartz/quartzs";
	}
	
	
	@RequestMapping(value = "/{jobGroup}/{jobName}/startNow", method = RequestMethod.GET)
	public String startNow(@PathVariable String jobGroup, @PathVariable String jobName) throws SchedulerException {


		jobManager.startRightNow(jobGroup,jobName);


		return "redirect:/quartz/quartzs";
	}
	
	
	@RequestMapping(value = "/{jobGroup}/{jobName}/del", method = RequestMethod.GET)
	public String del(@PathVariable String jobGroup, @PathVariable String jobName) throws SchedulerException {
		
		jobManager.delete(jobGroup, jobName);
		
		return "redirect:/quartz/quartzs";
	}
	

	
	@RequestMapping(value = "/{jobGroup}/{jobName}/rescheduleJob", method = RequestMethod.GET)
	public String rescheduleJob(@PathVariable String jobGroup, @PathVariable String jobName,String cron) throws SchedulerException {
		jobManager.rescheduleJob(jobGroup, jobName, cron);
		return "redirect:/quartz/quartzs";
	}



}
