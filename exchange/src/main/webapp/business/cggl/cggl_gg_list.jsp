<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div >
    <form class="form-horizontal" role="form">
        <!-- #section:elements.form -->
        <div class="form-group">
            <label class="col-sm-4 control-label no-padding-right" for="condition1"> 出访国家: </label>

            <div class="col-sm-5">
                <input type="text" id="condition1" name="condition"  placeholder="出访国家" class="col-xs-12" />
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
            caption: "已申请出国流程",
            url:'cgglgg/list',
            colNames:['姓名','性别', '所属二级单位', '所属二级单位名称','出访国家','状态',"操作"],
            pager:pager_selector,
            colModel:[
                {name:'tzxm',index:'tzxm' },
                {name:'xb',index:'xb', formatter:function(xb,options,rowObject){
                        return dmcache.getCode('t_dm_xb',xb);
                    }},
                {name:'ssejdw',index:'ssejdw', hidden:true },
                {name:'ssejdwmc',index:'ssejdwmc', formatter:function(xb,options,rowObject){
                        return '名称';
                    }},
                {name:'cfgjdq',index:'cfgjdq',  },
                {name:'status',index:'status', formatter:function(status,options,rowObject) {
                        var zt = "审核通过";
                        switch (status) {
                            case '01':
                                zt = '暂存';
                                break;
                            case '02':
                                zt = '已通过';
                                break;
                        }
                        return zt;
                    }
                },
                {name:'rwfkId',index:'rwfkId', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var zt = rowObject.status;
                        return  "<button class='btn btn-info btn-mini' title='反馈' onclick='fkCgsq(\""+cellvalue+"\")'><i class='ace-icon fa fa-pencil '>反馈</i></button>"+
                            "<button class='btn btn-danger btn-mini' title='上传总结'  onclick='sczjCgsq(\""+cellvalue+"\")'><i class='ace-icon fa fa-trash-o '>上传总结</i></button>";
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
                'cfgjdq':$("#condition1").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }
    function clearTable(){
        $(grid_selector).jqGrid('clearGridData');  //清空表格
    }
    function fkCgsq(rwfkid){
        layer.newpage({
            area: ['1000px', ($(window).height()-20)+"px"],
            title:'编辑出国反馈',
            content:'cgglgg/toEdit?rwfkid='+rwfkid,
        });
    }
    function sczjCgsq(rwfkid){

        layer.newpage({
            area: ['400px', "220px"],
            title:'上传总结',
            content:'sys/file/uppage?targetUrl=cgglgg/updateUploadId&rwfkid='+rwfkid,
        });
    }


</script>