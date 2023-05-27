<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	/* String s=request.getAttribute("name").toString();
	out.println("<b>its</b>:"+s);*/
%>

 <br>
 hello Mr. ${name}<!-- Expression tag -->
 <br>
 <c:out value="hey ${name}"/>
 <c:import url="https://www.gmail.com/"></c:import>
 <c:import url="hello.jsp"></c:import>
 
</body>
</html>