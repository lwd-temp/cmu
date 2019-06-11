<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div >
    <form class="form-horizontal" role="form">
        <!-- #section:elements.form -->
        <div class="form-group">
            <label class="col-sm-4 control-label no-padding-right" for="xm">护照、通行证持有人姓名: </label>
            <div class="col-sm-5">
                <input type="text" id="xm" placeholder="护照、通行证持有人姓名" class="col-xs-12" />
            </div>
            <div class="col-sm-3">
                <button class="btn btn-info btn-xs" id="query" type="button"> <i class="ace-icon fa fa-search "></i>
                    查询
                </button>
                <button class="btn btn-warning btn-xs" id="download" type="button"> <i class="ace-icon fa fa-download "></i>
                    下载护照信息
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
                caption:"添加护照、通行证",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['1250px',"750px"],
                        title:'添加护照、通行证',
                        content:'business/hzgl/hzgl_add.jsp',
                    });
                }
            }
            // ,{
            //     caption:"批量删除",
            //     buttonicon:"ace-icon fa fa-trash-o red",
            //     onClickButton: function(){
            //         var ids= $(grid_selector).jqGrid('getGridParam','selarrrow');
            //         if(ids && ids.length>0){
            //             var cindex = layer.confirm('确定删除？', {
            //                 btn: ['确定','取消'] //按钮
            //             }, function(){
            //                 layer.close(cindex);
            //                 var index = layer.loading();
            //                 setTimeout(function(){
            //                     $(ids).each(function(index,id){
            //                         $(grid_selector).jqGrid('delRowData',id);
            //                     });
            //                     layer.close(index);
            //                 },1500);
            //             });
            //         }else{
            //             layer.alert("请选择要删除的数据",{icon:3})
            //         }
            //     }
            // }
        ]


        var settings = {
            caption: "护照管理",
            url: 'hzgl/list',
            colNames:['姓名','性别','护照号码','出生日期','状态','操作'],
            navBtns:navBtns,
            pager:pager_selector,
            colModel:[
                {name:'xm',index:'xm'},
                {name:'gender',index:'gender', formatter:function(gender){
                        return dmcache.getCode("t_dm_xb",gender);
                    } },
                {name:'hzhm',index:'hzhm'},
                {name:'birthday',index:'birthday',formatter:function(birthday){
                        if(birthday==null){
                            return '';
                        }else{
                            return new Date(birthday).getYmd("yyyy-MM-dd");
                        }
                    }},
                {name:'status',index:'status', formatter:function(status){
                        return dmcache.getCode("t_dm_hzzt",status);
                    } },
                {name:'hzid',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(id, options, rowObject){
                        return "<button class='btn btn-info btn-mini' title='测试' onclick='editHz(\""+id+"\")' ><i class='ace-icon fa fa-pencil '>编辑</i></button>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class='btn btn-danger btn-mini' title='删除' onclick='delHz(\""+id+"\")' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
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

        //下载护照信息
        $("#download").click(function(){

            var sortname = $(grid_selector).jqGrid('getGridParam','sortname');
            var sortorder = $(grid_selector).jqGrid('getGridParam','sortorder');
            if(typeof(sortname) != 'string'){
                sortname = '';
            }

            window.open("hzgl/download?xm="+$("#xm").val()+"&orderCol="+sortname+"&orderType="+sortorder);
        });
    });
    function clearTable(){
        $(grid_selector).jqGrid('clearGridData');  //清空表格
    }
    function refreshTable(){
        $(grid_selector).jqGrid('setGridParam',{  // 重新加载数据
            postData:{'xm':$("#xm").val()},//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }
    //修改
    function editHz(bzid){
        layer.newpage({
            area: ['1250px',"750px"],
            title:'编辑护照、通行证',
            content:'hzgl/toEdit?id='+bzid
        });
    }
    //删除
    function delHz(bzid){
        var index = layer.dconfirm("确认删除?",function(){
            layer.close(index);
            $.ajax('hzgl/delById',{
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
</script>