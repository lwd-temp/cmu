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
            <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> 已申报通过的交流项目名称: </label>

            <div class="col-sm-5">
                <input type="text" id="form-field-1" placeholder="已申报通过的交流项目名称" class="col-xs-12" />
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
            {id:"1",	xmzm:"项目总名1",kssj:"2017-02-01",	jssj:"2018-12-08",	cc:"本科", zt:"暂存",  jfly:'2017-01-01'},
            {id:"2",	xmzm:"项目总名2",kssj:"2017-03-01",	jssj:"2018-11-08",	cc:"硕士", zt:"已初审", jfly:'2016-01-01'},
            {id:"3",	xmzm:"项目总名3",kssj:"2017-04-01",	jssj:"2018-10-08",	cc:"博士", zt:"已复审", jfly:'2015-01-01'},
            {id:"4",	xmzm:"项目总名4",kssj:"2017-05-01",	jssj:"2018-09-08",	cc:"本科", zt:"已通过", jfly:'2014-01-01'},
            {id:"5",	xmzm:"项目总名5",kssj:"2017-06-01",	jssj:"2018-08-08",	cc:"博士", zt:"已通过", jfly:'2013-01-01'},
            {id:"6",	xmzm:"项目总名6",kssj:"2017-07-01",	jssj:"2018-07-08",	cc:"本科", zt:"已通过",  jfly:'2012-01-01'},
            {id:"7",	xmzm:"项目总名7",kssj:"2017-08-01",	jssj:"2018-06-08",	cc:"博士", zt:"已通过", jfly:'2011-01-01'},
            {id:"8",	xmzm:"项目总名8",kssj:"2017-09-01",	jssj:"2018-05-08",	cc:"本科", zt:"已通过", jfly:'2010-01-01'},
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
        var navBtns = [ ]

        var settings = {
            caption: "已申请项目管理",
            /*data: grid_data,*/
            url:'xm/listYsqxm',
            colNames:['项目总名','项目名称','查看总结',"总结"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'xmzm',index:'xmzm',  },
                {name:'xmmc',index:'kssj',  },
                {name:'sqjlId',index:'sqjlId', fixed:true, sortable:false, resize:true,
                    formatter:function(sqjlId, options, rowObject){

                        return "<button class='btn btn-info btn-mini' onclick='ckzj(\""+sqjlId+"\")' title='查看总结' ><i class='ace-icon fa fa-eye '>查看总结</i></button>";

                    }
                },{name:'sqjlId',index:'sqjlId', fixed:true, sortable:false, resize:true,
                    formatter:function(sqjlId, options, rowObject){

                        return "<button class='btn btn-yellow btn-mini' onclick='zj(\""+sqjlId+"\")' title='总结' ><i class='ace-icon fa fa-upload '>总结</i></button>";

                    }
                }
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


    function  zj(sqjlId){
        layer.newpage({
            area: ['400px', "220px"],
            title:'上传总结',
            content:'sys/file/uppage?targetUrl=xm/zj&sqjlId='+sqjlId,
        });
    }

    function ckzj(sqjlId){
        layer.newpage({
            area: ['700px', "520px"],
            title:'查看总结',
            content:'xm/ckzj?sqjlId='+sqjlId,
        });
    }



</script>