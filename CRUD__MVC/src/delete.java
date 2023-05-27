import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete1")
public class delete extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("enter");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
			PreparedStatement ps=con.prepareStatement("delete from login1 where id=?"); 
//			 ps.setString(1,req.getParameter("name"));
//		   	 ps.setString(2,req.getParameter("pass"));
		   	 ps.setString(1,req.getParameter("id"));
		   	 if(ps.executeUpdate()==1)
		   		 resp.getWriter().print("deleted succesfully");
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
