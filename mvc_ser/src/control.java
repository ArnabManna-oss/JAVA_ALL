import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/control")
public class control extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		model m;
		try {
		if(!req.getParameter("name").equals("")&&!req.getParameter("id").equals("")&&!req.getParameter( "pass").equals("")) {
			m=new model(req.getParameter("name"),req.getParameter("id"),req.getParameter("pass"));
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
			java.sql.Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into login1 values(?,?,?)"); 
			ps.setString(1,m.getId());
			ps.setString(2,m.getName() );
			ps.setString(3,m.getPass());
			ps.executeUpdate();
			} 
			catch (ClassNotFoundException e) { 
			e.printStackTrace();
			}
			catch (SQLException e) {
			e.printStackTrace();
			}	
		}
		catch(NullPointerException e) {
			System.out.println(); 
			res.sendRedirect("show");
		}

	}
}
