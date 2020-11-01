<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/29
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆账号</title>
</head>
<body>
<form method="post" action="/LoginServlet">
    用户名:<label><input type="text" name="name"/></label><br>
    密码:<label><input type="password" name="password"/></label><br>
    <input type="submit" value="登陆"/>
</form>
</body>
</html>
