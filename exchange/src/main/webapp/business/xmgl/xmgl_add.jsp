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
                            <input type="hidden" name="xm.status" id="status" value=""/>
                            <!-- #section:elements.form -->
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 项目类型: </label>

                                <div class="col-xs-4">
                                    <dm:list tabName="T_DM_XMLX" id="xmlx" name="xm.xmlx" data-placeholder="请选择项目类型"></dm:list>
                                </div>
                                <label class="col-xs-2 control-label "> 项目编号: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="xm.xmbh" readonly="readonly" placeholder="保存后自动生成项目编号" class="col-xs-12"/>
                                </div>


                            </div>


                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 项目名称: </label>
                                <div class="col-xs-4">
                                    <input type="text" name="xm.xmmc" id="xmmc" placeholder="请输入项目名称" class="col-xs-12"/>
                                </div>
                                <label class="col-xs-2 control-label "> 项目总名: </label>

                                <div class="col-xs-4">
                                    <input type="text" name="xm.xmzm" id="xmzm" placeholder="请输入项目总名" class="col-xs-12"/>
                                </div>

                            </div>


                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 项目开始时间: </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" id="xmkssj" name="xm.xmkssj" value="" type="text" data-date-format="yyyy-mm-dd"/>
                                </div>


                                <label class="col-xs-2 control-label "> 项目层次: </label>
                                <div class="col-xs-4">
                                    <dm:list tabName="T_DM_XMCC" id="xmcc" name="xm.xmcc" data-placeholder="请选择项目层次"></dm:list>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 项目结束时间: </label>

                                <div class="col-xs-4">
                                    <input class="form-control date-picker" id="smjssj" name="xm.smjssj" value="" type="text" data-date-format="yyyy-mm-dd"/>
                                </div>
                                <label class="col-xs-2 control-label "> 经费来源: </label>
                                <div class="col-xs-4">
                                    <dm:list tabName="T_DM_JFLY" id="jfly" name="xm.jfly" data-placeholder="请选择经费来源"></dm:list>
                                </div>

                            </div>

                            <div class="form-group selectgs">

                                <label class="col-xs-2 control-label "> 归属院系: </label>
                                <div class="col-xs-4">

                                    <input   name="xm.gsyxdm" id="gsyxdm" value=""  id="gsyxdm" type="hidden" />
                                    <input class="form-control " style="cursor: pointer;" name="xm.gsyxmc" id="gsyx" value="" readonly="readonly" type="text" placeholder="请点击进行选择"/>
                                </div>


                                <label class="col-xs-2 control-label "> 归属学生: </label>
                                <div class="col-xs-4">
                                    <input   name="xm.gsxsdm" id="gsxsdm" value=""  type="hidden" />
                                    <input class="form-control"  style="cursor: pointer;" name="xm.gsxsxm"  readonly="readonly" id="gsxs" type="text" placeholder="请点击进行选择"/>
                                </div>
                            </div>


                            <div class="form-group">

                                <label class="col-xs-2 control-label "> 交流目标国家或地区: </label>
                                <div class="col-xs-4">
                                    <dm:list tabName="T_DM_GB"  type="select" multiple="multiple"  id="gb"  name="gbs"   data-placeholder="请选择国别"  ></dm:list>
                                </div>


                                <label class="col-xs-2 control-label "> 交流目标机构名称: </label>
                                <div class="col-xs-4">
                                    <input class="form-control typeahead scrollable" name="xm.jlmbjgmc" id="jlmbjgmc" type="text" placeholder="交流目标机构名称,如'国'"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 资助金额: </label>
                                <div class="col-xs-4">
                                    <input class="form-control  " name="xm.zjje" id="zjje" value="" type="text"/>
                                </div>
                                <label class="col-xs-2 control-label "> 项目收费标准: </label>
                                <div class="col-xs-4">
                                    <input class="form-control" style="display: inline;width: 55%;" name="xm.fybz" id="fybz" type="text" placeholder="费用标准"/> &nbsp;&nbsp;&nbsp;人民币元/人
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 项目收费说明: </label>
                                <div class="col-xs-10">
                                    <input class="col-xs-12 col-sm-12" name="xm.zysm" id="zysm" value="" type="text"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 计划人数: </label>
                                <div class="col-xs-4">
                                    <input class="form-control" name="xm.jhrs" id="jhrs" value="" type="text"/>
                                </div>
                                <label class="col-xs-2 control-label "> 项目年级限制: </label>
                                <div class="col-xs-4">

                                    <input class="form-control typeahead scrollable" name="xm.xmnjxz" id="xmnjxz" type="text" placeholder="年级限制"/>
                                </div>

                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 项目专业限制: </label>
                                <div class="col-xs-4">


                                    <dm:list sourceList="${zyList}"   id="xmzyxz" name="xm.xmzyxz" data-placeholder="项目专业限制"></dm:list>

                                    <%--<select class="form-control chosen-select" name="xm.xmzyxz"  id="xmzyxz" data-placeholder="请选择专业" multiple="multiple">
                                        <option value="2014" >临床医学</option>
                                        <option value="2015" >影像学</option>
                                        <option value="2016" >检验学</option>
                                    </select>--%>
                                </div>
                                <label class="col-xs-2 control-label "> 语言要求: </label>
                                <div class="col-xs-4">
                                    <dm:list tabName="t_dm_yy"  value="" id="yyyq" name="xm.yyyq" data-placeholder="请选择语言"></dm:list>
                                </div>

                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 项目概况: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" name="xm.xmgk" id="xmgk" maxlength="300"></textarea>
                                </div>

                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "> 项目资助计划: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" name="xm.xmzzjh" id="xmzzjh" maxlength="300"></textarea>
                                </div>

                            </div>

                            <div class="col-md-offset-3 col-md-9">

                                <button class="btn btn-info btn-sm" id="btnSave" type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                    暂存
                                </button>

                                &nbsp; &nbsp; &nbsp;

                                <button class="btn btn-info btn-sm" id="btnDeploy" type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                    发布
                                </button>

                            </div>

                        </form>

                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div>
    </div><!-- /.main-content -->


</div><!-- /.main-container -->


<script src='assets/js/jquery.js'></script>

<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>
<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>

<script src="assets/js/layer/layer.js"></script>
<script src="assets/js/jqGrid/jquery.jqGrid.js"></script>
<script src="assets/js/jqGrid/i18n/grid.locale-cn.js"></script>
<!-- ace scripts -->
<!-- jqueryValidate验证框架-->
<script src="assets/js/jqvalidate/jquery.validate.js"></script>
<%--<script src="assets/js/jqvalidate/jquery.validate.min.js"></script>--%>
<script src="assets/js/jqvalidate/messages_zh.js"></script>
<script src="assets/js/layer/layer.js"></script>
<script src="assets/project/js/common-window.js"></script>


<script>

    var validator;

    $(function () {

        //设置验证.
        setFormValidate();

        var names = ["美国", "英国1", "英国2", "英国3", "英国4", "英国5", "英国6", "英国7", "英国8"];


        $('#jlmbjgmc').inputSelect(names);

        $('#xmnjxz').inputSelect('xm/listNj');
        $('#xmzm').inputSelect('xm/listMc');


        //根据项目层次 设置归属院系、归属学生显隐
        calXmcc($("#xmcc").val());


        $("#xmcc").change(function () {
            var val = $(this).val();
            calXmcc(val);
        });



        //选择归属院系
        $("#gsyx").click(function(){
            if($("#xmcc").val() =='02' || $("#xmcc").val() =='03'){
                selectYx();
            }
        });

        //选择归属学生
        $("#gsxs").click(function(){
            if($("#xmcc").val() =='03'){

                if($("#gsyx").val() == ''){
                    parent.layer.msg('请先选择归属院系');
                    return;
                }
                selectXs();
            }
        });




        $("#btnSave,#btnDeploy").click(function () {
            if (!$("#form").valid()) {
                validator.focusInvalid();
                return;
            }
            var id = $(this).attr('id');

            if ("btnSave" == id) {
                $("#status").val('01');
            } else {
                $("#status").val('02');
            }

            $.ajax('xm/save', {
                data: $("#form").serialize(),
                success: function (resp) {
                    if (resp && resp.success) {
                        parent.refreshTable();
                        winAlert("保存成功");
                        closeLayer();
                    }
                }
            })
        });

    });



    /**
     * 计算项目层次
     */
    function calXmcc(xmcc) {
        if ("01" == xmcc || "" == xmcc ) {
            $(".selectgs").hide();
            $("#gsyx").val("");
            $("#gsxs").val("");

            $("#gsyx").attr("disabled", "disabled");
            $("#gsxs").attr("disabled", "disabled");


        } else if ("02" == xmcc) {
            $(".selectgs").show();
            $("#gsyx").removeAttr("disabled");
            $("#gsxs").attr("disabled", "disabled");


            $("#gsxs").val("");

        } else if ("03" == xmcc) {
            $(".selectgs").show();
            $("#gsyx").removeAttr("disabled");
            $("#gsxs").removeAttr("disabled");
        }



        if ("03" == xmcc) {
            $("#gsxs").attr("placeholder","请点击选择学生");
        }else{
            $("#gsxs").attr("placeholder","非个人项目无需录入学生");
        }

    }


    //添加校验
    function setFormValidate() {

        validator = $("#form").setValid({
            ignore: ".ignore",
            //校验规则
            rules: {
                'xm.xmlx': 'required',
                'xm.xmmc': 'required',
                'xm.xmzm': 'required',
                'xm.xmkssj': 'required',
                'xm.xmcc': 'required',
                'xm.smjssj': 'required',
                'xm.jfly': 'required',
                'xm.zjje': {required: true, digits: true},
                'xm.jlmbjgmc': 'required',
                'xm.jlmbgj': 'required',
                'xm.fybz': {required: true, digits: true},
                'xm.zysm': 'required',
                'xm.jhrs': {required: true, number: true},
                'xm.xmnjxz': 'required',
                'xm.xmzyxz': 'required',
                'xm.yyyq': 'required',
                'xm.xmgk': 'required',
                'xm.xmzzjh': 'required',
                'xm.gsyxmc':{required:function(){
                        return ($("#xmcc").val() =='02' || $("#xmcc").val()== '03')
                    }},
                'xm.gsxsxm':{required:function(){
                        return $("#xmcc").val() == '03';
                    }}
            }
        });
    }


    /**
     * 选择归属院系
     */
    function selectYx(){
        var index = parent.layer.open({
            type: 2,
            area: ['1000px', ($(parent).height()-10)+"px"],
            maxmin: true,
            content:'sys/unit/selectUnic',
            success:function(layero, index){

                var fraWinName = layero.find('iframe')[0]['name'];
                //设置打开窗口的回调函数,及调用此函数接受参数
                parent.frames[fraWinName].callback = function(unit){
                    $("#gsyxdm").val(unit.unitId);
                    $("#gsyx").val(unit.name);
                };
            },
        });
    }

    /**
     * 选择归属学生
     */
    function selectXs(){
        var unitId = $("#gsyxdm").val();
        var index = parent.layer.open({
            type: 2,
            area: ['1000px', ($(parent).height()-10)+"px"],
            maxmin: true,
            content:'xsxx/selectXs?unitId='+unitId,
            success:function(layero, index){

                var fraWinName = layero.find('iframe')[0]['name'];
                //设置打开窗口的回调函数,及调用此函数接受参数
                parent.frames[fraWinName].callback = function(xsxx){
                    var xh = xsxx.XH;
                    var xm = xsxx.XM;
                    $("#gsxsdm").val(xh);
                    $("#gsxs").val(xm);
                };
            },
        });
    }


</script>
</body>
</html>
