<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/13
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta name="description" content="imooc browser download">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>推荐浏览器</title>
    <style>
        *{margin: 0;padding: 0;}
        html,body{height: 100%;font-family: "Helvetica Neue", "Hiragino Sans GB", "Segoe UI", "Microsoft Yahei", "微软雅黑", Tahoma, Arial, STHeiti, sans-serif;}
        .container{min-height: 100%;}
        .header{
            background-color: #656e73;
            font-size: 18px;
            text-align: center;
            color: #fff;
            padding: 30px 0;
        }
        .header i{
            display: inline-block;
            width: 41px;
            height: 61px;
            margin-bottom: 10px;
            background: url(images/cpt.png) no-repeat;
        }
        .bs{width: 1000px;padding: 60px 0;text-align: center; margin: 0 auto;}
        .bs-block{display: inline-block;width: 150px;margin: 0 40px;}
        .bs-block .bsi-icon{display: inline-block;height: 80px;width: 80px;}
        .bs-block a{display: inline-block;width: 98px;height: 38px;line-height:38px;border: 1px solid #39b94e;color: #39b94e;border-radius: 50px;text-decoration: none;font-size: 12px;}
        .bs-block a:hover{background-color: #39b94e;color: #fff;}
        .bsi-chrome .bsi-icon{background: url(images/cpt-chrome.png) no-repeat;}
        .bsi-firefox .bsi-icon{background: url(images/cpt-firefox.png) no-repeat;}
        .bsi-360 .bsi-icon{background: url(images/cpt-360.jpg) no-repeat;}
        .bsi-name{
            font-size: 18px;
            display: inline-block;
            margin: 10px 0 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="header">
        <i></i>
        <p>为保证最佳使用体验，建议您使用以下浏览器的最新版本</p>
    </div>
    <div class="bs">

                <span class="bs-block bsi-firefox">
                    <i class="bsi-icon"></i>
                    <span class="bsi-name">Firefox(推荐)</span>
                    <a href="https://www.mozilla.org/zh-CN/firefox/new/" target="_blank">官方下载</a>
                </span>


                <span class="bs-block bsi-chrome">
                    <i class="bsi-icon"></i>
                    <span class="bsi-name">Chrome(推荐)</span>
                    <a href="http://www.google.cn/chrome/" target="_blank">官方下载</a>
                </span>


                <span class="bs-block bsi-360">
                    <i class="bsi-icon"></i>
                    <span class="bsi-name">--3 6 0--</span>
                    <a href="https://browser.360.cn/se/" target="_blank">官方下载</a>
                </span>



    </div>
</div>
</body>
</html>