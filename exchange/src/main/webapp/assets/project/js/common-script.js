/****
 * 自定义 js
 */

/**
 * 扩展日期类，添加格式化方法
 * @param fmt
 * @returns {*}
 */
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

    var area = options.area;
    var width = $(window).width()-40;
    var height = $(window).height()-60;
    if(area){
        if(area[0]){
            if(width >area[0].substring(0,area[0].length-2)){//如果屏幕比设置的宽，按照设置的来
                width = area[0];
            }else{
                width=width+'px';
            }

        }
        if(area[1]){
            if(height >area[1].substring(0,area[1].length-2)){//如果屏幕比设置的高，按照设置的来
                height = area[1];
            }else{
                height=height+'px';
            }
        }
    }
    //从options 中删除 area 否则 会覆盖settings中的area
    var settings ={
        type: 2,
        anim: 1,
        area: [width, height],
        //fixed: false, //不固定
        maxmin: true,
    }
    delete options.area;
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
        traditional: true,
        beforeSend:function(){
             ajaxIndex = layer.loading();
        },
        complete:function(XHR, TS){
            layer.close(ajaxIndex);
        },error:function(err,xhr){
            layer.close(ajaxIndex);
            layer.alert("处理失败..");
        }
    });
})()


function initMenu() {
    var topMenuTempBase = $(' <li class="">\n' +
        '                        <a href="#" class="dropdown-toggle">\n' +
        '                            <i class="menu-icon fa "></i>\n' +
        '                            <span class="menu-text"> 主菜单</span>\n' +
        '                            <b class="arrow fa fa-angle-down"></b>\n' +
        '                        </a>\n' +
        '                    </li>');
    var secondMenuTempBase = $('<li class="" tg="business/wblfgl/wbgl_list.jsp">\n' +
        '                        <a href="javascript:void(0)" >\n' +
        '                            <i class="menu-icon fa fa-caret-right second-text"></i>' +
        '                        </a>' +
        '                     </li>');

    $.ajax('sys/menu/umenu_list',{
        success:function(menus){
            var menuLis = "";
            //循环添加一级菜单
            $.each(menus,function(index,topMenu){
                if(topMenu.parentId == "0"){
                    var topMenuTemp = topMenuTempBase.clone();
                    topMenuTemp.find('.menu-text').text(topMenu.menuName);//设置菜单名称
                    var iconClass = "fa-bar-chart";
                    if(topMenu.menuIcon && topMenu.menuIcon.trim() !=''){
                        iconClass = topMenu.menuIcon;
                    }
                    topMenuTemp.find(".menu-icon").addClass(iconClass);

                    //循环向一级菜单中添加二级菜单
                    $.each(menus,function(index,secondMenu){
                        if(secondMenu.parentId == topMenu.menuId){

                            var secondMenuTemp = secondMenuTempBase.clone();
                            secondMenuTemp.find('.second-text').after(secondMenu.menuName);
                            secondMenuTemp.attr("tg",secondMenu.url);
                            topMenuTemp.append(secondMenuTemp);
                        }
                    });

                    //如果一级菜单有内容，使用ul包裹
                    if(topMenuTemp.children().size() >0){
                        topMenuTemp.find("li").wrapAll('<ul class="submenu cc"></ul>')
                    }
                    //向主菜单中添加一级菜单元素（一级元素一级包裹二级菜单了.）
                    $("ul.menus").append(topMenuTemp);

                }

            });

            //给菜单添加点击事件.
            $('li [tg]').click(function(){
                getUrl(this);
            });

        }
    })

}

$(function(){

    //初始化菜单
    initMenu();

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
                prmNames:{
                    sort: "orderCol", // 表示用于排序的列名的参数名称  05.
                    order: "orderType", // 表示采用的排序方式的参数名称
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
                loadComplete : function(res) {

                    if(options.loaded){
                        options.loaded(res);
                    }

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


});


/***
 * 加载代码缓存
 */
(function(){
    var dmcache = {};

    dmcache.getCode = function(table,paramCode){
        if(!paramCode || paramCode =='null'){
            return '';
        }
        var data = this.data;
        var name = '';
        if(data){
            table = table.toUpperCase();
            var codes = data[table];
            if($.isArray(codes) ){
                $(codes).each(function(){
                    var json = this;
                    if(json[paramCode] && json[paramCode].length>0){
                        name = json[paramCode]
                        return false;
                    }
                });
                if(name.length>0){
                    return name;
                }
            }
        }

        return paramCode;
    }

    window.dmcache = dmcache;

    $.ajax('ui/dm_cache',{
        success:function(data){
            //console.info(data);
            dmcache.data = data;
        }
    });



    //给菜单添加点击事件

})()

//菜单点击 时调用
function getUrl(li){

    var url = $(li).attr('tg');
    //移除其他active
    $(li).siblings('.active').removeClass("active");
    $(li).addClass("active");

    var text = $(li).text();
    //alert("text :"+text);
    $("#breadcrumb").text(text.trim());

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