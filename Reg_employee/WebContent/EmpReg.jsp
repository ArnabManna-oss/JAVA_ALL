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

<%	try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
	PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)"); 
	 ps.setString(1,request.getParameter("Eid"));
   	 ps.setString(2,request.getParameter("Ename"));
   	 ps.setString(3,request.getParameter("email"));
	 ps.setString(4,request.getParameter("salary"));
   	 ps.setString(5,request.getParameter("pin"));
   	 if(ps.executeUpdate()==1)
   		 out.println("Inserted successfuly");
}
catch (SQLException e) {
	// TODO: handle exception
	e.printStackTrace();
}

%>

</body>
</html>