<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<!--include,jsp-->
<html>
<head>
<meta charset="utf-8">
<title>Insert title he</title>
</head>
<body bgcolor="#faebd7">
    <span style="color: blue; ">
        the current date and time are <%@include file="included.jsp"%>
        <br>执行完了include指令后执行本行。<br>
    </span>

    <%--以下分别声明了一个实例变量和一个方法--%>
    <%! int i=50230;%>
<%! int add(int a,int b){
   return a+b;
}%>
<%--使用表达式输出声明的实例变量--%>
i=<%=i%><br>
<%--使用脚本端声明的方法并用表达式输出结果--%>
<%
    int x=101,y=5,z;
    z=add(x,y);
%>

z=<%=z%>

<%--<jsp:forward page="jumped1.jsp">--%>
<%--    <jsp:param name="stringtojumped" value="jump1222"/>--%>
<%--</jsp:forward>--%>
</body>
</html>