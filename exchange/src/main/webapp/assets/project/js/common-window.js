
//弹出层，关闭自身
function closeLayer(){

    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.close(index);

}


/**
 * 在父Win中弹出alert
 * @param msg
 * @param setting
 */
function winAlert(msg,setting){
    parent.layer.alert(msg,setting);
}

var ajaxIndex ;

$.ajaxSetup({
    beforeSend:function(){
        ajaxIndex = parent.layer.loading();
    },
    complete:function(XHR, TS){
        parent.layer.close(ajaxIndex);
    }
});


$.fn.extend({

    setValid:function(options) {
        var form = this;
        var settings = {
            onkeyup:false,
            obblur:true,
            ignore: ":hidden:not(select)",
            errorPlacement: function(error, el) {
                var text = $(error).text();
                var eleId = $(el).attr("id");
                if($(el).hasClass("chosen-select")){

                    eleId = eleId+"_chosen";
                }
                //console.info($(el));
                layer.tips(text, "#"+eleId, {
                    tips: [3, '#78BA32'],
                    tipsMore: true,
                    time: 2700
                });
            },
        }
        $.extend(settings, options);
        $(form).validate(settings);
    }

})


$(function(){
    try{
        //日期控件
        $('.date-picker').datepicker({
            autoclose: true,
            todayHighlight: true
        });
    }catch(e){
        console.error(e.message);
    }


    try{
        //下拉选
        $('.chosen-select').chosen({allow_single_deselect:true});
    }catch(e){
        console.error(e.message);
    }






})


