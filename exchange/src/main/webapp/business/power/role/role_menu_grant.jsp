<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath%>" >
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />

    <meta name="description" content="Common form elements and layouts" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="assets/css/bootstrap.css" />
    <link rel="stylesheet" href="assets/css/font-awesome.css" />

    <!-- text fonts -->
    <link rel="stylesheet" href="assets/css/ace-fonts.css" />

    <!-- ace styles -->
    <link rel="stylesheet" href="assets/css/ace.css" class="ace-main-stylesheet" id="main-ace-style" />

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="assets/css/ace-part2.css" class="ace-main-stylesheet" />
    <link rel="stylesheet" href="assets/css/ace-ie.css" />
    <![endif]-->

    <!--[if lte IE 9]>
    <![endif]-->

    <!--[if lte IE 8]>
    <script src="assets/js/html5shiv.js"></script>
    <script src="assets/js/respond.js"></script>
    <![endif]-->
</head>
<body>
<input type="hidden" id="roleId" value="${roleId}">
<div class="row" >
    <button class="btn btn-info btn-sm" id="role_grant" type="button" style="margin-left: 2px">
        <i class="ace-icon fa fa-check bigger-110"></i>
        授权
    </button>
    <div class="col-xs-11"  style="max-height: 500px;overflow-y: auto;">

        <ul id="treeDemo" class="ztree"></ul>
    </div>

</div>



<link rel="stylesheet" href="assets/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<link rel="stylesheet" href="assets/zTree/css/metroStyle/metroStyle.css" type="text/css">
<script src='assets/js/jquery.js'></script>
<script type="text/javascript" src="assets/zTree/js/jquery.ztree.all.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>

<script src="assets/project/js/common-window.js"></script>

<script LANGUAGE="JavaScript">

    var roleMenuArray = ${roleMenuArray};
    var zTreeObj;
    // zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
    var setting = {
        data:{
            simpleData: {
                enable: true,
                idKey: "menuId",
                pIdKey: "parentId",
                rootPId: 0
            },
            key: {
                name: "menuName",
                title: "menuName",
                url:'nourl'
            }
        },
        check:{
            enable: true,
            chkboxType :{ "Y" : "ps", "N" : "s" }
        },
        callback: {
            onClick: function (e, treeId, treeNode, clickFlag) {
                zTreeObj.checkNode(treeNode, !treeNode.checked, true);
            }
        }
    };
    $(document).ready(function(){
        //动态加载tree数据,并展开根节点
        $.ajax('sys/menu/list',{
            success:function(data){
                zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, data);
                var nodes = zTreeObj.getNodesByParam("menuId", "0", null);
                zTreeObj.expandNode(nodes[0], true);


                $(roleMenuArray).each(function(){
                    var roleMenu = this;

                    var nodes = zTreeObj.getNodesByParam("menuId", roleMenu.menuId, null);
                    $(nodes).each(function(){
                        var node = this;
                        zTreeObj.checkNode(node, true, false);
                    });
                });


            }
        });

        //zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, zNodes);






        $("#role_grant").click(function(){

            var nodes = zTreeObj.getCheckedNodes(true);
            if(nodes && nodes.length>0){
                var menuIds = [];
                for(var name in nodes){
                    var node = nodes[name];
                    menuIds.push(node.menuId);
                }
                grantMenu(menuIds);
            }else{
                parent.layer.alert("请选择授权菜单.....")
            }

        });

    });


    /**
     * 给角色授权菜单权限
     * @param menuIds
     */
    function grantMenu(menuIds){
        $.ajax('sys/role/grantMenu',{
            traditional:true,
            data:{"ids":menuIds,roleId:$("#roleId").val()},
            success:function(resp){
                if(resp && resp.success){
                    closeLayer();
                    winAlert("授权成功...")
                }else{
                    winAlert("操作失败,请重试...")
                }
            }
        });
    }
</script>
</body>
</html>