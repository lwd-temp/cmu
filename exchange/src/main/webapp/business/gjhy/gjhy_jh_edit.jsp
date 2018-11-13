<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/13
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://cn.edu.cmu/uitag" prefix="dm" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

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

    <!-- page specific plugin styles -->
    <link rel="stylesheet" href="assets/css/jquery-ui.custom.css" />
    <link rel="stylesheet" href="assets/css/jquery-ui.css" />
    <link rel="stylesheet" href="assets/css/ui.jqgrid.css" />
    <link rel="stylesheet" href="assets/css/chosen.css" />
    <link rel="stylesheet" href="assets/css/bootstrap-datepicker3.css" />

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

<body class="no-skin">
<!-- #section:basics/navbar.layout -->

<!-- /section:basics/navbar.layout -->
<div class="main-container" id="main-container">
    <div class="main-content">
        <div class="main-content-inner">
            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <form class="form-horizontal" id="form" role="form">
                            <input type="hidden" name="hyJh.jhid" value="${hyJh.jhid}" />
                            <!-- #section:elements.form -->
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 会议名称: </label>

                                <div class="col-xs-4">
                                    <input type="text"  name="hyJh.hymc" value="${hyJh.hymc}" id="hymc"   placeholder="会议名称"  class="col-xs-12" />
                                </div>
                                <label class="col-xs-2 control-label " > 会议编号: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="hyJh.hybh" value="${hyJh.hybh}" id="hybh"   readonly="readonly"  placeholder="会议编号保存时自动生成"  class="col-xs-12" />
                                </div>


                            </div>


                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 主办单位: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="hyJh.zbdw" value="${hyJh.zbdw}" id="zbdw"     placeholder="主办单位"  class="col-xs-12" />
                                </div>
                                <label class="col-xs-2 control-label " > 承办单位: </label>

                                <div class="col-xs-4">
                                    <input type="text"  name="hyJh.cbdw" value="${hyJh.cbdw}"  id="cbdw"  placeholder="承办单位"  class="col-xs-12" />
                                </div>

                            </div>



                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 举行日期: </label>
                                <div class="col-xs-4">

                                    <input class="form-control date-picker"   name="hyJh.jxrq" value="<fmt:formatDate value="${hyJh.jxrq}" pattern="yyyy-MM-dd"/>" id="jbrq"  type="text" data-date-format="yyyy-mm-dd" />
                                </div>

                                <label class="col-xs-2 control-label "  > 经费来源: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="hyJh.jfly"  value="${hyJh.jfly}" id="jfly" placeholder="经费来源"  class="col-xs-12" />
                                </div>

                            </div>

                            <div class="form-group">

                                <label class="col-xs-2 control-label " > 地点: </label>

                                <div class="col-xs-10">
                                    <input type="text"  name="hyJh.dd" value="${hyJh.dd}"  id="dd"  placeholder="地点"  class="col-xs-12" />
                                </div>
                            </div>


                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 负责人姓名: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="hyJh.fzrxm"  value="${hyJh.fzrxm}" id="fzrxm" placeholder="负责人姓名"  class="col-xs-12" />
                                </div>
                                <label class="col-xs-2 control-label "  > 负责人电话: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="hyJh.fzrdh" value="${hyJh.fzrdh}"  id="fzrdh"  placeholder="负责人电话"  class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 会议类型: </label>
                                <div class="col-xs-4">
                                    <dm:list  name="hyJh.hylx" value="${hyJh.hylx}" type="select"   id="hylx" tabName="t_dm_hylx" />
                                </div>
                                <div class="col-xs-6">

                                </div>
                            </div>
                            <hr/>
                            <div class="form-group">
                                <div class="col-xs-2">
                                    参会人员姓名
                                </div>
                                <div class="col-xs-2">
                                    国籍
                                </div>
                                <div class="col-xs-3">
                                    单位
                                </div>
                                <div class="col-xs-3">
                                    职务
                                </div>
                                <div class="col-xs-2">
                                    操作
                                </div>
                            </div>

                            <c:choose>
                                <c:when test="${ryList!=null && ryList.size()>0}">
                                    <c:forEach items="${ryList}" var="ry">
                                        <div class="form-group cy">
                                            <div class="col-xs-2">
                                                <input type="text"  inp="xm" name="chrys[@].xm"  value="${ry.xm}"  placeholder="姓名"  class="col-xs-12" />
                                            </div>
                                            <div class="col-xs-2">
                                                <input type="text"  inp="gj" name="chrys[@].gj"  value="${ry.gj}" placeholder="国籍"  class="col-xs-12" />
                                            </div>
                                            <div class="col-xs-3">
                                                <input type="text"  inp="dw" name="chrys[@].dw"  value="${ry.dw}"  placeholder="单位"  class="col-xs-12" />
                                            </div>
                                            <div class="col-xs-3">
                                                <input type="text"  inp="zw" name="chrys[@].zw"  value="${ry.zw}"  placeholder="职务"  class="col-xs-12" />
                                            </div>
                                            <div class="col-xs-2">
                                                <button class='btn btn-danger btn-mini' onclick='deleteCy(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
                                                <button class='btn btn-info btn-mini' onclick='appendCy(); return false;'><i class='ace-icon fa fa-plus '>添加</i>  </button>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </c:when>
                                <c:otherwise>

                                    <div class="form-group cy">
                                        <div class="col-xs-2">
                                            <input type="text"  inp="xm" name="chrys[@].xm"   placeholder="姓名"  class="col-xs-12" />
                                        </div>
                                        <div class="col-xs-2">
                                            <input type="text"  inp="gj" name="chrys[@].gj"  placeholder="国籍"  class="col-xs-12" />
                                        </div>
                                        <div class="col-xs-3">
                                            <input type="text"  inp="dw" name="chrys[@].dw"   placeholder="单位"  class="col-xs-12" />
                                        </div>
                                        <div class="col-xs-3">
                                            <input type="text"  inp="zw" name="chrys[@].zw"   placeholder="职务"  class="col-xs-12" />
                                        </div>
                                        <div class="col-xs-2">
                                            <button class='btn btn-danger btn-mini' onclick='deleteCy(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
                                            <button class='btn btn-info btn-mini' onclick='appendCy(); return false;'><i class='ace-icon fa fa-plus '>添加</i>  </button>
                                        </div>
                                    </div>
                                </c:otherwise>
                            </c:choose>


                            <div id="btns" class="col-md-offset-3 col-md-9" style = "text-align:right;">
                                <hr/>
                                <button class="btn btn-info btn-sm" id="saveHyjh" type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                    保存
                                </button>
							   </div>
							&nbsp; &nbsp; &nbsp;
                        </form>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div>
    </div><!-- /.main-content -->


</div><!-- /.main-container -->
<div id="template" style="display: none">

    <div class="form-group cy">
        <div class="col-xs-2">
            <input type="text"  inp="xm" name="chrys[@].xm"   placeholder="姓名"  class="col-xs-12" />
        </div>
        <div class="col-xs-2">
            <input type="text"  inp="gj" name="chrys[@].gj"  placeholder="国籍"  class="col-xs-12" />
        </div>
        <div class="col-xs-3">
            <input type="text"  inp="dw" name="chrys[@].dw"   placeholder="单位"  class="col-xs-12" />
        </div>
        <div class="col-xs-3">
            <input type="text"  inp="zw" name="chrys[@].zw"   placeholder="职务"  class="col-xs-12" />
        </div>
        <div class="col-xs-2">
            <button class='btn btn-danger btn-mini' onclick='deleteCy(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
            <button class='btn btn-info btn-mini' onclick='appendCy(); return false;'><i class='ace-icon fa fa-plus '>添加</i>  </button>
        </div>
    </div>
</div>

<script src='assets/js/jquery.js'></script>

<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>
<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>

<script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
<script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>

<!-- jqueryValidate验证框架-->
<script src="assets/js/jqvalidate/jquery.validate.min.js"></script>
<script src="assets/js/jqvalidate/messages_zh.js"></script>
<!--弹出层 -->
<script src="assets/js/layer/layer.js"></script>

<!--自定义js -->
<script src="assets/project/js/common-window.js"></script>


<!-- ace scripts -->


<script>
    var validator = null;
    function setFormValid(){
        validator = $("#form").setValid({
            //校验规则
            rules: {
                "hyJh.hylx":{required : true},
                "hyJh.hymc":{required : true},
                "hyJh.zbdw":{required : true},
                "hyJh.cbdw":{required : true},
                "hyJh.jxrq":{required : true},
                "hyJh.dd":{required : true},
                "hyJh.jfly":{required : true},
                "hyJh.fzrxm":{required : true},
                "hyJh.fzrdh":{required : true,isphoneNum:true},
                "chrys[@].xm":{required : true},
                "chrys[@].gj":{required : true},
                "chrys[@].dw":{required : true},
                "chrys[@].zw":{required : true},
            }
        });
    }

    $(function(){
        setFormValid();

        $("#saveHyjh").click(function(){

            if(!$("#form").valid()){
                validator.focusInvalid();
                return;
            }

            //将List类型的参数设置下标
            setRyListIndex();

            $.ajax('hyjh/save',{
                data:$("#form").serialize(),
                success:function(resp){

                    if(resp && resp.success){
                        winAlert("保存计划成功");
                        parent.refreshTable();
                        closeLayer();
                    }else{
                        winAlert("保存失败");
                    }
                }
            })

        })


    });
    //将List类型的参数设置下标
    function setRyListIndex(){
        $("form input[inp=xm]").each(function(index,el){
            $(el).attr('name','chrys['+index+'].xm');
        });

        $("form input[inp=gj]").each(function(index,el){
            $(el).attr('name','chrys['+index+'].gj');
        });

        $("form input[inp=dw]").each(function(index,el){
            $(el).attr('name','chrys['+index+'].dw');
        });
        $("form input[inp=zw]").each(function(index,el){
            $(el).attr('name','chrys['+index+'].zw');
        });

    }


    function deleteCy(btn){

        var size = $("#form .cy").size();
        if(size<=1){
            parent.layer.alert("请至少录入一个会议成员");
            return false;
        }

        var row = $(btn).parent().parent();
        row.remove();

        setFormValid();
    }


    function appendCy(){
        $("#btns").before($("#template").html());
        var cy = $("#btns").prev(".cy");
        cy.find("input").each(function(index,el){

            $(el).attr("id","formEl"+(Math.rnd()));
            $(el).rules('add', { required:true  });

        })
        setFormValid();
    }

</script>
</body>
</html>
