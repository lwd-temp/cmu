Date.prototype.getYmd = function(fmt){
    var date = this;
    var o = {
        "M+" : date.getMonth()+1,                 //月份
        "d+" : date.getDate(),                    //日
        "h+" : date.getHours(),                   //小时
        "m+" : date.getMinutes(),                 //分
        "s+" : date.getSeconds(),                 //秒
        "q+" : Math.floor((date.getMonth()+3)/3), //季度
        "S"  : date.getMilliseconds()             //毫秒
    };
    if(/(y+)/.test(fmt)) {
        fmt=fmt.replace(RegExp.$1, (date.getFullYear()+"").substr(4 - RegExp.$1.length));
    }
    for(var k in o){
        if(new RegExp("("+ k +")").test(fmt)) {
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
        }
    }
    return fmt;

}

//定义layer的 加载层...
layer.loading = function(){
    var index = layer.msg('正在处理(^.^)', {
        icon: 16
        ,shade: 0.61
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


layer.dconfirm = function(msg,okfun){
    var index = layer.confirm(msg,{
        icon:3,
        btn: ['删除','取消'], //按钮
    },function(){
        okfun();
    });
    return index;
}

var initIndex = layer.loading();

(function(){
    var ajaxIndex;
    $.ajaxSetup({
        type:'post',
        dataType:'json',
        beforeSend:function(){
            var ajaxIndex = layer.loading();
        },
        complete:function(XHR, TS){
            layer.close(ajaxIndex);
        }
    });
})()




$(function(){



    //定义加载表格的公共方法
    $.fn.extend({
        tables:function(options){

            var tab = this;
            var settings = {
                datatype: "json",
                //如果有url 从服务器端获取数据，数据返回的jsonkey可以在jsonReader中定义
                jsonReader : {
                    root:"data",//array或者List数据
                    page: "page",//当前页码
                    total: "pages",//总页数
                    records: "count",//总记录数
                    repeatitems: false
                },
                mtype:"post",
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