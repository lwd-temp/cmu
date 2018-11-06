<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://cn.edu.cmu/uitag" prefix="dm" %>
<!DOCTYPE html>
<html lang="en">
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

    <meta name="hzxy.description" content="Common form elements and layouts" />
    <meta name="hzxy.viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

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

<div class="main-container" id="main-container">
    <div class="main-content">
        <div class="main-content-inner">
            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <form class="form-horizontal" id="form" role="form">
                            <!-- #section:elements.form -->
                            <input type="hidden" name="hzxy.xyid" value="${jlxy.xyid}" />
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 协议名称: </label>

                                <div class="col-xs-4">

                                    <input type="text"  name="hzxy.xymc" value="${jlxy.xymc}"  placeholder="协议名称"  class="col-xs-12" />
                                </div>
                                <label class="col-xs-2 control-label " > 合作方名称: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="hzxy.hzfmc"  value="${jlxy.hzfmc}" placeholder="合作方名称"  class="col-xs-12" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 签订日期: </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" id="id-date-picker-1" name="hzxy.qdrq" value="<fmt:formatDate value="${jlxy.qdrq}" pattern="yyyy-MM-dd"/>"
                                           type="text" data-date-format="yyyy-mm-dd" />

                                </div>
                                <label class="col-xs-2 control-label " > 失效日期: </label>

                                <div class="col-xs-4">
                                    <input class="form-control date-picker" id="id-date-picker-2"   name="hzxy.sxrq" value="<fmt:formatDate value="${jlxy.sxrq}" pattern="yyyy-MM-dd"/>"
                                           type="text" data-date-format="yyyy-mm-dd" />
                                </div>

                            </div>


                            <div class="form-group">
                                <label class="col-xs-2 control-label" > 国别: </label>
                                <div class="col-xs-10">
                                    <dm:list tabName="T_DM_GB"  type="select" multiple="multiple"  valueList="${gbList}" id="gb"  name="gbs"   data-placeholder="请选择国别"></dm:list>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 签字人: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" name="hzxy.qzr"  placeholder="签字人"  maxlength="300">${jlxy.qzr}</textarea>
                                </div>

                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 签字人职务: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" name="hzxy.qzrzw"   placeholder="签字人职务"  maxlength="300">${jlxy.qzrzw}</textarea>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 备注: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" name="hzxy.memo"   placeholder="备注"  maxlength="300">${jlxy.memo}</textarea>
                                </div>
                            </div>

                            <div class="col-md-offset-3 col-md-9" style = "text-align:right;">
                                <hr/>
                                <button class="btn btn-info btn-sm" id="btn-submit"  type="button">
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
<!---date-->
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>

<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>
<!-- ace scripts -->
<script>
    $(function(){

        $('#gb').chosen({allow_single_deselect:true});



        var validator = $("#form").setValid({
            //校验规则
            rules: {
                'hzxy.xymc': {
                    required: true
                },
                'hzxy.hzfmc': {
                    required: true
                }
            }
        });
        $("#btn-submit").click(function(){
            if(!$("#form").valid()){
                validator.focusInvalid();
                return;
            }
            $.ajax('jlxy/save',{
                type:'post',
                dataType:'json',
                data:$("#form").serialize(),
                success:function(res){
                    if(res && res.success){
                        parent.refreshTable();
                        closeLayer();//关闭
                        winAlert("保存成功");//弹出确认消息
                    }else{
                        winAlert("保存失败");//弹出确认消息
                    }
                }

            });
        });
    })
</script>
</body>
</html>
