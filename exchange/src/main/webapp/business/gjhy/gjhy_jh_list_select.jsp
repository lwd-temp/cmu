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
<div >
    <form class="form-horizontal" role="form">
        <!-- #section:elements.form -->
        <div class="form-group">
            <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> 主办单位或承办单位: </label>

            <div class="col-sm-5">
                <input type="text" id="form-field-1" placeholder="请输入主办单位或承办单位" class="col-xs-12" />
            </div>

            <div class="col-sm-3">
                <button class="btn btn-info btn-xs" id="query" type="button"> <i class="ace-icon fa fa-search "></i>
                    查询
                </button>
            </div>
        </div>

    </form>
    <div id="grid-pager"></div>

    <table id="grid-table"></table>

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

    var grid_data =
        [

            {id:"1",  	hymc:"会议名称1",	zbdw:"主办单位1"	,cbdw:"承办单位1",	dd:"会议室1",	jxrq:"2019-01-01",  jfly:'自筹'},
            {id:"2",	hymc:"会议名称2",	zbdw:"主办单位2"	,cbdw:"承办单位2",	dd:"会议室2",	jxrq:"2019-02-02",  jfly:'财政拨款'},
            {id:"3",	hymc:"会议名称3",	zbdw:"主办单位3"	,cbdw:"承办单位3",	dd:"会议室3",	jxrq:"2019-03-03",  jfly:'财政拨款'},
            {id:"4",	hymc:"会议名称4",	zbdw:"主办单位4"	,cbdw:"承办单位4",	dd:"会议室4",	jxrq:"2019-04-04",  jfly:'财政拨款'},
            {id:"5",	hymc:"会议名称5",	zbdw:"主办单位5"	,cbdw:"承办单位5",	dd:"会议室5",	jxrq:"2019-05-05",  jfly:'财政拨款'},
            {id:"6",	hymc:"会议名称6",	zbdw:"主办单位6"	,cbdw:"承办单位6",	dd:"会议室6",	jxrq:"2019-06-06",  jfly:'财政拨款'},
            {id:"7",	hymc:"会议名称7",	zbdw:"主办单位7"	,cbdw:"承办单位7",	dd:"会议室7",	jxrq:"2019-07-07",  jfly:'财政拨款'},
            {id:"8",	hymc:"会议名称8",	zbdw:"主办单位8"	,cbdw:"承办单位8",	dd:"会议室8",	jxrq:"2019-08-08",  jfly:'省级财政'},
            {id:"9",	hymc:"会议名称9",	zbdw:"主办单位9"	,cbdw:"承办单位9",	dd:"会议室9",	jxrq:"2019-09-10",  jfly:'省级财政'},
            {id:"10",	hymc:"会议名称10",	zbdw:"主办单位10"	,cbdw:"承办单位10",	dd:"会议室10",	jxrq:"2019-10-11",  jfly:'省级财政'},
            {id:"11",	hymc:"会议名称11",	zbdw:"主办单位11"	,cbdw:"承办单位11",	dd:"会议室11",	jxrq:"2019-11-12",  jfly:'省级财政'},
            {id:"12",	hymc:"会议名称12",	zbdw:"主办单位12"	,cbdw:"承办单位12",	dd:"会议室12",	jxrq:"2019-12-13",  jfly:'省级财政'},
            {id:"13",	hymc:"会议名称13",	zbdw:"主办单位13"	,cbdw:"承办单位13",	dd:"会议室13",	jxrq:"2019-13-14",  jfly:'省级财政'},
            {id:"14",	hymc:"会议名称14",	zbdw:"主办单位14"	,cbdw:"承办单位14",	dd:"会议室14",	jxrq:"2019-14-15",  jfly:'省级财政'},
            {id:"15",	hymc:"会议名称15",	zbdw:"主办单位15"	,cbdw:"承办单位15",	dd:"会议室15",	jxrq:"2019-15-16",  jfly:'省级财政'},
            {id:"16",	hymc:"会议名称16",	zbdw:"主办单位16"	,cbdw:"承办单位16",	dd:"会议室16",	jxrq:"2019-16-17",  jfly:'省级财政'},
            {id:"17",	hymc:"会议名称17",	zbdw:"主办单位17"	,cbdw:"承办单位17",	dd:"会议室17",	jxrq:"2019-17-18",  jfly:'省级财政'},
            {id:"18",	hymc:"会议名称18",	zbdw:"主办单位18"	,cbdw:"承办单位18",	dd:"会议室18",	jxrq:"2019-18-19",  jfly:'省级财政'}
        ];

    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";

    var settings = {
        caption: "国际会议计划管理",
        data: grid_data,
        colNames:["会议名称","主办单位","承办单位","举行日期","地点","经费来源" ,"操作"],
        navBtns:[],//自定义按钮
        pager:pager_selector,
        colModel:[
            {name:'hymc',index:'hymc',  },
            {name:'zbdw',index:'zbdw',  },
            {name:'cbdw',index:'cbdw',  },
            {name:'jxrq',index:'jxrq',  },
            {name:'dd',index:'dd',  },
            {name:'jfly',index:'jfly',  },

            {name:'id',index:'', fixed:true, sortable:false, resize:true,
                formatter:function(id, options, rowObject){
                    return "<button class='btn btn-success btn-mini' onclick='selectedJh()' title='选择计划申报' ><i class='ace-icon fa fa-plus '>申报</i></button>";
                }
            },
        ]

    }

    $(function(){

        //渲染jqGrid表格 ,包括渲染 分页信息
        $(grid_selector).tables(settings);

        //查询按钮添加事件
        $("#query").click(function(){
            layer.msg("点击查询后，根据条件进行查询")
            clearTable(); //清空表格
            setTimeout(function(){
                refreshTable();//刷新页面
            },800);
        });

    });


    function clearTable(){
        $(grid_selector).jqGrid('clearGridData');  //清空表格
    }

    function refreshTable(){

        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
            datatype:'local',
            data : grid_data,   //  newdata 是符合格式要求的需要重新加载的数据
            page:1
        }).trigger("reloadGrid");
    }


    function selectedJh(rowObject){
        alert("此处根据选择的计划，将会议信息直接填写到申报页面....");

        var index = parent.layer.getFrameIndex(window.name); //获取窗口索引

        parent.layer.close(index);

        parent.layer.newpage({
            area: ['1000px', ($(window).height()-10)+"px"],
            title:'申报会议',
            content:'business/gjhy/gjhy_sb_add.jsp',
        });

    }

</script>
</body>
</html>
