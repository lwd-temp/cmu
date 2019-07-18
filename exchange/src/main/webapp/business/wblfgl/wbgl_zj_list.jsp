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
            <label class="col-sm-2 control-label no-padding-right" for="condition1"> 主请联系人姓名: </label>

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
                <button class="btn btn-warning btn-xs" id="download" type="button"> <i class="ace-icon fa fa-download "></i>
                    批量下载
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
            colNames:['代表团名称','来访时间起','来访时间止', '来访人数',/* '来访目的',*/'团长姓名','主请联系人姓名','状态',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'dbtmc',index:'dbtmc', width:6,  },
                {name:'lfsjStart',index:'lfsj_start',width:4, phoneHide:true,formatter:function(lfsjStart, options, rowObject){
                        if(lfsjStart==null){
                            return '';
                        }else{
                            return new Date(lfsjStart).getYmd("yyyy-MM-dd");
                        }
                    }},
                {name:'lfsjEnd',index:'lfsj_end',width:4, phoneHide:true,formatter:function(lfsjEnd, options, rowObject){
                        if(lfsjEnd==null){
                            return '';
                        }else{
                            return new Date(lfsjEnd).getYmd("yyyy-MM-dd");
                        }
                    }},
                {name:'lfrs',index:'lfrs',  width:3, phoneHide:true},
                /*{name:'lfmd',index:'lfmd', formatter:function(lfmd,options,rowObject){
                        return dmcache.getCode('t_dm_lfmd',lfmd);
                    }},*/
                {name:'tzxm',index:'tzxm', width:4,  },
                {name:'zqlxrxm',index:'zqlxrxm', width:6, phoneHide:true },
                {name:'writed',index:'writed', width:5, formatter:function(status){
                        var ztText = "";
                        if("0" == status){
                            ztText = "未填写";
                        }else{
                            ztText = "已填写";
                        }
                        return ztText;
                    } },
                {name:'lfid',index:'', width:5,  sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var status = rowObject.writed;
                        var lfid = rowObject.lfid;
                        var zjid = rowObject.zjid;
                        var btns = "";
                        var zt = rowObject.status;

                        if("0" == status ){
                            btns = "<button class='btn btn-success btn-mini' onclick='zjWbgl(\""+lfid+"\")' title='填写' ><i class='ace-icon fa fa-pencil '>填写</i></button>";
                        }else {
                            btns = "<button class='btn btn-info btn-mini' onclick='editWbgl(\""+zjid+"\")' title='编辑' ><i class='ace-icon fa fa-pencil '>编辑</i></button>";
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

        //下载外宾来访接待信息
        $("#download").click(function(){

            var sortname = $(grid_selector).jqGrid('getGridParam','sortname');
            var sortorder = $(grid_selector).jqGrid('getGridParam','sortorder');
            if(typeof(sortname) != 'string'){
                sortname = '';
            }

            window.open("wbzj/download?zqlxrxm="+$("#condition1").val()+"&dbtmc="+$("#condition2").val()+"&orderCol="+sortname+"&orderType="+sortorder);
        });
    });

    function refreshTable(){
        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
            postData:{
                'zqlxrxm':$("#condition1").val(),
                'dbtmc':$("#condition2").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }
    //总结外宾接待申请
    function zjWbgl(lfid){
        layer.newpage({
            area: ['1100px',"750px"],
            title:'外宾接待【总结】',
           // content:'business/wblfgl/wbgl_zj_add.jsp?lfid='+lfid,
            content:'wbzj/add?lfid='+lfid,
        });
    }
    function editWbgl(zjid){
        layer.newpage({
            area: ['1100px',"750px"],
            title:'外宾接待【总结】',
            content:'wbzj/toEdit?zjid='+zjid,
        });
    }
    function showWbgl(zjid){
        layer.newpage({
            area: ['1100px',"750px"],
            title:'外宾接待【总结】',
            content:'wbzj/toEdit?type=show&zjid='+zjid,
        });
    }
</script>