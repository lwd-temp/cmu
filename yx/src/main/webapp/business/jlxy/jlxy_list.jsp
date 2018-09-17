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
            <label class="col-sm-4 control-label no-padding-right" for="form-field-1"> 协议名称: </label>

            <div class="col-sm-5">
                <input type="text" id="form-field-1" placeholder="协议名称" class="col-xs-12" />
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
            {id:"1" ,xymc:"项目名称1" ,hzfmc:"合作方名称1",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
            {id:"2" ,xymc:"项目名称2" ,hzfmc:"合作方名称2",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
            {id:"3" ,xymc:"项目名称3" ,hzfmc:"合作方名称3",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
            {id:"4" ,xymc:"项目名称4" ,hzfmc:"合作方名称4",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
            {id:"5" ,xymc:"项目名称5" ,hzfmc:"合作方名称5",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
            {id:"6" ,xymc:"项目名称6" ,hzfmc:"合作方名称6",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
            {id:"7" ,xymc:"项目名称7" ,hzfmc:"合作方名称7",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
            {id:"8" ,xymc:"项目名称8" ,hzfmc:"合作方名称8",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
            {id:"9" ,xymc:"项目名称9" ,hzfmc:"合作方名称9",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
            {id:"10" ,xymc:"项目名称10" ,hzfmc:"合作方名称10",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
            {id:"11" ,xymc:"项目名称11" ,hzfmc:"合作方名称11",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
            {id:"12" ,xymc:"项目名称12" ,hzfmc:"合作方名称12",	qdrq:"2017-01-01",	sxrq:"2019-01-01",  gb:'中国'},
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
                caption:"添加协议",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['900px', ($(window).height()-20)+'px'],
                        title:'添加协议',
                        content:'business/jlxy/jlxy_add.jsp',
                    });
                }

            }
        ]
        var settings = {
            caption: "交流协议管理",
            data: grid_data,
            colNames:['协议名称','合作方名称', '签订日期', '失效日期','国别',"电子协议","操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'xymc',index:'xymc',  },
                {name:'hzfmc',index:'hzfmc',  },
                {name:'qdrq',index:'qdrq',  },
                {name:'sxrq',index:'sxrq',  },
                {name:'gb',index:'gb',  },

                {name:'id',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        return "<button class='btn btn-info btn-mini' title='测试' onclick='uploadXy("+cellvalue+")' ><i class='ace-icon fa fa-upload '>上传</i></button>" +
                            "&nbsp;&nbsp;<button class='btn btn-danger btn-mini' onclick='downloadXy("+cellvalue+")' title='测试' ><i class='ace-icon fa fa-download '>下载</i></button>";
                    }
                },
                {name:'id',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(cellvalue, options, rowObject){
                        return "<button class='btn btn-info btn-mini' title='测试' onclick='editXy("+cellvalue+")' ><i class='ace-icon fa fa-pencil '>修改</i></button>" +
                            "&nbsp;&nbsp;<button class='btn btn-danger btn-mini' onclick='delXy("+cellvalue+")' title='测试' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
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



    //上传协议
    function uploadXy(userId){
        layer.newpage({
            area: ['600px', '300px'],
            title:'上传协议',
            content:'business/jlxy/jlxy_upload.jsp',
        });
    }

    //下载协议
    function downloadXy(userId){
        window.open("alink/doc/hzxy.png")
    }

    //修改协议
    function editXy(userId){
        layer.newpage({
            area: ['900px', ($(window).height()-20)+'px'],
            title:'协议编辑',
            content:'business/jlxy/jlxy_edit.jsp',
        });
    }

    //删除协议
    function delXy(userId){
        $(grid_selector).delGridRow(userId);
    }
</script>