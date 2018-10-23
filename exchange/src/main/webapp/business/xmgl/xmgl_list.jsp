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
           /* data: grid_data,*/
            url:'xm/list',
            colNames:['项目名称','开始时间', '结束时间', '层次','经费来源',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'xmmc',index:'xmmc',  },
                {name:'xmkssj',index:'xmkssj', formatter:function( time){
                    return new Date(time).getYmd("yyyy年MM月dd日")
                    } },
                {name:'smjssj',index:'smjssj', formatter:function( time){
                        return new Date(time).getYmd("yyyy年MM月dd日")
                    }   },
                {name:'xmcc',index:'xmcc',formatter:function(xmccdm){
                        return dmcache.getCode('T_DM_XMCC',xmccdm);
                    }  },
                {name:'jfly',index:'jfly', formatter:function(jfly){
                        return dmcache.getCode('T_DM_JFLY',jfly);
                    }  },

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
            postData:{
                'xmmc':$("#condition").val(),//项目名称
                'xmzm':$("#condition").val() //项目总名
            },
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