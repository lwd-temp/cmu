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
<div class="row" >
    <button class="btn btn-info btn-sm" id="role_grant" type="button" style="margin-left: 2px">
        <i class="ace-icon fa fa-check bigger-110"></i>
        授权
    </button>
    <div class="col-xs-11"  style="max-height: 320px;overflow-y: auto;">

        <ul id="treeDemo" class="ztree"></ul>
    </div>


</div>



<link rel="stylesheet" href="assets/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<link rel="stylesheet" href="assets/zTree/css/metroStyle/metroStyle.css" type="text/css">
<script src='assets/js/jquery.js'></script>
<script type="text/javascript" src="assets/zTree/js/jquery.ztree.all.js"></script>
<script LANGUAGE="JavaScript">
    var zTreeObj;
    // zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
    var setting = {
        data:{
            simpleData: {
                enable: true,
                idKey: "id",
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
        {id:"0",	name:"系统菜单"	 ,open:true 	},
        {id:"1",	name:"学生交流项目管理" ,		pId:"0"	  },
        {id:"11",	name:"交流项目设定" ,		pId:"1"	  },
        {id:"12",	name:"申请交流项目" ,		pId:"1"	  },
        {id:"13",	name:"项目审核" ,		pId:"1"	  },
        {id:"13",	name:"交流报告总结" ,		pId:"1"	  },
        {id:"2",	name:"出国团组计划与管理" ,		pId:"0"	  },
        {id:"21",	name:"出访团组申请" ,		pId:"2"	  },
        {id:"22",	name:"出访团组审批" ,		pId:"2"	  },
        {id:"23",	name:"出访团组管理" ,		pId:"2"	  },
        {id:"3",	name:"短期出国（境）管理" ,		pId:"0"	  },
        {id:"31",	name:"短期出国（境）申请" ,		pId:"3"	  },
        {id:"32",	name:"出国（境）审批流程" ,		pId:"3"	  },
        {id:"33",	name:"归国管理" ,		pId:"3"	  },
        {id:"4",	name:"国际会议管理" ,		pId:"0"	  },
        {id:"41",	name:"国际会议计划" ,		pId:"4"	  },
        {id:"42",	name:"国际会议申报" ,		pId:"4"	  },
        {id:"43",	name:"国际会议总结" ,		pId:"4"	  },
        {id:"44",	name:"国际会议数据统计" ,		pId:"4"	  },
        {id:"5",	name:"因公护照管理" ,		pId:"0"	  },
        {id:"51",	name:"因公护照管理" ,		pId:"5"	  },
        {id:"6",	name:"外宾来访接待" ,		pId:"0"	  },
        {id:"61",	name:"来访接待申请" ,		pId:"6"	  },
        {id:"62",	name:"来访接待" ,			pId:"6"	  },
        {id:"63",	name:"来访接待总结" ,		pId:"6"	  },
        {id:"7",	name:"交流合作协议管理" ,		pId:"0"	  },
        {id:"71",	name:"交流合作协议管理" ,		pId:"7"	  },
        {id:"8",	name:"外籍教师管理" ,		pId:"0"	  },
        {id:"81",	name:"外籍教师管理" ,		pId:"8"	  },
        {id:"9",	name:"国际交流联系人库" ,		pId:"0"	  },
        {id:"91",	name:"联系人库管理" ,		pId:"9"	  }

    ];
    $(document).ready(function(){
        zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, zNodes);


        $("#role_grant").click(function(){

            var index = parent.layer.getframeindex(window.name); //获取窗口索引
            parent.layer.close(index);
            parent.layer.alert("授权成功。。。")
        });




    });
</script>
</body>
</html>