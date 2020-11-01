<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/26
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Include.jsp</title>
</head>
<body bgcolor="#f0ffff">
<span style="color: blue; ">
    The current date and time are
    <%@ include file="included1.jsp"%>
    <br>执行完了include后执行本行。
</span>

</body>
</html>
