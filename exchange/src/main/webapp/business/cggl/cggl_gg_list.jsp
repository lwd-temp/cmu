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
                {name:'xm',index:'xm' ,width:'15%'},
                {name:'xb',index:'xb',  width:'15%',  formatter:function(xb,options,rowObject){
                        return dmcache.getCode('t_dm_xb',xb);
                    }},
                {name:'ssejdw',index:'ssejdw', hidden:true },
                {name:'ssejdwmc',index:'ssejdwmc' ,width:'20%' },
                {name:'cfgj',index:'cfgj',width:'15%' },
                {name:'writed',index:'writed',width:'10%',formatter:function(status){
                        var ztText = "";
                        if("0" == status){
                            ztText = "未填写";
                        }else{
                            ztText = "已填写";
                        }
                        return ztText;
                    } },
                {name:'cgid',index:'',width:'25%', sortable:false, resize:true,
                    formatter:function(id, options, rowObject){
                        var status = rowObject.writed;
                        var cgid = rowObject.cgid;
                        var zjid = rowObject.zjid;
                        var btns = "";

                        if("0" == status ){
                            btns = "<button class='btn btn-success btn-mini' title='填写反馈' onclick='fkCgsq(\""+cgid+"\")'><i class='ace-icon fa fa-pencil '>填写反馈</i></button>";
                                // "&nbsp;&nbsp;<button class='btn btn-info btn-mini' title='上传总结'+zjid+''  onclick='sczjCgsq(\""+zjid+"\")'><i class='ace-icon fa fa-upload '>上传总结</i></button>";
                        }else{
                            btns = "<button class='btn btn-info btn-mini' title='编辑反馈' onclick='editfkCgsq(\""+zjid+"\")'><i class='ace-icon fa fa-pencil '>编辑反馈</i></button>"+
                                "&nbsp;&nbsp;<button class='btn btn-warning btn-mini' title='导出反馈' onclick='fkCgsqWord(\""+zjid+"\")'><i class='ace-icon fa fa-pencil '>导出反馈</i></button>"+
                            "&nbsp;&nbsp;<button class='btn btn-info btn-mini' title='上传总结'  onclick='sczjCgsq(\""+zjid+"\")'><i class='ace-icon fa fa-upload '>上传总结</i></button>";
                        }
                        return btns;
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
                'cfgj':$("#condition1").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }
    function clearTable(){
        $(grid_selector).jqGrid('clearGridData');  //清空表格
    }
    function fkCgsq(cgid){
        layer.newpage({
            area: ['1100px',"750px"],
            title:'填写出国反馈',
            content:'cgglgg/add?cgid='+cgid,
        });
    }
    function sczjCgsq(zjid){

        layer.newpage({
            area: ['400px', "220px"],
            title:'上传总结',
            content:'sys/file/uppage?targetUrl=cgglgg/updateUploadId&rwfkid='+zjid,
        });
    }
    function editfkCgsq(zjid){
        layer.newpage({
            area: ['1100px', "750px"],
            title:'编辑出国反馈',
            content:'cgglgg/toEdit?rwfkid='+zjid,
        });
    }

    function  fkCgsqWord(zjid){
        window.open("cgglexp/downloadword?rwfkid="+zjid);
    }

</script>