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
            <label class="col-sm-2 control-label no-padding-right" for="condition1"> 项目名称: </label>

            <div class="col-sm-3">
                <input type="text" id="condition1" placeholder="项目名称" class="col-xs-12" />
            </div>
            <label class="col-sm-2 control-label no-padding-right"  for="condition2"> 学生姓名: </label>

            <div class="col-sm-3">
                <input type="text" id="condition2" placeholder="学生姓名" class="col-xs-12" />
            </div>

            <div class="col-sm-2">
                <button class="btn btn-info btn-xs" id="query" type="button"> <i class="ace-icon fa fa-search "></i>
                    查询
                </button>


                <button class="btn btn-info btn-xs" id="download" type="button"> <i class="ace-icon fa fa-search "></i>
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
        var navBtns = [ ]

        var settings = {
            caption: "学生已申请项目列表",
            /*data: grid_data,*/
            url:'xm/listXmzjbg',
            colNames:["学生姓名",'学生学号','学生年级','所在学院','项目编号','项目名称',"下载查看"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'xm',index:'xm',  width:'10'  },
                {name:'xh',index:'xh', width:'10'},
                {name:'sznj',index:'sznj', width:'10' },
                {name:'unitName',index:'unitName', width:'30' },
                {name:'xmbh',index:'xmbh', width:'10' },
                {name:'xmmc',index:'xmmc',  width:'30'},

                {name:'fileId',  sortable:false,width:'15',
                    formatter:function(fileId, options, rowObject){
                        var xm = rowObject.xm;
                        var xmmc = rowObject.xmmc;
                        if(!fileId){
                            return "";
                        }
                        return "<button class='btn btn-info btn-mini' onclick='download(\""+fileId+"\",\""+xm+"\",\""+xmmc+"\")' title='查看总结' ><i class='ace-icon fa fa-download '>查看总结</i></button>";

                    }
                }
            ]
        }

        //渲染jqGrid表格 ,包括渲染 分页信息
        $(grid_selector).tables(settings);
        // $(grid_selector).autoWidth();


        //查询按钮添加事件
        $("#query").click(function(){
            refreshTable();

        });

        $("#download").click(function(){
            var xmmc = $("#condition1").val();      //项目名称
            var xm = $("#condition2").val();        //姓名
            window.open('xm/downLoadXmzjbg?xmmc='+xmmc+'&xm='+xm);
        });

    });

    function clearTable(){
        $(grid_selector).jqGrid('clearGridData');  //清空表格
    }

    function refreshTable(){

        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
            postData:{
                'xmmc':$("#condition1").val(),//项目名称
                'xm':$("#condition2").val() //项目总名
            },
            page:1
        }).trigger("reloadGrid");
    }


    //下载查看总结
    function  download(fid,xm,xmmc){
        var fileName = "项目总结报告_"+xm+"_"+xmmc;
        window.open('sys/file/download?fileName='+fileName+'&fileId='+fid);
    }




</script>