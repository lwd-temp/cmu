<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/10
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div >
    <%--<form class="form-horizontal" role="form">
        <!-- #section:elements.form -->
        <div class="form-group">
            <label class="col-sm-4 control-label no-padding-right" for="condition"> 联系人姓名: </label>

            <div class="col-sm-5">
                <input type="text" id="condition" placeholder="联系人姓名" class="col-xs-12" />
            </div>

            <div class="col-sm-3">
                <button class="btn btn-info btn-xs" id="query" type="button"> <i class="ace-icon fa fa-search "></i>
                    查询
                </button>
            </div>
        </div>

    </form>--%>
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
        var navBtns = [ ];

        var settings = {
            caption: "联系人管理",
            /*data: grid_data,*/
            url:'quartz/list',
            colNames:['任务号','描述','任务组','任务名称',"任务类", '执行时机', '状态',"立即执行一次","操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'jobId',key:true,sortable:false, resize:true},
                {name:'desc' , sortable:false, resize:true },
                {name:'jobGroup' , sortable:false, resize:true},
                {name:'jobName' ,sortable:false, resize:true},
                {name:'jobClassName' ,sortable:false, resize:true},
                {name:'cronExpression'  , sortable:false, resize:true,
                    formatter:function(cronExpression,options, rowObject){
                        var group = rowObject.jobGroup;
                        var name = rowObject.jobName;
                        var rescheduleJobUrl = 'quartz/'+group+"/"+name+"/rescheduleJob"
                        return "<a href=\"javascript:rescheduleJob('"+rescheduleJobUrl+"','"+cronExpression+"')\">"+cronExpression+"</a>";
                    }
                },

                {name:'jobStatus' ,formatter:function(jobStatus, options, rowObject){
                            if("NORMAL" == jobStatus){
                                return "<span style='color:#60dc24'>正常(已调度)</span>";
                            }else if('PAUSED' == jobStatus){
                                return "<span style='color:crimson'>暂停</span>";
                            }else{
                                return "<span style='color:rebeccapurple'>其他</span>";
                            }
                    } },
                {name:'cronExpression',fixed:false, sortable:false, resize:true,
                    formatter:function(cronExpression, options, rowObject){
                        var group = rowObject.jobGroup;
                        var name = rowObject.jobName;
                        var startRightNowUrl = 'quartz/'+group+"/"+name+"/startRightNow"

                        return "<button class='btn btn-info btn-mini' title='立即执行一次' onclick='changeJob(\""+startRightNowUrl+"\")' ><i class='ace-icon fa fa-caret-square-o-right'>Run</i></button>" ;
                    }
                },
                {name:'cronExpression',fixed:false, sortable:false, resize:true,
                    formatter:function(cronExpression, options, rowObject){
                        var group = rowObject.jobGroup;
                        var name = rowObject.jobName;
                        var stopUrl = 'quartz/'+group+"/"+name+"/stop"
                        var reStartUrl = 'quartz/'+group+"/"+name+"/reStart"
                        var startRightNowUrl = 'quartz/'+group+"/"+name+"/startRightNow"

                        return "<button class='btn btn-danger btn-mini' title='编辑' onclick='changeJob(\""+stopUrl+"\")' ><i class='ace-icon fa fa-pencil '>停止</i></button>" +
                            "&nbsp;&nbsp;<button class='btn btn-info btn-mini' title='恢复' onclick='changeJob(\""+reStartUrl+"\")' ><i class='ace-icon fa fa-trash-o '>恢复</i></button>"
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
            page:1
        }).trigger("reloadGrid");

    }

    /**
     * 改变任务状态
     * @param url
     */
   function changeJob(url){
        $.ajax(url,{
           success:function(data){
               if(data && data.success){
                   refreshTable();
               }
           }
        });
   }


   function rescheduleJob(url,cron){
       layer.prompt({title: '请修改执行触发条件', formType: 0,value:cron}, function(editCron, index){
           layer.close(index);
           $.ajax(url,{
               data:{cron:editCron},
               success:function(data){
                   if(data && data.success){
                       refreshTable();
                       layer.alert("已修改成功");
                   }
               }
           });

       });
   }


</script>