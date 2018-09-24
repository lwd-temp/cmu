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



            <label class="col-sm-2 control-label no-padding-right" for="form-field-12"> 主办单位或承办单位: </label>

            <div class="col-sm-3">
                <input type="text"   placeholder="请输入主办单位或承办单位" class="col-xs-12" />
            </div>

            <label class="col-sm-2 control-label no-padding-right"  > 会议类型: </label>
            <div class="col-sm-2">
                <input name="form-field-radio"   type="radio"  class="ace" />  <span class="lbl">国际会议</span>
                <input name="form-field-radio"   type="radio"  class="ace"  checked/>  <span class="lbl"> 两国会议</span>
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

            {id:"1",  	hymc:"会议名称1", hylx:'两国会议', hylx:'两国会议',	zbdw:"已执行" , zt:"暂存"	,cbdw:"未总结",	dd:"会议室1",	jxrq:"2019-01-01",  jfly:'自筹'},
            {id:"2",	hymc:"会议名称2", hylx:'两国会议',	zbdw:"已执行", zt:"暂存"     ,cbdw:"已总结",	dd:"会议室2",	jxrq:"2019-02-02",  jfly:'财政拨款'},
            {id:"3",	hymc:"会议名称3", hylx:'两国会议',	zbdw:"已执行", zt:"可修改"     ,cbdw:"已总结",	dd:"会议室3",	jxrq:"2019-03-03",  jfly:'财政拨款'},
            {id:"4",	hymc:"会议名称4", hylx:'国际会议',	zbdw:"已执行", zt:"已提交"     ,cbdw:"已总结",	dd:"会议室4",	jxrq:"2019-04-04",  jfly:'财政拨款'},
            {id:"5",	hymc:"会议名称5", hylx:'两国会议',	zbdw:"未执行", zt:"通过"     ,cbdw:"未总结",	dd:"会议室5",	jxrq:"2019-05-05",  jfly:'财政拨款'},
            {id:"6",	hymc:"会议名称6", hylx:'国际会议',	zbdw:"已执行", zt:"通过"     ,cbdw:"已总结",	dd:"会议室6",	jxrq:"2019-06-06",  jfly:'财政拨款'},
            {id:"7",	hymc:"会议名称7", hylx:'国际会议',	zbdw:"已执行", zt:"通过"     ,cbdw:"未总结",	dd:"会议室7",	jxrq:"2019-07-07",  jfly:'财政拨款'},
            {id:"8",	hymc:"会议名称8", hylx:'两国会议',	zbdw:"已执行", zt:"通过"     ,cbdw:"已总结",	dd:"会议室8",	jxrq:"2019-08-08",  jfly:'省级财政'},
            {id:"9",	hymc:"会议名称9", hylx:'两国会议',	zbdw:"未执行", zt:"通过"     ,cbdw:"未总结",	dd:"会议室9",	jxrq:"2019-09-10",  jfly:'省级财政'},
            {id:"10",	hymc:"会议名称10", hylx:'国际会议',	zbdw:"未执行", zt:"通过"	,cbdw:"未总结",	dd:"会议室10",	jxrq:"2019-10-11",  jfly:'省级财政'},
            {id:"11",	hymc:"会议名称11", hylx:'国际会议',	zbdw:"未执行", zt:"通过"	,cbdw:"未总结",	dd:"会议室11",	jxrq:"2019-11-12",  jfly:'省级财政'},
            {id:"12",	hymc:"会议名称12", hylx:'两国会议',	zbdw:"已执行", zt:"通过"	,cbdw:"未总结",	dd:"会议室12",	jxrq:"2019-12-13",  jfly:'省级财政'},
            {id:"13",	hymc:"会议名称13", hylx:'国际会议',	zbdw:"未执行", zt:"通过"	,cbdw:"未总结",	dd:"会议室13",	jxrq:"2019-13-14",  jfly:'省级财政'},
            {id:"14",	hymc:"会议名称14", hylx:'两国会议',	zbdw:"未执行", zt:"通过"	,cbdw:"未总结",	dd:"会议室14",	jxrq:"2019-14-15",  jfly:'省级财政'},
            {id:"15",	hymc:"会议名称15", hylx:'国际会议',	zbdw:"未执行", zt:"通过"	,cbdw:"未总结",	dd:"会议室15",	jxrq:"2019-15-16",  jfly:'省级财政'},
            {id:"16",	hymc:"会议名称16", hylx:'国际会议',	zbdw:"未执行", zt:"通过"	,cbdw:"未总结",	dd:"会议室16",	jxrq:"2019-16-17",  jfly:'省级财政'},
            {id:"17",	hymc:"会议名称17", hylx:'国际会议',	zbdw:"未执行", zt:"通过"	,cbdw:"未总结",	dd:"会议室17",	jxrq:"2019-17-18",  jfly:'省级财政'},
            {id:"18",	hymc:"会议名称18", hylx:'两国会议',	zbdw:"未执行", zt:"通过"	,cbdw:"未总结",	dd:"会议室18",	jxrq:"2019-18-19",  jfly:'省级财政'}
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
        var navBtns = [];

        var settings = {
            caption: "综合统计查询",
            data: grid_data,
            colNames:["会议编号","会议名称","举行日期","地点","经费来源","会议类型", "是否执行","是否总结"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'id',index:'id',  },
                {name:'hymc',index:'hymc',  },

                {name:'jxrq',index:'jxrq',  },
                {name:'dd',index:'dd',  },
                {name:'jfly',index:'jfly',  },
                {name:'hylx',index:'hylx',  },
                {name:'zbdw',index:'zbdw',  formatter:function(value, options, rowObject){
                    var id = rowObject.id;
                    if(value == '已执行'){//查看申报信息
                        return "<a href='javascript:showSbInfo(\""+id+"\")' >已执行</a>";
                    }else{
                        return value;
                    }

                    } },
                {name:'cbdw',index:'cbdw', formatter:function(value, options, rowObject){

                        var id = rowObject.id;
                        if(value == '已总结'){//查看总结信息
                            return "<a href='javascript:showZjInfo(\""+id+"\")' >已总结</a>";
                        }else{
                            return value;
                        }
                }  },


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


    //查看申报
    function showSbInfo(userId){
        layer.newpage({
            area: ['1100px', ($(window).height()-10)+"px"],
            title:'查看会议申报信息',
            content:'business/gjhy/gjhy_sb_show.jsp',
        });
    }
    //查看总结
    function showZjInfo(userId){
        layer.newpage({
            area: ['1100px', ($(window).height()-10)+"px"],
            title:'查看会议总结信息',
            content:'business/gjhy/gjhy_zj_show.jsp',
        });
    }

</script>