<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/19
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register_do3</title>
</head>
<body>
<jsp:useBean id="user" class="ch05.User" scope="page"/>
<jsp:setProperty name="user" property="name" param="username" />
<jsp:setProperty name="user" property="age" param="userage" />
显示用户注册信息<br>
你的用户名：<jsp:getProperty property="name" name="user"/><br>
你的年龄:<jsp:getProperty property="age" name="user" />
</body>
</html>
