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
        var navBtns = []

        var settings = {
            caption: "项目管理",
            /* data: grid_data,*/
            url:'xm/listSqXm',
            colNames:['项目编号','项目总名','项目名称','开始时间', '结束时间', '项目层次','申报状态',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'xmbh',index:'xmbh',  },
                {name:'xmzm',index:'xmzm',  },
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



                {name:'sqStatus',index:'sqStatus', formatter:function(sqStatus){
                        var txzt = "";
                        if("01" == sqStatus){
                            txzt = "暂存";
                        }else if ("02" == sqStatus){
                            txzt = "提交待审批";
                        }else if ("03" == sqStatus){
                            txzt = "待复审";
                        }else if ("04" == sqStatus){
                            txzt = "复审通过";
                        }else if ("05" == sqStatus){
                            txzt = "审核不通过";
                        }else{
                            txzt = "未申报";

                        }
                        return txzt;

                    } },
                {name:'sqjlId',index:'sqjlId', fixed:true, sortable:false, resize:true,
                    formatter:function(sqjlId, options, rowObject){
                        var sqStatus = rowObject.sqStatus;
                        var xmId = rowObject.xmId;
                        var content = "";
                        if("01" == sqStatus){
                            content += "<button class='btn btn-info btn-mini' title='编辑' onclick='editXmSb(\""+sqjlId+"\")' ><i class='ace-icon fa fa-pencil '>修改申报</i></button>" ;
                        }else if ("02" == sqStatus){

                        }else if ("03" == sqStatus){

                        }else if ("04" == sqStatus){

                        }else if ("05" == sqStatus){

                        }else{
                            content += "<button class='btn btn-info btn-mini' title='申报' onclick='addXmSb(\""+xmId+"\")' ><i class='ace-icon fa fa-pencil '>申报</i></button>" ;
                        }

                        return content;
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
                'xmmc':$("#condition").val(),//项目名称
                'xmzm':$("#condition").val() //项目总名
            },
            page:1
        }).trigger("reloadGrid");
    }

    //修改用户
    function editXmSb(sbid){

        layer.newpage({
            area: ['1000px', ($(window).height()-20)+'px'],
            title:'申报项目',
            content:'xm/toSbEdit?id='+sbid,
        });
    }

    /**
     * 添加申报
     */
    function addXmSb(xmid){
        layer.newpage({
            area: ['1000px', ($(window).height()-20)+'px'],
            title:'申报项目',
            content:'xm/toSbAdd?id='+xmid,
        });
    }


</script>