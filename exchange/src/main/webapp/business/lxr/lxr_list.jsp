<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/10
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div >
    <form class="form-horizontal" role="form" onkeydown="huiche()">
        <div class="form-group">
            <label class="col-sm-2 control-label no-padding-right" for="condition"> 联系人姓名: </label>

            <div class="col-sm-2">
                <input type="text" id="condition" name="condition" placeholder="联系人姓名" class="col-xs-12" />
            </div>
            <label class="col-sm-2 control-label no-padding-right" for="condition2"> 工作单位: </label>

            <div class="col-sm-2">
                <input type="text" id="condition2" name="condition2"  placeholder="工作单位" class="col-xs-12" />
            </div>
            <div class="col-sm-3">
                <button class="btn btn-info btn-xs" id="tuihui" type="button" onclick="qingk()"> <i class="ace-icon fa fa-search "></i>
                    清空退回
                </button>
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
                caption:"添加联系人",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['900px',"500px"],
                        title:'添加联系人',
                        content:'business/lxr/lxr_add.jsp',
                    });
                }
            },{
                caption:"批量删除",
                buttonicon:"ace-icon fa fa-trash-o red",
                onClickButton: function(){
                    //  获取选中的行
                    var ids= $(grid_selector).jqGrid('getGridParam','selarrrow');
                    if(ids && ids.length>0){
                        //询问框
                        var cindex = layer.confirm('确定删除？', {
                            btn: ['确定','取消'] //按钮
                        }, function(){
                            layer.close(cindex);
                            delMulRoles(ids);

                        });
                    }else{
                        layer.alert("请选择要删除的数据",{icon:3})
                    }

                }
            }
        ]

        var settings = {
            caption: "联系人管理",
            /*data: grid_data,*/
            url:'lxr/list',
            colNames:["ID",'姓名','姓名','性别', '国籍', '专业领域','关联项目',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'lxrId',index:'lxrId',  key:true,hidden:true},
                {name:'name',index:'name',  key:true,hidden:true},
                {name:'lxrId',index:'lxrId', width:3,formatter:function(lxrId, options, rowObject){
                        var name = rowObject.name;
                        var content = "";
                        content += "<span class='mark_data' ondblclick='editLxr(\""+lxrId+"\")'>"+name+"</span>";
                        return content;
                    }  },
                {name:'gender',index:'gender', width:3,phoneHide:true,formatter:function(gender){
                        return dmcache.getCode("t_dm_xb",gender);//从缓存中获取代码对应的名称
                } },
                {name:'gj',index:'gj',  width:4,phoneHide:true},
                {name:'zyly',index:'zyly', width:4,},
                {name:'glxm',index:'glxm',  width:4,phoneHide:true},

                {name:'lxrId',index:'', width:6, sortable:false, resize:true,
                    formatter:function(id, options, rowObject){

                        return "<button class='btn btn-info btn-mini' title='编辑' onclick='editLxr(\""+id+"\")' ><i class='ace-icon fa fa-pencil '>编辑</i></button>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class='btn btn-danger btn-mini' title='删除' onclick='delLxr(\""+id+"\")' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
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

        //下载联系人信息信息
        $("#download").click(function(){

            var sortname = $(grid_selector).jqGrid('getGridParam','sortname');
            var sortorder = $(grid_selector).jqGrid('getGridParam','sortorder');
            if(typeof(sortname) != 'string'){
                sortname = '';
            }

            window.open("lxr/download?name="+$("#condition").val()+"&gzdw="+$("#condition2").val()+"&orderCol="+sortname+"&orderType="+sortorder);
        });
    });


    function qingk() {
        $("#condition").val(" "),
        $("#condition2").val(" ")
        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
            postData:{
                'name':$("#condition").val(),
                'gzdw':$("#condition2").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }

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
                'name':$("#condition").val(),
                'gzdw':$("#condition2").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }

    //修改用户
    function editLxr(lxrId){
        layer.newpage({
            area: ['900px',"500px"],
            title:'编辑联系人',
            content:'lxr/toEdit?id='+lxrId
        });
    }

    function delLxr(lxrId){
        var index = layer.dconfirm("确认删除?",function(){
            layer.close(index);

            $.ajax('lxr/delById',{
                data:{id:lxrId},
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

    function delMulRoles(ids){
        $.ajax('lxr/delMulti',{
            data:{ids:ids},
            success:function(res){
                if(res && res.success){
                    layer.alert("删除成功");
                    refreshTable();
                }else{
                    layer.alert("删除失败")
                }
            }
        })
    }


</script>