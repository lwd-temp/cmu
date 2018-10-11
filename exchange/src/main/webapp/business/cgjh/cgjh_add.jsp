<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/13
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://cn.edu.cmu/uitag" prefix="dm" %>

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


    <link rel="stylesheet" href="assets/css/bootstrap-timepicker.css" />
    <link rel="stylesheet" href="assets/css/daterangepicker.css" />
    <link rel="stylesheet" href="assets/css/bootstrap-datetimepicker.css" />


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
    <ul class="nav nav-tabs" id="myTab">
        <li class="active">
            <a data-toggle="tab" href="#home">
                <i class="green ace-icon fa fa-home bigger-120"></i>
                学生信息
            </a>
        </li>

        <li>
            <a data-toggle="tab" id="tzcyinfo" href="#messages">
                团组成员信息

            </a>
        </li>

    </ul>

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">

                <input type="hidden" name="cgTzjh.status" id="status" value="01" />
                <!-- #section:elements.form -->
                <div class="form-group">
                    <label class="col-xs-2 control-label "> 团组号: </label>

                    <div class="col-xs-4">
                        <input type="text" id="tzh" readonly="readonly" placeholder="保存后自动生成" class="col-xs-12"/>
                    </div>
                    <label class="col-xs-2 control-label "> 团组类别: </label>
                    <div class="col-xs-4">


                        <dm:list tabName="T_DM_TZLB" id="tzlb" name="cgTzjh.tzlb"  data-placeholder="请选择团组类别" onchange="selecttzjb(this)"></dm:list>

                    </div>


                </div>


                <div class="form-group">
                    <label class="col-xs-2 control-label "> 计划类型: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="T_DM_JHLX" id="jhlx" name="cgTzjh.jhlx"  data-placeholder="请选择计划类型" ></dm:list>

                    </div>
                    <label class="col-xs-2 control-label "> 出访单位: </label>

                    <div class="col-xs-4">
                        <input type="text" name="cgTzjh.cfdw" readonly="readonly" value="中国医科大学" class="col-xs-12"/>
                    </div>

                </div>


                <div class="form-group">
                    <label class="col-xs-2 control-label "> 团组级别: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="T_DM_TZJB" id="tzjb" name="cgTzjh.tzjb"  data-placeholder="请选择团组级别" ></dm:list>


                    </div>
                    <label class="col-xs-2 control-label "> 自主或参加双跨: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="T_DM_ZZSK" id="zzhsk" name="cgTzjh.zzhsk"  data-placeholder="请选择" ></dm:list>

                    </div>
                </div>

                <div class="form-group lx1">
                    <label class="col-xs-2 control-label "> 团组负责人姓名: </label>
                    <div class="col-xs-4" id="fzr1">
                        <input class="form-control" name="cgTzjh.fzrxm" id="fzrxm" value="" type="text"/>
                    </div>

                    <label class="col-xs-2 control-label "> 行政职务: </label>
                    <div class="col-xs-4">
                        <input class="form-control " name="cgTzjh.xzzw" id="xzzw" value="" type="text"/>
                    </div>

                </div>
                <div class="form-group lx1">
                    <label class="col-xs-2 control-label "> 行政级别: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " name="cgTzjh.xzjb" id="xzjb" value="" type="text"/>
                    </div>

                    <label class="col-xs-2 control-label "> 技术职务: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " name="cgTzjh.jszw" id="jszw" value="" type="text"/>
                    </div>

                </div>

                <div class="form-group lx2">
                    <label class="col-xs-2 control-label "> 团组负责人姓名: </label>
                    <div class="col-xs-4" id="fzr2">

                    </div>

                    <label class="col-xs-2 control-label "> 职务: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " name="cgTzjh.zw" id="zw" value="" type="text"/>
                    </div>

                </div>
                <div class="form-group lx2">
                    <label class="col-xs-2 control-label "> 职级: </label>
                    <div class="col-xs-4">
                        <input class="form-control  "  name="cgTzjh.zj" id="zj" value="" type="text"/>
                    </div>

                    <label class="col-xs-2 control-label "> 分管工作: </label>
                    <div class="col-xs-4">
                        <input class="form-control  "  name="cgTzjh.ffgz"  id="ffgz" value="" type="text"/>
                    </div>

                </div>


                <div class="form-group">
                    <label class="col-xs-2 control-label "> 团组人数: </label>
                    <div class="col-xs-4">
                        <input class="form-control "  name="cgTzjh.tzrs"   id="tzrs" value="" type="text"/>
                    </div>
                    <label class="col-xs-2 control-label "> 拟出访国家或地区: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="T_DM_GB"  type="select" multiple="multiple"  id="cfgbIds"  name="cfgbIds"   data-placeholder="请选择团组级别"  ></dm:list>


                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "> 出访任务: </label>
                    <div class="col-xs-10">
                        <input class="form-control " name="cgTzjh.cfrw" id="cfrw" value="" type="text"/>
                    </div>

                </div>


                <div class="form-group">
                    <label class="col-xs-2 control-label "> 出访时间(月): </label>
                    <div class="col-xs-4 ">
                        <input class="form-control month-picker" data-date-format="YYYY-MM"  id="cfsj" name="cgTzjh.cfsj" value="" type="text"/>
                    </div>
                    <label class="col-xs-2 control-label "> 出访天数: </label>
                    <div class="col-xs-4">
                        <input class="form-control" id="cfts" name="cgTzjh.cfts" value="" type="text"/>
                    </div>

                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "> 省本级部门预算: </label>
                    <div class="col-xs-4">
                        <input class="form-control" id="sjys" name="cgTzjh.sjys" value="" type="text"/>
                    </div>
                    <label class="col-xs-2 control-label "> 其他预算: </label>
                    <div class="col-xs-4">
                        <input class="form-control" id="qtys" name="cgTzjh.qtys" value="" type="text"/>
                    </div>

                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "> 任务批件文号: </label>
                    <div class="col-xs-4">
                        <input class="form-control" id="rwpjwh" name="cgTzjh.rwpjwh" value="" type="text"/>
                    </div>

                    <label class="col-xs-2 control-label "> 任务批复时间: </label>
                    <div class="col-xs-4">
                        <input class="form-control date-picker" name="cgTzjh.rwpfsj" id="rwpfsj" value="" type="text"
                               data-date-format="yyyy-mm-dd"/>
                    </div>

                </div>


                <div class="col-md-offset-3 col-md-9">
                    <button class="btn btn-info btn-sm" id="saveForm" type="button">
                        <i class="ace-icon fa fa-check bigger-110"></i>
                        暂存
                    </button>

                    &nbsp; &nbsp; &nbsp;


                    <button class="btn btn-danger btn-sm" id="submitForm" type="button">
                        <i class="ace-icon fa fa-check bigger-110"></i>
                        提交
                    </button>

                </div>



        </div>
        <div id="messages" class="tab-pane fade in " style="">
            <div class="row" style="text-align: center;">
                <div class="col-xs-2">姓名</div>
                <div class="col-xs-3">二级单位名称</div>
                <div class="col-xs-3">职务</div>
                <div class="col-xs-2">级别</div>
                <div class="col-xs-2">操作</div>
            </div>
            <div class="row cy">
                <div class="col-xs-2"><input type="text" inp="xm"       name="cys[0].xm" class="col-xs-12"/></div>
                <div class="col-xs-3"><input type="text" inp="ejdwmc"   name="cys[0].ejdwmc" class="col-xs-12"/></div>
                <div class="col-xs-3"><input type="text" inp="zw"       name="cys[0].zw" class="col-xs-12"/></div>
                <div class="col-xs-2"><input type="text" inp="jb"       name="cys[0].jb" class="col-xs-12"/></div>
                <div class="col-xs-2">
                    <button class='btn btn-danger btn-mini' onclick='deleteCy(this);return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
                    <button class='btn btn-info btn-mini' onclick='appendCy(); return false;'><i class='ace-icon fa fa-plus '>添加</i>  </button>
                </div>
            </div>
        </div>
    </div>
</div>
</form>

<div id="template" style="display: none">
    <div class="row cy" >
        <div class="col-xs-2"><input type="text" inp="xm"   name="cys[@].xm" class="col-xs-12"/></div>
        <div class="col-xs-3"><input type="text" inp="ejdwmc"   name="cys[@].ejdwmc" class="col-xs-12"/></div>
        <div class="col-xs-3"><input type="text" inp="zw"   name="cys[@].zw" class="col-xs-12"/></div>
        <div class="col-xs-2"><input type="text" inp="jb"   name="cys[@].jb" class="col-xs-12"/></div>
        <div class="col-xs-2">
            <button class='btn btn-danger btn-mini' onclick='deleteCy(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
            <button class='btn btn-info btn-mini' onclick='appendCy(); return false;'><i class='ace-icon fa fa-plus '>添加</i>  </button>
        </div>
    </div>
</div>






<script src='assets/js/jquery.js'></script>

<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/date-time/moment.js"></script>
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>
<script src="assets/js/date-time/bootstrap-datetimepicker.js"></script>
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

        //月份选择器
        $(".month-picker").datetimepicker({viewMode: "months",format: 'YYYY-MM'});

        $(".lx2").hide();

        setFormValid();//设置校验规则

        $("#saveForm").click(function(){
            $("#status").val("01");//暂存
            saveJh();
        });

        $("#submitForm").click(function(){
            $("#status").val("02");//提交
            saveJh();
        });
    });

    //校验整个计划
    function validateJh(){

        if(!$("#form").valid()){
            return false;
        }
        //校验成员信息

        return true;
    }

    function isLx1(){
        var lb = $("#tzlb").val();

        //$("#tzh").val(lb);
        if (lb!='' && (lb == '01' || lb == '02')) {
            return true;
        }

        return false;
    }

    function isLx2(){
        var lb = $("#tzlb").val();

        //$("#tzh").val(lb);
        if (lb!='' &&(lb == '01' || lb == '02')) {
            return false;
        }

        return true;
    }


    function setFormValid(){

        $("#form").setValid({
            //校验规则
            rules: {
                "cgTzjh.tzlb":{ required:true},
                "cgTzjh.jhlx":{ required:true},
                "cgTzjh.cfdw":{ required:true},
                "cgTzjh.tzjb":{ required:true},
                "cgTzjh.zzhsk":{ required:true},
                "cgTzjh.fzrxm":{ required:true},

                "cgTzjh.xzzw":{ required:isLx1},
                "cgTzjh.xzjb":{ required:isLx1},
                "cgTzjh.jszw":{ required:isLx1},

                "cgTzjh.zw":{ required:isLx2},
                "cgTzjh.zj":{ required:isLx2},
                "cgTzjh.ffgz":{ required:isLx2},

                "cgTzjh.tzrs":{ required:true,number:true},
                "cgTzjh.cfrw":{ required:true},
                "cgTzjh.cfsj":{ required:true},
                "cgTzjh.cfts":{ required:true,number:true},
                "cgTzjh.sjys":{ required:true,range:[0.01,9999999999.99]},
                "cgTzjh.qtys":{ required:true,range:[0.01,9999999999.99]},
                "cgTzjh.rwpjwh":{ required:true},
                "cgTzjh.rwpfsj":{ required:true},
            }
        })


    }


    function saveJh(){
        if(!validateJh()){
            return;
        }
        calInputNames();

        $.ajax('cgjh/save',{
            type:'post',
            dataType:'json',
            data:$("#form").serialize(),
            success:function(res){
                if(res && res.success){
                    parent.refreshTable();
                    closeLayer();//关闭
                    winAlert("保存成功");//弹出确认消息
                }
            }

        });
    }

    //选择团组类别决定团组号
    function selecttzjb(select) {
        var lb = $(select).val();

        //$("#tzh").val(lb);
        if (lb == '01' || lb == '02') {

            $(".lx1").show();
            $(".lx2").hide();

            var fzr = $("#fzr2").children().clone(true);
            $("#fzr1").append(fzr);
            $("#fzr2").children().remove();

        } else {
            $(".lx1").hide();
            $(".lx2").show();


            var fzr = $("#fzr1").children().clone(true);

            $("#fzr2").append(fzr);
            $("#fzr1").children().remove()


        }
    }

    function deleteCy(btn){

        var size = $("#messages .cy").size();
        if(size<=1){
            parent.layer.alert("请至少录入一个团组成员");
            return false;
        }

        var row = $(btn).parent().parent();
        row.remove();
    }

    function calInputNames(){

        $('form input[inp=xm]').each(function(index,el){
            $(el).attr('name','cys['+index+'].xm');
        });

        $('form input[inp=ejdwmc]').each(function(index,el){
            $(el).attr('name','cys['+index+'].ejdwmc');
        });

        $('form input[inp=zw]').each(function(index,el){
            $(el).attr('name','cys['+index+'].zw');
        });

        $('form input[inp=jb]').each(function(index,el){
            $(el).attr('name','cys['+index+'].jb');
        });

    }

    function appendCy(){
        //var $pdf_template = $("#pdf_template").clone();
        $("#messages").append($("#pdf_template").html());
    }

</script>
</body>
</html>
