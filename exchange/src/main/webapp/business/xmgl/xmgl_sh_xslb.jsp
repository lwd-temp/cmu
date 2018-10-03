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
<script src="assets/project/js/common-script.js"></script>
<script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
<script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>
<!-- ace scripts -->


<script>



    $(function(){

        initStus();

    });

    function initStus(){
        var grid_data =
            [
                {id:"1",	name:"张三",yx:"临床医学",	zy:"麻醉学"},
                {id:"2",	name:"李四",yx:"护理医学院",	zy:"护师"},
                {id:"3",	name:"王五",yx:"妇产",	zy:"妇产学"},
                {id:"4",	name:"赵六",yx:"临床医学",	zy:"眼耳鼻喉"},
                {id:"6",	name:"赵六1",yx:"临床医学",	zy:"眼耳鼻喉"},
                {id:"7",	name:"赵六2",yx:"临床医学",	zy:"眼耳鼻喉"},
                {id:"8",	name:"赵六3",yx:"临床医学",	zy:"眼耳鼻喉"},
                {id:"9",	name:"赵六4",yx:"临床医学",	zy:"眼耳鼻喉"},
                {id:"10",	name:"赵六5",yx:"临床医学",	zy:"眼耳鼻喉"},
                {id:"11",	name:"赵六6",yx:"临床医学",	zy:"眼耳鼻喉"},
                {id:"12",	name:"赵六7",yx:"临床医学",	zy:"眼耳鼻喉"},
                {id:"13",	name:"赵六8",yx:"临床医学",	zy:"眼耳鼻喉"},
            ];

        var grid_selector = "#grid-table";


        var settings = {
            caption: "申请学生列表",
            data: grid_data,
            colNames:['学生姓名','院系', '专业',"审核"],
            navBtns:[],//自定义按钮
            pager_selector:"",
            colModel:[
                {name:'name',index:'name', formatter:function(cellvalue, options, rowObject){
                        //console.info(parseInt(cellvalue) +"\t"+parseInt(cellvalue)%2)
                        if(parseInt(rowObject.id)%3 != 0) {
                            return cellvalue;
                        }
                        return cellvalue+"(<i class='ace-icon fa fa-eye '>已申请"+rowObject.id+"项目</i>)";

                    } },
                {name:'yx',index:'yx',  },
                {name:'zy',index:'zy',  },

                {name:'id',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        //console.info(parseInt(cellvalue) +"\t"+parseInt(cellvalue)%2)
                        if(parseInt(cellvalue)%2 == 0){
                            return "<button class='btn btn-info btn-mini' onclick='sh_ch("+cellvalue+")' title='删除' ><i class='ace-icon fa fa-eye '>初审</i></button>";
                        }else{
                            return "<button class='btn btn-danger btn-mini' onclick='sh_fh("+cellvalue+")' title='删除' ><i class='ace-icon fa fa-street-view '>复审</i></button>";
                        }
                    }
                },
            ]

        }


        //渲染jqGrid表格 ,包括渲染 分页信息
        $(grid_selector).tables(settings);
    }

    function sh_ch(){
        parent.layer.newpage({
            area: ['800px', '600px'],
            title:'【初审】申请',
            content:'business/xmgl/xmgl_sh_cs.jsp',
        });
    }
    function sh_fh(){
        parent.layer.newpage({
            area: ['800px', '600px'],
            title:'【复审】申请',
            content:'business/xmgl/xmgl_sh_fs.jsp',
        });
    }


</script>
</body>
</html>
