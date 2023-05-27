<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.mysql.cj.xdevapi.PreparableStatement"%>
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
String pno,opn,query;
pno=request.getParameter("pno");
opn=request.getParameter("sel");

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	if(opn.equals("Delete"))
	{
		query=opn+" from product where prod_no=\""+pno+"\"";

		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
		PreparedStatement ps=con1.prepareStatement(query);
		if(ps.executeUpdate()==1)
		out.print("Deleted");
	}
	else{
		
		query=opn+" * from product where prod_no=\""+pno+"\"";
		
		//out.print(query);
		Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
		Statement s=con2.createStatement();
		ResultSet rs=s.executeQuery(query);
		out.print("<h2>details</h2>");
		while(rs.next()){
			out.print(rs.getString(1)+"__");
			out.print(rs.getString(2)+"__");
			out.print(rs.getString(3)+"__");
			out.print(rs.getString(4)+"__");
		}
	}
}
catch(Exception e){
	e.printStackTrace();
}
%>
</body>
</html>