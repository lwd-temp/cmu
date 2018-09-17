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
            <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> 联系人姓名: </label>

            <div class="col-sm-5">
                <input type="text" id="form-field-1" placeholder="联系人姓名" class="col-xs-12" />
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
    var grid_data = 
        [
            {id:"1",	name:"联系人1",gender:"男",	gj:"中国",		zyly:"内科",  glxm:'项目1'},
            {id:"2",	name:"联系人12",gender:"男",	gj:"日本",	zyly:"骨科",  glxm:'项目1'},
            {id:"3",	name:"联系人13",gender:"男",	gj:"日本",	zyly:"心脏",  glxm:'项目2'},
            {id:"4",	name:"联系人14",gender:"女",	gj:"日本",	zyly:"神内",  glxm:'项目3'},
            {id:"5",	name:"联系人15",gender:"男",	gj:"美国",	zyly:"血液科",  glxm:'项目1'},
            {id:"6",	name:"联系人16",gender:"女",	gj:"中国",	zyly:"介入超声科",  glxm:'项目4'},
            {id:"7",	name:"联系人17",gender:"男",	gj:"中国",	zyly:"血液科",  glxm:'项目5'},
            {id:"8",	name:"联系人18",gender:"男",	gj:"中国",	zyly:"血液科",  glxm:'项目6'},
            {id:"9",	name:"联系人19",gender:"女",	gj:"中国",	zyly:"血液科",  glxm:'项目7'},
            {id:"10",	name:"联系人20",gender:"男",	gj:"中国",	zyly:"血液科",  glxm:'项目8'},
            {id:"11",	name:"联系人21",gender:"男",	gj:"中国",	zyly:"血液科",  glxm:'项目9'},
            {id:"12",	name:"联系人22",gender:"女",	gj:"中国",	zyly:"介入超声科",  glxm:'项目10'},
            {id:"13",	name:"联系人23",gender:"女",	gj:"中国",	zyly:"血液科",  glxm:'项目11'},
            {id:"14",	name:"联系人24",gender:"男",	gj:"中国",	zyly:"介入超声科",  glxm:'项目12'},
        ];


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
                caption:"添加联系人",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['900px', ($(window).height()-20)+"px"],
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
            caption: "联系人管理",
            data: grid_data,
            colNames:['姓名','性别', '国籍', '专业领域','关联项目',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'name',index:'name',  },
                {name:'gender',index:'gender',  },
                {name:'gj',index:'gj',  },
                {name:'zyly',index:'zyly',  },
                {name:'glxm',index:'glxm',  },

                {name:'id',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var glxm = rowObject.glxm;
                        return "<button class='btn btn-info btn-mini' title='测试' onclick='editLxr(\"+cellvalue+\")' ><i class='ace-icon fa fa-pencil '>编辑</i></button>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class='btn btn-warning btn-mini' title='查看' onclick='delLxr(\"+cellvalue+\")' ><i class='ace-icon fa fa-eye '>删除</i></button>";
                    }
                },
            ]

        }


        //渲染jqGrid表格 ,包括渲染 分页信息
        $(grid_selector).tables(settings);

        //查询按钮添加事件
        $("#query").click(function(){
            layer.msg("点击查询后，根据条件进行查询")
            clearTable(); //清空表格
            setTimeout(function(){
                refreshTable();//刷新页面
            },800);

        });

    });

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

    //修改用户
    function editLxr(sqid){
        layer.newpage({
            area: ['900px', ($(window).height()-20)+"px"],
            title:'编辑联系人',
            content:'business/lxr/lxr_edit.jsp',
        });
    }

    function delLxr(sqid){
        $(grid_selector).delGridRow(sqid);
    }


</script>