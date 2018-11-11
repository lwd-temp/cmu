<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/13
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
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
    <!-- text fonts -->
    <link rel="stylesheet" href="assets/css/ace-fonts.css"/>

    <link rel="stylesheet" href="assets/css/jquery-ui.css"/>
    <link rel="stylesheet" href="assets/css/chosen.css"/>
    <link rel="stylesheet" href="assets/css/bootstrap-datepicker3.css"/>


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
                            <%-- <input type="hidden" name="tid" id="tid" value="" />--%>
                            <!-- #section:elements.form -->
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 姓: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="jsx" id="jsx" value="" placeholder="姓" class="col-xs-12"/>
                                </div>

                                <label class="col-xs-2 control-label "> 名: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="jsm" id="jsm" value="" placeholder="名" class="col-xs-12"/>
                                </div>
                            </div>


                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 中文名字: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="chineseName" id="chineseName" value="" placeholder="中文名字" class="col-xs-12"/>
                                </div>

                                <label class="col-xs-2 control-label "> 性别: </label>
                                <div class="col-xs-4">
                                    <dm:list tabName="t_dm_xb"   type="radio" name="gender" id="gender" value="${gender}" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 国籍: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="gj" id="gj" value="" placeholder="国籍" class="col-xs-12"/>
                                </div>

                                <label class="col-xs-2 control-label "> 出生日期: </label>
                                <div class="col-xs-4">

                                    <input class="form-control date-picker" name="birthday" id="birthday"
                                           value="<fmt:formatDate value="${birthday}" pattern="yyyy-MM-dd"/>"
                                           type="text" data-date-format="yyyy-mm-dd" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 婚姻状况: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="hyzk" id="hyzk" value="" placeholder="婚姻状况" class="col-xs-12"/>
                                </div>

                                <label class="col-xs-2 control-label "> 护照类型: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="hzlx" id="hzlx" value="" placeholder="护照类型" class="col-xs-12"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 护照码: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="hzh" id="hzh" value="" placeholder="护照码" class="col-xs-12"/>
                                </div>

                                <label class="col-xs-2 control-label "> 护照签发日期: </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" name="hzqfrq" id="hzqfrq"
                                           value="<fmt:formatDate value="${hzqfrq}" pattern="yyyy-MM-dd"/>"
                                           type="text" data-date-format="yyyy-mm-dd" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 护照有效期至: </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" name="hzyxq" id="hzyxq"
                                           value="<fmt:formatDate value="${hzyxq}" pattern="yyyy-MM-dd"/>"
                                           type="text" data-date-format="yyyy-mm-dd" />
                                </div>

                                <label class="col-xs-2 control-label "> 最高学位（学历）: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="zgxw" id="zgxw" value="" placeholder="最高学位（学历）" class="col-xs-12"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 汉语水平: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="hysp" id="hysp" value="" placeholder="汉语水平" class="col-xs-12"/>
                                </div>

                                <label class="col-xs-2 control-label "> 申请人电子邮箱: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="email" id="email" value="" placeholder="申请人电子邮箱" class="col-xs-12"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 所有曾授予你护照的国家: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="syccsyhzgj" id="syccsyhzgj" value="" placeholder="所有曾授予你护照的国家" class="col-xs-12"/>
                                </div>

                                <label class="col-xs-2 control-label "> 工作岗位（职业）: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="gzgw" id="gzgw" value="" placeholder="工作岗位（职业）" class="col-xs-12"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 聘用合同/任职证明在华工作开始时间: </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" name="rzzmsj" id="rzzmsj"
                                           value="<fmt:formatDate value="${rzzmsj}" pattern="yyyy-MM-dd"/>"
                                           type="text" data-date-format="yyyy-mm-dd" />
                                </div>

                                <label class="col-xs-2 control-label ">申请在中国工作职务: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="gzzw" id="gzzw" value="" placeholder="申请在中国工作职务" class="col-xs-12"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 申请在华工作时间开始: </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" name="gzsjStart" id="gzsjStart"
                                           value="<fmt:formatDate value="${gzsjStart}" pattern="yyyy-MM-dd"/>"
                                           type="text" data-date-format="yyyy-mm-dd" />
                                </div>

                                <label class="col-xs-2 control-label ">申请在华工作时间结束: </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" name="gzsjEnd" id="gzsjEnd"
                                           value="<fmt:formatDate value="${gzsjEnd}" pattern="yyyy-MM-dd"/>"
                                           type="text" data-date-format="yyyy-mm-dd" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 在中国工作电话: </label>
                                <div class="col-xs-10">
                                    <input type="text" name="phone" id="phone" value="" placeholder="在中国工作电话" class="col-xs-12"/>
                                </div>
                            </div>
                            <hr/>

                            <div class="col-md-offset-3 col-md-9" style="text-align:left;">

                                <button class="btn btn-info btn-sm" id="btn-submit" type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                    保存
                                </button>
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
    if ('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.js'>" + "<" + "/script>");
</script>

<script src="assets/js/bootstrap.js"></script>

<!-- page specific plugin scripts -->
<script src="assets/js/jquery-ui.custom.js"></script>
<script src="assets/js/jquery.ui.touch-punch.js"></script>
<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>
<script src="assets/js/fuelux/fuelux.spinner.js"></script>
<script src="assets/js/jquery.knob.js"></script>
<script src="assets/js/autosize.js"></script>
<script src="assets/js/jquery.inputlimiter.1.3.1.js"></script>
<script src="assets/js/jquery.maskedinput.js"></script>
<script src="assets/js/bootstrap-tag.js"></script>
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

        var validator = $("#form").setValid({
            //校验规则
            rules: {
                "tid": "required",
                "name": "required",
                "gender": "required",
                "language": "required",
                "gzdw": "required",
                "zyly": "required",
                "email": {
                    required: true,
                    email: true
                },
                "phone": {
                    required: true,
                    isphoneNum: true
                },
                "zwzc": "required",
                "glxm": "required",
                "cz": "required",
                "txdz": "required",
                "gj": "required",
                "memo": {
                    maxlength: 500
                },


            }
        });


        $("#btn-submit").click(function () {

            if (!$("#form").valid()) {
                validator.focusInvalid();
                return;
            }

            $.ajax('wjjs/save', {
                type: 'post',
                dataType: 'json',
                data: $("#form").serialize(),
                success: function (res) {
                    if (res && res.success) {
                        parent.refreshTable();
                        closeLayer();//关闭
                        winAlert("保存成功");//弹出确认消息
                    }
                }
            });
        });
    })


</script>
</body>
</html>
