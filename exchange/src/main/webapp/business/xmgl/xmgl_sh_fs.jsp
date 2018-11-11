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
        body{

            background: #fff;
        }
        th , td{
            margin:0px 20px 0px 15px;
            padding:0px 20px 0px 15px;
        }

    </style>

</head>

<body class="no-skin">
<!-- #section:basics/navbar.layout -->

<div class="tabbable">
    <ul class="nav nav-tabs" id="myTab">
        <li class="active">
            <a data-toggle="tab" href="#home">
                <i class="green ace-icon fa fa-home bigger-120"></i>
                学生信息
            </a>
        </li>

        <li>
            <a data-toggle="tab" href="#messages">
                申报材料
                <c:if  test="${fjList != null && fjList.size() >0 }">
                    <span class="badge badge-danger">${fjList.size()}</span>
                </c:if>
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

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">


            <form class="form-horizontal" role="form">
                <input type="hidden" name="sqjlId" id="sqjlId" value="${sqjl.sqjlId}" />
                <input type="hidden" name="xmId" id="xmId" value="${sqjl.xmId}" />
                <input type="hidden" name="status" id="status" value="${sqjl.status}" />
                <input type="hidden" name="confirmStatus" id="confirmStatus" value="${sqjl.confirmStatus}" />
                <!-- #section:elements.form -->
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 项目总名: </label>
                    <div class="col-xs-4">
                        <input type="text"   name="xmzm" id="xmzm" value="${sqjl.xmzm}" readonly="readonly"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 项目名称: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="xmmc"  id="xmmc" value="${sqjl.xmmc}" readonly="readonly"     class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 学号 : </label>
                    <div class="col-xs-4">
                        <input type="text"  name="xh" id="xh"  value="${sqjl.xh}" readonly="readonly"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 姓名: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="xm"  id="xm" value="${sqjl.xm}" readonly="readonly"     class="col-xs-12" />
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 性别  : </label>
                    <div class="col-xs-4">
                        <dm:list tabName="T_DM_XB" type="radio" name="gender" id="gender" value="${sqjl.gender}" readonly="readonly"/>
                    </div>

                    <label class="col-xs-2 control-label "  > 院系: </label>
                    <div class="col-xs-4">
                        <input type="hidden" name="yxdm" id="yxdm" value="${sqjl.yxdm}" />
                        <input type="text"  name="yxmc"  id="yxmc" value="${sqjl.yxmc}" readonly="readonly"     class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 入学年级   : </label>
                    <div class="col-xs-4">
                        <input type="text"  name="rxn" id="rxn" value="${sqjl.rxn}" readonly="readonly"     class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 年级: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="nj" id="nj"  value="${sqjl.nj}" readonly="readonly"     class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 专业   : </label>
                    <div class="col-xs-4">
                        <input type="hidden" name="zyh" id="zyh" value="${sqjl.zyh}" />
                        <input type="text"  name="zymc" id="zymc"  value="${sqjl.zymc}" readonly="readonly"     class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 班级: </label>
                    <div class="col-xs-4">
                        <input type="hidden" name="bjh" id="bjh" value="${sqjl.bjh}" />
                        <input type="text"  name="bjmc"  id="bjmc" value="${sqjl.bjmc}" readonly="readonly"     class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 成绩排名   : </label>
                    <div class="col-xs-4">
                        <input type="text"  name="chpm" id="chpm"  value="${sqjl.chpm}"  readonly="readonly"  placeholder="格式20/100"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 综合评级: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_zhpj" name="zhpj" id="zhpj" value="${sqjl.zhpj}" readonly="readonly"  data-placeholder="请选择综合评级"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 手机号   : </label>
                    <div class="col-xs-4">
                        <input type="text"  name="phone" id="phone"  value="${sqjl.phone}"  readonly="readonly"  placeholder="手机号"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 邮箱: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="email" id="email" value="${sqjl.email}"  readonly="readonly"  placeholder="邮箱"    class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 交流目标国家或地区   : </label>
                    <div class="col-xs-4">

                        <dm:list sourceList="${gjdqList}"  type="select" id="jlgjdqm"  name="jlgjdqm"  value="${sqjl.jlgjdqm}" readonly="readonly"  data-placeholder="交流目标国家或地区"  ></dm:list>

                    </div>

                    <label class="col-xs-2 control-label "  > 英语水平 </label>
                    <div class="col-xs-4">
                        <input type="text"  name="yysp" id="yysp" value="${sqjl.yysp}"  readonly="readonly" placeholder="考试种类+成绩"      class="col-xs-12" />
                    </div>
                </div>



                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 已资助金额   : </label>
                    <div class="col-xs-4">
                        <input type="text"  name="yzzje"    readonly="readonly" disabled="" value="${yzzje}"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 心理测评结果: </label>
                    <div class="col-xs-4">
                        <select class="chosen-select form-control" name="xlcp"  id="xlcp"    data-placeholder="请选择该学生测评结果">
                            <option value="A" selected>&nbsp;&nbsp;A&nbsp;&nbsp;</option>
                            <option value="B">&nbsp;&nbsp;B&nbsp;&nbsp;</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 项目资助金额(分段): </label>
                    <div class="col-xs-4">
                        <input type="text"     readonly="readonly" disabled="" value="${xm.zjje}"    class="col-xs-12" />
                    </div>

                    <label class="col-xs-2 control-label "  > 资助金额<i class="fa fa-star red"></i>: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="zzje"  id="zzje"  value=""    class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 审核意见<i class="fa fa-star-o red"></i>   : </label>
                    <div class="col-xs-10">
                       <%-- <select class="chosen-select form-control"  readonly="readonly"   data-placeholder="请选择审核意见">
                            <option value="">  </option>
                            <option value="A">通过</option>
                            <option value="B">不通过</option>
                        </select>--%>

                           <input type="text"  name="fsyj"  id="fsyj"  value=""    class="col-xs-12" />

                    </div>


                </div>

            </form>

        </div>

        <div id="messages" class="tab-pane fade">

            <c:if  test="${fjList != null && fjList.size() >0 }">
                <c:forEach items="${fjList}" var="fj" varStatus="status" >
                    <p><a href="sys/file/download?fileName=download${status.count}&fileId=${fj.fileId}" target="_blank">${fj.clsm} -点击下载</a>.</p>

                </c:forEach>
            </c:if>

        </div>


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


    </div>
</div>
<div class="col-md-offset-3 col-md-9">

    <button class="btn btn-info btn-sm" id="btnPass" type="button">
        <i class="ace-icon fa fa-check bigger-110"></i>
        通过
    </button>

    &nbsp; &nbsp; &nbsp;


    <button class="btn btn-danger btn-sm" id="btnBack" type="button">
        <i class="ace-icon fa fa-close bigger-110"></i>
        不通过
    </button>

    &nbsp; &nbsp; &nbsp;
</div>


<script src='assets/js/jquery.js'></script>
<script src="assets/js/jquery.knob.js"></script>
<script src="assets/js/autosize.js"></script>
<script src="assets/js/jquery.inputlimiter.1.3.1.js"></script>
<script src="assets/js/jquery.maskedinput.js"></script>
<script src="assets/js/jquery-ui.js"></script>
<script src="assets/js/jquery.ui.touch-punch.js"></script>

<!-- ace scripts -->



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


<!--自定义js -->
<script src="assets/project/js/common-window.js"></script>



<script>
    $(function(){




        $('.chosen-select').chosen({allow_single_deselect:true});

        /*$("#cjpm").mouseover(function(){
            layer.tips('最近一学年学业成绩排名或最近一学年综合测评排名:格式20/100', '#cjpm');
        });*/


        $("#btnPass").click(function(){
            alert("复审通过");
            sh("02");
        });
        $("#btnBack").click(function(){

            alert("复审不通过");
            sh("03");
        })

    })



    function sh(status){
       // alert("$(\"#sqjlId\").val():"+$("#sqjlId").val());
        $.ajax('xm/xsshFs',{
            data:{
                sqjlId:$("#sqjlId").val(),
                confirmStatus:status,
                xlcp:$("#xlcp").val(),
                zzje:$("#zzje").val(),
                fsyj:$("#fsyj").val()
            },
            success:function(resp){
                if(resp && resp.success){
                    parent.layer.alert("审核成功");
                    callback();
                }else{
                    parent.layer.alert("操作失败");
                }
            }
        })
    }

</script>
</body>
</html>
