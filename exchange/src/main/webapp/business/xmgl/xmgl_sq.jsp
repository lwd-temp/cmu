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
                                <label class="col-xs-2 control-label "  > 项目总名: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="xxxxxxx项目总名" readonly="readonly"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 项目名称: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="xxxxxxx项目项目名称" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 学号 : </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="2015021303" readonly="readonly"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 姓名: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="温家宝" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 性别  : </label>
                                <div class="col-xs-4">
                                    <input name="form-field-radio"  disabled="" type="radio" class="ace"  checked/>
                                    <span class="lbl"> 男</span>
                                    <input name="form-field-radio"  disabled="" type="radio"  class="ace" />
                                    <span class="lbl"> 女</span>
                                </div>

                                <label class="col-xs-2 control-label "  > 院系: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="基础医学院" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 入学年级   : </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="2014" readonly="readonly"     class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 年级: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="2014" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 专业   : </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="麻醉学" readonly="readonly"     class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 班级: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value="基础医学麻醉01班" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 成绩排名   : </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value=""   id="cjpm" placeholder="格式20/100"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 综合评级: </label>
                                <div class="col-xs-4">
                                    <select class="chosen-select form-control"   data-placeholder="请选择项目类型">
                                        <option value="">  </option>
                                        <option value="A">A</option>
                                        <option value="B">B</option>
                                        <option value="C">C</option>
                                        <option value="D">D</option>
                                        <option value="X">X</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 手机号   : </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value=""    placeholder="13801662589"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 邮箱: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value=""    placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 交流目标国家或地区   : </label>
                                <div class="col-xs-4">
                                    <select class="chosen-select form-control"   data-placeholder="请选择本项目目标交流国家">
                                        <option value="">  </option>
                                        <option value="A">英国</option>
                                        <option value="B">法国</option>
                                        <option value="C">日本</option>
                                        <option value="D">澳大利亚</option>
                                        <option value="X">悉尼</option>
                                    </select>
                                </div>

                                <label class="col-xs-2 control-label "  > 英语水平 </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value=""        class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 上传材料1   : </label>
                                <div class="col-xs-4">
                                    <input type="file" id="id-input-file-1" />
                                </div>

                                <label class="col-xs-2 control-label "  > 材料1说明: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 上传材料2   : </label>
                                <div class="col-xs-4">
                                    <input type="file" id="id-input-file-2" />
                                </div>

                                <label class="col-xs-2 control-label "  > 材料2说明: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                            </div>



                            <div class="col-md-offset-3 col-md-9">

                                <button class="btn btn-info btn-sm" type="button">
                                    <i class="ace-icon fa fa-save bigger-110"></i>
                                    暂存
                                </button>

                                &nbsp; &nbsp; &nbsp;


                                <button class="btn btn-info btn-sm" type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                    提交
                                </button>

                                &nbsp; &nbsp; &nbsp;


                                <button class="btn btn-sm" type="reset">
                                    <i class="ace-icon fa fa-undo bigger-110"></i>
                                    Reset
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




<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>
<script src="assets/js/ace/elements.fileinput.js"></script>
<script src="assets/js/layer/layer.js"></script>
<script src="assets/js/ace/ace.js"></script>

<!-- ace scripts -->

<script>
    $(function(){
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

        $("#cjpm").mouseover(function(){
            layer.tips('最近一学年学业成绩排名或最近一学年综合测评排名:格式20/100', '#cjpm');
        });


    })


</script>
</body>
</html>
