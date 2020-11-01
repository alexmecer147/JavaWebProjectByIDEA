<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/22
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="ch06.User" %>
<html>
<head>
    <title>ReceiveServletExperiment5</title>
</head>
<body>
<%
    User rsjspUser = (User) request.getAttribute("requestUser");
%>
<%=
    rsjspUser.getName()
%>

</body>
</html>
