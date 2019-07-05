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
                <input type="hidden"    name="wbjdZj.lfid" value="${wbjdZj.lfid}"/>
                <input type="hidden"    name="wbjdZj.zjid" value="${wbjdZj.zjid}"/>
                <input type="hidden"   id="status"  name="wbjdZj.status" value="${wbjdZj.status}"/>

                <input type="hidden"   id="ynYqxld_value" />
                <input type="hidden"   id="ynXyty_value"   />
                <input type="hidden"   id="ynBbssgabm_value"  />
                <input type="hidden"   id="ynBbssxcbm_value"  />

                <div class="form-group ">
                    <label class="col-xs-12 col-sm-2 control-label "  > 接待类型: </label>
                    <div class="col-xs-12 col-sm-4">
                        <dm:list tabName="t_dm_wblf_jdlx"  id="jdlx" name="wbjdZj.jdlx" value="${wbjdZj.jdlx}" data-placeholder="请选接待类型" ></dm:list>
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label "  > 接待部门: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input class="form-control" id="jdbm" name="wbjdZj.jdbm" value="${wbjdZj.jdbm}" type="text"   />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label "  > 代表团名称: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="wbjdZj.dbtmc"   placeholder="" value="${wbjdZj.dbtmc}" class="col-xs-12" />
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label " > 来访人数: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input type="text"  name="wbjdZj.lfrs" id="lfrs"   placeholder="" value="${wbjdZj.lfrs}" class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label "  > 来访时间起: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input class="form-control date-picker" name="wbjdZj.lfsjStart"
                               value="<fmt:formatDate value="${wbjdZj.lfsjStart}" pattern="yyyy-MM-dd"/>"
                               id="lfsjStart" type="text" data-date-format="yyyy-mm-dd" />
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label "  > 来访时间止: </label>
                    <div class="col-xs-12 col-sm-4">
                        <input class="form-control date-picker" name="wbjdZj.lfsjEnd"
                               value="<fmt:formatDate value="${wbjdZj.lfsjEnd}" pattern="yyyy-MM-dd"/>"
                               id="lfsjEnd" type="text" data-date-format="yyyy-mm-dd" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label " > 来访目的: </label>
                    <div class="col-xs-12 col-sm-4">
                        <dm:list tabName="t_dm_lfmd"   type="select" multiple="multiple"  name="wbjdZj.lfmd" id="lfmd" data-placeholder="请选择来访目的" value="${wbjdZj.lfmd}"  onchange="selectlfmd(this)"></dm:list>
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label "  > 国家/地区: </label>
                    <div class="col-xs-12 col-sm-4">
                        <dm:list tabName="T_DM_GB"  type="select" multiple="multiple"  id="cfgbIds"  name="cfgbIds"  valueList="${gbCodeList}"  data-placeholder="请选择国家/地区"  ></dm:list>
                    </div>
                </div>
                <div class="form-group qtmd">
                    <label class="col-xs-12 col-sm-2 control-label "  > 其他目的: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdZj.lfmdQt" value="${wbjdZj.lfmdQt}" type="text"   />
                    </div>
                </div>
                <div class="form-group yjtm" >
                    <label class="col-xs-12 col-sm-2 control-label "  > 演讲题目: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdZj.yjtm" value="${wbjdZj.yjtm}" type="text"   />
                    </div>
                </div>
                <div class="form-group">

                    <label class="col-xs-12 col-sm-2 control-label "  > 经费来源: </label>
                    <div class="col-xs-10">
                        <textarea class="form-control limited" name="wbjdZj.jfly"  placeholder="请输入经费来源"  maxlength="300">${wbjdZj.jfly}</textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label "  > 是否邀请校领导: </label>
                    <div class="col-xs-12 col-sm-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdZj.ynYqxld" type="radio" id="ynYqxld"
                                 value="${wbjdZj.ynYqxld}"  onclick="getRadio(this)" data-placeholder="请选是否邀请校领导" ></dm:list>
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label "  > 是否获学院同意: </label>
                    <div class="col-xs-12 col-sm-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdZj.ynXyty"  type="radio" id="ynXyty"
                                 value="${wbjdZj.ynXyty}" onclick="getRadio(this)" data-placeholder="请选是否获学院同意" ></dm:list>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-12 col-sm-2 control-label "  > 是否报备属地公安部门: </label>
                    <div class="col-xs-12 col-sm-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdZj.ynBbssgabm"   type="radio" id="ynBbssgabm"
                                 value="${wbjdZj.ynBbssgabm}"  onclick="getRadio(this)" data-placeholder="请选是否报备属地公安部门" ></dm:list>
                    </div>
                    <label class="col-xs-12 col-sm-2 control-label "  > 是否报备学校宣传部: </label>
                    <div class="col-xs-12 col-sm-4">
                        <dm:list tabName="t_dm_yn"  name="wbjdZj.ynBbssxcbm"   type="radio" id="ynBbssxcbm"
                                 value="${wbjdZj.ynBbssxcbm}" onclick="getRadio(this)" data-placeholder="请选是否报备学校宣传部" ></dm:list>
                    </div>
                </div>
                <div class="form-group "  >
                    <label class="col-xs-12 col-sm-2 control-label "  > 备注: </label>
                    <div class="col-xs-10">
                        <input class="form-control"  id="memo" name="wbjdZj.memo" value="${wbjdZj.memo}"   type="text"  style="height: 70px;" />
                    </div>
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-12 col-sm-2 control-label "  > 情况记录: </label>
                <div class="col-xs-10">
                    <textarea class="form-control limited" name="wbjdZj.qkjl"  placeholder="情况记录"  maxlength="300">${wbjdZj.qkjl}</textarea>
                </div>
            </div>

            <div class="form-group ">
                <label class="col-xs-12 col-sm-2 control-label "  > 团长姓名: </label>
                <div class="col-xs-12 col-sm-4">
                    <input class="form-control  " name="wbjdZj.tzxm" value="${wbjdZj.tzxm}"  type="text"   />
                </div>
                <label class="col-xs-12 col-sm-2 control-label "  > 团长国籍: </label>
                <div class="col-xs-12 col-sm-4">
                    <input class="form-control  " name="wbjdZj.tzgj" value="${wbjdZj.tzgj}"  type="text"   />

                </div>
            </div>

            <div class="form-group ">
                <label class="col-xs-12 col-sm-2 control-label "  > 团长性别: </label>
                <div class="col-xs-12 col-sm-4">
                    <dm:list tabName="t_dm_xb"  name="wbjdZj.tzxb" type="radio" value="${wbjdZj.tzxb}" data-placeholder="请选接团长性别" ></dm:list>
                </div>

                <label class="col-xs-12 col-sm-2 control-label "  > 出生年份: </label>
                <div class="col-xs-12 col-sm-4">
                    <input class="form-control date-picker" name="wbjdZj.tzcsrq" id="tzcsrq"
                           value="<fmt:formatDate value="${wbjdZj.tzcsrq}" pattern="yyyy"/>"
                           type="text" data-date-format="yyyy" />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-12 col-sm-2 control-label "  > 团长工作单位: </label>
                <div class="col-xs-12 col-sm-4">
                    <input class="form-control  " name="wbjdZj.tzgzdw" value="${wbjdZj.tzgzdw}" type="text"   />
                </div>

                <label class="col-xs-12 col-sm-2 control-label "  > 团长职称: </label>
                <div class="col-xs-12 col-sm-4">
                    <input class="form-control  " name="wbjdZj.tzzc" value="${wbjdZj.tzzc}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-12 col-sm-2 control-label "  > 专业及学术领域: </label>
                <div class="col-xs-12 col-sm-4">
                    <input class="form-control  " name="wbjdZj.tzzy" value="${wbjdZj.tzzy}" type="text"   />
                </div>
                <label class="col-xs-12 col-sm-2 control-label "  > 团长职务: </label>
                <div class="col-xs-12 col-sm-4">
                    <input class="form-control  " name="wbjdZj.tzzw" value="${wbjdZj.tzzw}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-12 col-sm-2 control-label "  > 主请联系人姓名: </label>
                <div class="col-xs-12 col-sm-4">
                    <input class="form-control  " id="zqlxrxm" name="wbjdZj.zqlxrxm" value="${wbjdZj.zqlxrxm}" type="text"   />
                </div>

                <label class="col-xs-12 col-sm-2 control-label "  > 主请联系人电话: </label>
                <div class="col-xs-12 col-sm-4">
                    <input class="form-control  " id="zqlxrdh" name="wbjdZj.zqlxrdh" value="${wbjdZj.zqlxrdh}" type="text"   />
                </div>
            </div>
            <div class="form-group ">
                <label class="col-xs-12 col-sm-2 control-label "  > 访问成果: </label>
                <div class="col-xs-10">
                    <input class="form-control  " id="fwcg" name="wbjdZj.fwcg" value="${wbjdZj.fwcg}" style="color:red;background-color: #47ca8d" type="text"   />
                </div>
            </div>


            <div class="row">
                <div class="col-xs-12 col-sm-12">
                    <div class="widget-box ">
                        <div class="widget-header">
                            <h4 class="widget-title">来访成果附件</h4> &nbsp;&nbsp;&nbsp;<button class='btn btn-info btn-mini' onclick='appendLfcg(); return false;'><i class='ace-icon fa fa-plus '>添加</i></button>
                        </div>

                        <div class="widget-body">
                            <div class="widget-main row-lfcg">
                                <div class="form-group">
                                    <div class="col-xs-5">
                                        附件
                                    </div>
                                    <div class="col-xs-12 col-sm-4">
                                        说明
                                    </div>
                                    <div class="col-xs-3">
                                        操作
                                    </div>
                                </div>
                                <c:if test="${zjFjs!=null && zjFjs.size()>0}">
                                    <c:forEach items="${zjFjs}" var="zjfj" varStatus="status">
                                        <div class="form-group lfcg">
                                            <div class="col-xs-5">
                                                <input type="hidden" inp="uploadEdFid"  name="zjFjs[${status.index}].fid" value="${zjfj.fid}" readonly="readonly"/>
                                                <input type="text"  inp="uploadEdZjms"  name="zjFjs[${status.index}].zjms" value="${zjfj.zjms}" readonly="readonly"
                                                class="col-xs-11"/>
                                            </div>
                                            <div class="col-xs-12 col-sm-4">
                                                <a href="javascript:downloadLfcg('sys/file/download?fileName=${zjfj.zjms}&fileId=${zjfj.fid}')" style="margin-top: 3px"> 下载</a>
                                            </div>
                                            <div class="col-xs-3">
                                                <button class='btn btn-danger btn-mini' onclick='deleteLfcg(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </c:if>

                            </div>
                        </div>
                    </div>
                </div><!-- /.span -->

            </div><!-- /.row -->


            <hr/>

            <div class="row">
                <div class="col-xs-12 col-sm-12">
                    <div class="widget-box">
                        <div class="widget-header">
                            <h4 class="widget-title">随行人员</h4> &nbsp;&nbsp;&nbsp;<button class='btn btn-info btn-mini' onclick='appendSxr(); return false;'><i class='ace-icon fa fa-plus '>添加</i></button>
                        </div>
                        <div class="widget-body">
                            <div class="widget-main row-sxry">
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
                                    <div class="col-xs-12 col-sm-2">
                                        操作
                                    </div>
                                </div>
                                <c:if test="${sxryList!=null && sxryList.size()>0}">
                                    <c:forEach items="${sxryList}" var="sxr">
                                        <div class="form-group sxr">
                                            <div class="col-xs-3"><input type="text" inp="xm"  placeholder="姓名"   value="${sxr.xm}"   name="sxr[@].xm" class="col-xs-12"/></div>
                                            <div class="col-xs-3"><input type="text" inp="gj"  placeholder="国籍"   value="${sxr.gj}"   name="sxr[@].gj" class="col-xs-12"/></div>
                                            <div class="col-xs-3"><input type="text" inp="zw"  placeholder="职务"   value="${sxr.zw}"   name="sxr[@].zw" class="col-xs-12"/></div>
                                            <div class="col-xs-12 col-sm-2">
                                                <button class='btn btn-danger btn-mini' onclick='deleteSxr(this);return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div><!-- /.span -->

            </div><!-- /.row -->


            <hr/>

            <div class="row">
                <div class="col-xs-12 col-sm-12">
                    <div class="widget-box ">
                        <div class="widget-header">
                            <h4 class="widget-title">礼品信息</h4> &nbsp;&nbsp;&nbsp;<button class='btn btn-info btn-mini' onclick='appendLp(); return false;'><i class='ace-icon fa fa-plus '>添加</i></button>
                        </div>

                        <div class="widget-body">
                            <div class="widget-main row-lp">
                                <div class="form-group">
                                    <div class="col-xs-5">
                                        礼品名称
                                    </div>
                                    <div class="col-xs-12 col-sm-4">
                                        数量
                                    </div>
                                    <div class="col-xs-3">
                                        操作
                                    </div>
                                </div>


                                <c:if test="${lpList!=null && lpList.size()>0}">
                                    <c:forEach items="${lpList}" var="lp">
                                        <div class="form-group sxr">
                                            <div class="col-xs-5"><input type="text" inp="mc" placeholder="礼品名称"   value="${lp.mc}"   name="lp[@].mc" class="col-xs-12"/></div>
                                            <div class="col-xs-12 col-sm-4"><input type="text" inp="sl"  placeholder="数量"  value="${lp.sl}"   name="lp[@].sl" class="col-xs-12"/></div>
                                            <div class="col-xs-3">
                                                <button class='btn btn-danger btn-mini' onclick='deleteLp(this);return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div><!-- /.span -->

            </div><!-- /.row -->



            <div id="btns" class="col-md-offset-3 col-md-9" style = "text-align:right;">
                <hr/>
                <button class="btn btn-info btn-sm btns" id="saveForm" type="button">
                    <i class="ace-icon fa fa-check bigger-110"></i>
                    保存
                </button>
            </div>
            &nbsp;&nbsp;&nbsp;
        </div>
    </div>
    </div>
</form>


<!--来访成果附件模板 -->
<div id="template-lfcg" style="display: none">
    <div class="form-group lfcg">
        <div class="col-xs-5">
            <input type="file"   multiple="multiple" class="fileUpload" inp="file" name="fjUploads[@].file"  onchange="changeFile(this)" />
        </div>

        <div class="col-xs-12 col-sm-4"><input type="text" placeholder="说明" inp="zjms"  name="fjUploads[@].zjms" class="col-xs-12"/></div>
        <div class="col-xs-3">
            <button class='btn btn-danger btn-mini' onclick='deleteLfcg(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
        </div>
    </div>
</div>


<div id="template-sxry" style="display: none">
    <div class="form-group sxr">
        <div class="col-xs-3"><input type="text" inp="xm" placeholder="姓名" name="sxr[@].xm" class="col-xs-12"/></div>
        <div class="col-xs-3"><input type="text" inp="gj" placeholder="国籍" name="sxr[@].gj" class="col-xs-12"/></div>
        <div class="col-xs-3"><input type="text" inp="zw" placeholder="职务" name="sxr[@].zw" class="col-xs-12"/></div>
        <div class="col-xs-12 col-sm-2">
            <button class='btn btn-danger btn-mini' onclick='deleteSxr(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
        </div>
    </div>
</div>
<div id="template-lp" style="display: none">
    <div class="form-group lfcg">
        <div class="col-xs-5">
            <input type="file"   multiple="multiple" class="fileUpload" inp="file" name="fjUploads[@].file"  onchange="changeFile(this)" />
        </div>

        <div class="col-xs-12 col-sm-4"><input type="text" placeholder="说明" inp="zjms"  name="fjUploads[@].zjms" class="col-xs-12"/></div>
        <div class="col-xs-3">
            <button class='btn btn-danger btn-mini' onclick='deleteLfcg(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
        </div>
    </div>
</div>

<script src='assets/js/jquery.js'></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>
<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>
<script src="assets/js/ace/elements.fileinput.js"></script>

<script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
<script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>
<!-- ace scripts -->
<!-- jqueryValidate验证框架-->
<%--<script src="assets/js/jqvalidate/jquery.validate.min.js"></script>--%>
<script src="assets/js/jqvalidate/jquery.validate.js"></script>
<script src="assets/js/jqvalidate/messages_zh.js"></script>
<!--弹出层 -->
<script src="assets/js/layer/layer.js"></script>
<script src="assets/js/ace/ace.js"></script>
<!--自定义js -->
<script src="assets/project/js/common-window.js"></script>

<script>
    $(function () {

        //是否邀请校领导， 选是，提示在备注中输入校领导的名字
        $('input[name="wbjdZj.ynYqxld"][value="Y"]').click(function(){
            layer.msg("请在备注中输入受邀校领导的姓名");
        });

        //选择来访目的
        selectlfmd($("#lfmd"));

        var val = $("#jdlx").val();
        jdlxfunction(val);

        setFormValid();//设置校验规则

        $("#jdlx").change(function(){
            var $select = $(this);
            var val = $select.val();
            jdlxfunction(val);
        })

        $("#saveForm").click(function(){
            $("#status").val("01");//暂存
            saveSq();
        });

        //提示访问结果 在总结时 需要修改
        $("#fwcg").mouseover(function(){
            layer.tips('总结时，此部分需要可修改', '#fwcg');
        });

    });

    function setFormValid(){
        $("#form").setValid({
            //校验规则
            rules: {
                "wbjdZj.dbtmc":{ required:true},
                "wbjdZj.lfrs":{ required:true},
                "wbjdZj.lfmd":{ required:true},
                "wbjdZj.tzxm":{ required:true},
                "wbjdZj.jdlx":{ required:true},
                "wbjdZj.zqlxrxm":{ required:true},
                "wbjdZj.zqlxrdh":{ required:true},
                "cfgbIds":{ required:true},
                "sxr[@].xm":{ required:true},
                "sxr[@].gj":{ required:true},
                "sxr[@].zw":{ required:true},
                "lp[@].mc":{ required:true},
                "lp[@].sl":{ required:true,digits:true},
                "fjUploads[@].file":{ required:true},
                "fjUploads[@].zjms":{ required:true}
            }
        })
    }
    function saveSq(){
        if(!validateSq()){
            return;
        }
        calInputNames();

        var formData = new FormData($("#form")[0]);

        $.ajax('wbzj/save',{
            type:'post',
            dataType:'json',
            cache: false,
            processData: false,
            contentType: false,
            // data:$("#form").serialize(),
            data: formData,//是ajax支持上传文件
            success:function(res){
                if(res && res.success){
                    parent.refreshTable();
                    closeLayer();//关闭
                    winAlert("保存成功");//弹出确认消息
                }
            }
        });
    }

    function changeFile(fileInput){
        //alert($(fileInput).parent().prev().size())
        $(fileInput).parent().prev().val("");
        // alert("index:"+index)
    }

    //校验整个计划
    function validateSq(){
        if(!$("#form").valid()){
            return false;
        }
        return true;
    }
    function calInputNames(){
        $('form input[inp=xm]').each(function(index,el){
            $(el).attr('name','zjsxr['+index+'].xm');
        });
        $('form input[inp=gj]').each(function(index,el){
            $(el).attr('name','zjsxr['+index+'].gj');
        });
        $('form input[inp=zw]').each(function(index,el){
            $(el).attr('name','zjsxr['+index+'].zw');
        });

        $('form input[inp=mc]').each(function (index, el) {
            $(el).attr('name', 'lp[' + index + '].mc');
        });

        $('form input[inp=sl]').each(function (index, el) {
            $(el).attr('name', 'lp[' + index + '].sl');
        });



        $('form input[inp=uploadEdFid]').each(function (index, el) {
            $(el).attr('name', 'zjFjs[' + index + '].fid');
        });
        $('form input[inp=uploadEdZjms]').each(function (index, el) {
            $(el).attr('name', 'zjFjs[' + index + '].zjms');
        });

        $('form input[inp=file]').each(function (index, el) {
            $(el).attr('name', 'fjUploads[' + index + '].file');
        });
        $('form input[inp=zjms]').each(function (index, el) {
            $(el).attr('name', 'fjUploads[' + index + '].zjms');
        });
    }

    /***
     *  来访成果附件删除
     *
     * **/
    function deleteLfcg(btn) {

        var row = $(btn).parent().parent();
        row.remove();
        setFormValid();//设置校验规则
    }

    /***
     *  来访成果附件添加
     *
     * **/
    function appendLfcg() {
        $(".row-lfcg").append($("#template-lfcg").html());
        var lfcg = $(".row-lfcg").children().last();

        lfcg.find("input").each(function (index, el) {

            $(el).attr("id", "formEl" + (Math.rnd()));
            if(el.name =='sl'){//数量要求必须填入数字
                $(el).rules('add', {required: true,digits:true});
            }else{
                $(el).rules('add', {required: true});
            }
        })

        lfcg.find('[type=file]').ace_file_input({
            no_file:'暂无文件 ...',
            btn_choose:'选择',
            btn_change:'替换',
            droppable:false,
            onchange:null,
            // allowExt: ['png','jpg','jpeg','gif'],//允许的文件格式
            thumbnail:true, //| true | large
            //whitelist:'gif|png|jpg|jpeg'
            //blacklist:'exe|php'
            /* onchange:'changeFile'*/
            //
        }).on('file.error.ace', function(event, info) {//不匹配上面的文件格式就会跳出弹框提示
            parent.layer.alert("选择图片格式的文件上传！", {icon: 0, title: "提示"});
        });
        // setFormValid();//设置校验规则
    }



    function deleteSxr(btn) {
        var size = $("#form .sxr").size();
        if (size <= 1 && $("#lfrs").val()>1) {
            parent.layer.alert("请至少录入一个随行成员");
            return false;
        }
        var row = $(btn).parent().parent();
        row.remove();
        setFormValid();//设置校验规则
    }

    function appendSxr() {
        $(".row-sxry").append($("#template-sxry").html());
        var sxr = $(".row-sxry").children().last();

        sxr.find("input").each(function (index, el) {
            $(el).attr("id", "formEl" + (Math.rnd()));
            $(el).rules('add', {required: true});
        })
        setFormValid();//设置校验规则
    }

    function deleteLp(btn) {

        var row = $(btn).parent().parent();
        row.remove();
        setFormValid();//设置校验规则
    }

    function appendLp() {
        $(".row-lp").append($("#template-lp").html());
        var lp = $(".row-lp").children().last();

        lp.find("input").each(function (index, el) {

            $(el).attr("id", "formEl" + (Math.rnd()));
            if(el.name =='sl'){//数量要求必须填入数字
                $(el).rules('add', {required: true,digits:true});
            }else{
                $(el).rules('add', {required: true});
            }
        })
        setFormValid();//设置校验规则
    }


    /**
     * 判断是否包含来访目的
     * @param type
     * @param mds
     * @returns {boolean}
     */
    function containLfmd(type,mds){

        if(!mds){
            mds = []
        }

        if(typeof(mds) == 'string'){
            return type == mds;
        }else{
            return $.inArray(type,mds)>-1;
        }

    }

    //选择来访目的
    function selectlfmd(select) {
        var md = $(select).val();

        //学术讲座 -- 演讲题目
        if (    containLfmd('03',md)    ) {
            $(".yjtm").show();
        }else{
            $(".yjtm").hide();
        }

        if( containLfmd('99',md)    ) {
            $(".qtmd").show();
        }else{
            $(".qtmd").hide();
        }
    }

    function jdlxfunction(val) {
        if (val == '01') {//校级

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

            $("#jdbm").removeAttr("disabled");
            $("#jdbm").removeAttr("readonly");
            $("#zqlxrxm").removeAttr("disabled");
            $("#zqlxrxm").removeAttr("readonly");
            $("#zqlxrdh").removeAttr("disabled");
            $("#zqlxrdh").removeAttr("readonly");
        }
    }

    function getRadio(rad){
        var ynYqxld_check = $("input[name='wbjdZj.ynYqxld']:checked").val();
        var ynXyty_check  = $("input[name='wbjdZj.ynXyty']:checked").val();
        var ynBbssgabm_check = $("input[name='wbjdZj.ynBbssgabm']:checked").val();
        var ynBbssxcbm_check = $("input[name='wbjdZj.ynBbssxcbm']:checked").val();

        if(ynYqxld_check == 'Y'){
            $("#ynYqxld_value").val("是否邀请校领导:是");
        }else if(ynYqxld_check == 'N'){
            $("#ynYqxld_value").val("是否邀请校领导:否");
        }
        if(ynXyty_check == 'Y'){
            $("#ynXyty_value").val("是否获学院同意:是");
        }else if(ynXyty_check == 'N'){
            $("#ynXyty_value").val("是否获学院同意:否");
        }
        if(ynBbssgabm_check == 'Y'){
            $("#ynBbssgabm_value").val("是否报备属地公安部门:是");
        }else if(ynBbssgabm_check == 'N'){
            $("#ynBbssgabm_value").val("是否报备属地公安部门:否")
        }
        if(ynBbssxcbm_check == 'Y'){
            $("#ynBbssxcbm_value").val("是否报备学校宣传部:是")
        }else if(ynBbssxcbm_check == 'N'){
            $("#ynBbssxcbm_value").val("是否报备学校宣传部:否")
        }
        var ynYqxld_value =  $("#ynYqxld_value").val();
        var ynXyty_value  = $("#ynXyty_value").val();
        var ynBbssgabm_value = $("#ynBbssgabm_value").val();
        var ynBbssxcbm_value = $("#ynBbssxcbm_value").val();

        //$("#memo").val(ynYqxld_value+'   '+ynXyty_value+'   '+ynBbssgabm_value+'   '+ynBbssxcbm_value);
    }


    function downloadLfcg(url){
        var href = encodeURI(url);
        window.open(href);
    }
</script>
</body>
</html>