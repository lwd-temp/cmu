//定义layer的 加载层...
layer.loading = function(){
    var index = layer.load(1, {
        shade: [0.5,'#000'] //0.1透明度的白色背景
    });
    return index;
}

//定义layer的弹出层
layer.newpage = function(options) {
    var settings ={
        type: 2,
        anim: 1,
        area: ['700px', '450px'],
        //fixed: false, //不固定
        maxmin: true,
    }
    $.extend(settings, options);
    var index = layer.open(settings);

    return index;
}

var initIndex = layer.loading();

$(function(){



    //定义加载表格的公共方法
    $.fn.extend({
        tables:function(options){

            var tab = this;
            var settings = {
                datatype: "local",
                shrinkToFit:true,
                /*width:"100%",*/
                autowidth:true,
                height:"100%",
                viewrecords : true,
                rowNum:10,
                rowList:[10,20,30,50,100],
                altRows: true,
                multiselect: true,
                multiboxonly: true,
                gridComplete:function(){
                    //隐藏grid底部滚动条
                    tab.closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" });
                },
                loadComplete : function() {
                    var table = this;
                    //更新 反野的 图标
                    var replacement =
                        {
                            'ui-icon-seek-first' : 'ace-icon fa fa-angle-double-left bigger-140',
                            'ui-icon-seek-prev' : 'ace-icon fa fa-angle-left bigger-140',
                            'ui-icon-seek-next' : 'ace-icon fa fa-angle-right bigger-140',
                            'ui-icon-seek-end' : 'ace-icon fa fa-angle-double-right bigger-140'
                        };
                    $('.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon').each(function(){
                        var icon = $(this);
                        var $class = $.trim(icon.attr('class').replace('ui-icon', ''));

                        if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
                    })

                    $('.navtable .ui-pg-button').tooltip({container:'body'});
                    $(table).find('.ui-pg-div').tooltip({container:'body'});
                }

            }

            $.extend(settings, options);
            tab.jqGrid(settings);//渲染表格....

            //设置表格的导航
            var navBtns = null;
            if( settings.navBtns && (settings.navBtns instanceof  Array) && settings.navBtns.length>0 ){
                for(var i in   settings.navBtns){
                    if(navBtns == null){
                        navBtns = tab.navGrid(settings.pager,{edit:false,add:false,del:false,search:false,refresh:false}).
                        navButtonAdd(settings.pager,settings.navBtns[i]);
                    }else{
                        navBtns.navButtonAdd(settings.pager,settings.navBtns[i]);
                    }
                }
            }

            $(window).triggerHandler('resize.jqGrid');//trigger window resize to make the grid get the correct size

        }
    });


    setTimeout(function(){
        layer.close(initIndex);
    },500);

});


//菜单点击 时调用
function getUrl(ahref ,url){
    if(!url  || url == '' || url=='unknow'){
        layer.msg("原型开发中，请稍等....")
        return;
    }
    var text = $(ahref).text();
    $("#breadcrumb").text(text);
    var index = layer.loading();

    $.ajax(url,{
        type:'post',
        dataType:'html',
        success:function(html){
            $("#frameSetContent").html(html);
            layer.close(index);
        }

    })
}