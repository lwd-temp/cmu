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
            <label class="col-sm-2 control-label no-padding-right" for="form-field-1"> 主请人姓名: </label>

            <div class="col-sm-3">
                <input type="text" id="form-field-1" placeholder="主请人姓名" class="col-xs-12" />
            </div>
            <label class="col-sm-2 control-label no-padding-right" for="form-field-1"> 代表团名称: </label>

            <div class="col-sm-3">
                <input type="text" id="form-field-2" placeholder="代表团名称" class="col-xs-12" />
            </div>

            <div class="col-sm-2">
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

            {id:"1",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"2",	lfmd:"科研合作",    zt:'通过',  zqr:'习近平',tzxm:'普京'},
            {id:"2",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"3",	lfmd:"科研合作",    zt:'退回',  zqr:'习近平',tzxm:'普京'},
            {id:"3",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"4",	lfmd:"学术讲座",  	zt:'通过',zqr:'习近平',tzxm:'普京'},
            {id:"4",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"5",	lfmd:"友好访问",  	zt:'退回',zqr:'习近平',tzxm:'普京'},
            {id:"5",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"6",	lfmd:"学术讲座",  	zt:'通过',zqr:'习近平',tzxm:'普京'},
            {id:"6",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"7",	lfmd:"科研合作",    zt:'退回',  zqr:'习近平',tzxm:'普京'},
            {id:"7",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"8",	lfmd:"学术讲座",  	zt:'暂存',zqr:'习近平',tzxm:'普京'},
            {id:"8",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"9",	lfmd:"科研合作",    zt:'暂存',  zqr:'习近平',tzxm:'普京'},
            {id:"9",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"2",	lfmd:"友好访问",  	zt:'暂存',zqr:'习近平',tzxm:'普京'},
            {id:"10",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"2",	lfmd:"科研合作",    zt:'暂存',  zqr:'习近平',tzxm:'普京'},
            {id:"11",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"3",	lfmd:"科研合作",    zt:'暂存',  zqr:'习近平',tzxm:'普京'},
            {id:"12",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"4",	lfmd:"科研合作",    zt:'通过',  zqr:'习近平',tzxm:'普京'},
            {id:"13",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"5",	lfmd:"科研合作",    zt:'通过',  zqr:'习近平',tzxm:'普京'},
            {id:"14",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"6",	lfmd:"友好访问",  	zt:'暂存',zqr:'习近平',tzxm:'普京'},
            {id:"15",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"7",	lfmd:"学术讲座",  	zt:'暂存',zqr:'习近平',tzxm:'普京'},
            {id:"16",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"8",	lfmd:"科研合作",    zt:'通过',  zqr:'习近平',tzxm:'普京'},
            {id:"17",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"9",	lfmd:"友好访问",  	zt:'通过',	zqr:'习近平',tzxm:'普京'},
            {id:"18",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"11",	lfmd:"科研合作",    zt:'通过',  zqr:'习近平',tzxm:'普京'},
            {id:"19",	dbtxm:"xxx代表团",lfsj:"2018-12-01",	lfrs:"22",	lfmd:"科研合作",    zt:'通过',  zqr:'习近平',tzxm:'普京'},

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
                caption:"申请接待",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['900px', ($(window).height()-20)+"px"],
                        title:'申请接待',
                        content:'business/wblfgl/wbgl_add.jsp',
                    });
                }
            }
        ]
        var settings = {
            caption: "已申请来访接待",
            data: grid_data,
            colNames:['代表团名称','来访时间', '来访人数', '来访目的','团长姓名','主请人姓名','状态',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'dbtxm',index:'dbtxm',  },
                {name:'lfsj',index:'lfsj',  },
                {name:'lfrs',index:'lfrs',  },
                {name:'lfmd',index:'lfmd',  },
                {name:'tzxm',index:'tzxm',  },
                {name:'zqr',index:'zqr',  },
                {name:'zt',index:'zt',  },

                {name:'id',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var zt = rowObject.zt;
                        if(zt == '暂存' || zt == '退回'){
                            return "<button class='btn btn-info btn-mini' title='测试' onclick='editWbgl("+cellvalue+")' ><i class='ace-icon fa fa-pencil '>编辑</i></button>" +
                                "&nbsp;&nbsp;<button class='btn btn-danger btn-mini' onclick='delWbgl("+cellvalue+")' title='测试' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";

                        }else{
                            return "<button class='btn btn-danger btn-mini' onclick='showWbgl("+cellvalue+")' title='测试' ><i class='ace-icon fa fa-eye '>查看</i></button>";
                        }
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

    //修改外宾接待申请
    function editWbgl(userId){
        layer.newpage({
            area: ['900px', ($(window).height()-20)+"px"],
            title:'外宾接待申请编辑',
            content:'business/wblfgl/wbgl_edit.jsp',
        });
    }
    function showWbgl(userId){
        layer.newpage({
            area: ['900px', ($(window).height()-20)+"px"],
            title:'外宾接待申请查看',
            content:'business/wblfgl/wbgl_edit.jsp',
        });
    }

    //删除外宾接待申请
    function delWbgl(userId){
        $(grid_selector).delGridRow(userId);
    }
</script>