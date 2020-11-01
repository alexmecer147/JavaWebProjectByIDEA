<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/19
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>register_do</title>
</head>
<body>
<jsp:useBean id="user" class="ch05.User" scope="page"/>
<jsp:setProperty name="user" property="*"/>
显示用户注册信息:<br>
你的用户名:<jsp:getProperty name="neme" property="user"/><br>
你的年龄:<jsp:getProperty name="age" property="user"/>
</body>
</html>
