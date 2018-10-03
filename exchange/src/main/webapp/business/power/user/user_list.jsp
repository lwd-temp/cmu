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
            <label class="col-sm-4 control-label no-padding-right" > 用户: </label>

            <div class="col-sm-5">
                <input type="text" id="condition" placeholder="请输入用户显示名称或用户名" class="col-xs-12" />
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
                caption:"添加用户",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['600px', '290px'],
                        title:'添加用户',
                        content:'business/power/user/user_add.jsp',
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
                            alert('cindex:'+cindex);
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
            caption: "用户管理2",
            /*data: grid_data,*/
            postData:{'condition':$("#condition").val()},
            gridview:false,

            url: 'sys/user/list',
            datatype: "json",
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colNames:['显示名称','用户名', '密码','最后一次登录时间', '最后一次修改时间','创建时间',"操作"],
            colModel:[
                {name:'userName',index:'user_name',  },
                {name:'userName',index:'user_name', sortable:false },
                {name:'password',index:'password', formatter:function(time){
                        return "☆☆☆☆☆☆☆☆☆";
                    }  },
                {name:'lastModifyTime',index:'last_modify_time', formatter:function(time){
                    return new Date(time).getYmd("yyyy-MM-dd");
                }, },
                {name:'lastLoginTime',index:'last_login_time', formatter:function(time){
                    return new Date(time).getYmd("yyyy-MM-dd");
                }, },
                {name:'createTime',index:'create_time', formatter:function(time){
                        return new Date(time).getYmd("yyyy-MM-dd");
                    }, },

                {name:'userId',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var idStr = "'"+cellvalue+"'";
                        return "<button class='btn btn-info btn-mini' title='测试' onclick=\"editUser("+idStr+")\" ><i class='ace-icon fa fa-pencil '>修改</i></button>" +
                            "&nbsp;&nbsp;<button class='btn btn-danger btn-mini' onclick=\"delUser("+idStr+")\" title='测试' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
                    }
                },
            ],
            //给行加样式
            /*afterInsertRow:function( rowid, rowdata ,rowelem ,a){
                if(rowid>5){
                    $("tr#"+rowid).css("background","#ff99cc");
                }

            }*/

        }


        //渲染jqGrid表格 ,包括渲染 分页信息
        $(grid_selector).tables(settings);


        //查询按钮添加事件
        $("#query").click(function(){
            $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
                postData:{'userName':$("#condition").val()},
                page:1
            }).trigger("reloadGrid");

        });

    });


    //修改用户
    function editUser(userId){
        layer.newpage({
            area: ['600px', '290px'],
            title:'修改用户',
            content:'business/power/user/user_edit.jsp',
        });
    }

    //删除用户
    function delUser(userId){
        $(grid_selector).delGridRow(userId);
    }
</script>