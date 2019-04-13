<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://cn.edu.cmu/uitag" prefix="dm" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
    <style>
        body {
            background: #fff;
        }
    </style>
</head>
<body class="no-skin">
<form class="form-horizontal" action="cgglexp/downloadPdf" id="form" role="form" method="post">
    <div class="tabbable">
        <div class="tab-content">
            <div id="home" class="tab-pane fade in active">
                <input type="hidden" name="status" id="status" value="${cgdqcgj.status}" />
                <input type="hidden" name="id" id="cgid" value="${cgdqcgj.cgid}" />
                <div class="form-group">
                    <label class="col-xs-3 control-label"  > 本人承诺(申请表说明): </label>
                    <div class="col-xs-9">
                        <input type="hidden" name="sqbsm" id="sqbsm"/>
                        <textarea class="form-control" name="sqbsm_show" id="sqbsm_show" maxlength="300">${cgdqcgj.sqbsm}</textarea>
                    </div>
                </div>
                &nbsp; &nbsp; &nbsp;
                <div id="btns" class="col-md-offset-3 col-md-9" style = "text-align:right;">
                    <button class="btn btn-warning btn-sm btns" id="submitForm" type="button">
                        <i class="ace-icon fa fa-download bigger-110"></i>
                        导出pdf2
                    </button>
                    <button class="btn btn-danger btn-sm btns" id="btnClose" type="button">
                        <i class="ace-icon fa fa-check bigger-110"></i>
                        关闭
                    </button>
                </div>
                &nbsp; &nbsp; &nbsp;
            </div>
        </div>
    </div>
</form>
<script src='assets/js/jquery.js'></script>
<!-- jqueryValidate验证框架-->
<script src="assets/js/jqvalidate/jquery.validate.min.js"></script>
<script src="assets/js/jqvalidate/messages_zh.js"></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>
<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>
<script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
<script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>
<!-- ace scripts -->
<!-- jqueryValidate验证框架-->
<script src="assets/js/jqvalidate/jquery.validate.min.js"></script>
<script src="assets/js/jqvalidate/messages_zh.js"></script>
<!--弹出层 -->
<script src="assets/js/layer/layer.js"></script>
<!--自定义js -->
<script src="assets/project/js/common-window.js"></script>

<script>

    $(function () {
        setFormValid();//设置校验规则

        $("#submitForm").click(function(){
            if(!validateSq()){
                return;
            }

            $("#sqbsm").val(   encodeURI( $("#sqbsm_show").val()   ))
            $("#form").submit();
        });

        $("#btnClose").click(function(){
            var index = parent.layer.getFrameIndex(window.name);
            parent.layer.close(index);
        })
    });
    function setFormValid(){
        var validator =  $("#form").setValid({
            //校验规则
            rules: {
                "sqbsm_show":{ required:true}
            }
        })
    }
    //校验整个计划
    function validateSq(){
        if(!$("#form").valid()){
            return false;
        }
        return true;
    }

</script>
</body>
</html>