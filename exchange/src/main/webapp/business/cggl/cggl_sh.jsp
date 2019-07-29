<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://cn.edu.cmu/uitag" prefix="dm" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <base href="<%=basePath%>">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <meta name="description" content="Common form elements and layouts"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="assets/css/bootstrap.css"/>
    <link rel="stylesheet" href="assets/css/font-awesome.css"/>
    <!-- page specific plugin styles -->
    <link rel="stylesheet" href="assets/css/jquery-ui.custom.css"/>
    <link rel="stylesheet" href="assets/css/jquery-ui.css"/>
    <link rel="stylesheet" href="assets/css/ui.jqgrid.css"/>
    <link rel="stylesheet" href="assets/css/chosen.css"/>
    <link rel="stylesheet" href="assets/css/bootstrap-datepicker3.css"/>
    <!-- text fonts -->
    <link rel="stylesheet" href="assets/css/ace-fonts.css"/>
    <!-- ace styles -->
    <link rel="stylesheet" href="assets/css/ace.css" class="ace-main-stylesheet" id="main-ace-style"/>
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="assets/css/ace-part2.css" class="ace-main-stylesheet"/>
    <link rel="stylesheet" href="assets/css/ace-ie.css"/>
    <![endif]-->
    <!--[if lte IE 9]>
    <![endif]-->
    <!--[if lte IE 8]>
    <script src="assets/js/html5shiv.js"></script>
    <script src="assets/js/respond.js"></script>
    <![endif]-->
    <style>
        body {
            background: #fff;
        }
    </style>
</head>
<body class="no-skin">
<form class="form-horizontal" id="form" role="form">
    <div class="tabbable">
        <div class="tab-content">
            <div id="home" class="tab-pane fade in active">
                <input type="hidden" name="status" id="status" value="${cgdqcgj.status}" />
                <input type="hidden" name="cgid" id="cgid" value="${cgdqcgj.cgid}" />
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 姓名: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="xm" id="xm" value="${cgdqcgj.xm}"  readonly="readonly"    class="col-xs-12" />
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label"  > 性别: </label>
                    <div class="col-xs-12 col-sm-4">
                        <dm:list tabName="t_dm_xb"  name="xb" id="xb" value="${cgdqcgj.xb}" type="radio" disabled="disabled"  ></dm:list>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 出生日期 : </label>
                    <div class="col-xs-12 col-sm-4">

                        <input class="form-control" name="csrq" id="csrq"
                               value="<fmt:formatDate value="${cgdqcgj.csrq}" pattern="yyyy-MM-dd"/>" readonly="readonly"
                               type="text" data-date-format="yyyy-mm-dd" />

                    </div>
                    <label class="col-xs-12 col-sm-2 control-label"  > 出生地: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="csd" id="csd"   value="${cgdqcgj.csd}" readonly="readonly"   class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 户籍所在地  : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="hjszd"  id="hjszd"   value="${cgdqcgj.hjszd}"   readonly="readonly"    class="col-xs-12" />
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label"  > 身份证号: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="sfzh"  id="sfzh" value="${cgdqcgj.sfzh}"  readonly="readonly"     class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 所属二级单位   : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="hidden" name="ssejdw"  value="${cgdqcgj.ssejdw}" />
                        <input type="text"   value="${ssejdwMc}"  readonly="readonly"  class="col-xs-12" />
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label"  > 科室: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="ks"  id="ks"   readonly="readonly"   value="${cgdqcgj.ks}"  class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 职务   : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="zw"   id="zw"  value="${cgdqcgj.zw}" readonly="readonly"   class="col-xs-12" />
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label"  > 职称: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="zc"   id="zc"  value="${cgdqcgj.zc}" readonly="readonly"   class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 联系电话   : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="yddh" id="yddh" value="${cgdqcgj.lxdh}" readonly="readonly"   class="col-xs-12" />
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label "  > 邮箱: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="dzxx" id="dzxx" value="${cgdqcgj.email}" readonly="readonly"    class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 出访国家（地区）   : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="cfgj"   value="${cgdqcgj.cfgj}" readonly="readonly"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-12 col-sm-2 control-label"  > 入境城市（地区）: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="rjcs"   value="${cgdqcgj.rjcs}"  readonly="readonly"   class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 出访团组号   : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="hidden"  name="tzid"  id="tzid"   value="${cgdqcgj.tzid}"/>
                        <input type="text"  id="tzh" value="${tzh}"  readonly="readonly" class="col-xs-12" />
                    </div>

                    <label class="col-xs-12 col-sm-2 control-label"  > 出访团组名称   : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  id="tzmc" value="${tzmc}"   readonly="readonly" class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 出访开始日期 </label>
                    <div class="col-xs-12 col-sm-4">
                        <input class="form-control date-picker" name="cfksrq"
                               value="<fmt:formatDate value="${cgdqcgj.cfksrq}" pattern="yyyy-MM-dd"/>"
                               readonly="readonly"    id="cfksrq" type="text" data-date-format="yyyy-mm-dd" />
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label"  > 出访结束日期   : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input class="form-control date-picker" name="cfjsrq"
                               value="<fmt:formatDate value="${cgdqcgj.cfjsrq}" pattern="yyyy-MM-dd"/>"
                               readonly="readonly"    id="cfjsrq" type="text" data-date-format="yyyy-mm-dd" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 出访目的: </label>
                    <div class="col-xs-10">
                        <dm:list tabName="t_dm_cfmd"  name="cfmd" id="cfmd" value="${cgdqcgj.cfmd}" disabled="disabled"   data-placeholder="请选择出访目的"   ></dm:list>
                    </div>
                </div>
                <div class="form-group" id="cfmdQt">
                    <label class="col-xs-12 col-sm-2 control-label"  > 出访目的—其他: </label>
                    <div class="col-xs-10">
                        <input type="text"  name="cfmdQt" value="${cgdqcgj.cfmdQt}"  readonly="readonly"     class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 邀请人姓名   : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="yqrXm"  value="${cgdqcgj.yqrXm}"   readonly="readonly"       class="col-xs-12" />
                    </div>

                    <label class="col-xs-12 col-sm-2 control-label"  > 邀请人职务: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="yqrZw"   value="${cgdqcgj.yqrZw}"  readonly="readonly"     class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                <label class="col-xs-12 col-sm-2 control-label"  > 邀请人姓名(英文)   : </label>
                <div class="col-xs-12 col-sm-4">
                    <input type="text"  name="yqrXmEn"  value="${cgdqcgj.yqrXmEn}" readonly="readonly"    class="col-xs-12" />
                </div>

                <label class="col-xs-12 col-sm-2 control-label"  > 邀请人职务(英文): </label>
                <div class="col-xs-12 col-sm-4">
                    <input type="text"  name="yqrZwEn"    value="${cgdqcgj.yqrZwEn}"  readonly="readonly"     class="col-xs-12" />
                </div>
            </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 邀请人单位   : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="yqrDw"   value="${cgdqcgj.yqrDw}"   readonly="readonly"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-12 col-sm-2 control-label"  > 邀请人详细地址: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="yqrXxdz"   value="${cgdqcgj.yqrXxdz}"  readonly="readonly"     class="col-xs-12" />
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 邀请人单位(英文)   : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="yqrDwEn"   value="${cgdqcgj.yqrDwEn}"   readonly="readonly"     class="col-xs-12" />
                    </div>

                    <label class="col-xs-12 col-sm-2 control-label"  > 邀请人详细地址(英文): </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="yqrXxdzEn"   value="${cgdqcgj.yqrXxdzEn}"  readonly="readonly"       class="col-xs-12" />
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 邀请人电话  : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="yqrDh"    value="${cgdqcgj.yqrDh}"  readonly="readonly"      class="col-xs-12" />
                    </div>

                    <%--<label class="col-xs-12 col-sm-2 control-label"  > 邀请人电话(英文): </label>--%>
                    <%--<div class="col-xs-12 col-sm-4">--%>
                        <%--<input type="text"  name="yqrDhEn"   value="${cgdqcgj.yqrDhEn}"  readonly="readonly"       class="col-xs-12" />--%>
                    <%--</div>--%>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 邀请方背景资料简介(150字以上): </label>
                    <div class="col-xs-10">
                        <textarea name="ysfbjzljj" id="ysfbjzljj" disabled="disabled" disabled="disabled" cols="120" rows="10">${cgdqcgj.ysfbjzljj}</textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 出访任务简介  : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="cfrwjj" value="${cgdqcgj.cfrwjj}" disabled="disabled" disabled="disabled" placeholder="请输入出访任务简介"    class="col-xs-12" />
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label"  > 出访意义  : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="cfyy" value="${cgdqcgj.cfyy}" disabled="disabled" disabled="disabled" placeholder="请输入出访意义"    class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 申请类别  : </label>
                    <div class="col-xs-12 col-sm-4">
                        <dm:list tabName="t_dm_cgsqlx"  name="cglx" id="cglx" value="${cgdqcgj.cglx}" disabled="disabled"   data-placeholder="请选择申请类别"  ></dm:list>
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label"  > 年内出访次数  : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="nncfcs"  value="${cgdqcgj.nncfcs}" readonly="readonly"      class="col-xs-12" />
                    </div>
                </div>

                <div class="form-group jfysmx">
                    <label class="col-xs-12 col-sm-2 control-label"> 经费预算明细  : </label>
                    <div class="col-xs-10">
                        <textarea class="form-control" name="jfysmx" readonly="readonly"   maxlength="300">${cgdqcgj.jfysmx}</textarea>
                    </div>
                </div>
                <div class="form-group jfyshj">
                    <label class="col-xs-12 col-sm-2 control-label"> 预算合计  : </label>
                    <div class="col-xs-10">
                        <input type="text"  name="jfyshj"  value="${cgdqcgj.jfyshj}" readonly="readonly"   class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 申请人其他社会任职  : </label>
                    <div class="col-xs-10">
                        <textarea class="form-control limited" name="qtshrz"  readonly="readonly"   maxlength="300">${cgdqcgj.qtshrz}</textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label"  > 审核结果  : </label>
                    <div class="col-xs-12 col-sm-4">
                        <dm:list tabName="t_dm_cgspjg" onchange="shjgcs(this)"  name="shjg" id="shjg"   ></dm:list>
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label"  > 审核意见  : </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="shyj"   class="col-xs-12" />
                    </div>
                </div>
                <div class="col-md-offset-3 col-md-9" style = "text-align:right;">
                    <hr/>
                    <button class="btn btn-info btn-sm" id="btnPass" type="button">
                        <i class="ace-icon fa fa-check bigger-110"></i>
                        通过
                    </button>
                    &nbsp;&nbsp;&nbsp;
                    <button class="btn btn-danger btn-sm" id="btnBack" type="button">
                        <i class="ace-icon fa fa-backward bigger-110"></i>
                        退回
                    </button>
                    <%--&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <button class="btn btn-success btn-sm" id="btnClose" type="button">
                        <i class="ace-icon fa fa-close bigger-110"></i>
                        关闭
                    </button>--%>
                </div>
                &nbsp;&nbsp;&nbsp;
            </div>
        </div>
    </div>
</form>
<script src='assets/js/jquery.js'></script>
<!-- jqueryValidate验证框架-->
<script src="assets/js/jqvalidate/jquery.validate.min.js"></script>
<script src="assets/js/jqvalidate/messages_zh.js"></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>
<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>
<script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
<script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>
<!-- ace scripts -->
<!-- jqueryValidate验证框架-->
<script src="assets/js/jqvalidate/jquery.validate.min.js"></script>
<script src="assets/js/jqvalidate/messages_zh.js"></script>
<!--弹出层 -->
<script src="assets/js/layer/layer.js"></script>
<!--自定义js -->
<script src="assets/project/js/common-window.js"></script>

<script>

    $(function () {
        var cfmd =  $("#cfmd").val();
        if (cfmd == '99') {
            $("#cfmdQt").show();
        }else{
            $("#cfmdQt").hide();
        }
        var cglx =  $("#cglx").val();
        if (cglx == '01') {//因私短期出国
            $(".jfysmx").hide();
            $(".jfyshj").hide();
        }else{
            $(".jfysmx").show();
            $(".jfyshj").show();
        }

        $("#btnClose").click(function(){
            closeLayer();
        });
        $("#btnPass").click(function(){//通过
            $("#status").val("04");
            sh();
        });
        $("#btnBack").click(function(){//退回
            $("#status").val("03");
            sh();
        });
    });
    function shjgcs(select){
        var val = $(select).val();
        if (val=='01'){//资料需要修改
            $("#btnPass").attr("disabled","disabled");
        }
        if (val=='02'||val=='03') {//资料合格  办结
            $("#btnPass").removeAttr("disabled");
        }
    }
    //审核，03 退回， 04通过
    function sh(){
            $.ajax('cggl/shSave',{
                data:$("#form").serialize(),
                success:function(res){
                    if(res && res.success){
                        winAlert("处理成功");
                        parent.refreshTable();
                        closeLayer();
                    }else{
                        winAlert("处理失败");
                    }
                }
            })

        }



</script>
</body>
</html>