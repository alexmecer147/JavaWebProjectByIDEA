<%@ page import="java.util.List" %>
<%@ page import="servlet.experiment7.User" %>
<%@ page import="java.util.Collection" %><%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/11/12
  Time: 8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>LISTALLUSERS</title>
</head>
<body>
<c:forEach var="user" items="${users}">
    id=<c:out value="${user.id}"/>---name=<c:out value="${user.name}"/>---password=<c:out value="${user.password}"/><br>
</c:forEach>
<form action="ListUserServlet" method="post">
    你要查找的姓名:<input type="text" name="name"><br>
    <input type="submit" value="查找">
</form>
</body>
</html>
