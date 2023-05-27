<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
function validateForm() {
  let x1 = document.forms["myForm"]["repass"].value;
  let pattern=/[A-Z]\w{7,}/;
  return pattern.test(x1);
}

</script>
<body>

<%

String un,pas,a;
un=request.getParameter("name");
pas=request.getParameter("pass");

Cookie cookies[]=request.getCookies();
for(Cookie c:cookies)
{
	if((c.getName().equals(un))&&(c.getValue().equals(pas)))
	{
		out.println("Welcome "+c.getName());
		a=c.getName();
	}
}
out.println("<form name=\"myForm\" action=\"valid1\" onsubmit=\"return validateForm()\" method=\"post\">");
out.println("<form name=\"myForm\" action=\"valid1\" onsubmit=\"return validateForm()\" method=\"post\">");
out.println("user name:<input type=\"text\" name=\"un\">");
out.println("old password:<input type=\"text\" name=\"pass1\">");
out.println("new password:<input type=\"text\" name=\"repass\">");
out.println("<input type=\"submit\">");
out.println("</form>");
%>

</body>
</html>