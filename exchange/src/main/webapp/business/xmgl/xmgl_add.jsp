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
                        <form class="form-horizontal" role="form">
                            <!-- #section:elements.form -->
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目类型: </label>

                                <div class="col-xs-4">
                                    <select class="chosen-select form-control"   data-placeholder="请选择项目类型">
                                        <option value="">  </option>
                                        <option value="AL">Alabama</option>
                                        <option value="AK">Alaska</option>
                                        <option value="AZ">Arizona</option>
                                        <option value="AR">Arkansas</option>
                                        <option value="CA">California</option>
                                    </select>
                                </div>
                                <label class="col-xs-2 control-label " > 项目编号: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"   placeholder="请输入教职工姓名"  class="col-xs-12" />
                                </div>


                            </div>


                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目名称: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"   placeholder="请输入教职工姓名"  class="col-xs-12" />
                                </div>
                                <label class="col-xs-2 control-label " > 项目总名: </label>

                                <div class="col-xs-4">
                                    <input type="text"  name="username"   placeholder="请输入教职工姓名"  class="col-xs-12" />
                                </div>

                            </div>



                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目开始时间: </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" id="id-date-picker-1" value="2018-09-15" type="text" data-date-format="yyyy-mm-dd" />
                                </div>
                                <label class="col-xs-2 control-label " > 项目结束时间: </label>

                                <div class="col-xs-4">
                                    <input class="form-control date-picker" id="id-date-picker-2"value="2018-11-15"   type="text" data-date-format="yyyy-mm-dd" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目层次: </label>
                                <div class="col-xs-4">
                                    <select class="chosen-select form-control"   data-placeholder="请选择项目层次" onchange="cccccccc(this)">
                                        <option value=""> 请选择 </option>
                                        <option value="1">学校项目</option>
                                        <option value="2">院系项目</option>
                                        <option value="3">个人项目</option>
                                    </select>
                                </div>
                                <label class="col-xs-2 control-label "  > 经费来源: </label>
                                <div class="col-xs-4">
                                    <select class="chosen-select form-control"   placeholder="请选择经费来源">
                                        <option value=""> 请选择 </option>
                                        <option value="AL">经费来源1</option>
                                        <option value="AK">经费来源2</option>
                                        <option value="AZ">经费来源3</option>
                                    </select>
                                </div>

                            </div>


                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 资助金额: </label>
                                <div class="col-xs-4">
                                    <input class="form-control  " id="" value="100/3000/8000" type="text"   />
                                </div>
                                <label class="col-xs-2 control-label "  > 交流目标机构名称: </label>
                                <div class="col-xs-4">
                                        <input class="form-control typeahead scrollable" type="text" placeholder="交流目标机构名称,如'国'" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 交流目标国家或地区: </label>
                                <div class="col-xs-4">
                                    <input class="form-control " id="" value="英国/美国/日本" type="text"  />
                                </div>
                                <label class="col-xs-2 control-label "  > 项目收费标准: </label>
                                <div class="col-xs-4">
                                        <input class="form-control" style="display: inline;width: 55%;" type="text" placeholder="" /> &nbsp;&nbsp;&nbsp;人民币元/人
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目收费说明: </label>
                                <div class="col-xs-10">
                                    <input class="col-xs-11 col-sm-11" id="" value="" type="text"  />
                                </div>

                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 计划人数: </label>
                                <div class="col-xs-4">
                                    <input class="form-control" id="" value="" type="text"  />
                                </div>
                                <label class="col-xs-2 control-label "  > 项目年级限制: </label>
                                <div class="col-xs-4">
                                    <select class="form-control chosen-select" id="njxz" data-placeholder="请选择年级" multiple="multiple">
                                        <option value="2014" selected>2014</option>
                                        <option value="2015" selected>2015</option>
                                        <option value="2016" selected>2016</option>
                                        <option value="2017">2017</option>
                                        <option value="2018">2018</option>
                                        <option value="2019" selected>2019</option>

                                    </select>
                                </div>

                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目专业限制: </label>
                                <div class="col-xs-4">
                                    <select class="form-control chosen-select" id="njxz" data-placeholder="请选择专业" multiple="multiple">
                                        <option value="2014" >临床医学</option>
                                        <option value="2015" >影像学</option>
                                        <option value="2016" >检验学</option>
                                    </select>
                                </div>
                                <label class="col-xs-2 control-label "  > 语言要求: </label>
                                <div class="col-xs-4">
                                    <select class="form-control chosen-select" id="njxz" data-placeholder="请选择语言" multiple="multiple">
                                        <option value="2014" >英语</option>
                                        <option value="2015" >俄语</option>
                                        <option value="2016" >法语</option>
                                    </select>
                                </div>

                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目概况: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" id="form-field-10" maxlength="300"></textarea>
                                </div>

                            </div> <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目资助计划: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" id="form-field-11" maxlength="300"></textarea>
                                </div>

                            </div>
                            <div class="form-group"  style="display: none;padding: 0px 80px 0px 0px;" id="grid-table-div">

                                <div class="col-xs-12" style="margin: 0px 80px 0px 50px;">

                                    <table id="grid-table"></table>

                                </div>



                            </div>


                            <div class="col-md-offset-3 col-md-9">
                                <button class="btn btn-info btn-sm" type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
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


<script>



    $(function(){


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

        initStus();

    });


    //选择层次
    function cccccccc(select){
        if($(select).val() == 3){
            $("#grid-table-div").show()
        }else{
            $("#grid-table-div").hide()
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
            caption: "学生列表（个人项目时--选择学生信息）",
            data: grid_data,
            colNames:['学生姓名','院系', '专业',"删除"],
            navBtns:[],//自定义按钮
            pager_selector:"",
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
