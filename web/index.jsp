<%--
  Created by IntelliJ IDEA.
  User: acfun
  Date: 2021/1/29
  Time: 12:39 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  pageContext.setAttribute("cc",request.getContextPath());
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${cc}/user" method="post">
    请输入：<input type="text" value=""><br>
    <input type="submit" value="保存">
  </form>
  <form action="${cc}/user" method="get">
    请输入：<input type="text" value=""><br>
    <input type="submit" value="查询">
  </form>
  <form action="${cc}/user" method="post">
    <input type="hidden" name="_method" value="put">
    请输入：<input type="text" value=""><br>
    <input type="submit" value="更新">
  </form>
  <form action="${cc}/user" method="post">
    <input type="hidden" name="_method" value="delete">
    请输入：<input type="text" value=""><br>
    <input type="submit" value="删除">
  </form>
  </body>
</html>
