<%@ page import="org.jasig.cas.client.authentication.AttributePrincipal" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %><%--
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
<%
    StringBuffer sb = new StringBuffer();

    AttributePrincipal principal = (AttributePrincipal)request.getUserPrincipal();
    String userID = principal.getName();

    Map<String, Object> attributes = principal.getAttributes();
    Set<String> sets = attributes.keySet();

    for (String key : sets) {
        Object value = attributes.get(key);
        sb.append("key:"+key+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; value:"+value+"<br/>");
    }
%>

<%=userID%>
<br/>
<%=sb.toString()%>

</body>
</html>