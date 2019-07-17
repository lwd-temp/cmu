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
        body{

            background: #fff;
        }
        th , td{
            margin:0px 20px 0px 15px;
            padding:0px 20px 0px 15px;
        }

    </style>

</head>

<body class="no-skin">
<!-- #section:basics/navbar.layout -->

<div class="tabbable">
    <ul class="nav nav-tabs" id="myTab">
        <li class="active">
            <a data-toggle="tab" href="#home">
                <i class="green ace-icon fa fa-home bigger-120"></i>
                学生信息
            </a>
        </li>

        <li>
            <a data-toggle="tab" href="#messages">
                申报材料
                <span class="badge badge-danger">2</span>
            </a>
        </li>
        <li>
            <a data-toggle="tab" href="#ysqxm">
                已申请项目
                <span class="badge badge-danger">3</span>
            </a>
        </li>


    </ul>

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">


            <form class="form-horizontal" role="form">
                <!-- #section:elements.form -->
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 项目总名: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="username"  value="xxxxxxx项目总名" readonly="readonly"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 项目名称: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="username"  value="初审xxxxxxx项目项目名称" readonly="readonly"     class="col-xs-12" />
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
                        <input type="text"  name="username"  value="8/1021"   id="cjpm1" placeholder="格式20/100" readonly="readonly"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 综合评级: </label>
                    <div class="col-xs-4">
                        <select class="chosen-select form-control"  readonly="readonly"  disabled="disabled"  data-placeholder="综合评级">
                            <option value="">  </option>
                            <option value="A" selected>A</option>
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
                        <input type="text"  name="username"    readonly="readonly" value="13801662589"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 邮箱: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="username"   readonly="readonly"    value="demo@cmu.edu.cn"    class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 已资助金额   : </label>
                    <div class="col-xs-4">
                        <input type="text"  name="username"    readonly="readonly" disabled="" value="13000"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 心理测评结果: </label>
                    <div class="col-xs-4">
                        <select class="chosen-select form-control"     data-placeholder="请选择该学生测评结果">
                            <option value="A" selected>&nbsp;&nbsp;A&nbsp;&nbsp;</option>
                            <option value="B">&nbsp;&nbsp;B&nbsp;&nbsp;</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-5 control-label "  > 项目资助标准   : </label>
                    <div class="col-xs-7">
                        <input type="text"  name="username"    readonly="readonly" disabled="" value="5000/4000/2500"    class="col-xs-12" />
                    </div>


                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 审核意见<i class="fa fa-star-o red"></i>   : </label>
                    <div class="col-xs-4">
                        <select class="chosen-select form-control"  readonly="readonly"   data-placeholder="请选择审核意见">
                            <option value="">  </option>
                            <option value="A">通过</option>
                            <option value="B">不通过</option>
                        </select>
                    </div>

                    <label class="col-xs-2 control-label "  > 资助金额<i class="fa fa-star red"></i>: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="username"   value=""    class="col-xs-12" />
                    </div>
                </div>

            </form>




        </div>

        <div id="messages" class="tab-pane fade">
            <p><a href="alink/doc/f1.doc" target="_blank">申报材料1...............(点击可下载)</a>.</p>
            <p><a href="alink/doc/f2.doc" target="_blank">申报材料2...............(点击可下载)</a>.</p>
        </div>
        <div id="ysqxm" class="tab-pane fade">
            <table>
                <thead>
                <tr>
                    <th>序号</th>
                    <th>项目名称</th>
                    <th>目的地</th>
                    <th>出发时间</th>
                    <th>天数</th>
                    <th>资助金额</th>
                </tr>

                </thead>
                <tbody>
                <tr>
                    <td>1</td>
                    <td>项目名称1</td>
                    <td>目的地1</td>
                    <td>2018-01-01</td>
                    <td>3</td>
                    <td>5000</td>
                </tr> <tr>
                    <td>2</td>
                    <td>项目名称2</td>
                    <td>目的地2</td>
                    <td>2018-02-01</td>
                    <td>3</td>
                    <td>5000</td>
                </tr> <tr>
                    <td>3</td>
                    <td>项目名称3</td>
                    <td>目的地4</td>
                    <td>2018-03-01</td>
                    <td>3</td>
                    <td>2000</td>
                </tr>
                </tbody>
            </table>
        </div>


    </div>
</div>
<div class="col-md-offset-3 col-md-9">

    <button class="btn btn-info btn-sm" type="button">
        <i class="ace-icon fa fa-check bigger-110"></i>
        通过
    </button>

    &nbsp; &nbsp; &nbsp;


    <button class="btn btn-danger btn-sm" type="button">
        <i class="ace-icon fa fa-close bigger-110"></i>
        不通过
    </button>

    &nbsp; &nbsp; &nbsp;
</div>


<script src='assets/js/jquery.js'></script>
<script src="assets/js/jquery.knob.js"></script>
<script src="assets/js/autosize.js"></script>
<script src="assets/js/jquery.inputlimiter.1.3.1.js"></script>
<script src="assets/js/jquery.maskedinput.js"></script>
<script src="assets/js/jquery-ui.js"></script>
<script src="assets/js/jquery.ui.touch-punch.js"></script>

<!-- ace scripts -->



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
