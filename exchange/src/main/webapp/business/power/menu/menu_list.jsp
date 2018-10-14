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
        <ul id="ztree" class="ztree"></ul>
    </div>

    <div class="col-xs-9" >
        <form class="f orm-horizontal"  id="addForm" style="display: none;" >
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
        <form class="form-horizontal"  id="editForm"   >
            <input type="hidden"  name="menuId" id="menuId"    class="col-xs-10" />
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 菜单名称: </label>

                <div class="col-xs-10">
                    <input type="text"  name="menuName" id="menuName"   placeholder="请输入菜单名称"  class="col-xs-10" />
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 功能url: </label>

                <div class="col-xs-10">
                    <input type="text"  name="url" id="url"   placeholder="请输入功能url"  class="col-xs-10" />
                </div>

            </div>
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 图标: </label>

                <div class="col-xs-10">
                    <input type="text"  name="menuIcon" id="menuIcon"     class="col-xs-10" />
                </div>

            </div>  <div class="form-group">
                <label class="col-xs-2 control-label "  > 自定义样式: </label>

                <div class="col-xs-10">
                    <input type="text"  name="menuStyle" id="menuStyle"      class="col-xs-10" />
                </div>

            </div>
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 备注: </label>

                <div class="col-xs-10">
                    <input type="text"  name="memo" id="memo"   placeholder="请输入备注"  class="col-xs-10" />
                </div>

            </div>

            <div class="col-md-offset-3 col-md-9">
                <button class="btn btn-info btn-sm" id="btn-edit"  type="button">
                    <i class="ace-icon fa fa-check bigger-110"></i>
                    修改
                </button>

                &nbsp; &nbsp; &nbsp;
                <%--<button class="btn btn-sm" type="reset">
                    <i class="ace-icon fa fa-undo bigger-110"></i>
                    重置
                </button>--%>
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
        callback: {
            onClick: function(e,treeid,node,cliFlag){
               // node.name;
               /* $("#addForm").hide();
                $("#editForm").show();*/

                $("#menuId").val(node.menuId);
                $("#menuName").val(node.menuName);
                $("#url").val(node.url);
                $("#menuIcon").val(node.menuIcon);
                $("#menuStyle").val(node.menuStyle);
                $("#memo").val(node.memo);

            }
        }
    };
    // zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
    var zNodes = []

    function loadMenu(){
        $.ajax('sys/menu/list',{
            success:function(data){
                zTreeObj = $.fn.zTree.init($("#ztree"), setting, data);
                var nodes = zTreeObj.getNodesByParam("menuId", "0", null);
                zTreeObj.expandNode(nodes[0], true);
            }
        });
    }
    $(document).ready(function(){

        loadMenu();


        /*$("#btn-save").click(function(){

            layer.alert("插入成功，并更新左侧菜单树...")

        });*/
        $("#btn-edit").click(function(){


            //layer.alert("修改成功，并更新左侧菜单树..."+$("#editForm").serialize());

            $.ajax('sys/menu/save',{
                data:$("#editForm").serialize(),
                success:function(resp){
                    if(resp && resp.success){
                        layer.alert("修改成功");
                        loadMenu();
                    }else{
                        layer.alert("处理失败");
                    }
                }
            });


        });




    });
</script>
