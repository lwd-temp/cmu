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

        <!-- shType , xy:学院初审管理， xsc:学生处初审管理-->
        <input type="hidden" id="shType" value="${param.type}"/>
        <!-- #section:elements.form -->
        <div class="form-group">
            <label class="col-sm-4 control-label no-padding-right" for="condition"> 项目总名或者项目名称: </label>

            <div class="col-sm-5">
                <input type="text" id="condition" placeholder="请输入项目总名或者项目名称" class="col-xs-12" />
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
        var title = "";
        if($("#shType").val() == 'xy'){
            title = "学院审核";
        }else{
            title = "学生处审核";
        }

        var settings = {
            caption: "项目初审（"+title+"）",
            /*data: grid_data,*/
            url:'xm/list',
            colNames:['项目编号','项目总名','项目名称','开始时间', '结束时间', '项目层次','操作'/*,'经费来源'*/,/*'状态'*/,/*"操作"*/],
            navBtns:[],//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'xmbh',index:'xmbh', width:'2',  phoneHide:true,formatter:function(cellvalue, options, rowObject){
                        var callback = 'javascript:applyXm("'+rowObject.id+'")';
                        var href = "<a href='"+callback+"'  >"+cellvalue+"<a>";
                        //console.info(href);
                        return href;
                    } },
                {name:'xmzm',index:'xmzm',  width:'3', phoneHide:true},
                {name:'xmmc',index:'xmmc', width:'4', },

                {name:'xmkssj',index:'xmkssj',width:'3', phoneHide:true,formatter:function(time){
                        return new Date(time).getYmd("yyyy年MM月dd日")
                    }  },
                {name:'smjssj',index:'smjssj',width:'3', phoneHide:true,formatter:function(time){
                        return new Date(time).getYmd("yyyy年MM月dd日")
                    }  },
                {name:'xmcc',index:'xmcc', width:'3', phoneHide:true,formatter:function(xmccdm){
                        return dmcache.getCode('T_DM_XMCC',xmccdm);
                    } },

                {name:'xmId',index:'', width:'3',  sortable:false, resize:true,
                    formatter:function(xmId, options, rowObject){

                            return "<button class='btn btn-info btn-mini' onclick='shxm(\""+xmId+"\")' title='审核项目' ><i class='ace-icon fa fa-eye'>审核</i></button> &nbsp;" +
                                "<button class='btn btn-info btn-mini' onclick='cwmx(\""+xmId+"\")' title='明细' ><i class='ace-icon fa fa-child  '>明细</i></button> " ;


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
            refreshTable();
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

    //审核项目
    function shxm(xmid){
        var index = layer.newpage({
            area: ['1000px', ($(window).height()-20)+'px'],
            title:'审核项目',
            content:'business/xmgl/xmgl_sh_xslb.jsp?xmid='+xmid+"&type="+$("#shType").val(),
        });

        //此处全屏，不缩小
        layer.full(index);


    }

    function cwmx(xmid){

        var index = layer.newpage({
            area: ['800px', '600px'],
            title:'财务明细',
            content:'business/xmgl/xmgl_sh_cwmx.jsp?xmid='+xmid,
        });


    }

</script>