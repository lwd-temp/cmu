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
        //自定义 按钮
        var navBtns = [
            {
                caption:"出国申请",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['1000px', ($(window).height()-20)+"px"],
                        title:'申请短期出国',
                        content:'business/cggl/cggl_add.jsp',
                    });
                }
            }
        ]
        var settings = {
            caption: "已申请出国流程",
            url:'cggl/list',
            colNames:['姓名','性别', '所属二级单位', '出访国家','状态',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'name',index:'name',  },
                {name:'gender',index:'gender', formatter:function(gender,options,rowObject){
                    return dmcache.getCode('t_dm_xb',gender);
                }},
                {name:'ejdw',index:'ejdw',  },
                {name:'cfgj',index:'cfgj',  },
                {name:'zt',index:'zt',  },
                {name:'cgid',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var zt = rowObject.status;
                        if(zt == '02'||zt == '03'){
                            return  "<button class='btn btn-info btn-mini' title='编辑' onclick='editCgsq(\""+cellvalue+"\")'><i class='ace-icon fa fa-pencil '>编辑</i></button>"+
                                "&nbsp;&nbsp;<button class='btn btn-danger btn-mini' title='删除'  onclick='delCgsq(\""+cellvalue+"\")'><i class='ace-icon fa fa-trash-o '>删除</i></button>";
                        }else{
                            return  "<button class='btn btn-warning btn-mini' title='查看' onclick='showCgsq(\""+cellvalue+"\")'><i class='ace-icon fa fa-eye '>查看</i></button>";

                        }
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
    function refreshTable(){
        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
            datatype:'local',
            data : grid_data,   //  newdata 是符合格式要求的需要重新加载的数据
            page:1
        }).trigger("reloadGrid");
    }
    //修改
    function editCgsq(cgid){
        layer.newpage({
            area: ['1000px', ($(window).height()-20)+"px"],
            title:'编辑出国申请',
            content:'business/cggl/cggl_edit.jsp',
        });
    }
    //查看
    function showCgsq(cgid){
        layer.newpage({
            area: ['1000px', ($(window).height()-20)+"px"],
            title:'编辑出国申请',
            content:'business/cggl/cggl_show.jsp',
        });
    }
    //删除
    function delCgsq(cgid){
        var index = layer.dconfirm("确认删除?",function(){
            layer.close(index);
            $.ajax('cggl/delById',{
                data:{id:cgid},
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
</script>