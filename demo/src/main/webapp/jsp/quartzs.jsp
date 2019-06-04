<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
	<a href="add">添加</a>

	<br />
	<table cellpadding="0" cellspacing="0" border="1" style="width: 100%;">
		<tr>
			<td>任务id</td>
			<td>任务名称</td>
			<td>任务状态</td>
			<td>任务执行时机</td>
			<td>暂停</td>
			<td>恢复</td>
			<td>立即执行一次</td>
			<td>自定义</td>
		</tr>




	<c:forEach items="${allJobs }" var="job">

		<tr>
			<td>${job.jobId }</td>
			<td>${job.jobName }</td>
			<td>${job.jobStatus }</td>
			<td>${job.cronExpression }</td>
			<td><a href="${job.jobGroup }/${job.jobName }/stop" >暂停 </a> </td>
			<td><a href="${job.jobGroup }/${job.jobName }/reStart" >恢复 </a> </td>
			<td><a href="${job.jobGroup }/${job.jobName }/startNow" >立即执行一次 </a> </td>
			<td><a href="${job.jobGroup }/${job.jobName }/rescheduleJob?cron=0/1 * * * * ?" >五秒执行一次 </a> </td>

		</tr>

 		<br />
	</c:forEach>

	</table>
</body>
</html>