import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet4")
public class Conect1 extends HttpServlet {
public void service(HttpServletRequest req, 
HttpServletResponse res) throws ServletException, IOException{
for(Cookie c:req.getCookies()) {
if(c.getName().equals("log")) {
c.setMaxAge(0);
res.addCookie(c);
res.sendRedirect("index.html");
}
}
}
}