import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/filter")
public class filter extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String query="";
		String ch=req.getParameter("DES");
		System.out.println(ch);
		PrintWriter out=res.getWriter();
		if (ch.equals("ALL")) {
			query="SELECT * FROM emp";
		}
		else
		query="SELECT * FROM emp where Designation=\""+ch+"\"";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
			Statement s=con.createStatement();
			ResultSet re=s.executeQuery(query);
			out.print("<table><tr><th>EmpID</th><th>EmpName</th><th>Designation</th><th>Date of Joining</th><th>Salary</th></tr>");
			while (re.next()) {
				out.print("<tr>");
				out.print("<td>"+re.getString(1)+"</td>");
				out.print("<td>"+re.getString(2)+"</td>");
				out.print("<td>"+re.getString(3)+"</td>");
				out.print("<td>"+re.getString(4)+"</td>");
				out.print("<td>"+re.getString(5)+"</td>");
				out.print("</tr>");
			}
			out.print("</table>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
