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
   /* var grid_data =
        [
            {id:"1",	xmzm:"项目总名1",kssj:"2017-02-01",	jssj:"2018-12-08",	cc:"本科",  jfly:'自筹',zt:'正在审核'},
            {id:"2",	xmzm:"项目总名2",kssj:"2017-03-01",	jssj:"2018-11-08",	cc:"硕士",  jfly:'省级财政',zt:'正在审核'},
            {id:"3",	xmzm:"项目总名3",kssj:"2017-04-01",	jssj:"2018-10-08",	cc:"博士",  jfly:'国家级财政',zt:'正在审核'},
            {id:"4",	xmzm:"项目总名4",kssj:"2017-05-01",	jssj:"2018-09-08",	cc:"本科",  jfly:'企业赞助',zt:'正在审核'},
            {id:"5",	xmzm:"项目总名5",kssj:"2017-06-01",	jssj:"2018-08-08",	cc:"博士",  jfly:'省级财政',zt:'已全部审核'},
            {id:"6",	xmzm:"项目总名6",kssj:"2017-07-01",	jssj:"2018-07-08",	cc:"本科", jfly:'企业赞助',zt:'已全部审核'},
            {id:"7",	xmzm:"项目总名7",kssj:"2017-08-01",	jssj:"2018-06-08",	cc:"博士",  jfly:'省级财政',zt:'已全部审核'},
            {id:"8",	xmzm:"项目总名8",kssj:"2017-09-01",	jssj:"2018-05-08",	cc:"本科",  jfly:'企业赞助',zt:'已全部审核'},
        ];*/


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


        var settings = {
            caption: "项目审核",
            /*data: grid_data,*/
            url:'xm/list',
            colNames:['项目编号','项目总名','项目名称','开始时间', '结束时间', '项目层次','操作'/*,'经费来源'*/,/*'状态'*/,/*"操作"*/],
            navBtns:[],//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'xmbh',index:'xmbh',  formatter:function(cellvalue, options, rowObject){
                        var callback = 'javascript:applyXm("'+rowObject.id+'")';
                        var href = "<a href='"+callback+"'  >"+cellvalue+"<a>";
                        //console.info(href);
                        return href;
                    } },
                {name:'xmzm',index:'xmzm',  },
                {name:'xmmc',index:'xmmc', },

                {name:'xmkssj',index:'xmkssj',formatter:function(time){
                        return new Date(time).getYmd("yyyy年MM月dd日")
                    }  },
                {name:'smjssj',index:'smjssj',formatter:function(time){
                        return new Date(time).getYmd("yyyy年MM月dd日")
                    }  },
                {name:'xmcc',index:'xmcc', formatter:function(xmccdm){
                        return dmcache.getCode('T_DM_XMCC',xmccdm);
                    } },

                {name:'xmId',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(xmId, options, rowObject){

                            return "<button class='btn btn-info btn-mini' onclick='shxm(\""+xmId+"\")' title='审核项目' ><i class='ace-icon fa fa-child  '>审核</i></button> &nbsp;" +
                                "<button class='btn btn-info btn-mini' onclick='cwmx(\""+xmId+"\")' title='审核项目' ><i class='ace-icon fa fa-child  '>明细</i></button> " ;


                    }
                }

                /*
               /!* {name:'jfly',index:'jfly',  },*!/
                {name:'zt',index:'zt',  },

                {name:'id',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        if(cellvalue>4){
                            return "<button class='btn btn-info btn-mini' onclick='cwmx("+cellvalue+")' title='审核项目' ><i class='ace-icon fa fa-child  '>生成财务明细</i></button>";
                        }else{
                            return "<button class='btn btn-info btn-mini' onclick='shxm("+cellvalue+")' title='审核项目' ><i class='ace-icon fa fa-child  '>审核</i></button>";
                        }
                    }
                },*/
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
    function shxm(xmid){
        var index = layer.newpage({
            area: ['1000px', ($(window).height()-20)+'px'],
            title:'',
            content:'business/xmgl/xmgl_sh_xslb.jsp?xmid='+xmid,
        });

        //全屏
        layer.full(index);
    }

    function cwmx(xmid){

        var index = layer.newpage({
            area: ['800px', '600px'],
            title:'财务明细',
            content:'business/xmgl/xmgl_sh_cwmx.jsp?xmid='+xmid,
        });

        //全屏
        layer.full(index);
    }

</script>