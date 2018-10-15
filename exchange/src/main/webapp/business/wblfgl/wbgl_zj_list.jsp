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
            <label class="col-sm-2 control-label no-padding-right" for="condition1"> 主请人姓名: </label>

            <div class="col-sm-3">
                <input type="text" id="condition1" name="condition" placeholder="主请人姓名" class="col-xs-12" />
            </div>
            <label class="col-sm-2 control-label no-padding-right" for="condition2"> 代表团名称: </label>

            <div class="col-sm-3">
                <input type="text" id="condition2" name="condition" placeholder="代表团名称" class="col-xs-12" />
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
        var navBtns = [ ]
        var settings = {
            caption: "已申请来访接待",
            url:'wbzj/list',
            colNames:['代表团名称','来访时间', '来访人数', '来访目的','团长姓名','主请人姓名','状态',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'dbtmc',index:'dbtmc',  },
                {name:'lfsj',index:'lfsj',formatter:function(lfsj, options, rowObject){
                        return new Date(lfsj).getYmd("yyyy-MM-dd");
                    }},
                {name:'lfrs',index:'lfrs',  },
                {name:'lfmd',index:'lfmd', formatter:function(lfmd,options,rowObject){
                        return dmcache.getCode('t_dm_lfmd',lfmd);
                    }},
                {name:'tzxm',index:'tzxm',  },
                {name:'zqrxm',index:'zqrxm',  },
                {name:'status',index:'status', formatter:function(status,options,rowObject){
                        var zt = "未知";
                        switch (status) {
                            case '04':
                                zt = "未办结";
                                break;
                            case '06':
                                zt = "已办结";
                                break;
                        }
                        return zt;
                    }
                },
                {name:'zjid',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var zt = rowObject.status;
                        if(zt == '04' ){
                            return "<button class='btn btn-info btn-mini' onclick='zjWbgl(\""+cellvalue+"\")' title='总结' ><i class='ace-icon fa fa-pencil '>总结</i></button>"
                            +"&nbsp;&nbsp;<button class='btn btn-info btn-mini' onclick='showWbgl(\""+cellvalue+"\")' title='查看' ><i class='ace-icon fa fa-eye '>查看</i></button>" ;
                        }else{
                            return"<button class='btn btn-info btn-mini' onclick='showWbgl(\""+cellvalue+"\")' title='查看' ><i class='ace-icon fa fa-eye '>查看</i></button>" ;
                        }
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

    function refreshTable(){
        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
            postData:{
                'zqrxm':$("#condition1").val(),
                'dbtmc':$("#condition2").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }
    //总结外宾接待申请
    function zjWbgl(zjid){
        layer.newpage({
            area: ['900px', ($(window).height()-20)+"px"],
            title:'外宾接待申请【总结】',
            content:'wbzj/toEdit?type=zj&zjid='+zjid,
        });
    }
    function showWbgl(zjid){
        layer.newpage({
            area: ['900px', ($(window).height()-20)+"px"],
            title:'查看接待情况【总结】',
            content:'wbzj/toEdit?zjid='+zjid,
        });
    }
</script>