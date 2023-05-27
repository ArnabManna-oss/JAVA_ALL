import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/insert1")
public class insert extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("enter");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
			PreparedStatement ps=con.prepareStatement("insert into login1 values(?,?,?)"); 
			 ps.setString(1,req.getParameter("id"));
		   	 ps.setString(2,req.getParameter("name"));
		   	 ps.setString(3,req.getParameter("pass"));
		   	 if(ps.executeUpdate()==1)
		   		 resp.getWriter().print("Inserted successfuly");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
