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
            <label class="col-sm-4 control-label no-padding-right" for="condition"> 主办单位或承办单位: </label>

            <div class="col-sm-5">
                <input type="text" id="condition" placeholder="请输入主办单位或承办单位" class="col-xs-12" />
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

</div></div>


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



    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";

    $(function(){

        var settings = {
            caption: "国际会议计划管理",
            /*data: grid_data,*/
            url:'hyjh/list',
            colNames:["会议名称","主办单位","承办单位","举行日期","地点","经费来源" ,"操作"],
            navBtns:[],//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'hymc',index:'hymc',  },
                {name:'zbdw',index:'zbdw',  },
                {name:'cbdw',index:'cbdw',  },
                {name:'jxrq',index:'jxrq',
                    formatter:function(jxrq){
                        return new Date(jxrq).getYmd("yyyy年MM月dd日");
                    }
                },
                {name:'dd',index:'dd',  },
                {name:'jfly',index:'jfly', },

                {name:'jhid',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(jhid, options, rowObject){
                        return   "<button class='btn btn-success btn-mini' onclick='selectedJh(\""+jhid+"\")' title='选择计划申报' ><i class='ace-icon fa fa-plus '>申报</i></button>";
                    }
                },
            ]

        }


        //渲染jqGrid表格 ,包括渲染 分页信息
        $(grid_selector).tables(settings);

        //查询按钮添加事件
        $("#query").click(function(){
            refreshTable();
        });

    });


    function clearTable(){
        $(grid_selector).jqGrid('clearGridData');  //清空表格
    }

    function refreshTable(){

        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
            postData:{
                'zbdw':$("#condition").val(),
                'cbdw':$("#condition").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }


    function selectedJh(jhid){
       // alert("此处根据选择的计划，将会议信息直接填写到申报页面....");

        var index = parent.layer.getFrameIndex(window.name); //获取窗口索引

        parent.layer.close(index);

        parent.layer.newpage({
            area: ['1100px', ($(window).height()-10)+"px"],
            title:'申报会议',
            content:'hysb/jh2sb?id='+jhid,
        });

    }

</script>
</body>
</html>
