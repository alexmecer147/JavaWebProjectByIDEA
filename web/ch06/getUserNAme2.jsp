<%@ page import="ch05.User" %><%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/12
  Time: 8:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>getUserName2</title>
</head>
<body>
<%
    User[] users = new User[2];
    users[0] = new User();
    users[0].setName("555");
    //users[1].setName("000");
    pageContext.setAttribute("users",users);
%>
${users[0].name}<br>
${users[0]["name"]}<br>
<%=users[0].getName()%><br>

<%
    pageContext.setAttribute("userName","page", PageContext.PAGE_SCOPE);
    request.setAttribute("userName","request");
%>

</body>
</html>
