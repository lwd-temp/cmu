<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/11
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <script src="assets/js/jquery.js"></script>

    <script>

    $(function(){

        $("#exp").click(function(){

            //可以先通过ajax 保存信息，然后根据返回的id 到后台查询到信息 混编到html中，使用html生成pdf
            //此部分代码，写在 保存页面信息（ajax方法）的 success方法中
            window.open("demo/downloadPdf");

        });

    })

</script>

</head>
<body>
<button id="exp">点击按钮导出pdf</button>

<h1>可以先通过ajax 保存页面信息，</h1>
<h1>然后根据返回的id 到后台查询到信息 混编到html中，使用html生成pdf</h1>




</body>
</html>
