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
            <label class="col-sm-4 control-label no-padding-right" for="xymc"> 协议名称: </label>

            <div class="col-sm-5">
                <input type="text" id="xymc" placeholder="协议名称" class="col-xs-12" />
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
    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";
    $(function() {
        grid_selector = "#grid-table";
        pager_selector = "#grid-pager";
        var parent_column = $(grid_selector).closest('[class*="col-"]');
        $(window).on('resize.jqGrid', function () {
            $(grid_selector).jqGrid( 'setGridWidth', parent_column.width() );
        })
        $(document).on('settings.ace.jqGrid' , function(ev, event_name, collapsed) {
            if( event_name === 'sidebar_collapsed' || event_name === 'main_container_fixed' ) {
                setTimeout(function() {
                    $(grid_selector).jqGrid( 'setGridWidth', parent_column.width() );
                }, 0);
            }
        })
        //自定义 按钮
        var navBtns = [
            {
                caption:"添加协议",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['850px', ($(window).height()-20)+"px"],
                        title:'添加协议',
                        content:'business/jlxy/jlxy_add.jsp',
                    });
                }
            },{
                caption:"批量删除",
                buttonicon:"ace-icon fa fa-trash-o red",
                onClickButton: function(){
                    var ids= $(grid_selector).jqGrid('getGridParam','selarrrow');
                    if(ids && ids.length>0){
                        var cindex = layer.confirm('确定删除？', {
                            btn: ['确定','取消'] //按钮
                        }, function(){
                            layer.close(cindex);
                            var index = layer.loading();
                            setTimeout(function(){
                                $(ids).each(function(index,id){
                                    $(grid_selector).jqGrid('delRowData',id);
                                });
                                layer.close(index);
                            },1500);
                        });
                    }else{
                        layer.alert("请选择要删除的数据",{icon:3})
                    }
                }
            }
        ]


        var settings = {
            caption: "协议管理",
            url: 'jlxy/list',
            colNames:['协议名称','签订日期','失效日期','电子协议','操作'],
            navBtns:navBtns,
            pager:pager_selector,
            colModel:[
                {name:'xymc',index:'xymc'},
                {name:'qdrq',index:'qdrq'},
                {name:'sxrq',index:'sxrq'},
                {name:'uploadId',index:'uploadId'},
                {name:'xyid',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(id, options, rowObject){
                        return "<button class='btn btn-info btn-mini' title='测试' onclick='editHzxy(\""+id+"\")' ><i class='ace-icon fa fa-pencil '>编辑</i></button>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class='btn btn-warning btn-mini' title='查看' onclick='delHzxy(\""+id+"\")' ><i class='ace-icon fa fa-eye '>删除</i></button>";
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
            postData:{'condition':$("#xymc").val()},//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }
    //修改
    function editHzxy(bzid){
        layer.newpage({
            area: ['850px', ($(window).height()-20)+"px"],
            title:'编辑协议',
            content:'jlxy/toEdit?id='+bzid
        });
    }
    //删除
    function delHzxy(bzid){
        var index = layer.dconfirm("确认删除?",function(){
            layer.close(index);
            $.ajax('jlxy/delById',{
                data:{id:bzid},
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