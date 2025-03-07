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
            <label class="col-sm-2 control-label no-padding-right" for="condition1"> 会议编号: </label>

            <div class="col-sm-3">
                <input type="text" id="condition1" placeholder="请输入会议编号" class="col-xs-12" />
            </div>
            <label class="col-sm-2 control-label no-padding-right" for="condition2"> 主办单位或承办单位: </label>

            <div class="col-sm-3">
                <input type="text" id="condition2" placeholder="请输入主办单位或承办单位" class="col-xs-12" />
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
        var navBtns = [ ];

        var settings = {
            caption: "国际会议审核",
            url:'hysb/list?status=02',
            colNames:["会议编号","会议名称","主办单位","承办单位","举行日期(开始)","举行日期(结束)","经费来源" ,"状态","操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'hybh',index:'hybh',  width:'6', phoneHide:true,},
                {name:'hymc',index:'hymc',  width:'10', },
                {name:'zbdw',index:'zbdw',  width:'10',phoneHide:true, },
                {name:'cbdw',index:'cbdw',  width:'10', phoneHide:true,},
                {name:'jxrqKs',index:'jxrq_ks',width:'8', phoneHide:true, formatter:function(jxrqKs){
                        return new Date(jxrqKs).getYmd("yyyy年MM月dd日")
                    } },
                {name:'jxrqJs',index:'jxrq_js', width:'8',phoneHide:true, formatter:function(jxrqJs){
                        return new Date(jxrqJs).getYmd("yyyy年MM月dd日")
                    } },
                {name:'jfly',index:'jfly',  width:'6', phoneHide:true,},
                {name:'status',index:'status', width:'5', formatter:function(status){
                        var ztText = "";
                        if("01" == status){
                            ztText = "暂存";
                        }else if("02" == status){
                            ztText = "待审核";
                        }else if("03" == status){
                            ztText = "已退回";
                        }else if("04" == status){
                            ztText = "审核通过";
                        }
                        return ztText;
                    } },

                {name:'sbid',index:'', width:'6',  sortable:false, resize:true,
                    formatter:function(id, options, rowObject){
                        var status = rowObject.status;
                        var btns = "";

                        if("02" == status){
                            btns = "<button class='btn btn-info btn-mini' onclick='hysh(\""+id+"\")' title='审核' ><i class='ace-icon fa fa-eye '>审核</i></button>";
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

    function clearTable(){
        $(grid_selector).jqGrid('clearGridData');  //清空表格
    }

    function refreshTable(){
        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
            postData:{
                'hybh':$("#condition1").val(),
                'zbdw':$("#condition2").val(),
                'cbdw':$("#condition2").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");



    }

    //修改用户
    function hysh(sbid){
        var index = layer.newpage({
            area: ['1100px', "750px"],
            title:'审核会议申报信息',
            content:'hysb/toEdit?type=sh&id='+sbid,
        });
        layer.full(index);
    }


</script>