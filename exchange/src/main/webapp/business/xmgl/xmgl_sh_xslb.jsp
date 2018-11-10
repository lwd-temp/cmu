<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/13
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://cn.edu.cmu/uitag" prefix="dm" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                                <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> 用户: </label>

                                <div class="col-sm-5">
                                    <input type="text" id="form-field-1" placeholder="请输入用户显示名称或用户名" class="col-xs-12" />
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

                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div>
    </div><!-- /.main-content -->


</div><!-- /.main-container -->


<script src='assets/js/jquery.js'></script>

<script src="assets/js/bootstrap.js"></script>

<script src="assets/js/layer/layer.js"></script>
<script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
<script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>
<!-- ace scripts -->
<script src="assets/js/layer/layer.js"></script>
<script src="assets/project/js/common-script.js"></script>

<script>


    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";

    $(function(){

        initStus();

    });



    function initStus(){



        var settings = {
            caption: "申请学生列表",
            url:'xm/listXmSqxs?xmId=${param["xmid"]}',
            colNames:['学号','姓名','成绩排名','综合测评','初审状态','复审状态',"审核"],
            navBtns:[],//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'xh',index:'xh',  },
                {name:'xm',index:'xm', formatter:function(cellvalue, options, rowObject){
                        if(parseInt(rowObject.id)%3 != 0) {
                            return cellvalue;
                        }
                        return cellvalue+"(<i class='ace-icon fa fa-eye '>已申请"+rowObject.id+"项目</i>)";

                    } },

                {name:'chpm',index:'chpm',  },
                {name:'zhpj',index:'zhpj',  },
                {name:'status',index:'status',formatter:function(status){
                        if(status == '01'){
                            return "申请中";
                        }else if(status == "02"){
                            return "待审核";
                        }else if(status == '03'){
                            return "通过";
                        }else if(status == '04'){
                            return "不通过";
                        }
                    }  },
                {name:'configmStatus',index:'configmStatus', formatter:function(confirmStatus,options, rowObject){
                    var status = rowObject.status;
                    if(!confirmStatus || confirmStatus ==''){
                        if(status == '03'){//已通过初审，但为处理的复审状态 默认显示个
                            return "待学生初审确认";
                        }else{
                            return "无";
                        }
                    }
                    if(confirmStatus == '01'){
                        return "待复审";
                    }else if(confirmStatus = "02"){
                        return "通过";
                    }else if(confirmStatus == '03'){
                        return "不通过";
                    }
                } },

                {name:'sqjlId',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var status = rowObject.status;
                        var confirmStatus = rowObject.confirmStatus;
                        var content = "";
                        if("02" == status){//待初审
                            content += "<button class='btn btn-info btn-mini' onclick='sh_ch(\""+cellvalue+"\")' title='初审' ><i class='ace-icon fa fa-eye '>初审</i></button>";
                        }
                        if('01' == confirmStatus){
                            content += "<button class='btn btn-danger btn-mini' onclick='sh_fh(\""+cellvalue+"\")' title='复审' ><i class='ace-icon fa fa-street-view '>复审</i></button>";
                        }
                        return content;

                    }
                },
            ]

        }


        //渲染jqGrid表格 ,包括渲染 分页信息
        $(grid_selector).tables(settings);
    }


    function refreshTable(){

        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
           /* postData:{
                'xmmc':$("#condition").val(),//项目名称
                'xmzm':$("#condition").val() //项目总名
            },*/
            page:1
        }).trigger("reloadGrid");
    }

    function sh_ch(sqjlId){
        var index = parent.layer.newpage({
            area: ['1000px', ($(window).height()-10)+'px'],
            title:'【初审】申请',
            content:'xm/toCs?id='+sqjlId,
            success:function(layero, index){
                var fraWinName = layero.find('iframe')[0]['name'];
                //设置打开窗口的回调函数,及调用此函数接受参数
                parent.frames[fraWinName].callback = function(){

                    refreshTable();

                    parent.layer.close(index);

                };
            },
        });
    }


    function sh_fh(sqjlId){
        var index = parent.layer.newpage({
            area: ['1000px', ($(window).height()-10)+'px'],
            title:'【复审】申请',
            content:'xm/toFs?id='+sqjlId,
            success:function(layero, index){
                var fraWinName = layero.find('iframe')[0]['name'];
                //设置打开窗口的回调函数,及调用此函数接受参数
                parent.frames[fraWinName].callback = function(){

                    refreshTable();

                    parent.layer.close(index);

                };
            },
        });
    }



</script>
</body>
</html>
