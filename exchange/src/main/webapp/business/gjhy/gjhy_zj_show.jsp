<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/13
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath%>" >
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />

    <meta name="description" content="Common form elements and layouts" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="assets/css/bootstrap.css" />
    <link rel="stylesheet" href="assets/css/font-awesome.css" />

    <!-- page specific plugin styles -->
    <link rel="stylesheet" href="assets/css/jquery-ui.custom.css" />
    <link rel="stylesheet" href="assets/css/jquery-ui.css" />
    <link rel="stylesheet" href="assets/css/ui.jqgrid.css" />
    <link rel="stylesheet" href="assets/css/chosen.css" />
    <link rel="stylesheet" href="assets/css/bootstrap-datepicker3.css" />

    <!-- text fonts -->
    <link rel="stylesheet" href="assets/css/ace-fonts.css" />

    <!-- ace styles -->
    <link rel="stylesheet" href="assets/css/ace.css" class="ace-main-stylesheet" id="main-ace-style" />

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="assets/css/ace-part2.css" class="ace-main-stylesheet" />
    <link rel="stylesheet" href="assets/css/ace-ie.css" />
    <![endif]-->

    <!--[if lte IE 9]>
    <![endif]-->

    <!--[if lte IE 8]>
    <script src="assets/js/html5shiv.js"></script>
    <script src="assets/js/respond.js"></script>
    <![endif]-->


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
                        <form class="form-horizontal" id="form" role="form">
                            <input type="hidden" name="zjid" value="${hyzj.zjid}"/>
                            <input type="hidden" name="sbid" value="${hyzj.sbid}"/>
                            <!-- #section:elements.form -->
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 基本信息: </label>

                                <div class="col-xs-10">
                                    <input type="text" readonly="readonly" disabled="disabled"  name="jbxx"  value="${hyzj.jbxx}"  placeholder="基本信息"  class="col-xs-12" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 会议批件文号: </label>
                                <div class="col-xs-10">
                                    <input type="text" readonly="readonly" disabled="disabled"  name="pjwh" value="${hyzj.pjwh}"    placeholder="会议批件文号"  class="col-xs-12" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 会议具体情况介绍: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" name="jtqkjs"   id="form-field-10" maxlength="300" placeholder="会议具体情况介绍" readonly="readonly" disabled="disabled">${hyzj.jtqkjs}</textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 会议产出情况介绍: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" name="ccqkjs"    id="form-field-2" maxlength="300" placeholder="会议产出情况介绍" readonly="readonly" disabled="disabled">${hyzj.ccqkjs}</textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 会议申办主办过程中的经验与问题: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" id="form-field-12"  name="jyywt"  maxlength="300" placeholder="会议申办主办过程中的经验与问题" readonly="readonly" disabled="disabled">${hyzj.jyywt}</textarea>
                                </div>
                            </div>
							<div class="col-md-offset-3 col-md-9" style = "text-align:right;">
                                <hr/>
                                <button class="btn btn-info btn-sm" id="btnClose" type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                   关闭
                                </button>
                            </div>
						  &nbsp; &nbsp; &nbsp;
                        </form>

                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div>
    </div><!-- /.main-content -->


</div><!-- /.main-container -->


<script src='assets/js/jquery.js'></script>

<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>
<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>

<script src="assets/js/layer/layer.js"></script>
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



    $(function(){
        $("#btnClose").click(function(){

            closeLayer();

        });

    });


</script>
</body>
</html>
