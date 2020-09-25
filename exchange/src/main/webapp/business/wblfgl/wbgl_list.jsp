<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div >
    <form class="form-horizontal" role="form" onkeydown="huiche()">
        <div class="form-group">
            <label class="col-sm-2 control-label no-padding-right" for="condition1"> 主请人姓名: </label>

            <div class="col-sm-3">
                <input type="text" id="condition1" name="condition" placeholder="主请人姓名" class="col-xs-12" />
            </div>
            <label class="col-sm-2 control-label no-padding-right" for="condition2"> 代表团名称: </label>

            <div class="col-sm-3">
                <input type="text" id="condition2" name="condition"  placeholder="代表团名称" class="col-xs-12" />
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
<!-- inline scripts related to this page -->
<script type="text/javascript">
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
        var navBtns = [
            {
                caption:"申请接待",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['1100px',"750px"],
                        title:'申请接待',
                        content:'business/wblfgl/wbgl_add.jsp',
                    });
                }
            }
        ]
        var settings = {
            caption: "已申请来访接待",
            url:'wbjd/list',
            colNames:['代表团名称','来访时间起','来访时间止','来访人数', '团长姓名','主请联系人姓名','申请时间','状态',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'dbtmc',index:'dbtmc',width:6,},
                {name:'lfsjStart',index:'lfsj_start',width:4,phoneHide:true,formatter:function(lfsjStart, options, rowObject){
                    if(lfsjStart==null){
                        return '';
                    }else{
                        return new Date(lfsjStart).getYmd("yyyy-MM-dd");
                    }
                }},
                {name:'lfsjEnd',index:'lfsj_end',width:4,phoneHide:true,formatter:function(lfsjEnd, options, rowObject){
                    if(lfsjEnd==null){
                        return '';
                    }else{
                        return new Date(lfsjEnd).getYmd("yyyy-MM-dd");
                    }
                }},
                {name:'lfrs',index:'lfrs', width:3, phoneHide:true,},
                // {name:'lfmd',index:'lfmd', formatter:function(lfmd,options,rowObject){
                //     return dmcache.getCode('t_dm_lfmd',lfmd);
                // }},
                {name:'tzxm',index:'tzxm', width:4, phoneHide:true,},
                {name:'zqlxrxm',index:'zqlxrxm',width:6, phoneHide:true, },
                {name:'createTime',index:'create_time',width:5,phoneHide:true,formatter:function(createTime, options, rowObject){
                        if(createTime==null){
                            return '';
                        }else{
                            return new Date(createTime).getYmd("yyyy-MM-dd hh:mm");
                        }
                }},
                {name:'status',index:'status', width:4,formatter:function(status,options,rowObject){
                        var zt = "未知";
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
                {name:'lfid',index:'',  width:10,sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var zt = rowObject.status;
                        if(zt == "02"  || zt == "04"|| zt == "05"){
                            return "<button class='btn btn-success btn-mini' onclick='showWbgl(\""+cellvalue+"\")' title='查看' ><i class='ace-icon fa fa-eye '>查看</i></button>"+
                                "&nbsp;&nbsp;<button class='btn btn-warning btn-mini' onclick='downWbgl(\""+cellvalue+"\")' title='导出pdf' ><i class='ace-icon fa fa-download '>导出pdf</i></button>";
                        }else {
                            return "<button class='btn btn-info btn-mini' title='编辑' onclick='editWbgl(\""+cellvalue+"\")' ><i class='ace-icon fa fa-pencil '>编辑</i></button>" +
                                "&nbsp;&nbsp;<button class='btn btn-danger btn-mini' onclick='delWbgl(\""+cellvalue+"\")' title='删除' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
                        }
                    }
                },
            ]
        }

        //渲染jqGrid表格 ,包括渲染 分页信息
        $(grid_selector).tables(settings);

        //查询按钮添加事件
        $("#query").click(function(){
            if(event.keyCode==13) {
                refreshTable();
            }
            refreshTable();
        });

        //下载外宾来访接待信息
        $("#download").click(function(){

            var sortname = $(grid_selector).jqGrid('getGridParam','sortname');
            var sortorder = $(grid_selector).jqGrid('getGridParam','sortorder');
            if(typeof(sortname) != 'string'){
                sortname = '';
            }

            window.open("wbjdexp/download?zqlxrxm="+$("#condition1").val()+"&dbtmc="+$("#condition2").val()+"&orderCol="+sortname+"&orderType="+sortorder);
        });

    });

    function huiche() {
        if(event.keyCode==13) {
            refreshTable();
        }
    }
    function clearTable(){
        $(grid_selector).jqGrid('clearGridData');  //清空表格
    }

    function refreshTable(){
        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
            postData:{
                'zqlxrxm':$("#condition1").val(),
                'dbtmc':$("#condition2").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }

    //修改外宾接待申请
    function editWbgl(lfid){
        layer.newpage({
            area: ['1100px',"850px"],
            title:'外宾接待申请编辑',
            content:'wbjd/toEdit?id='+lfid,
        });
    }
    function showWbgl(lfid){
        layer.newpage({
            area: ['1100px', "750px"],
            title:'外宾接待申请查看',
            content:'wbjd/show?id='+lfid,
        });
    }
    //删除外宾接待申请
    function delWbgl(lfid){
        var index = layer.dconfirm("确认删除?",function(){
            layer.close(index);
            $.ajax('wbjd/delById',{
                data:{id:lfid},
                success:function(res){
                    if(res && res.success){
                        layer.alert("删除成功");
                        refreshTable();
                    }else{
                        layer.alert("删除失败")
                    }
                }
            })
        })
    }

    function downWbgl(lfid){
        window.open("wbjdexp/downloadPdf?id="+lfid);
    }
</script>
