<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/8
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie cookie = new Cookie("CASTGC", null);
    cookie.setMaxAge(0);
    response.addCookie(cookie);
%>

</body>
</html>
