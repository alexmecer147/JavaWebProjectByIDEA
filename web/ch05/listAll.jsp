<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/19
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*,ch05.User" %>
<html>
<head>
    <title>listALL</title>
</head>
<body>
用户列表<br>
<table border="1">
    <tr>
        <td>用户</td><td>年龄</td>
    </tr>
    <%
      List<User> all = (List<User>)request.getAttribute("all");
      if (all.size() > 0){
          for (User u : all){
              %>
    <tr><td><%=u.getName()%></td><td><%=u.getAge()%></td></tr>
          <%}%>
      <%
      }else{
    %>
    <tr><td>没有任何记录</td></tr>
    <%}%>
</table>
</body>
</html>
