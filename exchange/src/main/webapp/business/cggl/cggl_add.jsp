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
                <input type="hidden" name="status" id="status" value="01" />
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 姓名: </label>
                        <div class="col-xs-4">
                            <input type="text"  name="xm" id="xm" value="${jzg.xm}"  readonly="readonly"    class="col-xs-12" />
                        </div>
                        <label class="col-xs-2 control-label"  > 性别: </label>
                        <div class="col-xs-4">
                            <dm:list tabName="t_dm_xb"  name="xb" id="xb" value="01" type="radio" readonly="readonly"  ></dm:list>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 出生日期 : </label>
                        <div class="col-xs-4">

                            <input class="form-control date-picker" name="csrq" id="csrq"
                                   value="${jzg.csrq}"
                                   type="text" data-date-format="yyyy-mm-dd" />

                        </div>
                        <label class="col-xs-2 control-label"  > 出生地: </label>
                        <div class="col-xs-4">
                            <input type="text"  name="csd" id="csd"   value="${jzg.csdm}"  class="col-xs-12" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 户籍所在地  : </label>
                        <div class="col-xs-4">
                            <input type="text"  name="hjszd"  id="hjszd"       class="col-xs-12" />
                        </div>
                        <label class="col-xs-2 control-label"  > 身份证号: </label>
                        <div class="col-xs-4">
                            <input type="text"  name="sfzh"  id="sfzh" value="${jzg.sfzjh}"     class="col-xs-12" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 所属二级单位   : </label>
                        <div class="col-xs-4">
                            <input type="hidden" name="ssejdw"  value="${jzg.ejdwh}" />
                            <input type="text" id="ssejdw" value="${ssejdwMc}"  readonly="readonly"  class="col-xs-12" />
                        </div>
                        <label class="col-xs-2 control-label"  > 科室: </label>
                        <div class="col-xs-4">
                            <input type="text"  name="ks"  id="ks"     class="col-xs-12" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 职务   : </label>
                        <div class="col-xs-4">
                            <input type="text"  name="zw"   id="zw"    class="col-xs-12" />
                        </div>
                        <label class="col-xs-2 control-label"  > 职称: </label>
                        <div class="col-xs-4">
                            <input type="text"  name="zc"   id="zc"    class="col-xs-12" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 联系电话   : </label>
                        <div class="col-xs-4">
                            <input type="text"  name="yddh" id="yddh" value="${jzg.yddh}"  class="col-xs-12" />
                        </div>
                        <label class="col-xs-2 control-label "  > 邮箱: </label>
                        <div class="col-xs-4">
                            <input type="text"  name="dzxx" id="dzxx" value="${jzg.dzxx}"   class="col-xs-12" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 出访国家（地区）   : </label>
                        <div class="col-xs-4">
                            <input type="text"  name="cfgj"      class="col-xs-12" />
                        </div>

                        <label class="col-xs-2 control-label"  > 入境城市（地区）: </label>
                        <div class="col-xs-4">
                            <input type="text"  name="rjcs"      class="col-xs-12" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 出访团组号   : </label>
                        <div class="col-xs-4">
                            <input type="hidden"  name="tzid"  id="tzid"  />
                            <input type="text"  id="tzh" onclick="clicktzid()" class="col-xs-12" />
                        </div>

                        <label class="col-xs-2 control-label"  > 出访团组名称   : </label>
                        <div class="col-xs-4">
                            <input type="text"  id="tzmc" onclick="clicktzid()" class="col-xs-12" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 出访开始日期 </label>
                        <div class="col-xs-4">
                            <input class="form-control date-picker" name="cfksrq"
                                   readonly="readonly"    id="cfksrq" type="text" data-date-format="yyyy-mm-dd" />
                        </div>
                        <label class="col-xs-2 control-label"  > 出访结束日期   : </label>
                        <div class="col-xs-4">
                            <input class="form-control date-picker" name="cfjsrq"
                                   readonly="readonly"    id="cfjsrq" type="text" data-date-format="yyyy-mm-dd" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 出访目的: </label>
                        <div class="col-xs-10">
                            <dm:list tabName="t_dm_cfmd"  name="cfmd"  data-placeholder="请选择出访目的"  onchange="selectcfmd(this)"></dm:list>
                        </div>
                    </div>
                    <div class="form-group" id="cfmdQt">
                        <label class="col-xs-2 control-label"  > 出访目的—其他: </label>
                        <div class="col-xs-10">
                            <input type="text"  name="cfmdQt"      class="col-xs-12" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 邀请人姓名   : </label>
                        <div class="col-xs-4">
                            <input type="text"  name="yqrXm"        class="col-xs-12" />
                        </div>

                        <label class="col-xs-2 control-label"  > 邀请人职务: </label>
                        <div class="col-xs-4">
                            <input type="text"  name="yqrZw"      class="col-xs-12" />
                        </div>
                    </div><div class="form-group">
                        <label class="col-xs-2 control-label"  > 邀请人姓名(英文)   : </label>
                        <div class="col-xs-4">
                            <input type="text"  name="yqrXmEn"     class="col-xs-12" />
                        </div>

                        <label class="col-xs-2 control-label"  > 邀请人职务(英文): </label>
                        <div class="col-xs-4">
                            <input type="text"  name="yqrZwEn"         class="col-xs-12" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 邀请人单位   : </label>
                        <div class="col-xs-4">
                            <input type="text"  name="yqrDw"        class="col-xs-12" />
                        </div>

                        <label class="col-xs-2 control-label"  > 邀请人详细地址: </label>
                        <div class="col-xs-4">
                            <input type="text"  name="yqrXxdz"       class="col-xs-12" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 邀请人单位(英文)   : </label>
                        <div class="col-xs-4">
                            <input type="text"  name="yqrDwEn"         class="col-xs-12" />
                        </div>

                        <label class="col-xs-2 control-label"  > 邀请人详细地址(英文): </label>
                        <div class="col-xs-4">
                            <input type="text"  name="yqrXxdzEn"        class="col-xs-12" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 邀请人电话  : </label>
                        <div class="col-xs-4">
                            <input type="text"  name="yqrDh"         class="col-xs-12" />
                        </div>

                        <label class="col-xs-2 control-label"  > 邀请人电话(英文): </label>
                        <div class="col-xs-4">
                            <input type="text"  name="yqrDhEn"        class="col-xs-12" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 申请类别  : </label>
                        <div class="col-xs-4">
                            <dm:list tabName="t_dm_cgsqlx"  name="cglx"  data-placeholder="请选择申请类别"  onchange="selectcglx(this)"></dm:list>
                        </div>
                        <label class="col-xs-2 control-label"  > 年内出访次数  : </label>
                        <div class="col-xs-4">
                            <input type="text"  name="nncfcs"      class="col-xs-12" />
                        </div>
                    </div>

                    <div class="form-group" id="jfysmx">
                        <label class="col-xs-2 control-label"> 经费预算明细  : </label>
                        <div class="col-xs-10">
                            <textarea class="form-control" name="jfysmx"  maxlength="300"></textarea>
                        </div>
                    </div>
                    <div class="form-group" id="jfyshj">
                        <label class="col-xs-2 control-label"> 预算合计  : </label>
                        <div class="col-xs-10">
                            <input type="text"  name="jfyshj"  class="col-xs-12" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-2 control-label"  > 申请人其他社会任职  : </label>
                        <div class="col-xs-10">
                            <textarea class="form-control limited" name="qtshrz"   maxlength="300"></textarea>
                        </div>
                    </div>
                    <div id="btns" class="col-md-offset-3 col-md-9">
                        <button class="btn btn-info btn-sm btns" id="saveForm" type="button">
                            <i class="ace-icon fa fa-check bigger-110"></i>
                            暂存
                        </button>
                        &nbsp; &nbsp; &nbsp;
                        <button class="btn btn-danger btn-sm btns" id="submitForm" type="button">
                            <i class="ace-icon fa fa-check bigger-110"></i>
                            提交
                        </button>
                    </div>
                &nbsp; &nbsp; &nbsp;
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
        $('#cfmdQt').hide();

        setFormValid();//设置校验规则

        $("#saveForm").click(function(){
            $("#status").val("01");//暂存
            if(!validateSq()){
                return;
            }
            saveSq();
        });

        $("#submitForm").click(function(){
            $("#status").val("02");//提交
            if(!validateSq()){
                return;
            }
            saveSq();
        });
    });
    function setFormValid(){
        var validator =  $("#form").setValid({
            //校验规则
            rules: {
                "cfmd":{ required:true},
                "cglx":{ required:true},
                "yqrXm":{ required:true},
                "yqrZw":{ required:true},
                "yqrDw":{ required:true},
                "yqrXxdz":{ required:true},
                "yqrDh":{ required:true},
                "yqrXmEn":{ required:true},
                "yqrZwEn":{ required:true},
                "yqrDwEn":{ required:true},
                "yqrXxdzEn":{ required:true},
                "yqrDhEn":{ required:true}
            }
        })
    }
    function saveSq(){

        if(!validateSq()){
            return;
        }
        $.ajax('cggl/save',{
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

    //校验整个计划
    function validateSq(){
        if(!$("#form").valid()){
            validator.focusInvalid();
            return false;
        }
        return true;
    }

    //选择出国类型
    function selectcglx(select) {
        var cglx = $(select).val();
        if (cglx == '99') {//因私短期出国
            $("#jfysmx").hide();
            $("#jfyshj").hide();
        }else{
            $("#jfysmx").show();
            $("#jfyshj").show();
        }
    }
    //选择出访目的
    function selectcfmd(select) {
        var cfmd = $(select).val();
        //选择其他需要填写
        if (cfmd == '99') {
            $("#cfmdQt").show();
        }else{
            $("#cfmdQt").hide();
        }
    }

    function clicktzid() {

        var index = parent.layer.open({
            type: 2,
            area: ['1000px', ($(parent).height()-10)+"px"],
            maxmin: true,
            content:'cggl/selectTzList',
            success:function(layero, index){

                var fraWinName = layero.find('iframe')[0]['name'];
                //设置打开窗口的回调函数,及调用此函数接受参数
                parent.frames[fraWinName].callback = function(tzjh){

                    $("#tzid").val(tzjh.tzid);
                    $("#tzh").val(tzjh.tzh);
                    $("#tzmc").val(tzjh.tzmc);
                };
            },
        });
    }
</script>
</body>
</html>