<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
    
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jps page</title>
</head>
<body>
	<%!
		int count=0;
		void print()
		{
			Scanner sc= new Scanner(System.in);
		}
	%>
jsp started<br>
<% //int x=15,y=5;
	//out.println("result is ="+(int)(x+y));
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	out.println("username \n:"+uname.toUpperCase());
	out.println("password :"+pass);
	
	int k=10/0;
%>

count is <%= count %>
</body>
</html>