//js随机
Math.rnd = function () {
    var rnd = this.random();
    rnd = rnd * 100000000000000000;
    return Math.ceil(rnd);

}


//弹出层，关闭自身
function closeLayer() {

    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.close(index);

}


/**
 * 在父Win中弹出alert
 * @param msg
 * @param setting
 */
function winAlert(msg, setting) {
    parent.layer.alert(msg, setting);
}

/**
 * 选择录入框匹配模式
 * @param strs
 * @returns {findMatches}
 */
function substringMatcher(strs) {
    return function findMatches(q, cb) {
        var matches, substringRegex;

        // an array that will be populated with substring matches
        matches = [];

        // regex used to determine if a string contains the substring `q`
        substrRegex = new RegExp(q, 'i');

        // iterate through the pool of strings and for any string that
        // contains the substring `q`, add it to the `matches` array
        $.each(strs, function(i, str) {
            if (substrRegex.test(str)) {
                // the typeahead jQuery plugin expects suggestions to a
                // JavaScript object, refer to typeahead docs for more info
                matches.push({ value: str });
            }
        });

        cb(matches);
    }
}



var ajaxIndex;

$.ajaxSetup({
    type: 'post',
    dataType: 'json',
    traditional: true,
    beforeSend: function () {
        ajaxIndex = parent.layer.loading();
    },
    complete: function (XHR, TS) {
        parent.layer.close(ajaxIndex);
    }
});


$.fn.extend({

    setValid: function (options) {
        var form = this;
        var settings = {
            onkeyup: false,
            obblur: true,
            ignore: "",
            focusInvalid:true,
            errorPlacement: function (error, el) {
                var text = $(error).text();
                console.info(el);
                var eleId = $(el).attr("id");
                if (!eleId || eleId == '') {
                    $(el).attr("id", 'inputId' + (new Date().getTime()));
                }

                if ($(el).hasClass("chosen-select")) {

                    eleId = eleId + "_chosen";
                }
                layer.tips(text, "#" + eleId, {
                    tips: [3, '#78BA32'],
                    tipsMore: true,
                    time: 2700
                });
            },
        }
        $.extend(settings, options);
        return $(form).validate(settings);
    },


    inputSelect:function(values){
        var that = this;

        if( typeof(values) =='object' && values instanceof Array ) {
            $(that).typeahead({
                hint: true,
                highlight: true,
                minLength: 1
            }, {
                name: 'states',
                displayKey: 'value',
                source: substringMatcher(values),
                limit: 10
            });
        }else if( typeof(values) == 'string'){
            var url = values;
            $.ajax(url,{
                success:function(resp){
                    if(resp && resp.success){
                        values = resp.data;
                        $(that).typeahead({
                            hint: true,
                            highlight: true,
                            minLength: 1
                        }, {
                            name: 'states',
                            displayKey: 'value',
                            source: substringMatcher(values),
                            limit: 10
                        });
                    }
                }
            })
        }

    }

})

function initFormInputId() {

    if ($.validator) {
        $.validator.prototype.elements = function () {
            var validator = this, rulesCache = {};
            return $([]).add(this.currentForm.elements).filter(":input").not(":submit, :reset, :image, [disabled]").not(this.settings.ignore).filter(function () {
                var elementIdentification = this.id || this.name;
                !elementIdentification && validator.settings.debug && window.console && console.error("%o has no id nor name assigned", this);
                if (elementIdentification in rulesCache || !validator.objectLength($(this).rules())) return false;
                rulesCache[elementIdentification] = true;
                return true;
            });
        };
    }


    $("form input,form select,form textarea").each(function (index, el) {
        var id = $(el).attr("id");
        if (!id || id == '') {
            $(el).attr("id", "formEl" + (Math.rnd()));
        }
    })


}

$(function () {

    initFormInputId();

    try {
        //日期控件
        $('.date-picker').datepicker({
            autoclose: true,
            todayHighlight: true
        });
    } catch (e) {
        console.error("缺少日期控件...");
    }


    try {
        //下拉选
        $('.chosen-select').chosen({
            allow_single_deselect: true,
            no_results_text: "未找到",
            placeholder_text : "请选择",
            search_contains: true,
        });
    } catch (e) {
        console.error("下拉选处理失败");
    }

    try {
        jQuery.validator.addMethod("isphoneNum", function (value, element) {
            var length = value.length;
            var mobile = /^1[3|5|7|8]{1}[0-9]{9}$/;
            return this.optional(element) || (length == 11 && mobile.test(value));
        }, "请正确填写您的手机号码");
    }catch (e) {
        console.error(e.message);
    }

})


