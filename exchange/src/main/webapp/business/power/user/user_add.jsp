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
                        <form class="form-horizontal" role="form" id="form">

                            <!-- #section:elements.form -->
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 用户名: </label>

                                <div class="col-xs-4">
                                    <input type="text"  name="userName" id="userName"    placeholder="请输入用户名"  class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label " > 显示名称: </label>

                                <div class="col-xs-4">
                                    <input type="text"  name="name"  id="showName"  placeholder="请输入教职工姓名"  class="col-xs-12" />
                                </div>

                            </div>


                            <div class="form-group">


                                <label class="col-xs-2 control-label " > 密码: </label>

                                <div class="col-xs-4">
                                    <input type="password" name="password"  id="password"  placeholder="请输入密码" class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 重复密码: </label>

                                <div class="col-xs-4">
                                    <input type="password" name="re-password"      messages ="两次输入密码不一致" id="re-password"  placeholder="请再次输入密码" class="col-xs-12" required />
                                </div>
                            </div>

                            <div class=" form-actions">
                                <div class="col-md-offset-3 col-md-9">
                                    <button class="btn btn-info btn-sm" id="save"  type="button">
                                        <i class="ace-icon fa fa-check bigger-110"></i>
                                        提交
                                    </button>

                                    &nbsp; &nbsp; &nbsp;
                                    <button class="btn btn-sm" id="close" type="button">
                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                        取消
                                    </button>
                                </div>
                            </div>

                        </form>

                   </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div>
    </div><!-- /.main-content -->


</div><!-- /.main-container -->


<script src='assets/js/jquery.js'></script>

<script type="text/javascript">
    if('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.js'>"+"<"+"/script>");
</script>

<script src="assets/js/bootstrap.js"></script>

<!-- page specific plugin scripts -->
<script src="assets/js/jquery-ui.custom.js"></script>
<script src="assets/js/jquery.ui.touch-punch.js"></script>
<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/fuelux/fuelux.spinner.js"></script>
<script src="assets/js/jquery.knob.js"></script>
<script src="assets/js/autosize.js"></script>
<script src="assets/js/jquery.inputlimiter.1.3.1.js"></script>
<script src="assets/js/jquery.maskedinput.js"></script>
<script src="assets/js/bootstrap-tag.js"></script>
<!-- ace scripts -->

<!-- jqueryValidate验证框架-->
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
<script src="assets/js/layer/layer.js"></script>

<script src="assets/project/js/common-window.js"></script>

<script>

    $(function(){
        //添加校验
        $("#form").setValid({
            //校验规则
            rules: {
                userName:{
                    required: true,
                    minlength: 5
                },
                showName:{
                    required: true,
                },
                password: {
                    required: true,
                    minlength: 5
                },
                "re-password": {
                    required: true,
                    minlength: 5,
                    equalTo: "#password"
                },
            },
            messages:{
                "re-password": {
                    equalTo: "两次密码不一致"
                },
            }
        });

        $("#save").click(function(){
            var addUrl = 'sys/user/save';

            if(!$("#form").valid()){
                return;
            }
            if(1==1){
                return;
            }
            $.ajax(addUrl,{
                type:'post',
                dataType:'json',
                data:$("#form").serialize(),
                success:function(res){
                    if(res && res.success){
                        closeLayer();//关闭
                        winAlert("保存成功,用户ID: "+res.data.userId);//弹出确认消息
                    }
                }
            });

        });
        $("#close").click(function(){
            closeLayer();//关闭
        })
    });

</script>
</body>
</html>
