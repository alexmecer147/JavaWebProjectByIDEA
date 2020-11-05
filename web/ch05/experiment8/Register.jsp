<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/11/5
  Time: 8:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>注册用户</h1>
<form method="post" action="/RegisterServlet">
    <label>
        姓名：<input type="text" name="name"/><br>
    </label>
    <label>
        密码:：<input type="password" name="password"/><br>
    </label>
    <label>
        年龄：<input type="text" name="age"/><br>
    </label>
    <input type="submit" value="提交"/><input type="reset" value="重置"/>
</form>
</body>
</html>
