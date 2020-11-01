<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/26
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AForwarded</title>
</head>
<body>
<%

    String name = request.getParameter("name");
    name = "我是"+name;
    out.print(name);
%>
</body>
</html>
