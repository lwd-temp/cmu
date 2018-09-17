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

    <!-- inline styles related to this page -->



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

    <!-- ace settings handler -->
    <script src="assets/js/ace-extra.js"></script>


    <style>
        .control-value{
            text-align: left !important;
        }

    </style>

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
                            <!-- #section:elements.form -->

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 组团单位   : </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="组团单位" readonly="readonly"     class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 出访国家或地区 : </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="出访国家或地区" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 团长姓名   : </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="团长姓名" readonly="readonly"     class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 团长单位及职务: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="团长单位及职务" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 批准出访人数   : </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value=""    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 批准出访天数: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="aaa@cmu.edu.cn"    class="col-xs-12" />

                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 实际出访人数   : </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value=""    placeholder="13801662589"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 实际出访天数: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value=""    placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 出境时间   : </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" id="id-date-picker-3"value="2018-11-15"   type="text" data-date-format="yyyy-mm-dd" />

                                </div>

                                <label class="col-xs-2 control-label "  > 任务批件文号 </label>
                                <div class="col-xs-4">
                                    <input class="form-control  " id="id-date-picker-2"value="2018-11-15"   type="text" data-date-format="yyyy-mm-dd" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 入境时间   : </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" id="id-date-picker-1"value="2018-11-15"   type="text" data-date-format="yyyy-mm-dd" />
                                </div>


                            </div>
                            <div class="form-group"   >

                                <label class="col-xs-2 control-label "  > 出访报告标题: </label>
                                <div class="col-xs-10">
                                    <input type="text"  name="username"  value=""    placeholder="demo@cmu.edu.cn"    class="col-xs-12" />

                                </div>
                            </div>
                            <div class="form-group"   >

                                <label class="col-xs-2 control-label "  > 任务执行情况: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" id="form-field-10" maxlength="300"></textarea>

                                </div>
                            </div>
                            <div class="form-group"   >

                                <label class="col-xs-2 control-label "  > 未完成任务情况及原因: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" id="form-field-10" maxlength="300"></textarea>

                                </div>
                            </div>


                            <div class="col-md-offset-3 col-md-9">

                                <button class="btn btn-info btn-sm" type="button">
                                    <i class="ace-icon fa fa-save bigger-110"></i>
                                    暂存
                                </button>

                                &nbsp; &nbsp; &nbsp;


                                <button class="btn btn-info btn-sm" id="submit"  type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                    提交
                                </button>


                            </div>

                        </form>

                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div>
    </div><!-- /.main-content -->


</div><!-- /.main-container -->



<script src="../assets/js/jquery.knob.js"></script>
<script src="../assets/js/autosize.js"></script>
<script src="../assets/js/jquery.inputlimiter.1.3.1.js"></script>
<script src="../assets/js/jquery.maskedinput.js"></script>


<!-- ace scripts -->


<script src='assets/js/jquery.js'></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/jquery.knob.js"></script>
<script src="assets/js/autosize.js"></script>
<script src="assets/js/jquery.inputlimiter.1.3.1.js"></script>
<script src="assets/js/jquery.maskedinput.js"></script>
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>




<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>
<script src="assets/js/ace/elements.fileinput.js"></script>

<script src="assets/js/layer/layer.js"></script>
<script src="assets/js/ace/ace.js"></script>

<!-- ace scripts -->

<script>
    $(function(){

        //日期选择器
        $('.date-picker').datepicker({
            autoclose: true,
            todayHighlight: true
        });


        $('[type=file]').ace_file_input({
            no_file:'暂无文件 ...',
            btn_choose:'选择',
            btn_change:'替换',
            droppable:false,
            onchange:null,
            thumbnail:true //| true | large
            //whitelist:'gif|png|jpg|jpeg'
            //blacklist:'exe|php'
            //onchange:''
            //
        });

        $('.chosen-select').chosen({allow_single_deselect:true});

        $("#submit").click(function(){

            var index = parent.layer.alert("根据填报信息生成word文档。.........",function(){
                parent.window.open( "alink/doc/fkb.docx");
                parent.layer.close(index);

            })

        })

    })


</script>
</body>
</html>
