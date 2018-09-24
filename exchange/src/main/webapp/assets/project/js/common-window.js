
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
        var ajaxIndex = parent.layer.loading();
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
            errorPlacement: function(error, element) {
                var text = $(error).text();
                var eleId = $(element).attr("id");
                //alert(eleId);
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




