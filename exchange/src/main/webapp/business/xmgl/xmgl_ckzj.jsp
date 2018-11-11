<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/13
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <base href="<%=basePath%>">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>

    <meta name="description" content="Common form elements and layouts"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>


    <!-- inline styles related to this page -->


    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="assets/css/bootstrap.css"/>
    <link rel="stylesheet" href="assets/css/font-awesome.css"/>

    <!-- page specific plugin styles -->
    <link rel="stylesheet" href="assets/css/jquery-ui.custom.css"/>
    <link rel="stylesheet" href="assets/css/jquery-ui.css"/>
    <link rel="stylesheet" href="assets/css/ui.jqgrid.css"/>
    <link rel="stylesheet" href="assets/css/chosen.css"/>
    <link rel="stylesheet" href="assets/css/bootstrap-datepicker3.css"/>

    <!-- text fonts -->
    <link rel="stylesheet" href="assets/css/ace-fonts.css"/>

    <!-- ace styles -->
    <link rel="stylesheet" href="assets/css/ace.css" class="ace-main-stylesheet" id="main-ace-style"/>

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="assets/css/ace-part2.css" class="ace-main-stylesheet"/>
    <link rel="stylesheet" href="assets/css/ace-ie.css"/>
    <![endif]-->

    <!--[if lte IE 9]>
    <![endif]-->

    <!--[if lte IE 8]>
    <script src="assets/js/html5shiv.js"></script>
    <script src="assets/js/respond.js"></script>
    <![endif]-->

    <!-- ace settings handler -->
    <script src="assets/js/ace-extra.js"></script>


</head>

<body class="no-skin">
<!-- #section:basics/navbar.layout -->

<!-- /section:basics/navbar.layout -->
<div class="main-container" id="main-container">
    <div class="main-content">
        <div class="main-content-inner">
            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <form class="form-horizontal" role="form">
                            <c:if test="${zjList!=null && zjList.size() >0}">
                            <div class="form-group">

                                <div class="col-xs-6">
                                    序号
                                </div>
                                <div class="col-xs-6">
                                   操作
                                </div>
                            </div>



                                <c:forEach items="${zjList}" var="zj" varStatus="status">

                                    <div class="form-group">

                                        <div class="col-xs-6">
                                            第${status.count}个总结
                                        </div>
                                        <div class="col-xs-6">
                                            <a href="sys/file/download?fileName=zj${status.count}&fileId=${zj.fileId}" target="_blank">下载</a>
                                        </div>
                                    </div>
                                </c:forEach>

                            </c:if>

                            <c:if test="${zjList == null ||  zjList.size() <=0}">
                                <b>暂无总结</b>
                            </c:if>

                        </form>

                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div>
    </div><!-- /.main-content -->


</div><!-- /.main-container -->


<!-- ace scripts -->


<script src='assets/js/jquery.js'></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/jquery.knob.js"></script>
<script src="assets/js/autosize.js"></script>
<script src="assets/js/jquery.inputlimiter.1.3.1.js"></script>
<script src="assets/js/jquery.maskedinput.js"></script>


<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>
<script src="assets/js/ace/elements.fileinput.js"></script>
<script src="assets/js/layer/layer.js"></script>
<script src="assets/js/ace/ace.js"></script>

<!--弹出层 -->
<script src="assets/js/layer/layer.js"></script>

<!--自定义js -->
<%--<script src="assets/project/js/common-window.js"></script>--%>



<!-- ace scripts -->

<script>


</script>
</body>
</html>
