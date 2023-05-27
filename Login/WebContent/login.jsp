<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String un,pass;
un= request.getParameter("uname");
pass= request.getParameter("upwd");

if(un.equals("Admin") && pass.equals("1234"))
{
	out.print("Loged in Successfully");
}

%>
</body>
</html>