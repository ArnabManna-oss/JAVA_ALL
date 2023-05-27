<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("name :"+request.getAttribute("name"));
out.println("id:"+request.getAttribute("id"));
out.println("Salary"+request.getAttribute("salary"));
%>
</body>
</html>