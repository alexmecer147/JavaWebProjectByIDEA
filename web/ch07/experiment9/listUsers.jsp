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
<jsp:useBean id="user" class="servlet.experiment7.User" scope="session"/>
<%
List<User> users1 = (List<User>) request.getAttribute("users");
    Collection<User> users  = (Collection<User>) request.getAttribute("users");
%>
<c:forEach var="user" items="${users}">
    id=${user.id}---name=${user.name}---password=${user.password}<br>
</c:forEach>
</body>
</html>
