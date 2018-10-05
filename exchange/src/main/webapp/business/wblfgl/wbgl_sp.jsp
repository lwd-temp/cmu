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
                基本信息
            </a>
        </li>

        <li>
            <a data-toggle="tab" id="tzcyinfo" href="#messages">
                随行成员信息

            </a>
        </li>



    </ul>

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">
            <form class="form-horizontal" role="form">
                <!-- #section:elements.form -->
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 代表团名称: </label>

                    <div class="col-xs-4">
                       <input type="text" readonly="readonly"  name="tzh"  value="代表团名称:"  placeholder="20180100001"  class="col-xs-12" />
                    </div>
                    
                    <label class="col-xs-2 control-label " > 来访人数: </label>
                    <div class="col-xs-4">
                       <input type="text" readonly="readonly"  name="tzh"  value="代表团名称:"  p   placeholder="20180100001"  class="col-xs-12" />
                    </div>
                </div>


                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 来访时间: </label>
                    <div class="col-xs-4">
                        <input class="form-control date-picker" readonly="readonly" id="" value="2018-09-15" type="text" data-date-format="yyyy-mm-dd" />
                    </div>
                    <label class="col-xs-2 control-label " > 停留时间: </label>

                    <div class="col-xs-4">
                        <input class="form-control date-picker" readonly="readonly" id="" value="2018-09-15" type="text" data-date-format="yyyy-mm-dd" />
                    </div>

                </div>

                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 国家: </label>
                    <div class="col-xs-4">
                        <select readonly="readonly" class="chosen-select form-control"   data-placeholder="请选择国家"  multiple="multiple" >
                            <option value="01" selected>中国</option>
                            <option value="02">新家坡</option>
                            <option value="03">日本</option>
                            <option value="04">英国</option>

                        </select>
                    </div>
                    <label class="col-xs-2 control-label " > 来访目的: </label>
                    <div class="col-xs-4">
                        <select readonly="readonly" class="chosen-select form-control"   data-placeholder="请选择来访目的"   onchange="changeMuDi(this)">
                            <option value="01" selected>友好访问</option>
                            <option value="02">科研合作</option>
                            <option value="03">学术讲座</option>
                            <option value="04">荣誉职称</option>
                            <option value="99">其他</option>
                        </select>
                    </div>
                </div>
                <div class="form-group qtmd" style="display:none;">
                    <label class="col-xs-2 control-label "  > 其他目的: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " readonly="readonly" id="" value="" type="text"   />
                    </div>
                </div>
                <div class="form-group yjtm" style="display: none;">
                    <label class="col-xs-2 control-label "  > 演讲题目: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " readonly="readonly" id="" value="" type="text"   />
                    </div>
                </div>
                <div class="form-group "  >
                    <label class="col-xs-2 control-label "  > 邀请信息: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " readonly="readonly" id="" value="邀请信息" type="text"   />
                    </div>
                </div>
                <div class="form-group lx1">
                    <label class="col-xs-2 control-label "  > 经费来源: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " readonly="readonly" id="" value="经费来源" type="text"   />
                    </div>

                    <label class="col-xs-2 control-label "  > 礼品及数量: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " readonly="readonly" id="" value="礼品及数量" type="text"   />
                    </div>
                </div>

                <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 情况记录: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " readonly="readonly" id="" value="情况记录" type="text"   />
                    </div>
                </div>
                <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 访问成果: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " readonly="readonly" id="" value="访问成果" type="text"   />
                    </div>
                </div>
                <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 团长姓名: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " readonly="readonly" id="" value="团长姓名" type="text"   />
                    </div>

                    <label class="col-xs-2 control-label "  > 团长国籍: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " readonly="readonly" id="" value="团长国籍" type="text"   />
                    </div>
                </div> <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 团长性别: </label>
                    <div class="col-xs-4">
                        <input name="form-field-radio"    type="radio" class="ace"  checked/>  <span class="lbl"> 男</span>
                        <input name="form-field-radio"   type="radio"  class="ace" />  <span class="lbl"> 女</span>
                    </div>

                    <label class="col-xs-2 control-label "  > 团长出生日期: </label>
                    <div class="col-xs-4">
                        <input class="form-control date-picker" readonly="readonly" id="id-date-picker-61" value="2018-09-15" type="text" data-date-format="yyyy-mm-dd" />
                    </div>
                </div> <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 团长工作单位: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " readonly="readonly" id="" value="团长工作单位" type="text"   />
                    </div>

                    <label class="col-xs-2 control-label "  > 团长职称及职务: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " readonly="readonly" id="" value="团长职称及职务" type="text"   />
                    </div>
                </div> <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 专业及学术领域: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " readonly="readonly" id="" value="专业及学术领域" type="text"   />
                    </div>
<%--
                    <label class="col-xs-2 control-label "  > 学术领域: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " readonly="readonly" id="" value="学术领域" type="text"   />
                    </div>--%>
                </div> <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 主请人姓名: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " readonly="readonly" id="" value="主请人姓名" type="text"   />
                    </div>

                    <label class="col-xs-2 control-label "  > 主请人电话: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " readonly="readonly" id="" value="主请人电话" type="text"   />
                    </div>
                </div> <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 主请联系人姓名: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " readonly="readonly" id="" value="主请联系人姓名" type="text"   />
                    </div>

                    <label class="col-xs-2 control-label "  > 主请联系人电话: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " readonly="readonly" id="" value="主请联系人电话" type="text"   />
                    </div>
                </div>
                <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 接待部门: </label>
                    <div class="col-xs-4">
                        <select readonly="readonly" class="chosen-select form-control"   data-placeholder="请选择接待部门"    >
                            <option value="01" selectede>部门1</option>
                            <option value="02">部门2</option>
                            <option value="03">部门3</option>
                            <option value="04">部门4</option>
                            <option value="99">部门5</option>
                        </select>
                    </div>

                    <label class="col-xs-2 control-label "  > 接待类型: </label>
                    <div class="col-xs-4">
                        <select readonly="readonly" class="chosen-select form-control"   data-placeholder="请选接待类型"    >
                            <option value="01">校级接待</option>
                            <option value="02" selected>院级接待</option>
                        </select>
                    </div>
                </div>




                <div class="col-md-offset-3 col-md-9">
                    <button class="btn btn-info btn-sm" id="tgSubmit" type="button">
                        <i class="ace-icon fa fa-check bigger-110"></i>
                        通过
                    </button>

                    &nbsp; &nbsp; &nbsp;

                    <button class="btn btn-danger btn-sm" type="button">
                        <i class="ace-icon fa fa-check bigger-110"></i>
                        退回
                    </button>

                    &nbsp; &nbsp; &nbsp;

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
    <script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
    <script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>
    <!-- ace scripts -->


    <script>



        $(function(){

            $("#tgSubmit").click(function(){

               /* parent.layer.confirm("确定审批通过?",function(){
                    alert('confirm...')
                });*/


            })


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



        });

        function changeMuDi(select){
            var md = $(select).val();
            $(".qtmd").hide();
            $(".yjtm").hide();
            if(99 == md){
                $(".qtmd").show();
            }else if('03' == md){
                $(".yjtm").show();
            }

        }

        function initStus(){
            var grid_data =
                [
                    {id:"1",	name:"张三",yx:"中国",	zy:"秘书长"},
                    {id:"2",	name:"李四",yx:"中国",	zy:"住院总"},
                    {id:"3",	name:"王五",yx:"中国",	zy:"产科主任"},
                    {id:"4",	name:"赵六",yx:"中国",	zy:"副主任医师"},
                ];

            var grid_selector = "#grid-table";

            var settings = {
                caption: "随行人员(☆此处信息应该是每行 多个文本框  可以添加行，删除行)",
                data: grid_data,
                colNames:['姓名','国际', '职务',"删除"],
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
