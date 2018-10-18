<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/15
  Time: 14:58
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
    <link rel="stylesheet" href="assets/css/jquery-ui.css" />
    <link rel="stylesheet" href="assets/css/ui.jqgrid.css" />


    <!-- text fonts -->
    <link rel="stylesheet" href="assets/css/ace-fonts.css" />

    <!-- ace styles -->
    <link rel="stylesheet" href="assets/css/ace.css" class="ace-main-stylesheet" id="main-ace-style" />

    <!-- inline styles related to this page -->

    <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

    <!--[if lte IE 8]>
    <script src="assets/js/html5shiv.js"></script>
    <script src="assets/js/respond.js"></script>
    <![endif]-->

    <!--[if !IE]> -->
    <script type="text/javascript">
        window.jQuery || document.write("<script src='assets/js/jquery.js'>"+"<"+"/script>");
    </script>


    <!-- <![endif]-->

    <!--[if IE]>
    <script type="text/javascript">
        window.jQuery || document.write("<script src='assets/js/jquery1x.js'>"+"<"+"/script>");
    </script>
    <![endif]-->


    <script src="assets/js/layer/layer.js"></script>
    <!-- 自定义脚本...-->
    <script src="assets/project/js/common-script.js"></script>

    <script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
    <script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>

</head>

<body class="no-skin">
<input type="hidden" name="" id="gh" value="${param['gh']}" />
<div >
    <form class="form-horizontal" role="form">
        <!-- #section:elements.form -->
        <div class="form-group">

            <div class="col-sm-2">

            </div>
            <div class="col-sm-10">
                <button class="btn btn-info btn-xs" id="grant" type="button"> <i class="ace-icon fa fa-search "></i>
                    授权
                </button>
            </div>
        </div>

    </form>
    <div id="grid-pager"></div>

    <table id="grid-table"></table>

</div>

<script src="assets/js/bootstrap.js"></script>

<!-- page specific plugin scripts -->
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>
<script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
<script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>

<!-- ace scripts -->
<script src="assets/js/ace/elements.scroller.js"></script>

<script src="assets/js/ace/elements.aside.js"></script>
<script src="assets/js/ace/ace.js"></script>

<!-- inline scripts related to this page -->
<script type="text/javascript">


    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";

    $(function() {

        var parent_column = $(grid_selector).closest('[class*="col-"]');
        //resize to fit page size
        $(window).on('resize.jqGrid', function () {
            $(grid_selector).jqGrid( 'setGridWidth', parent_column.width() );
        })

        //侧边栏发生变化时重新设置宽度
        $(document).on('settings.ace.jqGrid' , function(ev, event_name, collapsed) {
            if( event_name === 'sidebar_collapsed' || event_name === 'main_container_fixed' ) {
                //setTimeout is for webkit only to give time for DOM changes and then redraw!!!
                setTimeout(function() {
                    $(grid_selector).jqGrid( 'setGridWidth', parent_column.width() );
                }, 0);
            }
        })

        //自定义 按钮
        var navBtns = [];

        var settings = {
            caption: "用户角色4",
            url:'sys/role/list?rows=999999999',
            colNames:['ID','角色名称', '创建时间',],
            navBtns:navBtns,//自定义按钮
            rowNum:null,
            rowList:null,

            colModel:[
                {name:'roleId',index:'roleId', key: true ,hidden:true },
                {name:'roleName',index:'roleName',  },
                {name:'createTime',index:'createTime', formatter:function(time){
                        return new Date(time).getYmd("yyyy年MM月dd日")

                 } }
            ],
            loadComplete:function(){

                $.ajax('sys/role/listUserRoles?userId='+$("#gh").val(),{
                    success:function(datas){
                        if(datas && datas.length>0){
                            $(datas).each(function(index,ele){
                                $(grid_selector).jqGrid('setSelection',ele,false);
                            })
                        }
                    }
                })
            }
        }

        //渲染jqGrid表格 ,包括渲染 分页信息
        $(grid_selector).tables(settings);



        //查询按钮添加事件
        $("#grant").click(function(){
            grantUser();
        });

    });


    function grantUser(roleId){


        var roleIds = $(grid_selector).jqGrid('getGridParam','selarrrow');

        $.ajax('sys/power/grantUser',{
            data:{
                'userId':$("#gh").val(),
                'roleIds':roleIds
            },
            success:function(data){
                if(data && data.success){

                    var index = parent.layer.getFrameIndex(window.name);
                    parent.layer.close(index);
                    parent.layer.alert("授权成功....")
                }
            }

        });
    }

</script>
</body>
</html>