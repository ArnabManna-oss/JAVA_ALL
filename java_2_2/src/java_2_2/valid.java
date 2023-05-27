package java_2_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/valid1")
public class valid extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String un,pas;
		un=req.getParameter("un");
		pas=req.getParameter("repass");
		PrintWriter out=res.getWriter();
		
		
		
		Cookie ck=new Cookie(un,pas);
		res.addCookie(ck);
		
		out.println("successfully done");
		res.sendRedirect("index.html");
		
	}
}
