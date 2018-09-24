<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/13
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://cn.edu.cmu/uitag" prefix="dm" %>
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
                        <form class="form-horizontal" id="form" role="form">
                            <!-- #section:elements.form -->
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 姓名: </label>

                                <div class="col-xs-4">
                                    <input type="text"  name="name" id="name" value="" placeholder="姓名"  class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label " > 性别: </label>

                                <div class="col-xs-4">
                                    <dm:list tabName="T_DM_XB" type="radio" id="gender" name="gender"   ></dm:list>
                                </div>

                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 国籍: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="gj" id="gj" value="" placeholder="国籍"  class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label " > 语种: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="yz"  id="yz" value="" placeholder=""  class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 工作单位: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="gzdw" id="gzdw" value="" placeholder=""  class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label " > 职务职称: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="zwzc"  id="zwzc"  value="" placeholder=""  class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 专业领域: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="zyly" id="zyly" value="" placeholder=""  class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label " > 关联项目: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="glxm"  id="glxm" value="" placeholder=""  class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 邮箱: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="email" id="email" value="" placeholder=""  class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label " > 传真: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="fax"  id="fax" value="" placeholder=""  class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 工作电话: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="telphone" id="telphone" value="" placeholder=""  class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label " > 通信地址: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="address" id="address"  value="" placeholder=""  class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 备注: </label>
                                <div class="col-xs-10">
                                    <input type="text"  name="remark" id="remark" value="" placeholder="备注"  class="col-xs-12" />
                                </div>

                            </div>

                            <div class=" form-actions">
                                <div class="col-md-offset-3 col-md-9">
                                    <button class="btn btn-info btn-sm" id="btn-submit"  type="button">
                                        <i class="ace-icon fa fa-check bigger-110"></i>
                                        保存
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

<!-- jqueryValidate验证框架-->
<script src="assets/js/jqvalidate/jquery.validate.min.js"></script>
<script src="assets/js/jqvalidate/messages_zh.js"></script>
<!--弹出层 -->
<script src="assets/js/layer/layer.js"></script>

<!--自定义js -->
<script src="assets/project/js/common-window.js"></script>

<!-- ace scripts -->
<script>
    var index = parent.layer.getFrameIndex(window.name); //获取窗口索引

    $(function(){

        $("#form").setValid({
            //校验规则
            rules: {
                name:{
                    required:true
                },
                gender:{
                    required:true
                },
                email:{
                    email: true
                },

            }
        });


        $("#btn-submit").click(function(){

            if(!$("#form").valid()){
                return;
            }

            $.ajax('lxr/save',{
                type:'post',
                dataType:'json',
                data:$("#form").serialize(),
                success:function(res){
                    if(res && res.success){
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
