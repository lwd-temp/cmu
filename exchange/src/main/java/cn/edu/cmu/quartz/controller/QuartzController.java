package cn.edu.cmu.quartz.controller;

import cn.edu.cmu.quartz.schedule.JobManager;
import cn.edu.cmu.quartz.schedule.ScheduleJob;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	@RequestMapping(value = "/quartzs")
	public String list(Model model) throws SchedulerException {

		List<ScheduleJob> jobList = jobManager.listSimpleJob();

 		model.addAttribute("allJobs", jobList);

		return "quartzs";
	}

	@ResponseBody
	@RequestMapping(value = "/list")
	public Map jsonList(Model model) throws SchedulerException {

		Map map = new HashMap();
		List<ScheduleJob> jobList = jobManager.listSimpleJob();

		map.put("data",jobList);
		map.put("page",1);
		map.put("pages",1);//总页数
		map.put("count",jobList.size());

		return map;
	}
	

	@ResponseBody
	@RequestMapping(value = "/{jobGroup}/{jobName}/stop")
	public Map stop(@PathVariable String jobGroup, @PathVariable String jobName) throws SchedulerException {
		Map map = new HashMap();

		try {
			jobManager.stop(jobGroup,jobName);
			map.put("success",true);
		} catch (SchedulerException e) {
			map.put("success",false);
			e.printStackTrace();
		}

		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/{jobGroup}/{jobName}/reStart")
	public Map reStart(@PathVariable String jobGroup, @PathVariable String jobName) throws SchedulerException {
		Map map = new HashMap();

		try {
			jobManager.reStart(jobGroup,jobName);
			map.put("success",true);
		} catch (SchedulerException e) {
			map.put("success",false);
			e.printStackTrace();
		}

		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/{jobGroup}/{jobName}/startRightNow")
	public Map startRightNow(@PathVariable String jobGroup, @PathVariable String jobName) throws SchedulerException {

		Map map = new HashMap();

		try {
			jobManager.startRightNow(jobGroup,jobName);
			map.put("success",true);
		} catch (SchedulerException e) {
			map.put("success",false);
			e.printStackTrace();
		}

		return map;

	}
	

	@ResponseBody
	@RequestMapping(value = "/{jobGroup}/{jobName}/del")
	public Map del(@PathVariable String jobGroup, @PathVariable String jobName) throws SchedulerException {
		Map map = new HashMap();

		try {
			jobManager.delete(jobGroup,jobName);
			map.put("success",true);
		} catch (SchedulerException e) {
			map.put("success",false);
			e.printStackTrace();
		}

		return map;

	}
	

	@ResponseBody
	@RequestMapping(value = "/{jobGroup}/{jobName}/rescheduleJob")
	public Map rescheduleJob(@PathVariable String jobGroup, @PathVariable String jobName,String cron) throws SchedulerException {

		Map map = new HashMap();

		try {
			jobManager.rescheduleJob(jobGroup, jobName, cron);
			map.put("success",true);
		} catch (SchedulerException e) {
			map.put("success",false);
			e.printStackTrace();
		}

		return map;
	}



}
