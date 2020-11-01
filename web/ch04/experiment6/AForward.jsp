<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/26
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AForward.jsp</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
%>
<jsp:forward page="AForwarded.jsp">
    <jsp:param name="name" value="来自AForward"/>
</jsp:forward>
</body>
</html>
