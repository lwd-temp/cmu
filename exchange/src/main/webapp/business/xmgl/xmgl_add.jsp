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
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath%>" >
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />

    <meta name="description" content="Common form elements and layouts" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

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
                            <input type="hidden" name="xm.status" id="status" value="" />
                            <!-- #section:elements.form -->
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目类型: </label>

                                <div class="col-xs-4">
                                    <dm:list tabName="T_DM_XMLX" id="xmlx" name="xm.xmlx" data-placeholder="请选择项目类型"></dm:list>
                                </div>
                                <label class="col-xs-2 control-label " > 项目编号: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="xm.xmbh"   readonly="readonly"  placeholder="保存后自动生成项目编号"  class="col-xs-12" />
                                </div>


                            </div>


                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目名称: </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="xm.xmmc"  id="xmmc"  placeholder="请输入项目名称"  class="col-xs-12" />
                                </div>
                                <label class="col-xs-2 control-label " > 项目总名: </label>

                                <div class="col-xs-4">
                                    <input type="text"  name="xm.xmzm"  id="xmzm"  placeholder="请输入项目总名"  class="col-xs-12" />
                                </div>

                            </div>



                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目开始时间: </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" id="xmkssj" name="xm.xmkssj" value="" type="text" data-date-format="yyyy-mm-dd" />
                                </div>


                                <label class="col-xs-2 control-label "  > 项目层次: </label>
                                <div class="col-xs-4">
                                    <dm:list tabName="T_DM_XMCC" id="xmcc" name="xm.xmcc" data-placeholder="请选择项目层次"></dm:list>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label " > 项目结束时间: </label>

                                <div class="col-xs-4">
                                    <input class="form-control date-picker" id="smjssj"  name="xm.smjssj" value=""   type="text" data-date-format="yyyy-mm-dd" />
                                </div>
                                <label class="col-xs-2 control-label "  > 经费来源: </label>
                                <div class="col-xs-4">
                                    <dm:list tabName="T_DM_JFLY" id="jfly" name="xm.jfly" data-placeholder="请选择经费来源"></dm:list>
                                </div>

                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 资助金额: </label>
                                <div class="col-xs-4">
                                    <input class="form-control  "  name="xm.zjje" id="zjje" value="" type="text"   />
                                </div>
                                <label class="col-xs-2 control-label "  > 交流目标机构名称: </label>
                                <div class="col-xs-4">
                                        <input class="form-control typeahead scrollable" name="xm.jlmbjgmc" id="jlmbjgmc" type="text" placeholder="交流目标机构名称,如'国'" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 交流目标国家或地区: </label>
                                <div class="col-xs-4">
                                    <input class="form-control "  name="xm.jlmbgj" id="jlmbgj" value="" type="text"  />
                                </div>
                                <label class="col-xs-2 control-label "  > 项目收费标准: </label>
                                <div class="col-xs-4">
                                        <input class="form-control" style="display: inline;width: 55%;" name="xm.fybz" id="fybz" type="text" placeholder="费用标准" /> &nbsp;&nbsp;&nbsp;人民币元/人
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目收费说明: </label>
                                <div class="col-xs-10">
                                    <input class="col-xs-12 col-sm-12" name="xm.zysm" id="zysm" value="" type="text"  />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 计划人数: </label>
                                <div class="col-xs-4">
                                    <input class="form-control" name="xm.jhrs" id="jhrs" value="" type="text"  />
                                </div>
                                <label class="col-xs-2 control-label "  > 项目年级限制: </label>
                                <div class="col-xs-4">

                                    <input class="form-control typeahead scrollable" name="xm.xmnjxz" id="xmnjxz" type="text" placeholder="年级限制" />
                                </div>

                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目专业限制: </label>
                                <div class="col-xs-4">
                                    <select class="form-control chosen-select" name="xm.xmzyxz"  id="xmzyxz" data-placeholder="请选择专业" multiple="multiple">
                                        <option value="2014" >临床医学</option>
                                        <option value="2015" >影像学</option>
                                        <option value="2016" >检验学</option>
                                    </select>
                                </div>
                                <label class="col-xs-2 control-label "  > 语言要求: </label>
                                <div class="col-xs-4">
                                    <select class="form-control chosen-select" name="xm.yyyq" id="yyyq" data-placeholder="请选择语言" multiple="multiple">
                                        <option value="英语" >英语</option>
                                        <option value="俄语" >俄语</option>
                                        <option value="法语" >法语</option>
                                    </select>
                                </div>

                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目概况: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" name="xm.xmgk"  id="xmgk" maxlength="300"></textarea>
                                </div>

                            </div> <div class="form-group">
                                <label class="col-xs-2 control-label "  > 项目资助计划: </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" name="xm.xmzzjh" id="xmzzjh" maxlength="300"></textarea>
                                </div>

                            </div>


                            <div class="form-group">
                                <div class="col-xs-3">
                                    姓名
                                </div>
                                <div class="col-xs-3">
                                    专业
                                </div>
                                <div class="col-xs-3">
                                    年级
                                </div>
                                <div class="col-xs-3">
                                    操作
                                </div>
                            </div>

                            <div class="form-group"   id="grid-table-div">
                                <div class="col-xs-3">
                                    <input type="text"  inp="xm" name="chrys[@].xm"   placeholder="姓名"  class="col-xs-12" />
                                </div>
                                <div class="col-xs-3">
                                    <input type="text"  inp="zy" name="chrys[@].gj"  placeholder="专业"  class="col-xs-12" />
                                </div>
                                <div class="col-xs-3">
                                    <input type="text"  inp="nj" name="chrys[@].dw"   placeholder="年级"  class="col-xs-12" />
                                </div>
                                <div class="col-xs-3">
                                    <button class='btn btn-danger btn-mini' onclick='deleteCy(this); return false;'><i class='ace-icon fa fa-trash-o  '>删除</i></button>
                                    <button class='btn  btn-info btn-mini btnStuAdd' type="button" ><i class='ace-icon fa fa-plus '>添加</i>  </button>
                                </div>
                            </div>


                            <div class="col-md-offset-3 col-md-9">

                                <button class="btn btn-info btn-sm"  id="btnSave" type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                   暂存
                                </button>

                                &nbsp; &nbsp; &nbsp;

                                <button class="btn btn-info btn-sm" id="btnDeploy"  type="button">
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



    $(function(){

        //添加校验
        var validator = $("#form").setValid({
            ignore: ".ignore",
            //校验规则
            rules: {
                'xm.xmlx':'required',
                'xm.xmmc':'required',
                'xm.xmzm':'required',
                'xm.xmkssj':'required',
                'xm.xmcc':'required',
                'xm.smjssj':'required',
                'xm.jfly':'required',
                'xm.zjje':{required:true, 	digits:true},
                'xm.jlmbjgmc':'required',
                'xm.jlmbgj':'required',
                'xm.fybz':{required:true, 	digits:true},
                'xm.zysm':'required',
                'xm.jhrs':{required:true, 	number:true},
                'xm.xmnjxz':'required',
                'xm.xmzyxz':'required',
                'xm.yyyq':'required',
                'xm.xmgk':'required',
                'xm.xmzzjh':'required'
            }
        });

        var names  = ["美国","英国1","英国2","英国3","英国4","英国5","英国6","英国7","英国8"];



        $('#xmnjxz').inputSelect([2015,2016,2017,2018,2019]);

        $('#jlmbjgmc').inputSelect(names);


        /*$('.chosen-select').chosen({allow_single_deselect:true});*/
        // initStus();

        $("#btnSave,#btnDeploy").click(function(){
            alert('abcdef');
            if(!$("#form").valid()){
                validator.focusInvalid();
                return;
            }
            var id = $(this).attr(id);
            if("btnSave" == id){
                $("#status").val('01');
            }else{
                $("#status").val('02');
            }

            $.ajax('xm/save',{
                data:$("#form").serialize(),
                success:function(resp){
                    if(resp && resp.success){
                        parent.refreshTable();
                        winAlert("保存成功");
                        closeLayer();
                    }
                }
            })
        });


        $("button.btnStuAdd").click(selectStu)

    });

    function selectStu(){
        var index = parent.layer.open({
            type: 2,
            area: ['1000px', ($(parent).height()-10)+"px"],
            maxmin: true,
            content:'http://www.baidu.com',
            success:function(layero, index){

                var fraWinName = layero.find('iframe')[0]['name'];
                //设置打开窗口的回调函数,及调用此函数接受参数
                parent.frames[fraWinName].onload = function(){
                    alert('页面加载完成...');
                };
            },
        });






    }





</script>
</body>
</html>
