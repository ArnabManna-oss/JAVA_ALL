<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
	Statement s=con.createStatement();
	ResultSet rs=s.executeQuery("select prod_no from product");
	out.print("<form action=\"see.jsp\" method=\"post\">");
	out.print("select the product number");
	out.print("<select name=\"pno\">");
	while(rs.next()){
		int s1=rs.getInt(1);
		out.print("<option value=\""+s1+"\">"+s1+"</option>");
	}
	out.print("</select>");
	out.print("<select name=\"sel\">");
	out.print("<option value=\"Delete\">delete</option>");
	out.print("<option value=\"Select\">view</option>");
	out.print("</select>");
	out.print("<input type=\"submit\">");
	out.print("</form>");
}
catch(Exception e){
	e.printStackTrace();
}
%>
</body>
</html>