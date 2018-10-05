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
            <label class="col-sm-4 control-label no-padding-right" for="condition"> 主办单位或承办单位: </label>

            <div class="col-sm-5">
                <input type="text" id="condition" placeholder="请输入主办单位或承办单位" class="col-xs-12" />
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
                caption:"申报会议",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    var confirmIndex = layer.confirm("是否填写过会议计划",{
                        btn:["选择计划后填报","无计划立即申报"]
                    },function(){//选择计划后填报
                        layer.close(confirmIndex);
                        //alert(confirmIndex);
                        var index = layer.newpage({
                            area: ['1000px', ($(window).height()-10)+"px"],
                            title:'选择申报的会议计划',
                            content:'business/gjhy/gjhy_jh_list_select.jsp',
                        });
                        layer.full(index);
                    },function(){//无计划立即申报
                        layer.close(confirmIndex);
                        layer.newpage({
                            area: ['1100px', ($(window).height()-10)+"px"],
                            title:'申报会议',
                            content:'business/gjhy/gjhy_sb_add.jsp',
                        });
                    })
                }
            }
        ]

        var settings = {
           /* caption: "已申报国际会议计划列表",*/
            url:'hysb/list',
            colNames:["会议编号","会议名称","主办单位","承办单位","举行日期","地点","经费来源" ,"状态","操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'hybh',index:'hybh',  },
                {name:'hymc',index:'hymc',  },
                {name:'zbdw',index:'zbdw',  },
                {name:'cbdw',index:'cbdw',  },
                {name:'jxrq',index:'jxrq', formatter:function(jxrq){
                        return new Date(jxrq).getYmd("yyyy年MM月dd日")
                    } },
                {name:'dd',index:'dd',  },
                {name:'jfly',index:'jfly',  },
                {name:'status',index:'status', formatter:function(status){
                        var ztText = "";
                        if("01" == status){
                            ztText = "暂存";
                        }else if("02" == status){
                            ztText = "已提交";
                        }else if("03" == status){
                            ztText = "已退回";
                        }else if("04" == status){
                            ztText = "审核通过";
                        }
                        return ztText;
                    } },

                {name:'sbid',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(id, options, rowObject){
                        var status = rowObject.status;
                        var btns = "";

                        if("01" == status || "03" == status){
                            btns = "<button class='btn btn-info btn-mini' title='测试' onclick='editHysb(\""+id+"\")' ><i class='ace-icon fa fa-pencil'>编辑</i></button>" +
                                "&nbsp;&nbsp;<button class='btn btn-danger btn-mini' onclick='delHysb(\""+id+"\")' title='测试' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
                        }else{
                            btns = "<button class='btn btn-success btn-mini' onclick='showSbInfo("+id+")' title='查看' ><i class='ace-icon fa fa-eye '>查看</i></button>";

                        }
                        return btns;
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
            postData:{
                'zbdw':$("#condition").val(),
                'cbdw':$("#condition").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");



    }

    //修改用户
    function editHysb(sbid){
        layer.newpage({
            area: ['1100px', ($(window).height()-10)+"px"],
            title:'修改会议申报信息',
            content:'hysb/toEdit?id='+sbid,
        });
    }

    //删除用户
    function delUser(sbid){
        $(grid_selector).delGridRow(userId);
    }

    //查看用户
    function showSbInfo(sbid){
        layer.newpage({
            area: ['1100px', ($(window).height()-10)+"px"],
            title:'查看会议申报信息',
            content:'business/gjhy/gjhy_sb_show.jsp',
        });
    }

</script>