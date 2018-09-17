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
            <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> 出访单位: </label>

            <div class="col-sm-5">
                <input type="text" id="form-field-1" placeholder="请输入出访单位" class="col-xs-12" />
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
            {id:"1",	tzh:"2018010001",tzlb:"赴港澳(行政)",	cfdw:"xxxxx医院",	tzjb:"副厅级", zt:'暂存',  cfts:'12'},
            {id:"2",	tzh:"2018010002",tzlb:"赴港澳(学术)",	cfdw:"xxxxx医院",	tzjb:"正厅级", zt:'退回',  cfts:'11'},
            {id:"3",	tzh:"2018010003",tzlb:"赴港澳(行政)",	cfdw:"xxxxx医院",	tzjb:"副厅级", zt:'暂存',  cfts:'10'},
            {id:"4",	tzh:"2018010004",tzlb:"赴港澳(学术)",	cfdw:"xxxxx医院",	tzjb:"正厅级", zt:'退回',  cfts:'12'},
            {id:"5",	tzh:"2018010005",tzlb:"赴港澳(行政)",	cfdw:"xxxxx医院",	tzjb:"副厅级", zt:'已通过',  cfts:'15'},
            {id:"6",	tzh:"2018010006",tzlb:"赴港澳(学术)",	cfdw:"xxxxx医院",	tzjb:"正厅级", zt:'已通过', cfts:'16'},
            {id:"7",	tzh:"2018010007",tzlb:"赴港澳(学术)",	cfdw:"xxxxx医院",	tzjb:"副厅级", zt:'已通过',  cfts:'12'},
            {id:"8",	tzh:"2018010008",tzlb:"赴港澳(行政)",	cfdw:"xxxxx医院",	tzjb:"正厅级", zt:'已通过',  cfts:'18'},
            {id:"9",	tzh:"2018010009",tzlb:"赴港澳(行政)",	cfdw:"xxxxx医院",	tzjb:"处级",  zt:'已通过', cfts:'12'},
            {id:"10",	tzh:"20180100010",tzlb:"赴港澳(学术)",	cfdw:"xxxxx医院",	tzjb:"正厅级", zt:'已通过',  cfts:'21'},
            {id:"11",	tzh:"20180100011",tzlb:"赴港澳(行政)",	 cfdw:"xxxxx医院",	tzjb:"处级",  zt:'已通过', cfts:'12'},
            {id:"12",	tzh:"20180100012",tzlb:"赴港澳(学术)",	cfdw:"xxxxx医院",	tzjb:"正厅级", zt:'已通过',  cfts:'5'},
            {id:"13",	tzh:"20180100013",tzlb:"赴港澳(行政)",	cfdw:"xxxxx医院",	tzjb:"处级",  zt:'已通过',  cfts:'4'},

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
                caption:"申请出访计划",
                buttonicon:"ace-icon fa fa-plus pink",
                onClickButton: function(){
                    layer.newpage({
                        area: ['600px', '290px'],
                        title:'申请出访计划',
                        content:'business/cgjh/cgjh_add.jsp',
                    });
                }
            },
        ]

        var settings = {
            caption: "出访计划管理",
            data: grid_data,
            colNames:['团组号','团组类别', '出访单位', '团组级别','出访天数',"状态","操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'tzh',index:'tzh',  },
                {name:'tzlb',index:'tzlb',  },
                {name:'cfdw',index:'cfdw',  },
                {name:'tzjb',index:'tzjb',  },
                {name:'cfts',index:'cfts',  },
                {name:'zt',index:'zt',  },

                {name:'id',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        var zt = rowObject.zt;
                        if(zt == "已通过"){
                            return "<button class='btn btn-info btn-mini' onclick='editCgjh("+cellvalue+")' title='查看' ><i class='ace-icon fa fa-eye '>查看</i></button>";
                        }else{
                            return "<button class='btn btn-info btn-mini' onclick='editCgjh("+cellvalue+")' title='测试' ><i class='ace-icon fa fa-pencil '>编辑</i></button>" +
                                "&nbsp;&nbsp;&nbsp;<button class='btn btn-danger btn-mini' onclick='delUser(\"+cellvalue+\")' title='测试' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
                        }
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

    //修改出访计划
    function editCgjh(userId){
        layer.newpage({
            area: ['800px', ($(window).height()-5)+"px"],
            title:'修改出访计划',
            content:'business/cgjh/cgjh_edit.jsp',
        });
    }

    //删除出访计划
    function delCgjh(userId){
        $(grid_selector).delGridRow(userId);
    }
</script>