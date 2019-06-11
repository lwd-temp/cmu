<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/10
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://cn.edu.cmu/uitag" prefix="dm" %>


<div >
    <form class="form-horizontal" role="form">
        <!-- #section:elements.form -->
        <div class="form-group">


            <div class="col-sm-4">
                会议编号:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  id="condition1"  placeholder="请输入会议编号" class="" />
            </div>

            <div class="col-sm-4">
                会议名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  id="condition2"  placeholder="请输入会议名称" class="" />
            </div>

            <div class="col-sm-4">
                会议类型:<dm:list tabName="T_DM_HYLX" id="condition3" name="hylx"  style="width:70%;display:inline"></dm:list>
            </div>


        </div>

        <div class="form-group">


            <div class="col-sm-4">
                会议日期从:
                <input class="form-control date-picker" style="width:70%;display:inline" id="condition4" name="condition4"  placeholder="举办会议日期"     type="text" data-date-format="yyyy-mm-dd"/>
            </div>


            <div class="col-sm-4">
                到会议日期:
                <input class="form-control date-picker" style="width:70%;display:inline" id="condition5" name="condition5"  placeholder="举办会议日期（终止）"     type="text" data-date-format="yyyy-mm-dd"/>

            </div>

            <div class="col-sm-4">
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



    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";


    $(function() {

        //日期控件
        $('.date-picker').datepicker({
            autoclose: true,
            todayHighlight: true
        });



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
        var navBtns = [];

        var settings = {
            caption: "综合统计查询",
           /* data: grid_data,*/
            url:'hytj/list',
            colNames:["会议编号","会议名称","举行日期(开始)","举行日期(结束)","经费来源","会议类型", "是否执行","是否总结"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'hybh',index:'hybh',  },
                {name:'hymc',index:'hymc',  },

                {name:'jxrqKs',index:'jxrq_ks',formatter:function(jxrqKs){
                        return new Date(jxrqKs).getYmd("yyyy-MM-dd");
                    }  },
                {name:'jxrqJs',index:'jxrq_js',formatter:function(jxrqJs){
                        return new Date(jxrqJs).getYmd("yyyy-MM-dd");
                    }  },
                {name:'jfly',index:'jfly',  },
                {name:'hylx',index:'hylx', formatter:function (hylx) {
                        return dmcache.getCode('t_dm_hylx',hylx);
                    } },
                {name:'sfzxjh',index:'sfzxjh',  formatter:function(sfzxjh, options, rowObject){
                    var sbid = rowObject.sbid;
                    if(sfzxjh == '1'){//查看申报信息
                        return "<a href='javascript:showSbInfo(\""+sbid+"\")' >已执行</a>";
                    }else{
                        return "未执行";
                    }

                 } },
                {name:'sfzj',index:'sfzj', formatter:function(sfzj, options, rowObject){
                        var zjid = rowObject.zjid;
                        if(sfzj == '1'){//查看总结信息
                            return "<a href='javascript:showZjInfo(\""+zjid+"\")' >已总结</a>";
                        }else{
                            return "未总结";
                        }
                }  },
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
                'hybh':$("#condition1").val(),
                'hymc':$("#condition2").val(),
                'hylx':$("#condition3").val(),
                'jxrqKs':$("#condition4").val(),
                'jxrqJs':$("#condition5").val()
            },
            page:1
        }).trigger("reloadGrid");
    }


    //查看申报
    function showSbInfo(sbid){
        var index = layer.newpage({
            area: ['1100px', "750px"],
            title:'查看会议申报信息',
            content:'hysb/toEdit?type=show&id='+sbid,
        });
        layer.full(index);
    }

    //查看总结
    function showZjInfo(zjid){
        layer.newpage({
            area: ['1100px',"600px"],
            title:'查看会议总结信息',
            content:'hyzj/toEdit?type=show&id='+zjid,
        });
    }

</script>