<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/29
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
import="servlet.experiment7.User" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>


<jsp:useBean id="user" class="servlet.experiment7.User" scope="request"/>
登陆的账号名字是：<jsp:getProperty name="user" property="name"/>
<%--<%--%>
<%--    request.setCharacterEncoding("UTF-8");--%>
<%--    User user = (User) request.getAttribute("user");--%>
<%--%>--%>
<%--<%=--%>
<%--user.getName()+user.getId()--%>

<%--%>--%>
</body>
</html>
