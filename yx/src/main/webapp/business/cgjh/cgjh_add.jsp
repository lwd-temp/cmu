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
    <style>
        body{
            background: #fff;
        }
    </style>
</head>

<body class="no-skin">

<div class="tabbable">
    <ul class="nav nav-tabs" id="myTab">
        <li class="active">
            <a data-toggle="tab" href="#home">
                <i class="green ace-icon fa fa-home bigger-120"></i>
                学生信息
            </a>
        </li>

        <li>
            <a data-toggle="tab" id="tzcyinfo" href="#messages">
                团组成员信息

            </a>
        </li>



    </ul>

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">
            <form class="form-horizontal" role="form">
                <!-- #section:elements.form -->
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 团组号: </label>

                    <div class="col-xs-4">
                        <input type="text"  name="tzh" id="tzh" readonly="readonly" placeholder="20180100001"  class="col-xs-12" />
                    </div>
                    <label class="col-xs-2 control-label " > 团组类别: </label>
                    <div class="col-xs-4">
                        <select class="chosen-select form-control"   data-placeholder="请选择团组类别"  onchange="selecttzjb(this)" >
                            <option value=""> 请选择 </option>
                            <option value="2018010009">因公出国(赴港澳)行政类出访</option>
                            <option value="2018020009">因公出国(赴港澳)学术交流合作</option>
                            <option value="2018030009">因公出国(境)教学科研人员出国学术交流合作</option>
                            <option value="2018040009">因公赴台</option>
                        </select>
                    </div>


                </div>


                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 计划类型: </label>
                    <div class="col-xs-4">
                        <select class="chosen-select form-control"   data-placeholder="请选择计划类型"  >
                            <option value=""> 请选择 </option>
                            <option value="01">计划控制（行政类）</option>
                            <option value="02">计划单列（行政类）</option>
                            <option value="03">学术类</option>
                            <option value="99">不涉及</option>
                        </select>
                    </div>
                    <label class="col-xs-2 control-label " > 出访单位: </label>

                    <div class="col-xs-4">
                        <input type="text"  name="username" readonly="readonly"   value="中国医科大学" class="col-xs-12" />
                    </div>

                </div>



                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 团组级别: </label>
                    <div class="col-xs-4">
                        <select class="chosen-select form-control"   data-placeholder="请选择团组级别"  >
                            <option value="01">正厅级</option>
                            <option value="02">副厅级</option>
                            <option value="03">处级</option>
                            <option value="04">处级以下</option>
                            <option value="99">其他</option>

                        </select>
                    </div>
                    <label class="col-xs-2 control-label " > 自主或参加双跨: </label>
                    <div class="col-xs-4">
                        <select class="chosen-select form-control"   data-placeholder="请选择"  >
                            <option value="01">自主</option>
                            <option value="02">双跨</option>
                            <option value="99">其他</option>
                        </select>
                    </div>
                </div>

                <div class="form-group lx1">
                    <label class="col-xs-2 control-label "  > 团组负责人姓名: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " id="" value="" type="text"   />
                    </div>

                    <label class="col-xs-2 control-label "  > 行政职务: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " id="" value="" type="text"   />
                    </div>

                </div>
                <div class="form-group lx1">
                    <label class="col-xs-2 control-label "  > 行政级别: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " id="" value="" type="text"   />
                    </div>

                    <label class="col-xs-2 control-label "  > 技术职务: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " id="" value="" type="text"   />
                    </div>

                </div>

                <div class="form-group lx2">
                    <label class="col-xs-2 control-label "  > 团组负责人姓名: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " id="" value="张三" type="text"   />
                    </div>

                    <label class="col-xs-2 control-label "  > 职务: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " id="" value="职务" type="text"   />
                    </div>

                </div>
                <div class="form-group lx2">
                    <label class="col-xs-2 control-label "  > 职级: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " id="" value="职级" type="text"   />
                    </div>

                    <label class="col-xs-2 control-label "  > 分管工作: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " id="" value="分管工作" type="text"   />
                    </div>

                </div>


                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 团组人数: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " id="" value="10" type="text"   />
                    </div>
                    <label class="col-xs-2 control-label "  > 拟出访国家或地区: </label>
                    <div class="col-xs-4">
                        <select class="chosen-select form-control"   data-placeholder="请选择团组级别" multiple="multiple"  >
                            <option value="01">瑞典</option>
                            <option value="02">新西兰</option>
                            <option value="03">纽约</option>
                            <option value="04">日本</option>
                            <option value="99">俄罗斯</option>

                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 出访任务: </label>
                    <div class="col-xs-10">
                        <input class="form-control " id="" value="出访任务" type="text"  />
                    </div>

                </div>


                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 出访时间: </label>
                    <div class="col-xs-4">
                        <input class="form-control" id="" value="" type="text"  />
                    </div>
                    <label class="col-xs-2 control-label "  > 出访天数: </label>
                    <div class="col-xs-4">
                        <input class="form-control" id="" value="" type="text"  />
                    </div>

                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 省本级部门预算: </label>
                    <div class="col-xs-4">
                        <input class="form-control" id="" value="" type="text"  />
                    </div>
                    <label class="col-xs-2 control-label "  > 其他预算: </label>
                    <div class="col-xs-4">
                        <input class="form-control" id="" value="" type="text"  />
                    </div>

                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 任务批件文号: </label>
                    <div class="col-xs-4">
                        <input class="form-control" id="" value="" type="text"  />
                    </div>

                    <label class="col-xs-2 control-label "  > 任务批复时间: </label>
                    <div class="col-xs-4">
                        <input class="form-control date-picker" id="id-date-picker-1" value="2018-09-15" type="text" data-date-format="yyyy-mm-dd" />

                    </div>

                </div>



                <div class="col-md-offset-3 col-md-9">
                    <button class="btn btn-info btn-sm" type="button">
                        <i class="ace-icon fa fa-check bigger-110"></i>
                        暂存
                    </button>

                    &nbsp; &nbsp; &nbsp;


                    <button class="btn btn-danger btn-sm" type="button">
                        <i class="ace-icon fa fa-check bigger-110"></i>
                        提交
                    </button>


                </div>

            </form>

        </div>
        <div id="messages" class="tab-pane fade in active" style="display: none;">
            <table id="grid-table" ></table>
        </div>
    </div>



    <script src='assets/js/jquery.js'></script>

    <script src="assets/js/bootstrap.js"></script>
    <script src="assets/js/chosen.jquery.js"></script>
    <script src="assets/js/date-time/bootstrap-datepicker.js"></script>
    <script src="assets/js/typeahead.jquery.js"></script>
    <script src="assets/js/ace/elements.typeahead.js"></script>

    <script src="assets/js/layer/layer.js"></script>
    <script src="assets/project/js/common-script.js"></script>
    <script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
    <script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>
    <!-- ace scripts -->


    <script>



        $(function(){
            initStus();
            $("#tzcyinfo").click(function(){
                $("#messages").show();
            })

            //日期选择器
            $('.date-picker').datepicker({
                autoclose: true,
                todayHighlight: true
            });

            var names  = ["美国","英国1","英国2","英国3","英国4","英国5","英国6","英国7","英国8"];


            var substringMatcher = function(strs) {
                return function findMatches(q, cb) {
                    var matches, substringRegex;

                    // an array that will be populated with substring matches
                    matches = [];

                    // regex used to determine if a string contains the substring `q`
                    substrRegex = new RegExp(q, 'i');

                    // iterate through the pool of strings and for any string that
                    // contains the substring `q`, add it to the `matches` array
                    $.each(strs, function(i, str) {
                        if (substrRegex.test(str)) {
                            // the typeahead jQuery plugin expects suggestions to a
                            // JavaScript object, refer to typeahead docs for more info
                            matches.push({ value: str });
                        }
                    });

                    cb(matches);
                }
            }


            //选择录入框
            $('input.typeahead').typeahead({
                hint: true,
                highlight: true,
                minLength: 1
            }, {
                name: 'states',
                displayKey: 'value',
                source: substringMatcher(names),
                limit: 10
            });



            $('.chosen-select').chosen({allow_single_deselect:true});




            $(".lx2").hide();

        });


        //选择团组类别决定团组号
        function selecttzjb(select){
            var lb = $(select).val();

            $("#tzh").val(lb);
            if(lb == '2018010009' || lb == '2018020009'){

                $(".lx1").show();
                $(".lx2").hide();
            }else{
                $(".lx1").hide();
                $(".lx2").show();
            }
        }



        function initStus(){
            var grid_data =
                [
                    {id:"1",	name:"张三",yx:"临床医学",	zy:"麻醉学"},
                    {id:"2",	name:"李四",yx:"护理医学院",	zy:"护师"},
                    {id:"3",	name:"王五",yx:"妇产",	zy:"妇产学"},
                    {id:"4",	name:"赵六",yx:"临床医学",	zy:"眼耳鼻喉"},
                ];

            var grid_selector = "#grid-table";


            var settings = {
                caption: "团组成员信息(☆此处信息应该是每行 多个文本框  可以添加行，删除行)",
                data: grid_data,
                colNames:['二级单位名称','职务级别', '级别',"删除"],
                navBtns:[],//自定义按钮
                pager:"",
                colModel:[
                    {name:'name',index:'name',  },
                    {name:'yx',index:'yx',  },
                    {name:'zy',index:'zy',  },

                    {name:'id',index:'', fixed:true, sortable:false, resize:true,
                        formatter:function(cellvalue, options, rowObject){
                            return "<button class='btn btn-danger btn-mini' onclick='delUser("+cellvalue+")' title='删除' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
                        }
                    },
                ]
            }


            //渲染jqGrid表格 ,包括渲染 分页信息
            $(grid_selector).tables(settings);
        }


    </script>
</body>
</html>
