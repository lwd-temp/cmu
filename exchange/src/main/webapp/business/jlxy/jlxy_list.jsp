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

            <div class="col-sm-3">
                协议名称:
                <input type="text" id="xymc" placeholder="协议名称"  />
            </div>
            <div class="col-sm-3">
                签订日期从:<input class="form-control date-picker" style="width:70%;display:inline" id="qdrq" name="qdrq"  placeholder="签订日期"     type="text" data-date-format="yyyy-mm-dd"/>
            </div>
            <div class="col-sm-3">
                到失效日期:<input class="form-control date-picker" style="width:70%;display:inline" id="sxrq" name="sxrq"  placeholder="失效日期（终止）"   type="text" data-date-format="yyyy-mm-dd"/>
            </div>
            <div class="col-sm-2">
                <button class="btn btn-info btn-xs" id="query" type="button"> <i class="ace-icon fa fa-search "></i>
                    查询
                </button>

                <button class="btn btn-warning btn-xs" id="download" type="button"> <i class="ace-icon fa fa-download "></i>
                    下载协议信息
                </button>
            </div>
        </div>

    </form>
    <div id="grid-pager"></div>

    <table id="grid-table"></table>

</div>
<script type="text/javascript">
    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";
    $(function() {

        //日期控件
        $('.date-picker').datepicker({
            autoclose: true,
            todayHighlight: true
        });

        grid_selector = "#grid-table";
        pager_selector = "#grid-pager";
        var parent_column = $(grid_selector).closest('[class*="col-"]');
        $(window).on('resize.jqGrid', function () {
            $(grid_selector).jqGrid( 'setGridWidth', parent_column.width() );
        })
        $(document).on('settings.ace.jqGrid' , function(ev, event_name, collapsed) {
            if( event_name === 'sidebar_collapsed' || event_name === 'main_container_fixed' ) {
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
                        area: ['850px', '600px'],
                        title:'添加协议',
                        content:'business/jlxy/jlxy_add.jsp',
                    });
                }
            },{
                caption:"批量删除",
                buttonicon:"ace-icon fa fa-trash-o red",
                onClickButton: function(){
                    var ids= $(grid_selector).jqGrid('getGridParam','selarrrow');
                    if(ids && ids.length>0){
                        var cindex = layer.confirm('确定删除？', {
                            btn: ['确定','取消'] //按钮
                        }, function(){
                            layer.close(cindex);
                            var index = layer.loading();
                            delMulRoles(ids);
                        });
                    }else{
                        layer.alert("请选择要删除的数据",{icon:3})
                    }
                }
            }
        ]


        var settings = {
            caption: "协议管理",
            url: 'jlxy/list',
            colNames:['ID','协议名称','签订日期','失效日期','电子协议','操作'],
            navBtns:navBtns,
            pager:pager_selector,
            colModel:[
                {name:'xyid',index:'xyid',key:true,hidden:true},
                {name:'xymc',index:'xymc',width:6,},
                {name:'qdrq',index:'qdrq',width:6,phoneHide:true,formatter:function(qdrq, options, rowObject){
                        if(qdrq==null){
                            return '';
                        }else{
                            return new Date(qdrq).getYmd("yyyy-MM-dd");
                        }
                    }},
                {name:'sxrq',index:'sxrq',width:6,phoneHide:true,formatter:function(sxrq, options, rowObject){
                        if(sxrq==null){
                            return '';
                        }else{
                            return new Date(sxrq).getYmd("yyyy-MM-dd");
                        }
                    }},
                {name:'xyid',index:'', width:12, sortable:false, resize:true,
                    formatter:function(id, options, rowObject){
                        var fileId = rowObject.uploadId;
                        return "<button class='btn btn-info btn-mini' title='上传' onclick=\"uploadXy('"+id+"')\" ><i class='ace-icon fa fa-upload '>上传</i></button>" +
                            "&nbsp;&nbsp;<button class='btn btn-warning btn-mini' onclick=\"downloadXy('"+fileId+"')\" title='下载' ><i class='ace-icon fa fa-download '>下载</i></button>";
                    }
                },
                {name:'xyid',index:'',width:13, sortable:false, resize:true,
                    formatter:function(id, options, rowObject){
                        return "<button class='btn btn-info btn-mini' title='编辑' onclick='editHzxy(\""+id+"\")' ><i class='ace-icon fa fa-pencil '>编辑</i></button>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class='btn btn-danger btn-mini' title='删除' onclick='delHzxy(\""+id+"\")' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
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
        //下载协议信息
        $("#download").click(function(){

            var sortname = $(grid_selector).jqGrid('getGridParam','sortname');
            var sortorder = $(grid_selector).jqGrid('getGridParam','sortorder');
            if(typeof(sortname) != 'string'){
                sortname = '';
            }

            window.open("jlxy/download?xymc="+$("#xymc").val()+"&qdrq="+$("#qdrq").val()+"&sxrq="+$("#sxrq").val()+"&orderCol="+sortname+"&orderType="+sortorder);
        });
    });
    function clearTable(){
        $(grid_selector).jqGrid('clearGridData');  //清空表格
    }
    function refreshTable(){
        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
            postData:{'xymc':$("#xymc").val(),
                      'qdrq':$("#qdrq").val(),
                      'sxrq':$("#sxrq").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }


    //上传协议
    function uploadXy(xyid){
        layer.newpage({
            area: ['400px', "220px"],
            title:'上传交流合作协议',
            content:'sys/file/uppage?targetUrl=jlxy/updateUploadId&xyid='+xyid,
        });
    }

    //下载协议
    function downloadXy(fileId){
        if(fileId =='null'){
            layer.alert("未查询到上传协议.");
            return ;
        }
        window.open("sys/file/jlxydownload?fileId="+fileId)
    }



    //修改
    function editHzxy(bzid){
        layer.newpage({
            area: ['850px', "600px"],
            title:'编辑协议',
            content:'jlxy/toEdit?id='+bzid
        });



    }
    //删除
    function delHzxy(bzid){
        var index = layer.dconfirm("确认删除?",function(){
            layer.close(index);
            $.ajax('jlxy/delById',{
                data:{id:bzid},
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


    function delMulRoles(ids){
        $.ajax('jlxy/delMulti',{
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


    /**
     * 上传协议成功后刷新页面
     */
    function uploadCall(){
        refreshTable();
    }
</script>