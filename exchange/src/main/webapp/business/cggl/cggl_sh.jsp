<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/13
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<div class="main-container" id="main-container">
    <div class="main-content">
        <div class="main-content-inner">
            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <form class="form-horizontal" role="form">
                            <!-- #section:elements.form -->
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 姓名: </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="姓名"     class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 性别: </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="男"      class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 出生日期 : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="1999-01-01"     class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 出生地: </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="北京"      class="col-xs-12" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 户籍所在地  : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="户籍所在地"      class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 身份证号: </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="101010190101015489"      class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 所属二级单位   : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="所属二级单位"      class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 科室: </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="科室"      class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 职务   : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="职务"      class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 职称: </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="职称"      class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 年内出访次数   : </label>
                                <div class="col-xs-10">
                                    <input type="text"  name="username"  value="1" readonly="readonly"  placeholder="年内出访次数"     class="col-xs-12" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 申请人其他社会任职   : </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" readonly="readonly" id="form-field-13" maxlength="300">其他任职</textarea>
                                </div>


                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 联系电话   : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="13888888888"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 邮箱: </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value="aaa@cmu.edu.cn"    class="col-xs-12" />

                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 出访国家（地区）   : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""    placeholder="13801662589"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 入境城市（地区）: </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""    placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 出访团组   : </label>
                                <div class="col-xs-4">
                                    <select class="chosen-select form-control"  disabled="disabled"  data-placeholder="请选择出访团组">
                                        <option value="">  </option>
                                        <option value="A">2019010001-xxxx团组1</option>
                                        <option value="A">2019010002-xxxx团组2</option>
                                        <option value="A">2019010003-xxxx团组3</option>
                                        <option value="A">2019010004-xxxx团组4</option>
                                        <option value="A">2019010005-xxxx团组5</option>
                                        <option value="A">2019010006-xxxx团组6</option>

                                    </select>
                                </div>

                                <label class="col-xs-2 control-label "  > 出访开始日期 </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" readonly="readonly" id="id-date-picker-2"value="2018-11-15"   type="text" data-date-format="yyyy-mm-dd" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 出访结束日期   : </label>
                                <div class="col-xs-4">
                                    <input class="form-control date-picker" readonly="readonly" id="id-date-picker-3"value="2018-11-15"   type="text" data-date-format="yyyy-mm-dd" />
                                </div>

                                <label class="col-xs-2 control-label "  > 出访目的: </label>
                                <div class="col-xs-4">
                                    <select class="chosen-select form-control"  disabled="disabled"  data-placeholder="请选择出访目的" onchange="if($(this).val() == '99'){$('#cfmd_qt').show()}else{$('#cfmd_qt').hide()}">
                                        <option value="">  访问考察</option>
                                        <option value="">  学术会议</option>
                                        <option value="">  进修培训</option>
                                        <option value="">  合作研究</option>
                                        <option value="">  学术交流</option>
                                        <option value="">  短期讲学</option>
                                        <option value="99">  其他</option>

                                    </select>
                                </div>
                            </div>
                            <div class="form-group" id="cfmd_qt"  style="display: none;">

                                <label class="col-xs-2 control-label "  > 出访目的—其他: </label>
                                <div class="col-xs-10">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-10" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 邀请人姓名   : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 邀请人职务: </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                            </div><div class="form-group">
                                <label class="col-xs-2 control-label "  > 邀请人姓名(英文)   : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 邀请人职务(英文): </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 邀请人单位   : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 邀请人详细地址: </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 邀请人单位(英文)   : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 邀请人详细地址(英文): </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 邀请人电话  : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>

                                <label class="col-xs-2 control-label "  > 邀请人电话(英文): </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 经费预算明细  : </label>
                                <div class="col-xs-10">
                                    <textarea class="form-control limited" readonly="readonly" id="form-field-10" maxlength="300"></textarea>
                                </div>

                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 预算合计  : </label>
                                <div class="col-xs-4">
                                    <input type="text" readonly="readonly"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                                <label class="col-xs-2 control-label "  > 申请类别  : </label>
                                <div class="col-xs-4">
                                    <select class="chosen-select form-control"  disabled  data-placeholder="请选择申请类别"  >
                                        <option value="">  访问考察</option>
                                        <option value="">  校管干部因私短期出国</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 年内出访次数  : </label>
                                <div class="col-xs-4">
                                    <input type="text"  name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>
                                <label class="col-xs-2 control-label "  > 申请人其他社会任职  : </label>
                                <div class="col-xs-4">
                                    <textarea class="form-control limited" id="form-field-10" maxlength="300"></textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-2 control-label "  > 审核结果  : </label>
                                <div class="col-xs-4">
                                    <select class="chosen-select form-control"     data-placeholder="请选择审核结果"  >
                                        <option value="">  资料需修改</option>
                                        <option value="">  资料合格</option>
                                        <option value="">  办结</option>
                                    </select>
                                </div>

                                <label class="col-xs-2 control-label "  > 审核意见  : </label>
                                <div class="col-xs-4">
                                    <input type="text"   name="username"  value=""     placeholder="demo@cmu.edu.cn"    class="col-xs-12" />
                                </div>

                            </div>
                            <div class="col-md-offset-3 col-md-9">

                                <button class="btn btn-info btn-sm" type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                    通过
                                </button>

                                &nbsp; &nbsp; &nbsp;


                                <button class="btn btn-danger btn-sm" id="submit"  type="button">
                                    <i class="ace-icon fa fa-close bigger-110"></i>
                                    退回
                                </button>

                            </div>

                        </form>

                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div>
    </div><!-- /.main-content -->


</div><!-- /.main-container -->



<script src="../assets/js/jquery.knob.js"></script>
<script src="../assets/js/autosize.js"></script>
<script src="../assets/js/jquery.inputlimiter.1.3.1.js"></script>
<script src="../assets/js/jquery.maskedinput.js"></script>


<!-- ace scripts -->


<script src='assets/js/jquery.js'></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/jquery.knob.js"></script>
<script src="assets/js/autosize.js"></script>
<script src="assets/js/jquery.inputlimiter.1.3.1.js"></script>
<script src="assets/js/jquery.maskedinput.js"></script>
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>




<script src="assets/js/chosen.jquery.js"></script>
<script src="assets/js/typeahead.jquery.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>
<script src="assets/js/ace/elements.fileinput.js"></script>

<script src="assets/js/layer/layer.js"></script>
<script src="assets/js/ace/ace.js"></script>

<!-- ace scripts -->

<script>
    $(function(){

        //日期选择器
        $('.date-picker').datepicker({
            autoclose: true,
            todayHighlight: true
        });


        $('[type=file]').ace_file_input({
            no_file:'暂无文件 ...',
            btn_choose:'选择',
            btn_change:'替换',
            droppable:false,
            onchange:null,
            thumbnail:true //| true | large
            //whitelist:'gif|png|jpg|jpeg'
            //blacklist:'exe|php'
            //onchange:''
            //
        });

        $('.chosen-select').chosen({allow_single_deselect:true});

        $("#submit").click(function(){


        })





    })


</script>
</body>
</html>
