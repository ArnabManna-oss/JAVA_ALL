package class3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ser2")
public class ser2 extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
//		ServletContext ctx=getServletContext();
//		String str=ctx.getInitParameter("name");
//		out.println("hellow 1 2 3 4 "+str);
		
		ServletConfig cfg=getServletConfig();
		String st=cfg.getInitParameter("name2");
		out.println("hi 1 2 3 4 "+st);
		
		
		
	}

}
