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
            <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> 出访国家: </label>

            <div class="col-sm-5">
                <input type="text" id="form-field-1" placeholder="出访国家" class="col-xs-12" />
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
            {id:"1",	name:"教职工1",gender:"男",	ejdw:"妇产科",		cfgj:"美国",  zt:'暂存'},
            {id:"2",	name:"教职工12",gender:"男",	ejdw:"妇产科",	cfgj:"美国",  zt:'暂存'},
            {id:"3",	name:"教职工13",gender:"男",	ejdw:"妇产科",	cfgj:"英国",  zt:'已通过'},
            {id:"4",	name:"教职工14",gender:"女",	ejdw:"妇产科",	cfgj:"美国",  zt:'已通过'},
            {id:"5",	name:"教职工15",gender:"男",	ejdw:"妇产科",	cfgj:"澳大利亚",  zt:'已通过'},
            {id:"6",	name:"教职工16",gender:"女",	ejdw:"妇产科",	cfgj:"美国",  zt:'已通过'},
            {id:"7",	name:"教职工17",gender:"男",	ejdw:"妇产科",	cfgj:"美国",  zt:'已通过'},
            {id:"8",	name:"教职工18",gender:"男",	ejdw:"妇产科",	cfgj:"澳大利亚",  zt:'已通过'},
            {id:"9",	name:"教职工19",gender:"女",	ejdw:"妇产科",	cfgj:"美国",  zt:'暂存'},
            {id:"10",	name:"教职工20",gender:"男",	ejdw:"妇产科",	cfgj:"澳大利亚",  zt:'暂存'},
            {id:"11",	name:"教职工21",gender:"男",	ejdw:"妇产科",	cfgj:"美国",  zt:'暂存'},
            {id:"12",	name:"教职工22",gender:"女",	ejdw:"妇产科",	cfgj:"澳大利亚",  zt:'暂存'},
            {id:"13",	name:"教职工23",gender:"女",	ejdw:"妇产科",	cfgj:"美国",  zt:'暂存'},
            {id:"14",	name:"教职工24",gender:"男",	ejdw:"妇产科",	cfgj:"澳大利亚",  zt:'暂存'},
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
        var navBtns = [ ]

        var settings = {
            caption: "归国管理(已申请出国)",
            data: grid_data,
            colNames:['姓名','性别', '所属二级单位', '出访国家','状态',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'name',index:'name',  },
                {name:'gender',index:'gender',  },
                {name:'ejdw',index:'ejdw',  },
                {name:'cfgj',index:'cfgj',  },
                {name:'zt',index:'zt',  },

                {name:'id',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var zt = rowObject.zt;

                            return  "<button class='btn btn-info btn-mini' title='反馈' onclick='fk(\"+cellvalue+\")' ><i class='ace-icon fa fa-pencil '>反馈</i></button>" +
                                "<button class='btn btn-danger btn-mini' title='总结报告' onclick='zj(\"+cellvalue+\")' ><i class='ace-icon fa fa-pencil '>上传总结</i></button>";

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
    function fk(sqid){
        layer.newpage({
            area: ['900px', ($(window).height()-20)+"px"],
            title:'填写反馈情况表',
            content:'business/cggl/cggl_gg_fk.jsp',
        });
    }

    function zj(){

        layer.newpage({
            area: ['600px', "400px"],
            title:'填写反馈情况表',
            content:'business/cggl/cggl_gg_zj.jsp',
        });


    }




</script>