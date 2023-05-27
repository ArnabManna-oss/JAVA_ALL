package java_2_2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/user1")
public class User extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Cookie ck10=new Cookie("Arnab","Arnab12345");
		res.addCookie(ck10);
		
		Cookie ck20=new Cookie("Subhendhu","Subhendhu12345");
		res.addCookie(ck20);
		
		Cookie ck30=new Cookie("Kunal","Kunal12345");
		res.addCookie(ck30);

		Cookie ck40=new Cookie("Niketan","Niketan12345");
		res.addCookie(ck40);
		
		RequestDispatcher reqd=req.getRequestDispatcher("valid.jsp");
		reqd.forward(req, res);
	}
}
