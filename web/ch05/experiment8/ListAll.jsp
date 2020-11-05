<%@ page import="java.util.List" %>
<%@ page import="servlet.experiment7.User" %><%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/11/5
  Time: 8:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListAll</title>
</head>
<body>
<table border="1">
    <tr>
        <td>姓名</td>
        <td>密码</td>
        <td>性别</td>
        <td>年龄</td>
    </tr>
<%
    List<User> allUser = (List<User>) request.getAttribute("users");
    if (allUser.size()>0){
        for (User u : allUser){%>
    <tr><td><%= u.getName()%></td><td><%=u.getPassword()%></td><td><%=u.getSex()%></td><td><%=u.getAge()%></td></tr>

      <%  }%>
   <% }else {%>
    <tr><td>没有任何记录。</td></tr>
    <%}%>
</table>
</body>
</html>
