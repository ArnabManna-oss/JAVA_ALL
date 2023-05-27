import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/display1")
public class display extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
				Statement ps=con.createStatement();
				ResultSet re=ps.executeQuery("SELECT * from login1");

				while (re.next()) {
					out.print("<p>");
					out.print(re.getString(1)+"______");
					
					out.print(re.getString(2)+"______");
					
					out.print(re.getString(3)+"______");
					
					out.print("</p>");
					}
				}
				catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	
		
	}
}
