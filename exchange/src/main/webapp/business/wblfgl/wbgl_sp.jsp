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
                <input type="hidden" name="wbjdSq.status" id="status" value="${wbjdSq.status}" />
                <input type="hidden" name="wbjdSq.lfid" id="lfid" value="${wbjdSq.lfid}" />

                <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 接待类型: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_wblf_jdlx"  id="jdlx" name="wbjdSq.jdlx" disabled="disabled" value="${wbjdSq.jdlx}" data-placeholder="请选接待类型" ></dm:list>
                    </div>
                    <label class="col-xs-2 control-label "  > 接待部门: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " id="jdbm" name="wbjdSq.jdbm" disabled="disabled" value="${wbjdSq.jdbm}" type="text"   />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 代表团名称: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="wbjdSq.dbtmc"   placeholder="" disabled="disabled" value="${wbjdSq.dbtmc}" class="col-xs-12" />
                    </div>
                    <label class="col-xs-2 control-label " > 来访人数: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="wbjdSq.lfrs"   placeholder="" disabled="disabled" value="${wbjdSq.lfrs}"  class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 来访时间起: </label>
                    <div class="col-xs-4">
                        <input class="form-control date-picker" name="wbjdSq.lfsjStart" disabled="disabled"
                               value="<fmt:formatDate value="${wbjdSq.lfsjStart}" pattern="yyyy-MM-dd"/>"
                               id="lfsjStart" type="text" data-date-format="yyyy-mm-dd" />
                    </div>
                    <label class="col-xs-2 control-label "  > 来访时间止: </label>
                    <div class="col-xs-4">
                        <input class="form-control date-picker" name="wbjdSq.lfsjEnd" disabled="disabled"
                               value="<fmt:formatDate value="${wbjdSq.lfsjEnd}" pattern="yyyy-MM-dd"/>"
                               id="lfsjEnd" type="text" data-date-format="yyyy-mm-dd" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label " > 来访目的: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_lfmd"  name="wbjdSq.lfmd" id="lfmd" disabled="disabled"  value="${wbjdSq.lfmd}" data-placeholder="请选择来访目的"  onchange="selectlfmd(this)"></dm:list>
                    </div>
                    <label class="col-xs-2 control-label "  > 国家/地区: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="T_DM_GB"  type="select" multiple="multiple" disabled="disabled"  valueList="${gbCodeList}"  id="cfgbIds"  name="cfgbIds"   data-placeholder="请选择团组级别"  ></dm:list>
                    </div>
                </div>
                <div class="form-group qtmd">
                    <label class="col-xs-2 control-label "  > 其他目的: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdSq.lfmdQt" disabled="disabled" value="${wbjdSq.lfmdQt}" type="text"   />
                    </div>
                </div>
                <div class="form-group yjtm" >
                    <label class="col-xs-2 control-label "  > 演讲题目: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdSq.yjtm" disabled="disabled"  value="${wbjdSq.yjtm}" type="text"   />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 经费来源: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdSq.jfly" disabled="disabled"  value="${wbjdSq.jfly}" type="text"   />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 是否邀请校领导: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdSq.ynYqxld" disabled="disabled" type="radio" value="${wbjdSq.ynYqxld}" onclick="getRadio(this)" data-placeholder="请选是否邀请校领导" ></dm:list>
                    </div>
                    <label class="col-xs-2 control-label "  > 是否获学院同意: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdSq.ynXyty"  type="radio" disabled="disabled"  value="${wbjdSq.ynXyty}"  onclick="getRadio(this)" data-placeholder="请选是否获学院同意" ></dm:list>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 是否报备所属公安部门: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdSq.ynBbssgabm" disabled="disabled"  type="radio" value="${wbjdSq.ynBbssgabm}" onclick="getRadio(this)" data-placeholder="请选是否报备所属公安部门" ></dm:list>
                    </div>
                    <label class="col-xs-2 control-label "  > 是否报备所属宣传部门: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdSq.ynBbssxcbm" disabled="disabled"  type="radio" value="${wbjdSq.ynBbssxcbm}" onclick="getRadio(this)" data-placeholder="请选是否报备所属宣传部门" ></dm:list>
                    </div>
                </div>
                <div class="form-group "  >
                    <label class="col-xs-2 control-label "  > 备注: </label>
                    <div class="col-xs-10">
                        <input class="form-control"  id="memo" name="wbjdSq.memo" disabled="disabled" readonly=readonly  value="${wbjdSq.memo}" type="text"  style="height: 70px;" />
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 礼品: </label>
                <div class="col-xs-4">
                    <input class="form-control  "  id="lp" name="wbjdSq.lp" disabled="disabled" value="${wbjdSq.lp}" type="text"   />
                </div>
                <label class="col-xs-2 control-label "  > 数量: </label>
                <div class="col-xs-4">
                    <input class="form-control  " id="lpsl" name="wbjdSq.lpsl" disabled="disabled" value="${wbjdSq.lpsl}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 情况记录: </label>
                <div class="col-xs-10">
                    <input class="form-control  " name="wbjdSq.qkjl" disabled="disabled" value="${wbjdSq.qkjl}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 访问成果: </label>
                <div class="col-xs-10">
                    <input class="form-control  " name="wbjdSq.fwcg" disabled="disabled"  value="${wbjdSq.fwcg}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 团长姓名: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.tzxm" disabled="disabled"  value="${wbjdSq.tzxm}" type="text"   />
                </div>
                <label class="col-xs-2 control-label "  > 团长国籍: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.tzgj" disabled="disabled" value="${wbjdSq.tzgj}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 团长性别: </label>
                <div class="col-xs-4">
                    <dm:list tabName="t_dm_xb"  name="wbjdSq.tzxb" type="radio" disabled="disabled" value="${wbjdSq.tzxb}" data-placeholder="请选接团长性别" ></dm:list>
                </div>
                <label class="col-xs-2 control-label "  > 团长出生日期: </label>
                <div class="col-xs-4">
                    <input class="form-control date-picker" name="wbjdSq.tzcsrq" id="tzcsrq" disabled="disabled"
                           value="<fmt:formatDate value="${wbjdSq.tzcsrq}" pattern="yyyy-MM-dd"/>"
                           type="text" data-date-format="yyyy-mm-dd" />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 团长工作单位: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.tzgzdw" disabled="disabled" value="${wbjdSq.tzgzdw}" type="text"   />
                </div>
                <label class="col-xs-2 control-label "  > 团长职称: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.tzzc" disabled="disabled" value="${wbjdSq.tzzc}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 专业及学术领域: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.tzzy" disabled="disabled" value="${wbjdSq.tzzy}" type="text"   />
                </div>
                <label class="col-xs-2 control-label "  > 团长职务: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.tzzw"disabled="disabled"  value="${wbjdSq.tzzw}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 主请联系人姓名: </label>
                <div class="col-xs-4">
                    <input class="form-control  " id="zqlxrxm" name="wbjdSq.zqlxrxm" disabled="disabled" value="${wbjdSq.zqlxrxm}" type="text"   />
                </div>
                <label class="col-xs-2 control-label "  > 主请联系人电话: </label>
                <div class="col-xs-4">
                    <input class="form-control  " id="zqlxrdh" name="wbjdSq.zqlxrdh"disabled="disabled"  value="${wbjdSq.zqlxrdh}" type="text"   />
                </div>
            </div>
            <hr/>
            <div class="form-group">
                <div class="col-xs-3">
                    姓名
                </div>
                <div class="col-xs-3">
                    国籍
                </div>
                <div class="col-xs-3">
                    职务
                </div>

            </div>
            <c:choose>
                <c:when test="${sxryList!=null && sxryList.size()>0}">
                    <c:forEach items="${sxryList}" var="sxr">
                        <div class="form-group sxr">
                            <div class="col-xs-3"><input type="text" inp="xm" placeholder="姓名"  disabled="disabled"  value="${sxr.xm}"   name="sxr[@].xm" class="col-xs-12"/></div>
                            <div class="col-xs-3"><input type="text" inp="gj"  placeholder="国籍" disabled="disabled"  value="${sxr.gj}"   name="sxr[@].gj" class="col-xs-12"/></div>
                            <div class="col-xs-3"><input type="text" inp="zw"  placeholder="职务" disabled="disabled"  value="${sxr.zw}"   name="sxr[@].zw" class="col-xs-12"/></div>

                        </div>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <div class="form-group sxr">
                        <div class="col-xs-3"><input type="text" inp="xm"   placeholder="姓名"  disabled="disabled"  name="sxr[@].xm" class="col-xs-12"/></div>
                        <div class="col-xs-3"><input type="text" inp="gj"   placeholder="国籍"  disabled="disabled"  name="sxr[@].gj" class="col-xs-12"/></div>
                        <div class="col-xs-3"><input type="text" inp="zw"  placeholder="职务"   disabled="disabled"  name="sxr[@].zw" class="col-xs-12"/></div>

                    </div>
                </c:otherwise>
            </c:choose>
            <div class="col-md-offset-2 col-md-9">
                &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
                <button class="btn btn-info btn-sm" id="btnPass" type="button">
                    <i class="ace-icon fa fa-check bigger-110"></i>
                    通过
                </button>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <button class="btn btn-danger btn-sm" id="btnBack" type="button">
                    <i class="ace-icon fa fa-backward bigger-110"></i>
                    退回
                </button>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <button class="btn btn-success btn-sm" id="btnClose" type="button">
                    <i class="ace-icon fa fa-close bigger-110"></i>
                    关闭
                </button>
            </div>
            &nbsp; &nbsp; &nbsp;
        </div>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </div>
    </div>
</form>
<div id="template" style="display: none">
    <div class="form-group sxr" >
        <div class="col-xs-3"><input type="text" inp="xm" disabled="disabled"  placeholder="姓名" name="sxr[@].xm" class="col-xs-12"/></div>
        <div class="col-xs-3"><input type="text" inp="gj"  disabled="disabled" placeholder="国籍" name="sxr[@].gj" class="col-xs-12"/></div>
        <div class="col-xs-3"><input type="text" inp="zw"  disabled="disabled" placeholder="职务" name="sxr[@].zw" class="col-xs-12"/></div>
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
<!-- ace scripts -->
<!-- jqueryValidate验证框架-->
<%--<script src="assets/js/jqvalidate/jquery.validate.min.js"></script>--%>
<script src="assets/js/jqvalidate/jquery.validate.js"></script>
<script src="assets/js/jqvalidate/messages_zh.js"></script>
<!--弹出层 -->
<script src="assets/js/layer/layer.js"></script>
<!--自定义js -->
<script src="assets/project/js/common-window.js"></script>

<script>
    $(function () {
        var md = $("#lfmd").val();
        //学术讲座 -- 演讲题目
        if (md == '03') {
            $(".yjtm").show();
            $(".qtmd").hide();
        }
        if (md == '99') {
            $(".qtmd").show();
            $(".yjtm").hide();
        }
        if (md == '01' || md == '02' || md == '04') {
            $(".yjtm").hide();
            $(".qtmd").hide();
        }
        var val = $("#jdlx").val();
        jdlxfunction(val);

        $("#btnClose").click(function(){
            closeLayer();
        });
        $("#btnPass").click(function(){
            $("#status").val("04");//通过
            sh();
        });
        $("#btnBack").click(function(){//退回
            $("#status").val("03");//通过
            sh();
        });
    });

    //审核，03 退回， 04通过
    function sh(){
        $.ajax('wbjd/sh',{
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

    function jdlxfunction(val) {
        if (val == '01') {//校级
            $("#lp").removeAttr("disabled");
            $("#lp").removeAttr("readonly");
            $("#lpsl").removeAttr("disabled");
            $("#lpsl").removeAttr("readonly");
            $("#jdbm").val("");
            $("#jdbm").attr("disabled", "disabled");
            $("#jdbm").attr("readonly", "readonly");
            $("#zqlxrxm").val("");
            $("#zqlxrxm").attr("disabled", "disabled");
            $("#zqlxrxm").attr("readonly", "readonly");
            $("#zqlxrdh").val("");
            $("#zqlxrdh").attr("disabled", "disabled");
            $("#zqlxrdh").attr("readonly", "readonly");
        } else if (val == '02') {//院级
            $("#lp").val("");
            $("#lp").attr("disabled", "disabled");
            $("#lp").attr("readonly", "readonly");
            $("#lpsl").val("");
            $("#lpsl").attr("disabled", "disabled");
            $("#lpsl").attr("readonly", "readonly");
            $("#jdbm").removeAttr("disabled");
            $("#jdbm").removeAttr("readonly");
            $("#zqlxrxm").removeAttr("disabled");
            $("#zqlxrxm").removeAttr("readonly");
            $("#zqlxrdh").removeAttr("disabled");
            $("#zqlxrdh").removeAttr("readonly");
        }
    }
</script>
</body>
</html>