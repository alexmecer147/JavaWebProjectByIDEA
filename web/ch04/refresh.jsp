<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/5
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>刷新界面</title>
</head>
<body>
<%! int i = 0;%>
<%
    response.setHeader("refresh","1");
    //response.setHeader("refresh","2,URL=outJSP.jsp");
%>
<h1><%=i++%></h1>
  </body>
</html>
