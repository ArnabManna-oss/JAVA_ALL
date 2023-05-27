import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/calc")
public class calc extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		double ren,usg,sms,rom,tax=12,tot;
		ren=Double.parseDouble(req.getParameter("ren"));
		usg=Double.parseDouble(req.getParameter("usg"));
		rom=Double.parseDouble(req.getParameter("rom"));
		sms=Double.parseDouble(req.getParameter("sms"));
		PrintWriter out=res.getWriter();
		//calcuate the normal cost of usage
		if (usg<=80.0) {
			usg=0.0;
		}
		else {
			usg=(usg-80.0)*1.5;
		}
		rom*=3.5;
		tot=ren+usg+rom+sms;
		tax=(tot*12)/100;
		tot+=tax;
		out.print("total cost needeed to pay is:"+tot);
	}
}
