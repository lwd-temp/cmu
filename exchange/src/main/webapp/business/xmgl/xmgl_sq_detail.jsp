<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/13
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://cn.edu.cmu/uitag" prefix="dm" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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





    <!-- inline styles related to this page -->




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

    <!-- ace settings handler -->
    <script src="assets/js/ace-extra.js"></script>


    <style>
        .control-value{
            text-align: left !important;
        }

    </style>

</head>

<body class="no-skin">
<!-- #section:basics/navbar.layout -->

<!-- /section:basics/navbar.layout -->
<div class="tabbable">
    <ul class="nav nav-tabs" id="myTab">
        <li class="active">
            <a data-toggle="tab" href="#home">
                <i class="green ace-icon fa fa-home bigger-120"></i>
                学生信息
            </a>
        </li>
        <li>
            <a data-toggle="tab" href="#ysqxm">
                已申请项目
                <c:if  test="${ysqxmList != null && ysqxmList.size() >0 }">
                    <span class="badge badge-danger">${ysqxmList.size()}</span>
                </c:if>
            </a>
        </li>
    </ul>
</div>
<div class="main-container" id="main-container">
    <div class="main-content">
        <div class="main-content-inner">
            <div class="page-content">
                <div class="row tab-content">
                    <div class="tab-pane fade in active" id="home">
                        <!-- PAGE CONTENT BEGINS -->
                        <form class="form-horizontal" id="form" role="form">
                            <input type="hidden" name="sqjlId" id="sqjlId" value="${sqjl.sqjlId}" />
                            <input type="hidden" name="xmId" id="xmId" value="${sqjl.xmId}" />
                            <input type="hidden" name="status" id="status" value="${sqjl.status}" />
                            <input type="hidden" name="confirmStatus" id="confirmStatus" value="${sqjl.confirmStatus}" />
                            <!-- #section:elements.form -->
                            <div class="form-group">
                                <label class="col-xs-12 col-sm-2 control-label "  > 项目总名: </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="text"  name="xmzm" id="xmzm" value="${sqjl.xmzm}" readonly="readonly"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-12 col-sm-2 control-label "  > 项目名称: </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="text"  name="xmmc"  id="xmmc" value="${sqjl.xmmc}" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-12 col-sm-2 control-label "  > 学号 : </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="text"  name="xh" id="xh"  value="${sqjl.xh}" readonly="readonly"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-12 col-sm-2 control-label "  > 姓名: </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="text"  name="xm"  id="xm" value="${sqjl.xm}" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-12 col-sm-2 control-label "  > 性别  : </label>
                                <div class="col-xs-12 col-sm-4">
                                    <dm:list tabName="T_DM_XB" type="radio" name="gender" id="gender" value="${sqjl.gender}"/>
                                </div>

                                <label class="col-xs-12 col-sm-2 control-label "  > 院系: </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="hidden" name="yxdm" id="yxdm" value="${sqjl.yxdm}" />
                                    <input type="text"  name="yxmc"  id="yxmc" value="${sqjl.yxmc}" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-12 col-sm-2 control-label "  > 入学年级   : </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="text"  name="rxn" id="rxn" value="${sqjl.rxn}" readonly="readonly"     class="col-xs-12" />
                                </div>

                                <label class="col-xs-12 col-sm-2 control-label "  > 年级: </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="text"  name="nj" id="nj"  value="${sqjl.nj}" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-12 col-sm-2 control-label "  > 专业   : </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="hidden" name="zyh" id="zyh" value="${sqjl.zyh}" />
                                    <input type="text"  name="zymc" id="zymc"  value="${sqjl.zymc}" readonly="readonly"     class="col-xs-12" />
                                </div>

                                <label class="col-xs-12 col-sm-2 control-label "  > 班级: </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="hidden" name="bjh" id="bjh" value="${sqjl.bjh}" />
                                    <input type="text"  name="bjmc"  id="bjmc" value="${sqjl.bjmc}" readonly="readonly"     class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-12 col-sm-2 control-label "  > 成绩排名   : </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="text"  name="chpm" id="chpm"  value="${sqjl.chpm}"   placeholder="格式20/100"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-12 col-sm-2 control-label "  > 综合评级: </label>
                                <div class="col-xs-12 col-sm-4">
                                    <dm:list tabName="t_dm_zhpj" name="zhpj" id="zhpj" value="${sqjl.zhpj}" data-placeholder="请选择综合评级"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-12 col-sm-2 control-label "  > 手机号   : </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="text"  name="phone" id="phone"  value="${sqjl.phone}"    placeholder="手机号"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-12 col-sm-2 control-label "  > 邮箱: </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="text"  name="email" id="email" value="${sqjl.email}"    placeholder="邮箱"    class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-12 col-sm-2 control-label "  > 交流目标国家或地区   : </label>
                                <div class="col-xs-12 col-sm-4">

                                    <dm:list sourceList="${gjdqList}"  type="select" id="jlgjdqm"  name="jlgjdqm"  value="${sqjl.jlgjdqm}"  data-placeholder="交流目标国家或地区"  ></dm:list>

                                </div>

                                <label class="col-xs-12 col-sm-2 control-label "  > 外语水平 </label>
                                <div class="col-xs-12 col-sm-4">
                                    <input type="text"  name="yysp" id="yysp" value="${sqjl.yysp}"  placeholder="考试种类+成绩"      class="col-xs-12" />
                                </div>
                            </div>




                            <c:if test="${sqjl.confirmStatus == '02' || sqjl.confirmStatus == '03'}">
                                <%--复审通过或退回显示意见--%>
                                <div class="form-group">
                                    <label class="col-xs-12 col-sm-2 control-label "  > 审核意见<i class="fa fa-star-o red"></i>   : </label>
                                    <div class="col-xs-10">
                                        <input type="text"  readonly="readonly" name="fsyj"  id="fsyj"  value="${sqjl.fsyj}"    class="col-xs-12" />
                                    </div>
                                </div>

                                <c:if test="${sqjl.confirmStatus == '02'}">
                                    <div class="form-group">
                                        <label class="col-xs-12 col-sm-2 control-label "  > 资助金额<i class="fa fa-star-o red"></i>   : </label>
                                        <div class="col-xs-10">
                                            <input type="text"  readonly="readonly" name="zzje"  id="zzje"  value="${sqjl.zzje}"    class="col-xs-12" />
                                        </div>
                                    </div>
                                </c:if>
                                <c:if test="${sqjl.confirmStatus == '03' && xm.sfxzrs == 'N'}">

                                    <div class="form-group">

                                        <div class="col-xs-10" style="color: red">
                                           当前项目为不限制人数，可<b>申请自费</b>。
                                        </div>
                                    </div>
                                </c:if>

                            </c:if>





                            <hr>

                            <div class="form-group">

                                <label class="col-xs-12 col-sm-4 control-label "  style="text-align:center" > 上传材料   : </label>

                                <label class="col-xs-5 control-label "   style="text-align:center"> 材料说明   : </label>

                                <label class="col-xs-3 control-label "   style="text-align:center"> 操作   : </label>
                            </div>
                            <c:choose>
                                <c:when  test="${fjList != null && fjList.size() >0 }">
                                    <c:forEach items="${fjList}" var="fj" varStatus="status" >

                                        <div class="form-group ">
                                            <div class="col-xs-12 col-sm-4" >
                                                <input type="hidden"  name="fileid" value="${fj.fileId}" />
                                                <input  class="col-xs-12"   readonly="readonly" type="text" value="已上传材料${status.count}" />
                                            </div>
                                            <div class="col-xs-5">
                                                <input type="text"  name="clsm"  value="${fj.clsm}"     placeholder="材料说明"    class="col-xs-12" />
                                            </div>
                                            <div class="col-xs-3"  style="text-align:center">

                                                <button class='btn btn-info btn-mini' type="button" title='下载' onclick='download("${fj.fileId}")' ><i class='ace-icon fa fa-pencil '>下载</i></button>

                                            </div>
                                        </div>
                                    </c:forEach>
                                </c:when>
                            </c:choose>

                            <!--
                                初审确认， status =3 isConfirm1 =0;     ---?  confirmStatus=01

                                复审确认   confirmStatus(02,03) isConfirm2=0;
                                如果 复审没通过， 不限制人数 复审自费
                             -->

                            <div class="col-md-offset-3 col-md-9 btns">

                            <%--<c:if test="${(sqjl.status =='03' || sqjl.status =='04') && sqjl.isconfirm1 == '0'}">
                                <button class="btn btn-info btn-sm " id="btnConfirmCs"  type="button">
                                    <i class="ace-icon fa fa-save bigger-110"></i>
                                    初审结果确认
                                </button>
                            </c:if>--%>

                            <c:if test="${(sqjl.confirmStatus =='02' || sqjl.confirmStatus =='03') && sqjl.isconfirm2 == '0'}">
                                <button class="btn btn-info btn-sm " id="btnConfirmFs"  type="button">
                                    <i class="ace-icon fa fa-save bigger-110"></i>
                                    复审结果确认
                                </button>
                                <button class="btn btn-info btn-sm btns" id="btnClose" type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                    关闭
                                </button>
                            </c:if>

                            <c:if test="${sqjl.confirmStatus == '03' && xm.sfxzrs == 'N'}">
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <button class="btn btn-danger btn-sm " id="btnSqzf"  type="button">
                                    <i class="ace-icon fa fa-save bigger-110"></i>
                                    申请自费
                                </button>
                                <button class="btn btn-info btn-sm btns" id="btnClose" type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                    关闭
                                </button>
                            </c:if>
                            </div>

                        </form>

                    </div><!-- /.col -->
                    <div id="ysqxm" class="tab-pane fade">
                        <c:if  test="${ysqxmList != null && ysqxmList.size() >0 }">
                            <table>
                                <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>项目名称</th>
                                    <th>资助金额</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${ysqxmList}" var="ysqJl" varStatus="status">
                                    <tr>
                                        <td>${status.count}</td>
                                        <td>${ysqJl.xmmc}</td>
                                        <td>${ysqJl.zzje}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </c:if>
                    </div>
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div>
    </div><!-- /.main-content -->

</div><!-- /.main-container -->

<div style="display: none;" id="template">
    <div class="form-group uploadGroup">

        <div class="col-xs-12 col-sm-4">
            <input type="hidden" name="fileid" value="" />
            <input type="file"  class="fileUpload" onchange="changeFile(this)"/>
        </div>

        <div class="col-xs-5">
            <input type="text"  name="clsm"  value=""     placeholder="材料说明"    class="col-xs-12" />
        </div>
        <div class="col-xs-3"  style="text-align:center">
            <button class='btn btn-danger btn-mini uploadBtnDelete' type="button" title='删除' onclick='delUpload(this)' ><i class='ace-icon fa fa-trash-o '>删除</i></button>
            <button class='btn btn-info btn-mini' type="button" title='添加' onclick='addUpload()' ><i class='ace-icon fa fa-pencil '>添加</i></button>
        </div>

    </div>

</div>
<!-- ace scripts -->

<script src='assets/js/jquery.js'></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/jquery.knob.js"></script>
<script src="assets/js/autosize.js"></script>
<script src="assets/js/jquery.inputlimiter.1.3.1.js"></script>
<script src="assets/js/jquery.maskedinput.js"></script>


<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>
<script src="assets/js/ace/elements.fileinput.js"></script>
<script src="assets/js/layer/layer.js"></script>
<script src="assets/js/ace/ace.js"></script>

<!-- ace scripts -->
<!-- jqueryValidate验证框架-->
<script src="assets/js/jqvalidate/jquery.validate.min.js"></script>
<script src="assets/js/jqvalidate/messages_zh.js"></script>
<!--弹出层 -->
<script src="assets/js/layer/layer.js"></script>

<!--自定义js -->
<script src="assets/project/js/common-window.js"></script>
<script>
    $(function(){
        $('form .fileUpload').ace_file_input({
            no_file:'暂无文件 ...',
            btn_choose:'选择',
            btn_change:'替换',
            droppable:false,
            onchange:function(){alert(this.value)},
            thumbnail:true, //| true | large
            //whitelist:'gif|png|jpg|jpeg'
            //blacklist:'exe|php'
            /* onchange:'changeFile'*/
            //
        });

        $('.chosen-select').chosen({allow_single_deselect:true});

        $("#cjpm").mouseover(function(){
            layer.tips('最近一学年学业成绩排名或最近一学年综合测评排名:格式20/100', '#cjpm');
        });


        $("#btnConfirmCs").click(function(){
            comfirmCs();
        });


        $("#btnConfirmFs").click(function(){
            comfirmFs();
        });

        $("#btnSqzf").click(function(){
            sqzf();
        });

        $("#btnClose").click(function(){
            var index = parent.layer.getFrameIndex(window.name);
            parent.layer.close(index);
        })

    })


    var validator;
    function setFormValidate(){
        validator = $("#form").setValid({
            //校验规则
            rules: {
                name:{
                    required:true
                },
                gender:{
                    required:true
                },
                email:{
                    email: true
                },

            }
        });
    }

    /**

     * 初审确认
     */
    function comfirmCs() {
        $.ajax('xm/comfirmCs', {
            data: {
                id:$("#sqjlId").val(),
            },
            success: function (resp) {
                if (resp && resp.success) {
                    parent.layer.alert("已确认");
                    callback();
                }
            }
        });
    }

    /**
     * 复审确认
     */
    function comfirmFs() {
        $.ajax('xm/comfirmFs', {
            data: {
                id:$("#sqjlId").val(),
            },
            success: function (resp) {
                if (resp && resp.success) {
                    parent.layer.alert("已确认");
                    callback();
                }
            }
        });
    }


    /**
     * 申请自费
     */
    function sqzf() {
        $.ajax('xm/sqzf', {
            data: {
                id:$("#sqjlId").val(),
            },
            success: function (resp) {
                if (resp && resp.success) {
                    parent.layer.alert("已申请");
                    callback();
                }
            }
        });
    }

    function download(fileId){
        window.open('sys/file/download?fileId='+fileId+'&fileName=download')
    }

</script>
</body>
</html>
