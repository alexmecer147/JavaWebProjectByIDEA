<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/12
  Time: 8:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="user" class="ch06.User" scope="request"/>
<jsp:setProperty name="user" property="name" value="Alice11"/>
jsp:getProperty获取用户名:<jsp:getProperty name="user" property="name"/>
EL获取的用户名:${user.name}<br>
EL获取的用户名:${user["name"]}<br>
EL后却的用户名:<%=user.getName()%><br>

</body>
</html>
