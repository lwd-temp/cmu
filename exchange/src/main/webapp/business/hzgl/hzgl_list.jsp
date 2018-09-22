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
            <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> 护照、通行证持有人姓名: </label>

            <div class="col-sm-5">
                <input type="text" id="form-field-1" placeholder="护照、通行证持有人姓名" class="col-xs-12" />
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


<!-- inline scripts related to this page -->
<script type="text/javascript">
    var grid_data =
        [
            {id:"1",	name:"护照、通行证持有人1",gender:"男",	ejdw:"妇产科",		hzlx:"因公护照",  zt:'暂存'},
            {id:"2",	name:"护照、通行证持有人12",gender:"男",	ejdw:"妇产科",	hzlx:"因公港澳",  zt:'报废（过期）'},
            {id:"3",	name:"护照、通行证持有人13",gender:"男",	ejdw:"妇产科",	hzlx:"因公护照",  zt:'调往新单位'},
            {id:"4",	name:"护照、通行证持有人14",gender:"女",	ejdw:"妇产科",	hzlx:"因公护照",  zt:'在省签证处'},
            {id:"5",	name:"护照、通行证持有人15",gender:"男",	ejdw:"妇产科",	hzlx:"因公台湾",  zt:'调至省外'},
            {id:"6",	name:"护照、通行证持有人16",gender:"女",	ejdw:"妇产科",	hzlx:"因公港澳",  zt:'在省签证处'},
            {id:"7",	name:"护照、通行证持有人17",gender:"男",	ejdw:"妇产科",	hzlx:"因公护照",  zt:'在我部'},
            {id:"8",	name:"护照、通行证持有人18",gender:"男",	ejdw:"妇产科",	hzlx:"因公护照",  zt:'在我部'},
            {id:"9",	name:"护照、通行证持有人19",gender:"女",	ejdw:"妇产科",	hzlx:"因公台湾",  zt:'借出中'},
            {id:"10",	name:"护照、通行证持有人20",gender:"男",	ejdw:"妇产科",	hzlx:"因公港澳",  zt:'借出中'},
            {id:"11",	name:"护照、通行证持有人21",gender:"男",	ejdw:"妇产科",	hzlx:"因公港澳",  zt:'调往新单位'},
            {id:"12",	name:"护照、通行证持有人22",gender:"女",	ejdw:"妇产科",	hzlx:"因公台湾",  zt:'暂存'},
            {id:"13",	name:"护照、通行证持有人23",gender:"女",	ejdw:"妇产科",	hzlx:"因公台湾",  zt:'暂存'},
            {id:"14",	name:"护照、通行证持有人24",gender:"男",	ejdw:"妇产科",	hzlx:"因公台湾",  zt:'暂存'},
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
                caption:"添加护照、通行证",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['850px', ($(window).height()-20)+"px"],
                        title:'添加护照、通行证',
                        content:'business/hzgl/hzgl_add.jsp',
                    });
                }
            }
        ];

        var settings = {
            caption: "护照管理",
            data: grid_data,
            colNames:['姓名','性别', '所属二级单位', '证件类型','状态','备注','操作'],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'name',index:'name',  },
                {name:'gender',index:'gender',  },
                {name:'ejdw',index:'ejdw',  },
                {name:'hzlx',index:'hzlx',  },
                {name:'zt',index:'zt',

                }, {name:'zt',index:'zt',
                    formatter:function(cellvalue, options, rowObject){
                        var zt = rowObject.zt;
                        if('借出中' == zt){
                            return "超过七天未归还";
                        }else if('在我部' == zt){
                            return "提前三个月提醒";
                        }else if('报废（过期）' == zt){
                            return "已报废，此处应有红色预警";
                        }else{

                            return "其他备注";
                        }
                    }
                },

                {name:'id',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var zt = rowObject.zt;
                        return  "<button class='btn btn-info btn-mini' title='查看' onclick='editHz(\"+cellvalue+\")' ><i class='ace-icon fa fa-pencil '>编辑护照 </i></button>";
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
    function editHz(sqid){
        layer.newpage({
            area: ['850px', ($(window).height()-20)+"px"],
            title:'编辑护照、通行证',
            content:'business/hzgl/hzgl_edit.jsp',
        });
    }


</script>