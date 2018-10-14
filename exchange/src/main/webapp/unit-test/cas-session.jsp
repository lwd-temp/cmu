<%@ page import="org.jasig.cas.client.authentication.AttributePrincipal" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %>
<%@ page import="cn.edu.cmu.framework.CmuConstants" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/8
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>
    本地开发环境，登录的用户在application.yml文件中配置，UAT及生产环境根据登录人自动获取
</h3>
<hr/>





<h1>登录用户信息:</h1>
<%=session.getAttribute(CmuConstants.SESSION.USER_INFO_JZG)%>
<hr>


<h1>sso信息:</h1>
<%
    StringBuffer sb = new StringBuffer();
    String userID = "";
    AttributePrincipal principal = (AttributePrincipal)request.getUserPrincipal();
    if(principal != null){
        userID = principal.getName();

        Map<String, Object> attributes = principal.getAttributes();
        Set<String> sets = attributes.keySet();

        for (String key : sets) {
            Object value = attributes.get(key);
            sb.append("key:"+key+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; value:"+value+"<br/>");
        }
    }

%>

<%=userID%>
<br/>
<%=sb.toString()%>
<hr/>





</body>
</html>