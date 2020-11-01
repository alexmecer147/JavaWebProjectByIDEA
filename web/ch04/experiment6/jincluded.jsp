<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/26
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspinclude1</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
%>
<jsp:include page="jspincluded2.jsp">
    <jsp:param name="totwo" value="来自included的内容"/>
</jsp:include>
</body>
</html>
