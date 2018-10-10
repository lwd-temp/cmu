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
                    基本信息
                </a>
            </li>
            <li>
                <a data-toggle="tab" id="tzcyinfo" href="#messages">
                    随行成员信息
                </a>
            </li>
        </ul>
        <div class="tab-content">
            <div id="home" class="tab-pane fade in active">
                <input type="hidden" name="wbjdSq.status" id="status" value="01" />
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 代表团名称: </label>

                    <div class="col-xs-4">
                        <input type="text"  name="wbjdSq.dbtmc"   placeholder=""  class="col-xs-12" />
                    </div>
                    <label class="col-xs-2 control-label " > 来访人数: </label>
                    <div class="col-xs-4">
                        <input type="text"  name="wbjdSq.lfrs"   placeholder=""  class="col-xs-12" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 来访时间: </label>
                    <div class="col-xs-4">
                        <input class="form-control date-picker" name="wbjdSq.lfsj" value="" id="lfsj" type="text" data-date-format="yyyy-mm-dd" />
                    </div>
                    <label class="col-xs-2 control-label " > 停留时间起始: </label>

                    <div class="col-xs-4">
                        <input class="form-control date-picker" name="wbjdSq.tlsjStart" id="tlsjStart" value="" type="text" data-date-format="yyyy-mm-dd" />
                    </div>

                </div>

                <div class="form-group">
                    <label class="col-xs-2 control-label " > 停留时间截止: </label>

                    <div class="col-xs-4">
                        <input class="form-control date-picker" name="wbjdSq.tlsjEnd" id="tlsjEnd" value="" type="text" data-date-format="yyyy-mm-dd" />
                    </div>
                    <label class="col-xs-2 control-label "  > 国家: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="T_DM_GB"  type="select" multiple="multiple"  id="cfgbIds"  name="cfgbIds"   data-placeholder="请选择团组级别"  ></dm:list>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label " > 来访目的: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_lfmd" id="jdlx" name="wbjdSq.lfmd"  data-placeholder="请选择来访目的"  onchange="selectlfmd(this)"></dm:list>
                    </div>
                    <label class="col-xs-2 control-label "  > 经费来源: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " name="wbjdSq.jfly" value="" type="text"   />
                    </div>
                </div>
                <div class="form-group qtmd">
                    <label class="col-xs-2 control-label "  > 其他目的: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdSq.lfmdQt" value="" type="text"   />
                    </div>
                </div>
                <div class="form-group yjtm" >
                    <label class="col-xs-2 control-label "  > 演讲题目: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdSq.yjtm" value="" type="text"   />
                    </div>
                </div>
                <div class="form-group "  >
                    <label class="col-xs-2 control-label "  > 邀请信息: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdSq.yqxx" value="" type="text"   />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-2 control-label "  > 礼品: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " name="wbjdSq.lp" value="" type="text"   />
                    </div>
                    <label class="col-xs-2 control-label "  > 数量: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " name="wbjdSq.lpsl" value="" type="text"   />
                    </div>
                </div>
                <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 情况记录: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdSq.qkjl" value="" type="text"   />
                    </div>
                </div>
                <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 访问成果: </label>
                    <div class="col-xs-10">
                        <input class="form-control  " name="wbjdSq.fwcg" value="" type="text"   />
                    </div>
                </div>
                <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 团长姓名: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " name="wbjdSq.tzxm" value="" type="text"   />
                    </div>

                    <label class="col-xs-2 control-label "  > 团长国籍: </label>
                    <div class="col-xs-4">
                        <input class="form-control  " name="wbjdSq.tzgj" value="" type="text"   />

                    </div>
                </div> <div class="form-group ">
                <label class="col-xs-2 control-label "  > 团长性别: </label>
                <div class="col-xs-4">
                    <dm:list tabName="t_dm_xb" id="jdlx" name="wbjdSq.tzxb" type="radio" data-placeholder="请选接待类型" ></dm:list>
                </div>

                <label class="col-xs-2 control-label "  > 团长出生日期: </label>
                <div class="col-xs-4">
                    <input class="form-control date-picker" name="wbjdSq.tzcsrq" id="tzcsrq" value="" type="text" data-date-format="yyyy-mm-dd" />
                </div>
            </div> <div class="form-group ">
                <label class="col-xs-2 control-label "  > 团长工作单位: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.tzgzdw" value="" type="text"   />
                </div>

                <label class="col-xs-2 control-label "  > 团长职称及职务: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.tzzw" value="" type="text"   />
                </div>
            </div> <div class="form-group ">
                <label class="col-xs-2 control-label "  > 专业及学术领域: </label>
                <div class="col-xs-10">
                    <input class="form-control  " name="wbjdSq.tzzy" value="" type="text"   />
                </div>
            </div> <div class="form-group ">
                <label class="col-xs-2 control-label "  > 主请人姓名: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.zqrxm" value="" type="text"   />
                </div>

                <label class="col-xs-2 control-label "  > 主请人电话: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.zqrdh" value="" type="text"   />
                </div>
            </div> <div class="form-group ">
                <label class="col-xs-2 control-label "  > 主请联系人姓名: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.zqlxrxm" value="" type="text"   />
                </div>

                <label class="col-xs-2 control-label "  > 主请联系人电话: </label>
                <div class="col-xs-4">
                    <input class="form-control  " name="wbjdSq.zqlxrdh" value="" type="text"   />
                </div>
            </div>
                <div class="form-group ">
                    <label class="col-xs-2 control-label "  > 接待部门: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_wblf_jdlx" id="jdbm" name="wbjdSq.jdbm"  data-placeholder="请选择接待部门" ></dm:list>
                    </div>

                    <label class="col-xs-2 control-label "  > 接待类型: </label>
                    <div class="col-xs-4">
                        <dm:list tabName="t_dm_wblf_jdlx" id="jdlx" name="wbjdSq.jdlx"  data-placeholder="请选接待类型" ></dm:list>
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
                    <div class="col-xs-3">姓名</div>
                    <div class="col-xs-3">国籍</div>
                    <div class="col-xs-3">职务</div>
                    <div class="col-xs-2">操作</div>
                </div>
                <div class="row sxr">
                    <div class="col-xs-3"><input type="text" inp="xm"       name="sxr[0].xm" class="col-xs-12"/></div>
                    <div class="col-xs-3"><input type="text" inp="gj"       name="sxr[0].gj" class="col-xs-12"/></div>
                    <div class="col-xs-3"><input type="text" inp="zw"       name="sxr[0].zw" class="col-xs-12"/></div>
                    <div class="col-xs-2">
                        <button class='btn btn-danger btn-mini' onclick='deleteSxr(this);return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
                        <button class='btn btn-info btn-mini' onclick='appendSxr(); return false;'><i class='ace-icon fa fa-plus '>添加</i>  </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</form>

<div id="template" style="display: none">
    <div class="row sxr" >
        <div class="col-xs-3"><input type="text" inp="xm"   name="sxr[@].xm" class="col-xs-12"/></div>
        <div class="col-xs-3"><input type="text" inp="gj"   name="sxr[@].gj" class="col-xs-12"/></div>
        <div class="col-xs-3"><input type="text" inp="zw"   name="sxr[@].zw" class="col-xs-12"/></div>
        <div class="col-xs-2"  >
            <button class='btn btn-danger btn-mini' onclick='deleteSxr(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
            <button class='btn btn-info btn-mini' onclick='appendSxr(); return false;'><i class='ace-icon fa fa-plus '>添加</i>  </button>
        </div>
    </div>
</div>
</body>
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
            $(".yjtm").hide();
            $(".qtmd").hide();
            setFormValid();//设置校验规则
            $("#saveForm").click(function(){
                $("#status").val("01");//暂存
                saveSq();
            });
            $("#submitForm").click(function(){
                $("#status").val("02");//提交
                saveSq();
            });
        });
        function setFormValid(){
            $("#form").setValid({
                //校验规则
                rules: {
                    "wbjdSq.dbtmc":{ required:true},
                    "wbjdSq.lfrs":{ required:true},
                    "wbjdSq.lfmd":{ required:true},
                    "wbjdSq.tzxm":{ required:true},
                    "wbjdSq.zqlxrxm":{ required:true},
                    "wbjdSq.zqlxrdh":{ required:true}
                }
            })
        }
        function saveSq(){
            if(!validateSq()){
                return;
            }
            calInputNames();
            $.ajax('wbjd/save',{
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
                return false;
            }
            return true;
        }
        function calInputNames(){
            $('form input[inp=xm]').each(function(index,el){
                $(el).attr('name','sxr['+index+'].xm');
            });
            $('form input[inp=gj]').each(function(index,el){
                $(el).attr('name','sxr['+index+'].gj');
            });
            $('form input[inp=zw]').each(function(index,el){
                $(el).attr('name','sxr['+index+'].zw');
            });
        }
        function deleteSxr(btn){
            var size = $("#messages .sxr").size();
            if(size<=1){
                parent.layer.alert("请至少录入一个随行成员");
                return false;
            }
            var row = $(btn).parent().parent();
            row.remove();
        }
        function appendSxr(){
            $("#messages").append($("#template").html());
        }
        //选择来访目的
        function selectlfmd(select) {
            var md = $(select).val();
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
        }
    </script>
</body>
</html>
