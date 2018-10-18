<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/10
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-xs-3"  style="max-height: 520px;overflow-y: auto;">
        <ul id="ztree" class="ztree"></ul>
    </div>

    <div class="col-xs-9">
        <form class="form-horizontal" role="form">
            <input type="hidden" id="dwh" value="" />
           <%-- <input type="text" id="ejdwh" value="" />--%>
            <!-- #section:elements.form -->
            <div class="form-group">
                <label class="col-sm-2 control-label no-padding-right"> 工号: </label>

                <div class="col-sm-3">
                    <input type="text" id="condition1" placeholder="请输入工号" class="col-xs-12"/>
                </div>

                <label class="col-sm-2 control-label no-padding-right"> 姓名: </label>

                <div class="col-sm-3">
                    <input type="text" id="condition2" placeholder="请输入姓名" class="col-xs-12"/>
                </div>

                <div class="col-sm-2">
                    <button class="btn btn-info btn-xs" id="query" type="button"><i class="ace-icon fa fa-search "></i>
                        查询
                    </button>
                </div>
            </div>

        </form>
        <div id="grid-pager"></div>

        <table id="grid-table"></table>
    </div>
</div>
<script type="text/javascript">
    var $path_base = "..";//in Ace demo this will be used for editurl parameter
</script>

<!-- inline scripts related to this page -->
<script type="text/javascript">

    var zTreeObj;
    // zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
    var setting = {
        async : {
            enable : true,//设置 zTree 是否开启异步加载模式
            url : "sys/unit/list",//Ajax 获取数据的 URL 地址
            autoParam : [ "unitId=belongUnit" ],//异步加载时需要自动提交父节点属性的参数
            dataFilter: dataFilter
        },
        data:{
            simpleData: {
                enable: true,
                idKey: "unitId",
                pIdKey: "belongUnit",
                rootPId: 0
            },
            key: {
                name: "name",
                title: "name",
                url:'nourl'
            }
        },
        callback: {
            onClick: function(event,treeId,node,cliFlag){
                $("#dwh").val(node.unitId); //后台拼接单位号，和二级单位号
                queryUser();
            },
            onExpend:function(e,treeId,node,cliFlag){
                if(node.hasChild == false){
                    //alert(node.name+",没有子节点...");
                    var iconSpan = $(".node_name:contains('"+node.name+"')").prev();
                    iconSpan.removeClass("ico_open");
                    iconSpan.addClass("ico_docu");
                }
            }
        }
    };
    function dataFilter(treeId, parentNode, childNodes) {

        if (!childNodes || childNodes.length == 0) {
            setTimeout(function(){
                //alert(parentNode.name+",没有子节点...");
                var iconSpan = $(".node_name:contains('"+parentNode.name+"')").prev();
                //alert(iconSpan.hasClass("ico_open"));
                iconSpan.removeClass("ico_open");
                iconSpan.addClass("ico_docu");

                var switchSpan = iconSpan.parent().prev();
                switchSpan.removeClass("center_open");
                switchSpan.addClass("center_docu");

            },300);
            return null;
        }
        for (var i=0, l=childNodes.length; i<l; i++) {
            childNodes[i].isParent = true;
        }
        return childNodes;
    }
    // zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
    var zNodes = []
    function loadDeptTree(){
        $.ajax('sys/unit/list',{
            success:function(data){
                $(data).each(function(index,ele){
                    ele.isParent = true;
                })
                zTreeObj = $.fn.zTree.init($("#ztree"), setting, data);
                var nodes = zTreeObj.getNodesByParam("menuId", "0", null);
                zTreeObj.expandNode(nodes[0], true);
            }
        });
    }



    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";

    $(function () {
        loadDeptTree();

        var parent_column = $(grid_selector).closest('[class*="col-"]');
        //resize to fit page size
        $(window).on('resize.jqGrid', function () {
            $(grid_selector).jqGrid('setGridWidth', parent_column.width());
        })

        //侧边栏发生变化时重新设置宽度
        $(document).on('settings.ace.jqGrid', function (ev, event_name, collapsed) {
            if (event_name === 'sidebar_collapsed' || event_name === 'main_container_fixed') {
                //setTimeout is for webkit only to give time for DOM changes and then redraw!!!
                setTimeout(function () {
                    $(grid_selector).jqGrid('setGridWidth', parent_column.width());
                }, 0);
            }
        })

        //自定义 按钮
        var navBtns = [];

        var settings = {
            caption: "教职工信息",
            postData: {'condition': $("#condition").val()},
            gridview: false,
            url: 'sys/jzg/list',
            datatype: "json",
            navBtns: navBtns,//自定义按钮
            pager: pager_selector,
            colNames: ['工号',"姓名","操作"],
            colModel: [
                {name: 'gh', index: 'gh'},
                {name: 'xm', index: 'xm'},
                {name: 'gh', index: '',formatter:function(gh){
                        return "<button class='btn btn-info btn-mini' title='管理权限' onclick='grantRole(\""+gh+"\")' ><i class='ace-icon fa fa-pencil '>授权</i></button>";
                    }},

            ]

        }


        //渲染jqGrid表格 ,包括渲染 分页信息
        $(grid_selector).tables(settings);


        //查询按钮添加事件
        $("#query").click(function () {
            queryUser();
        });

    });

    function queryUser(){

        $(grid_selector).jqGrid('setGridParam', {  // 重新加载数据
            postData: {
                'gh': $("#condition1").val(),
                'xm': $("#condition2").val(),
                'dwh': $("#dwh").val(),
                /*'ejdwh': $("#ejdwh").val()*/
            },
            page: 1
        }).trigger("reloadGrid");
    }


    //修改用户
    function grantRole(gh) {
        layer.newpage({
            area: ['800px', ($(window).height()-50)+"px"],
            title: '给用户授权',
            content: 'business/power/user/user_grant.jsp?gh='+gh,
        });
    }

</script>