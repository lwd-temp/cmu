<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/24
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib uri="http://cn.edu.cmu/uitag" prefix="dm" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

T_DM_CFMD : <dm:list tabName="T_DM_CFMD" id="T_DM_CFMD" name="T_DM_CFMD" value="01"></dm:list><br/>
T_DM_CFMD radio <dm:list tabName="T_DM_CFMD" type="radio" id="T_DM_CFMD" name="T_DM_CFMD" value="01" ></dm:list>
<hr>

T_DM_CGSPJG : <dm:list tabName="T_DM_CGSPJG" id="T_DM_CGSPJG" name="T_DM_CGSPJG" value="01"></dm:list><br/>
T_DM_CGSPJG radio <dm:list tabName="T_DM_CGSPJG" type="radio" id="T_DM_CGSPJG" name="T_DM_CGSPJG" value="01" ></dm:list>
<hr>

T_DM_HZZT : <dm:list tabName="T_DM_HZZT" id="T_DM_HZZT" name="T_DM_HZZT" value="01"></dm:list><br/>
T_DM_HZZT radio <dm:list tabName="T_DM_HZZT" type="radio" id="T_DM_HZZT" name="T_DM_HZZT" value="01" ></dm:list>
<hr>


T_DM_LFMD : <dm:list tabName="T_DM_LFMD" id="T_DM_LFMD" name="T_DM_LFMD" value="01"></dm:list><br/>
T_DM_LFMD radio <dm:list tabName="T_DM_LFMD" type="radio" id="T_DM_LFMD" name="T_DM_LFMD" value="01" ></dm:list>
<hr>


T_DM_TZJB : <dm:list tabName="T_DM_TZJB" id="T_DM_TZJB" name="T_DM_TZJB" value="01"></dm:list><br/>
T_DM_TZJB radio <dm:list tabName="T_DM_TZJB" type="radio" id="T_DM_TZJB" name="T_DM_TZJB" value="01" ></dm:list>
<hr>

T_DM_WBLF_JDLX : <dm:list tabName="T_DM_WBLF_JDLX" id="T_DM_WBLF_JDLX" name="T_DM_WBLF_JDLX" value="01"></dm:list><br/>
T_DM_WBLF_JDLX radio <dm:list tabName="T_DM_WBLF_JDLX" type="radio" id="T_DM_WBLF_JDLX" name="T_DM_WBLF_JDLX" value="01" ></dm:list>
<hr>


T_DM_XMCC : <dm:list tabName="T_DM_XMCC" id="T_DM_XMCC" name="T_DM_XMCC" value="01"></dm:list><br/>
T_DM_XMCC radio <dm:list tabName="T_DM_XMCC" type="radio" id="T_DM_XMCC" name="T_DM_XMCC" value="01" ></dm:list>
<hr>

T_DM_XMLX : <dm:list tabName="T_DM_XMLX" id="T_DM_XMLX" name="T_DM_XMLX" value="01"></dm:list><br/>
T_DM_XMLX radio <dm:list tabName="T_DM_XMLX" type="radio" id="T_DM_XMLX" name="T_DM_XMLX" value="01" ></dm:list>
<hr>


T_DM_ZZSK : <dm:list tabName="T_DM_ZZSK" id="T_DM_ZZSK" name="T_DM_ZZSK" value="01"></dm:list><br/>
T_DM_ZZSK radio <dm:list tabName="T_DM_ZZSK" type="radio" id="T_DM_ZZSK" name="T_DM_ZZSK" value="01" ></dm:list>
<hr>


T_DM_XB : <dm:list tabName="T_DM_XB" id="T_DM_XB" name="T_DM_XB" value="01"></dm:list><br/>
T_DM_XB radio  <dm:list tabName="T_DM_XB" type="radio" id="gender" name="gender"  value="${'01'}" ></dm:list>
<hr>



<%
    List list = new java.util.ArrayList();
    list.add("01");
    list.add("02");
    list.add("03");
    request.setAttribute("gbList",list);
%>

T_DM_GB : <dm:list tabName="T_DM_GB" id="T_DM_GB" multiple="multiple"  length="10" valueList="${gbList}" name="T_DM_GB"  ></dm:list><br/>
T_DM_GB radio  <dm:list tabName="T_DM_GB" type="radio" id="gb" name="gb"  value="${'01'}" ></dm:list>
<hr>


T_DM_CFRW : <dm:list tabName="T_DM_CFRW" id="T_DM_CFRW" name="T_DM_CFRW" value="01"></dm:list><br/>
T_DM_CFRW radio  <dm:list tabName="T_DM_CFRW" type="radio" id="T_DM_CFRW" name="T_DM_CFRW"  value="01" ></dm:list>

<hr>

</body>
</html>
