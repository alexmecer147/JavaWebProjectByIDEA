<%@ page import="servlet.experiment7.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/11/28
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FINDUSERS</title>
</head>
<body>
<br>
<h2>查到的结果</h2>
<c:forEach var="user" items="${lists}">
    id=<c:out value="${user.id}"/>---name=<c:out value="${user.name}"/>---password=${user.password}<br>
</c:forEach>
</body>
</html>
