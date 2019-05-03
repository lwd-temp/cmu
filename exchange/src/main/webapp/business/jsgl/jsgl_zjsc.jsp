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
<div class="main-container" id="main-container">
    <div class="main-content">
        <div class="main-content-inner">
            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <form class="form-horizontal" id="form" role="form">
                            <input type="hidden" name="tid" id="tid" value="${param['tid']}" />
                            <div class="form-group">

                                <label class="col-xs-4 control-label "  style="text-align:center" > 选择证件   : </label>

                                <label class="col-xs-5 control-label "   style="text-align:center"> 证件描述   : </label>

                                <label class="col-xs-3 control-label "   style="text-align:center"> 操作   : </label>
                            </div>

                            <div class="form-group uploadGroup">

                                <div class="col-xs-4">
                                    <input type="file"  multiple="multiple" class="fileUpload"  onchange="changeFile(this)" />
                                </div>


                                <div class="col-xs-5">
                                    <input type="text"  name="zjms"  value=""     placeholder="证件描述"    class="col-xs-12" />
                                </div>
                                <div class="col-xs-3"  style="text-align:center">
                                    <button class='btn btn-danger btn-mini uploadBtnDelete' type="button" title='删除' onclick='delUpload(this)' ><i class='ace-icon fa fa-trash-o '>删除</i></button>
                                    <button class='btn btn-info btn-mini' type="button" title='添加' onclick='addUpload()' ><i class='ace-icon fa fa-pencil '>添加</i></button>
                                </div>

                            </div>


                            <div class="col-md-offset-3 col-md-9 btns">

                                <button class="btn btn-info btn-sm" id="btnCommit"  type="button">
                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                    上传
                                </button>
                            </div>

                        </form>

                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div>
    </div><!-- /.main-content -->


</div><!-- /.main-container -->



<div style="display: none;" id="template">
    <div class="form-group uploadGroup">

        <div class="col-xs-4">
            <input type="file"  class="fileUpload" onchange="changeFile(this)"/>
        </div>


        <div class="col-xs-5">
            <input type="text"  name="zjms"  value=""     placeholder="证件描述"    class="col-xs-12" />
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

    var validator;
    function setFormValidate(){
        validator = $("#form").setValid({
            //校验规则
            rules: {
                zjms:{  required:true  },
            }
        });
    }


    $(function(){
        $('form .fileUpload').ace_file_input({
            no_file:'暂无文件 ...',
            btn_choose:'选择',
            btn_change:'替换',
            droppable:false,
            onchange:null,
            allowExt: ['png','jpg','jpeg','gif'],//允许的文件格式
            thumbnail:true, //| true | large
            //whitelist:'gif|png|jpg|jpeg'
            //blacklist:'exe|php'
            /* onchange:'changeFile'*/
            //
        }).on('file.error.ace', function(event, info) {//不匹配上面的文件格式就会跳出弹框提示
            parent.layer.alert("选择图片格式的文件上传！", {icon: 0, title: "提示"});
        });;

        $('.chosen-select').chosen({allow_single_deselect:true});



        setFormValidate();


        $("#btnCommit").click(function(){
            saveSq();
        });

    })




    /**
     * 上传成功后保存form
     */
     function saveSq(){
        if (!$("#form").valid()) {
            validator.focusInvalid();
            return;
        }


        var fileList = [];
        var formFile = new FormData();

        var validFile = true;
        $("form input[type=file]").each(function(index,input){
            var file = input.files[0];
            if(!file){
                parent.layer.alert("请选择上传文件.");
                validFile = false;
                return false;
            }
            formFile.append('file', file, file.name);

            var zjms = $("form input[name=zjms]:eq("+index+")");
            formFile.append('zjms', zjms.val());
        })

        if(!validFile){
            return;
        }

        formFile.append('tid', $("#tid").val());

        $.ajax({
            url: 'wjjs/uploadZj',
            type: 'POST',
            cache: false,
            data: formFile,
            processData: false,
            contentType: false,
            success:function(resp){
                if(resp && resp.success){
                    closeLayer();//关闭
                    winAlert("上传成功");//弹出确认消息
                }
            }
        });
    }



    function changeFile(fileInput){
        //alert($(fileInput).parent().prev().size())
        $(fileInput).parent().prev().val("");
        // alert("index:"+index)
    }

    function delUpload(btn){
        var size = $("form .uploadBtnDelete").size();
        if(size <=1){
            parent.layer.msg("至少保留一条");
            return;
        }

        $(btn).parent().parent().remove();

    }
    function addUpload(){
        //var el = $("form .uploadGroup").clone(true);
        var el = $("#template>div").clone();
        $(".btns").before(el);

        el.find('[type=file]').ace_file_input({
            no_file:'暂无文件 ...',
            btn_choose:'选择',
            btn_change:'替换',
            droppable:false,
            onchange:null,
            allowExt: ['png','jpg','jpeg','gif'],//允许的文件格式
            thumbnail:true, //| true | large
            //whitelist:'gif|png|jpg|jpeg'
            //blacklist:'exe|php'
            /* onchange:'changeFile'*/
            //
        }).on('file.error.ace', function(event, info) {//不匹配上面的文件格式就会跳出弹框提示
            parent.layer.alert("选择图片格式的文件上传！", {icon: 0, title: "提示"});
        });;

    }

</script>
</body>
</html>
