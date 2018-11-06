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
            <label class="col-sm-4 control-label no-padding-right" for="condition"> 外籍教师姓名: </label>

            <div class="col-sm-5">
                <input type="text" id="condition" placeholder="外籍教师姓名" class="col-xs-12" />
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
                caption:"添加教师",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['900px', ($(window).height()-400)+"px"],
                        title:'添加教师',
                        content:'business/jsgl/jsgl_add.jsp',
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
                            delMulTeachers(ids);

                        });
                    }else{
                        layer.alert("请选择要删除的数据",{icon:3})
                    }

                }
            }
        ]

        var settings = {
            caption: "教师管理",
           /* data: grid_data,*/
            url:'wjjs/list',
            colNames:['ID','姓名','性别','语言', '国籍', '专业领域','关联项目',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'tid',index:'tid', key:true,hidden:true  },
                {name:'name',index:'name',  },
                {name:'gender',index:'gender',
                    formatter:function(gender){
                        return dmcache.getCode('t_dm_xb',gender);
                    }
                },
                {name:'language',index:'language',  },
                {name:'gj',index:'gj',  },
                {name:'zyly',index:'zyly',  },
                {name:'glxm',index:'glxm',  },

                {name:'tid',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(tid, options, rowObject){
                        return "<button class='btn btn-info btn-mini' title='编辑' onclick='editjsgl(\""+tid+"\")' ><i class='ace-icon fa fa-pencil '>编辑</i></button>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class='btn btn-danger btn-mini' title='删除' onclick='deljsgl(\""+tid+"\")' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
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
            postData:{'name':$("#condition").val()},//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }

    //修改用户
    function editjsgl(tid){
        layer.newpage({
            area: ['900px', ($(window).height()-400)+"px"],
            title:'编辑教师',
            content:'wjjs/toEdit?id='+tid
        });
    }


    function deljsgl(lxrId){
        var index = layer.dconfirm("确认删除?",function(){
            layer.close(index);

            $.ajax('wjjs/delById',{
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

    function delMulTeachers(ids){
        $.ajax('wjjs/delMulti',{
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