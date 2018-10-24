<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div >
    <form class="form-horizontal" role="form">
        <!-- #section:elements.form -->
        <div class="form-group">
            <label class="col-sm-2 control-label no-padding-right" for="condition1"> 教师姓名: </label>

            <div class="col-sm-3">
                <input type="text" id="condition1" name="xm"  placeholder="教师姓名" class="col-xs-12" />
            </div>
            <label class="col-sm-2 control-label no-padding-right" for="condition1"> 出访国家: </label>

            <div class="col-sm-3">
                <input type="text" id="condition2" name="cfgj"  placeholder="出访国家" class="col-xs-12" />
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
    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";
    $(function() {
        grid_selector = "#grid-table";
        pager_selector = "#grid-pager";
        var parent_column = $(grid_selector).closest('[class*="col-"]');
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

        var settings = {
            caption: "出国审批",
            url:'cggl/shlist',
            colNames:['姓名','性别', '所属二级单位', '出访国家','状态',"操作"],
            pager:pager_selector,
            colModel:[
                {name:'xm',index:'xm' },
                {name:'xb',index:'xb', formatter:function(xb,options,rowObject){
                        return dmcache.getCode('t_dm_xb',xb);
                    }},
                {name:'ssejdw',index:'ssejdw',  },
                {name:'cfgj',index:'cfgj',  },
                {name:'status',index:'status', formatter:function(status,options,rowObject) {
                        switch (status) {
                            case '01':
                                zt = "暂存";
                                break;
                            case '02':
                                zt = "待审核";
                                break;
                            case '03':
                                zt = "退回";
                                break;
                            case '04':
                                zt = "审核通过";
                                break;
                            case '05':
                                zt = "办结";
                                break;
                        }
                        return zt;
                    }
                },
                {name:'cgid',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        return  "<button class='btn btn-warning btn-mini' title='审核' onclick='shCgsq(\""+cellvalue+"\")'><i class='ace-icon fa fa-eye '>审核</i></button>"+
                            "&nbsp;&nbsp;<button class='btn btn-warning btn-mini' title='归档' onclick='gdCgsq(\""+cellvalue+"\")'><i class='ace-icon fa fa-eye '>归档</i></button>";

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
                'xm':$("#condition1").val(),
                'cfgj':$("#condition2").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }
    function clearTable(){
        $(grid_selector).jqGrid('clearGridData');  //清空表格
    }

    //审核
    function shCgsq(cgid){
        layer.newpage({
            area: ['1000px', ($(window).height()-20)+"px"],
            title:'审核出国申请',
            content:'cggl/sh?id='+cgid,
        });
    }
    //归档
    function gdCgsq(cgid){
        layer.newpage({
            area: ['400px', "220px"],
            title:'上传归档',
            content:'sys/file/uppage?targetUrl=cggl/updateUploadId&cgid='+cgid,
        });
    }
</script>