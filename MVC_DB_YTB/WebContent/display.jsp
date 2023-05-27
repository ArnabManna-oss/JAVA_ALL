<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
try{
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
Statement ps=con.createStatement();
ResultSet re=ps.executeQuery("SELECT * from login1");

while (re.next()) {
	
	out.print(re.getString(1)+"______");
	
	out.print(re.getString(2)+"______");
	
	out.print(re.getString(3)+"______");
	
	out.println("<br>");}
}
catch (SQLException e) {
	// TODO: handle exception
	e.printStackTrace();
}



%>
	
	
</body>
</html>