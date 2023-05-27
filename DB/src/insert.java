
import java.sql.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/op")
public class insert extends HttpServlet{

public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	try {
	//	res.getWriter().print("load");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
//	//	res.getWriter().print("connect");
//   	    PreparedStatement ps=con.prepareStatement("Insert into login1 values(?,?,?)");
//   	//    res.getWriter().print("queary");
//   	    ps.setString(1,req.getParameter("id"));
//   	    ps.setString(2,req.getParameter("name"));
//   	    ps.setString(3,req.getParameter("pass"));
//   //	 res.getWriter().print("go");
//   	 if(ps.executeUpdate()==1)
//	    	res.getWriter().print("Added");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","1234");
		Statement ps=con.createStatement();
		ResultSet re=ps.executeQuery("SELECT * from login1");
		
		while (re.next()) {
			
			res.getWriter().print(re.getString(1)+"			");
			
			res.getWriter().print(re.getString(2)+"			");
			
			res.getWriter().print(re.getString(3)+"			");
			
			res.getWriter().println("");
			
		}
		
		
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
	
}

