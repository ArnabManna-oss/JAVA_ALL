package class3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ser1")
public class sor1 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(arg0, arg1);
//		 System.out.println(req.getParameter("n1"));
		int x=Integer.parseInt(req.getParameter("n1"));
		int y=Integer.parseInt(req.getParameter("n2"));
		int m=x*y;
		PrintWriter out=res.getWriter();

//		ServletContext ctx=getServletContext();
//		String str=ctx.getInitParameter("name");
//		out.println("hellow "+str);
		
		ServletConfig cnfg=getServletConfig();
		String st=cnfg.getInitParameter("name1");
		out.println("hi "+st);
		
//	RequestDispatcher reqd=req.getRequestDispatcher("ser2");
//	reqd.forward(req, res);
//		
	
	}
	}

