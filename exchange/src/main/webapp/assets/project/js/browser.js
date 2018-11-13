
(function(){
    var agent = navigator.userAgent;
    var opera = opera = window.opera;

    window.nbrowser =  {
        trident: agent.indexOf('Trident') > -1, //IE内核
        presto: agent.indexOf('Presto') > -1, //opera内核
        webKit: agent.indexOf('AppleWebKit') > -1, //苹果、谷歌内核
        gecko: agent.indexOf('Firefox') > -1, //火狐内核Gecko
        mobile: !!agent.match(/AppleWebKit.*Mobile.*/), //是否为移动终端
        ios: !!agent.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/), //ios
        android: agent.indexOf('Android') > -1 || agent.indexOf('Linux') > -1, //android
        iPhone: agent.indexOf('iPhone') > -1 , //iPhone
        iPad: agent.indexOf('iPad') > -1, //iPad
        webApp: agent.indexOf('Safari') > -1, //Safari
        opera: (!!opera && opera.version),
        mac: agent.indexOf('macintosh') > -1,

    };


    window.nbrowser.version = (function(browser,uagent){
        // Gecko.
        if (browser.gecko) {
            var geckoRelease = uagent.match(/rv:([\d\.]+)/);
            if (geckoRelease) {
                geckoRelease = geckoRelease[1].split('.');
                version = geckoRelease[0] * 10000 + (geckoRelease[1] || 0) * 100 + (geckoRelease[2] || 0) * 1;
            }
        }

        //检测当前浏览器是否为Chrome, 如果是，则返回Chrome的大版本号
        if (/chrome\/(\d+\.\d)/i.test(agent)) {
            browser.chrome = +RegExp['\x241'];
        }

        //检测当前浏览器是否为Safari, 如果是，则返回Safari的大版本号
        if (/(\d+\.\d)?(?:\.\d)?\s+safari\/?(\d+\.\d+)?/i.test(agent) && !/chrome/i.test(agent)) {
            browser.safari = +(RegExp['\x241'] || RegExp['\x242']);
        }

        // Opera 9.50+
        if (browser.opera)
            version = parseFloat(opera.version());

        // WebKit 522+ (Safari 3+)
        if (browser.webkit)
            version = parseFloat(uagent.match(/ applewebkit\/(\d+)/)[1]);

        //检测当前浏览器版本号

        return version;

    })(window.nbrowser,agent)
})()