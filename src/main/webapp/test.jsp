<%@ page import="com.firetoro.todaynews.service.VideoService" %>
<%@ page import="com.firetoro.todaynews.util.ApplicationContextUtil" %>
<%@ page import="com.firetoro.todaynews.service.NewService" %>
<%@ page import="com.firetoro.todaynews.model.Interest" %><%--
  Created by IntelliJ IDEA.
  User: zhihu
  Date: 2017/9/4
  Time: 下午1:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
    VideoService ad = ApplicationContextUtil.getBean(VideoService.class);
    System.out.println("3=======================hbody="+ad.test());
    NewService in = ApplicationContextUtil.getBean(NewService.class);
    Interest cc = in.get(1);
    %>
    <p>intest</p>
    <p><%=cc%></p>
</body>

</html>
