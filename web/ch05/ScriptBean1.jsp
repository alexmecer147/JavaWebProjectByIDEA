<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/8
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="ch05.User" %>
<html>
<head>
    <title>JavaBean</title>
</head>
<body>

<%
    User user = new User();
    user.setName("Lucy");
    user.setPassword("12345");
%>

用户名：<%=user.getName()%><br>
密码：<%=user.getPassword()%>

<jsp:useBean id="userBean" class="ch05.User" scope="page">

</jsp:useBean>

</body>
</html>
