import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Serv4")
public class serv4 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out=res.getWriter();
		//out.println("hare krishna!");
//		int x=(int)req.getAttribute("m"); 
		
//		RequestDispatcher reqd=req.getRequestDispatcher("home.html");
//		reqd.forward(req, res);
		

//		int x=Integer.parseInt(req.getParameter("m"));
//		
//		out.println("multiplication is "+x);
		
//		HttpSession ses=req.getSession();
//		ses.removeAttribute("m");
//		int x=(int) ses.getAttribute("m");
//		out.println("sqauare of multiplication is "+(x*x));
		int x=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c:cookies)
		{
			if(c.getName().equals("m"))
				x=Integer.parseInt(c.getValue());
			
			
		}
		out.println("cube of multiplication is "+(x*x*x));
		
		
		}

}
