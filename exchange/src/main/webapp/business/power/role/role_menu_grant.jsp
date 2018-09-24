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
                pIdKey: "pId",
                rootPId: 0
            }
        },
        check:{
            enable: true,
            chkboxType :{ "Y" : "ps", "N" : "s" }
        },
        callback: {
            onClick: function(e,treeid,node,cliFlag){
                // node.name;
                $("#addForm").hide();
                $("#editForm").show();

                $("#menuName").val(node.name)
                $("#menuUrl").val(node.name+"的Url")
                $("#menuMemo").val(node.name+"的备注")

            }
        }
    };
    // zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
    var zNodes = [
        {menuId:"0",	name:"系统菜单"	 ,open:true 	},
        {menuId:"1",	name:"学生交流项目管理" ,		pId:"0"	  },
        {menuId:"11",	name:"交流项目设定" ,		pId:"1"	  },
        {menuId:"12",	name:"申请交流项目" ,		pId:"1"	  },
        {menuId:"13",	name:"项目审核" ,		pId:"1"	  },
        {menuId:"14",	name:"交流报告总结" ,		pId:"1"	  },
        {menuId:"2",	name:"出国团组计划与管理" ,		pId:"0"	  },
        {menuId:"21",	name:"出访团组申请" ,		pId:"2"	  },
        {menuId:"22",	name:"出访团组审批" ,		pId:"2"	  },
        {menuId:"23",	name:"出访团组管理" ,		pId:"2"	  },
        {menuId:"3",	name:"短期出国（境）管理" ,		pId:"0"	  },
        {menuId:"31",	name:"短期出国（境）申请" ,		pId:"3"	  },
        {menuId:"32",	name:"出国（境）审批流程" ,		pId:"3"	  },
        {menuId:"33",	name:"归国管理" ,		pId:"3"	  },
        {menuId:"4",	name:"国际会议管理" ,		pId:"0"	  },
        {menuId:"41",	name:"国际会议计划" ,		pId:"4"	  },
        {menuId:"42",	name:"国际会议申报" ,		pId:"4"	  },
        {menuId:"43",	name:"国际会议总结" ,		pId:"4"	  },
        {menuId:"44",	name:"国际会议数据统计" ,		pId:"4"	  },
        {menuId:"5",	name:"因公护照管理" ,		pId:"0"	  },
        {menuId:"51",	name:"因公护照管理" ,		pId:"5"	  },
        {menuId:"6",	name:"外宾来访接待" ,		pId:"0"	  },
        {menuId:"61",	name:"来访接待申请" ,		pId:"6"	  },
        {menuId:"62",	name:"来访接待" ,			pId:"6"	  },
        {menuId:"63",	name:"来访接待总结" ,		pId:"6"	  },
        {menuId:"7",	name:"交流合作协议管理" ,		pId:"0"	  },
        {menuId:"71",	name:"交流合作协议管理" ,		pId:"7"	  },
        {menuId:"8",	name:"外籍教师管理" ,		pId:"0"	  },
        {menuId:"81",	name:"外籍教师管理" ,		pId:"8"	  },
        {menuId:"9",	name:"国际交流联系人库" ,		pId:"0"	  },
        {menuId:"91",	name:"联系人库管理" ,		pId:"9"	  }

    ];
    $(document).ready(function(){
        zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, zNodes);


        $(roleMenuArray).each(function(){
            var roleMenu = this;

            var nodes = zTreeObj.getNodesByParam("menuId", roleMenu.menuId, null);
            $(nodes).each(function(){
                var node = this;
                //console.info(node);
                zTreeObj.checkNode(node, true, false);
            });
        });



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