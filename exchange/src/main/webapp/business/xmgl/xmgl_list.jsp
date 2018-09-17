<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/10
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div >
    <form class="form-horizontal" role="form">
        <!-- #section:elements.form -->
        <div class="form-group">
            <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> 项目总名或者项目名称: </label>

            <div class="col-sm-5">
                <input type="text" id="form-field-1" placeholder="请输入项目总名或者项目名称" class="col-xs-12" />
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
<script type="text/javascript">
    var $path_base = "..";//in Ace demo this will be used for editurl parameter
</script>

<!-- inline scripts related to this page -->
<script type="text/javascript">
    var grid_data =
        [
            {id:"1",	xmzm:"项目总名1",kssj:"2017-02-01",	jssj:"2018-12-08",	cc:"本科",  jfly:'2017-01-01'},
            {id:"2",	xmzm:"项目总名2",kssj:"2017-03-01",	jssj:"2018-11-08",	cc:"硕士",  jfly:'2016-01-01'},
            {id:"3",	xmzm:"项目总名3",kssj:"2017-04-01",	jssj:"2018-10-08",	cc:"博士",  jfly:'2015-01-01'},
            {id:"4",	xmzm:"项目总名4",kssj:"2017-05-01",	jssj:"2018-09-08",	cc:"本科",  jfly:'2014-01-01'},
            {id:"5",	xmzm:"项目总名5",kssj:"2017-06-01",	jssj:"2018-08-08",	cc:"博士",  jfly:'2013-01-01'},
            {id:"6",	xmzm:"项目总名6",kssj:"2017-07-01",	jssj:"2018-07-08",	cc:"本科",  jfly:'2012-01-01'},
            {id:"7",	xmzm:"项目总名7",kssj:"2017-08-01",	jssj:"2018-06-08",	cc:"博士",  jfly:'2011-01-01'},
            {id:"8",	xmzm:"项目总名8",kssj:"2017-09-01",	jssj:"2018-05-08",	cc:"本科",  jfly:'2010-01-01'},
        ];


    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";


    $(function() {
        grid_selector = "#grid-table";
        pager_selector = "#grid-pager";

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
        var navBtns = [
            {
                caption:"创建项目",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['1000px', '620px'],
                        title:'创建项目',
                        content:'business/xmgl/xmgl_add.jsp',
                    });
                }
            }
        ]

        var settings = {
            caption: "项目管理",
            data: grid_data,
            colNames:['项目名称','开始时间', '结束时间', '层次','经费来源',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'xmzm',index:'xmzm',  },
                {name:'kssj',index:'kssj',  },
                {name:'jssj',index:'jssj',  },
                {name:'cc',index:'cc',  },
                {name:'jfly',index:'jfly',  },

                {name:'id',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        return "<button class='btn btn-info btn-mini' title='测试' onclick='editUser("+cellvalue+")' ><i class='ace-icon fa fa-pencil '>修改</i></button>" +
                            "&nbsp;&nbsp;<button class='btn btn-danger btn-mini' onclick='delUser("+cellvalue+")' title='测试' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
                    }
                },
            ]

        }


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

    //修改用户
    function editXm(xmid){
        layer.newpage({
            area: ['600px', '290px'],
            title:'修改项目',
            content:'business/xmgl/xmgl_edit.jsp',
        });
    }

    //删除用户
    function delXm(xmid){
        $(grid_selector).delGridRow(xmid);
    }
</script>