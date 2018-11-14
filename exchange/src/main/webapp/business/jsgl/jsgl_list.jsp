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
            <label class="col-sm-2 control-label no-padding-right" for="condition1"> 外籍教师姓: </label>

            <div class="col-sm-2">
                <input type="text" id="condition1" placeholder="外籍教师姓" class="col-xs-12" />
            </div>
            <label class="col-sm-1 control-label no-padding-right" for="condition2"> 外籍教师名: </label>
            <div class="col-sm-2">
                <input type="text" id="condition2" placeholder="外籍教师名" class="col-xs-12" />
            </div>
            <label class="col-sm-1 control-label no-padding-right" for="condition3"> 中文姓名: </label>
            <div class="col-sm-2">
                <input type="text" id="condition3" placeholder="中文姓名" class="col-xs-12" />
            </div>
            <div class="col-sm-2">
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
                caption:"添加教师",
                buttonicon:"ace-icon fa fa-plus orange",
                onClickButton: function(){
                    layer.newpage({
                        area: ['1100px', '600px'],
                        title:'添加教师',
                        content:'business/jsgl/jsgl_add.jsp',
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
                            layer.close(cindex);
                            delMulTeachers(ids);

                        });
                    }else{
                        layer.alert("请选择要删除的数据",{icon:3})
                    }

                }
            }
        ]

        var settings = {
            caption: "教师管理",
            url:'wjjs/list',
            colNames:['ID','姓','名','中文姓名','性别', '国籍', '出生日期','婚姻状况',"操作"],
            navBtns:navBtns,//自定义按钮
            pager:pager_selector,
            colModel:[
                {name:'tid',index:'tid', key:true,hidden:true  },
                {name:'jsx',index:'jsx', formatter:function(jsx,options,rowObject){
                        if(jsx==null){
                            return '';
                        }else{
                            return jsx;
                        }
                     } },
                {name:'jsm',index:'jsm', formatter:function(jsm,options,rowObject){
                        if(jsm==null){
                            return '';
                        }else{
                            return jsm;
                        }
                    } },
                {name:'chineseName',index:'chineseName', formatter:function(chineseName,options,rowObject){
                        if(chineseName==null){
                            return '';
                        }else{
                            return chineseName;
                        }
                    } },
                {name:'gender',index:'gender',
                    formatter:function(gender){
                        return dmcache.getCode('t_dm_xb',gender);
                    }
                },
                {name:'gj',index:'gj',  },
                {name:'birthday',index:'birthday',formatter:function(time){
                        if(time==null){
                            return '';
                        }else{
                            return new Date(time).getYmd("yyyy-MM-dd");
                        }
                    }  },
                {name:'hyzk',index:'hyzk',  },


                {name:'tid',index:'', fixed:true, sortable:false, resize:true,
                    formatter:function(tid, options, rowObject){
                        return "<button class='btn btn-info btn-mini' title='编辑' onclick='editjsgl(\""+tid+"\")' ><i class='ace-icon fa fa-pencil '>编辑</i></button>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class='btn btn-danger btn-mini' title='删除' onclick='deljsgl(\""+tid+"\")' ><i class='ace-icon fa fa-trash-o '>删除</i></button>";
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
                'jsx':$("#condition1").val(),
                'jsm':$("#condition2").val(),
                'chineseName':$("#condition3").val()
            },//条件查询项后台发送的条件数据
            page:1
        }).trigger("reloadGrid");
    }



    //修改用户
    function editjsgl(tid){
        layer.newpage({
            area: ['1100px', ($(window).height()-100)+"px"],
            title:'编辑教师',
            content:'wjjs/toEdit?id='+tid
        });
    }


    function deljsgl(lxrId){
        var index = layer.dconfirm("确认删除?",function(){
            layer.close(index);

            $.ajax('wjjs/delById',{
                data:{id:lxrId},
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

    function delMulTeachers(ids){
        $.ajax('wjjs/delMulti',{
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

</script>