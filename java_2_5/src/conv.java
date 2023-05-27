

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/conv")
public class conv extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String FN,SN;
		int type,opr,f,s,r=0,max=0,min=0;
		FN=req.getParameter("first");
		SN=req.getParameter("Secon");
		type=Integer.parseInt(req.getParameter("Base"));
		opr=Integer.parseInt(req.getParameter("Opr"));
		
		PrintWriter out=res.getWriter();
		if(type!=10)
		{
			f=Integer.parseInt(FN,type);
			s=Integer.parseInt(SN,type);
			
			if(f>s) {max=f;min=s;}else if (s>f) {max=s;min=f;}else {max=f;min=s;}
			
			switch (opr) {
			case 1:
				r=max+min;
			break;
		    case 2:
		    	r=max-min;
		    break;
		    	}
		}
		else {
			f=Integer.parseInt(FN);
			s=Integer.parseInt(SN);
			if(f>s) {max=f;min=s;}else if (s>f) {max=s;min=f;}else {max=f;min=s;}
			switch (opr) {
			case 1:
				r=max+min;
			break;
		    case 2:
		    	r=max-min;
		    break;
		    	}
		}
		System.out.println("r="+r);
		System.out.println("opr="+opr);
		
		if(type==2)
		{
			out.println("the result is="+Integer.toBinaryString(r));
		}
		else if (type==10) {
			out.println("the result is="+r);
		} 
		else if(type==8) {
			out.println("the result is="+Integer.toOctalString(r));
		}
		else {
			out.println("the result is="+Integer.toHexString(r));
		}
		
		}
}
