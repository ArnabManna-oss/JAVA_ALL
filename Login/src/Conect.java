import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cont1")
public class Conect extends HttpServlet{
public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
{
PrintWriter out= res.getWriter();
String name = req.getParameter("n1");
String age = req.getParameter("n2");
out.print("<p>the name is "+name+" and the age is "+age+"</p>");
}
}