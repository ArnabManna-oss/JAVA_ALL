import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Serv3")
public class serv3 extends HttpServlet {

public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.service(arg0, arg1);
//	 System.out.println(req.getParameter("n1"));
	int x=Integer.parseInt(req.getParameter("n1"));
	int y=Integer.parseInt(req.getParameter("n2"));
	int m=x*y;
	
	
//System.out.println("multiplication is "+m);	
//	PrintWriter out = res.getWriter();
//	out.println("multiplication is "+m);
	
	
/*request dispatcher*/
//	req.setAttribute("m",m);
//	RequestDispatcher reqd=req.getRequestDispatcher("Serv4");
//	reqd.forward(req, res);
	

//res.sendRedirect("Serv4?m="+m);//url rewriting
	
/*session programing*/	
//	HttpSession session=req.getSession();
//	session.setAttribute("m",m);
//	res.sendRedirect("Serv4");
	
/*Cookie programing*/	
	Cookie cookie=new Cookie("m", m+"");
	res.addCookie(cookie);
	res.sendRedirect("Serv4");
	
}
}
