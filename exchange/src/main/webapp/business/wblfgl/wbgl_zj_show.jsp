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
                <input type="hidden" name="wbjdZj.lfid" value="${param['lfid']}"/>

                <input type="hidden"   id="ynYqxld_value" />
                <input type="hidden"   id="ynXyty_value"   />
                <input type="hidden"   id="ynBbssgabm_value"  />
                <input type="hidden"   id="ynBbssxcbm_value"  />


                <div class="form-group ">

                    <label class="col-xs-2 control-label "  > 接待类型: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_wblf_jdlx"  id="jdlx" name="wbjdZj.jdlx" value="${wbjdZj.jdlx}" data-placeholder="请选接待类型" ></dm:list>
                    </div>


                    <label class="col-xs-2 control-label "  > 接待部门: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " id="jdbm" name="wbjdZj.jdbm" value="${wbjdZj.jdbm}"  type="text"   />
                    </div>


                </div>

                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 代表团名称: </label>

                    <div class="col-xs-4">
                        <input type="text"  name="wbjdZj.dbtmc"   placeholder="" value="${wbjdZj.dbtmc}"  class="col-xs-12" />
                    </div>
                    <label class="col-xs-2 control-label " > 来访人数: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="wbjdZj.lfrs"   placeholder="" value="${wbjdZj.lfrs}" class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 来访时间起: </label>
                    <div class="col-xs-4">
                        <input class="form-control date-picker" name="wbjdZj.lfsj"
                               value="${wbjdZj.lfsj}" id="lfsj" type="text" data-date-format="yyyy-mm-dd" />
                    </div>

                    <label class="col-xs-2 control-label "  > 来访时间止: </label>
                    <div class="col-xs-4">
                        <input class="form-control date-picker" name="wbjdZj.tlsjEnd"
                               value="" id="tlsjEnd" type="text" data-date-format="yyyy-mm-dd" />
                    </div>

                </div>

                <div class="form-group">

                    <label class="col-xs-2 control-label " > 来访目的: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_lfmd"  name="wbjdZj.lfmd" value="${wbjdZj.lfmd}"  data-placeholder="请选择来访目的"  onchange="selectlfmd(this)"></dm:list>
                    </div>

                    <label class="col-xs-2 control-label "  > 国家/地区: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="T_DM_GB"  type="select" multiple="multiple" valueList="${cfgbIds}"  id="cfgbIds"  name="cfgbIds"   data-placeholder="请选择国家/地区"  ></dm:list>
                    </div>
                </div>
                <div class="form-group qtmd">
                    <label class="col-xs-2 control-label "  > 其他目的: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdZj.lfmdQt" value="${wbjdZj.lfmdQt}" type="text"   />
                    </div>
                </div>
                <div class="form-group yjtm" >
                    <label class="col-xs-2 control-label "  > 演讲题目: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdZj.yjtm"  value="${wbjdZj.yjtm}" type="text"   />
                    </div>
                </div>
                <div class="form-group">

                    <label class="col-xs-2 control-label "  > 经费来源: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdZj.jfly" value="${wbjdZj.jfly}" type="text"   />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 是否邀请校领导: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdZj.ynYqxld" type="radio" value="${wbjdZj.ynYqxld}"  onclick="getRadio(this)" data-placeholder="请选是否邀请校领导" ></dm:list>
                    </div>
                    <label class="col-xs-2 control-label "  > 是否获学院同意: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdZj.ynXyty"  type="radio" value="${wbjdZj.ynXyty}" onclick="getRadio(this)" data-placeholder="请选是否获学院同意" ></dm:list>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 是否报备所属公安部门: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdZj.ynBbssgabm"   type="radio" value="${wbjdZj.ynBbssgabm}" onclick="getRadio(this)" data-placeholder="请选是否报备所属公安部门" ></dm:list>
                    </div>
                    <label class="col-xs-2 control-label "  > 是否报备所属宣传部门: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdZj.ynBbssxcbm"   type="radio" value="${wbjdZj.ynBbssxcbm}" onclick="getRadio(this)" data-placeholder="请选是否报备所属宣传部门" ></dm:list>
                    </div>
                </div>
                <div class="form-group "  >
                    <label class="col-xs-2 control-label "  > 备注: </label>
                    <div class="col-xs-10">
                        <input class="form-control"  id="memo" name="wbjdZj.memo" value="${wbjdZj.memo}" readonly=readonly type="text"  style="height: 70px;" />
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-2 control-label "  > 礼品: </label>
                <div class="col-xs-4">
                    <input class="form-control  "  id="lp" name="wbjdZj.lp" value="${wbjdZj.lp}" type="text"   />
                </div>
                <label class="col-xs-2 control-label "  > 数量: </label>
                <div class="col-xs-4">
                    <input class="form-control  " id="lpsl" name="wbjdZj.lpsl" value="${wbjdZj.lpsl}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 情况记录: </label>
                <div class="col-xs-10">
                    <input class="form-control  " name="wbjdZj.qkjl" value="${wbjdZj.qkjl}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 访问成果: </label>
                <div class="col-xs-10">
                    <input class="form-control  " name="wbjdZj.fwcg" value="${wbjdZj.fwcg}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 团长姓名: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdZj.tzxm" value="${wbjdZj.tzxm}" type="text"   />
                </div>
                <label class="col-xs-2 control-label "  > 团长国籍: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdZj.tzgj" value="${wbjdZj.tzgj}" type="text"   />

                </div>
            </div>

            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 团长性别: </label>
                <div class="col-xs-4">
                    <dm:list tabName="t_dm_xb"  name="wbjdZj.tzxb" type="radio" value="${wbjdZj.tzxb}" data-placeholder="请选接团长性别" ></dm:list>
                </div>

                <label class="col-xs-2 control-label "  > 团长出生日期: </label>
                <div class="col-xs-4">
                    <input class="form-control date-picker" name="wbjdZj.tzcsrq" id="tzcsrq"
                           value="" type="text" data-date-format="yyyy-mm-dd" />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 团长工作单位: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdZj.tzgzdw" value="${wbjdZj.tzgzdw}" type="text"   />
                </div>

                <label class="col-xs-2 control-label "  > 团长职称: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdZj.tzzc" value="${wbjdZj.tzzc}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 专业及学术领域: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdZj.tzzy" value="${wbjdZj.tzzy}" type="text"   />
                </div>
                <label class="col-xs-2 control-label "  > 团长职务: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdZj.tzzw" value="${wbjdZj.tzzw}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-2 control-label "  > 主请联系人姓名: </label>
                <div class="col-xs-4">
                    <input class="form-control  " id="zqlxrxm" name="wbjdZj.zqlxrxm" value="${wbjdZj.zqlxrxm}" type="text"   />
                </div>

                <label class="col-xs-2 control-label "  > 主请联系人电话: </label>
                <div class="col-xs-4">
                    <input class="form-control  " id="zqlxrdh" name="wbjdZj.zqlxrdh" value="${wbjdZj.zqlxrdh}" type="text"   />
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
                <div class="col-xs-2">
                    操作
                </div>
            </div>
            <div class="form-group sxr">
                <div class="col-xs-3">
                    <input type="text"  inp="xm" name="sxr[@].xm"  value="${sxr.xm}"  placeholder="姓名"  class="col-xs-12" />
                </div>
                <div class="col-xs-3">
                    <input type="text"  inp="gj" name="sxr[@].gj"  value="${sxr.gj}" placeholder="国籍"  class="col-xs-12" />
                </div>
                <div class="col-xs-3">
                    <input type="text"  inp="zw" name="sxr[@].zw"  value="${sxr.zw}" placeholder="职务"  class="col-xs-12" />
                </div>
                <div class="col-xs-2">
                    <button class='btn btn-danger btn-mini' onclick='deleteSxr(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
                    <button class='btn btn-info btn-mini' onclick='appendSxr(); return false;'><i class='ace-icon fa fa-plus '>添加</i>  </button>
                </div>
            </div>

            <div class="col-md-offset-3 col-md-9">
                <button class="btn btn-info btn-sm" id="btnClose" type="button">
                    <i class="ace-icon fa fa-check bigger-110"></i>
                    关闭
                </button>

                &nbsp; &nbsp; &nbsp;
            </div>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </div>
    </div>
    </div>
</form>
<div id="template" style="display: none">
    <div class="form-group sxr" >
        <div class="col-xs-3"><input type="text" inp="xm"   placeholder="姓名" name="sxr[@].xm" class="col-xs-12"/></div>
        <div class="col-xs-3"><input type="text" inp="gj"   placeholder="国籍" name="sxr[@].gj" class="col-xs-12"/></div>
        <div class="col-xs-3"><input type="text" inp="zw"   placeholder="职务" name="sxr[@].zw" class="col-xs-12"/></div>
        <div class="col-xs-2"  >
            <button class='btn btn-danger btn-mini' onclick='deleteSxr(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
            <button class='btn btn-info btn-mini' onclick='appendSxr(); return false;'><i class='ace-icon fa fa-plus '>添加</i>  </button>
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
        var md = $('#lfmd').val();
        //学术讲座 -- 演讲题目
        if (md == '03') {
            $(".yjtm").show();
            $(".qtmd").hide();
        }
        if (md == '99') {
            $(".qtmd").show();
            $(".yjtm").hide();
        }
        if (md == '01'||md == '02'||md == '04') {
            $(".yjtm").hide();
            $(".qtmd").hide();
        }

        $("#btnClose").click(function(){

            closeLayer();

        });
    });

</script>
</body>
</html>