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
            <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> 用户: </label>

            <div class="col-sm-5">
                <input type="text" id="form-field-1" placeholder="请输入用户显示名称或用户名" class="col-xs-12" />
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
            {id:"1",	showName:"显示名1",name:"admin",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"2",	showName:"显示名2",name:"system",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"3",	showName:"显示名3",name:"test",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"4",	showName:"显示名3",name:"test1",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"5",	showName:"显示名4",name:"adminabc ",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"6",	showName:"显示名5",name:"liqifan",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"7",	showName:"显示名6",name:"username",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"8",	showName:"显示名8",name:"yangwenbin",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"9",	showName:"显示名9",name:"lixin",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"10",	showName:"显示名10",name:"xijinp",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"11",	showName:"显示名11",name:"wanghaom",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"12",	showName:"显示名12",name:"wuzongx",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"13",	showName:"显示名13",name:"gafgag",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"14",	showName:"显示名14",name:"bailinxi",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"15",	showName:"显示名15",name:"shishuo",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
            {id:"16",	showName:"显示名16",name:"xiejiaan",	passrord:"*",	expDate:"2019-01-01",  createTime:'2017-01-01'},
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
            caption: "用户管理",
            data: grid_data,
            colNames:['显示名称','用户名', '密码', '过期时间','创建时间',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'showName',index:'showName',  },
                {name:'name',index:'name',  },
                {name:'passrord',index:'passrord',  },
                {name:'expDate',index:'expDate',  },
                {name:'createTime',index:'createTime',  },

                {name:'id',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        return "<button class='btn btn-info btn-mini' title='测试' onclick='editUser("+cellvalue+")' ><i class='ace-icon fa fa-pencil '>修改</i></button>" +
                            "&nbsp;&nbsp;<button class='btn btn-danger btn-mini' onclick='delUser("+cellvalue+")' title='测试' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
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