<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/19
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register_do2</title>
</head>
<body>
<jsp:useBean id="user" class="ch05.User" scope="page"/>
<jsp:setProperty name="user" property="name"/>
<jsp:setProperty name="user" property="age"/>
显示用户注册信息：<br>
你的用户名：<jsp:getProperty name="user" property="name"/><br>
你的年龄:<jsp:getProperty name="user" property="age"/><br>
</body>
</html>
