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
            <label class="col-sm-2 control-label no-padding-right" for="condition1"> 会议编号: </label>

            <div class="col-sm-3">
                <input type="text" id="condition1" placeholder="请输入会议编号" class="col-xs-12" />
            </div>
            <label class="col-sm-2 control-label no-padding-right" for="condition2"> 主办单位或承办单位: </label>

            <div class="col-sm-3">
                <input type="text" id="condition2" placeholder="请输入主办单位或承办单位" class="col-xs-12" />
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
                caption:"填写会议计划",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['1100px',"750px"],
                        title:'填写会议计划',
                        content:'business/gjhy/gjhy_jh_add.jsp',
                    });
                }
            }
        ]

        var settings = {
            caption: "国际会议计划管理",
            /*data: grid_data,*/
            url:'hyjh/list',
            colNames:["会议编号","会议名称","主办单位","承办单位","举行日期3","地点","经费来源" ,"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'hybh',index:'hybh',  },
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
                        return "<button class='btn btn-info btn-mini' title='修改' onclick='editGjhyJh(\""+jhid+"\")' ><i class='ace-icon fa fa-pencil '>修改</i></button>" +
                            "&nbsp;&nbsp;<button class='btn btn-danger btn-mini' onclick='delGjhyJh(\""+jhid+"\")' title='删除' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
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
                'hybh':$("#condition1").val(),
                'zbdw':$("#condition2").val(),
                'cbdw':$("#condition2").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");

    }

    //修改用户
    function editGjhyJh(jhid){
        layer.newpage({
            area: ['1100px',"750px"],
            title:'修改会议计划',
            content:'hyjh/toEdit?id='+jhid,
        });
    }

    //删除用户
    function delGjhyJh(jhid){
        var index = layer.dconfirm("确认删除?",function(){
            layer.close(index);

            $.ajax('hyjh/delById',{
                data:{id:jhid},
                success:function(res){
                    if(res && res.success){
                        layer.alert("删除成功");
                        refreshTable();
                    }else{
                        layer.alert("删除失败")
                    }
                }
            })
        })
    }
</script>