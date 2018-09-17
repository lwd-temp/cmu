<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/10
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div class="row" >
    <div class="col-xs-3"  style="max-height: 420px;overflow-y: auto;">
        <ul id="treeDemo" class="ztree"></ul>
    </div>

    <div class="col-xs-9" >
        <form class="form-horizontal"  id="addForm"  >
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 菜单名称: </label>

                <div class="col-xs-10">
                    <input type="text"  name="username" id=""   placeholder="请输入菜单名称"  class="col-xs-10" />
                </div>

            </div>
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 功能url: </label>

                <div class="col-xs-10">
                    <input type="text"  name="username" id=""   placeholder="请输入功能url"  class="col-xs-10" />
                </div>

            </div>
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 备注: </label>

                <div class="col-xs-10">
                    <input type="text"  name="username" id=""   placeholder="请输入备注"  class="col-xs-10" />
                </div>

            </div>

            <div class="col-md-offset-3 col-md-9">
                <button class="btn btn-info btn-sm" id="btn-save"  type="button">
                    <i class="ace-icon fa fa-check bigger-110"></i>
                    添加
                </button>

                &nbsp; &nbsp; &nbsp;
                <button class="btn btn-sm" type="reset">
                    <i class="ace-icon fa fa-undo bigger-110"></i>
                    重置
                </button>
            </div>


        </form>


        <!-- 修改菜单-->
        <form class="form-horizontal"  id="editForm"  style="display: none;" >
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 菜单名称: </label>

                <div class="col-xs-10">
                    <input type="text"  name="menuName" id="menuName"   placeholder="请输入菜单名称"  class="col-xs-10" />
                </div>

            </div>
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 功能url: </label>

                <div class="col-xs-10">
                    <input type="text"  name="menuUrl" id="menuUrl"   placeholder="请输入功能url"  class="col-xs-10" />
                </div>

            </div>
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 备注: </label>

                <div class="col-xs-10">
                    <input type="text"  name="menuMemo" id="menuMemo"   placeholder="请输入备注"  class="col-xs-10" />
                </div>

            </div>

            <div class="col-md-offset-3 col-md-9">
                <button class="btn btn-info btn-sm" id="btn-edit"  type="button">
                    <i class="ace-icon fa fa-check bigger-110"></i>
                    修改
                </button>

                &nbsp; &nbsp; &nbsp;
                <button class="btn btn-sm" type="reset">
                    <i class="ace-icon fa fa-undo bigger-110"></i>
                    重置
                </button>
            </div>


        </form>




    </div>

</div>

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


        $("#btn-save").click(function(){

            layer.alert("插入成功，并更新左侧菜单树...")

        });
        $("#btn-edit").click(function(){
            layer.alert("修改成功，并更新左侧菜单树...")
        });




    });
</script>
