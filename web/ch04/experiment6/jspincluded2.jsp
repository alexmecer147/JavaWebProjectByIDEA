<%--
  Created by IntelliJ IDEA.
  User: Kanfeer
  Date: 2020/10/26
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String text = request.getParameter("totwo");
    text = "这是jsp:included2 和 "+text;
%>
<%=text%>

