import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/control1")
public class control1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name,id,sal;
		name=request.getParameter("name");
		id=request.getParameter("id");
		sal=request.getParameter("sal");
		
		employee emp= new employee();
		
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(sal);
		
		request.setAttribute("name", emp.getName());
		request.setAttribute("id", emp.getId());
		request.setAttribute("salary", emp.getSalary());
		RequestDispatcher rD= request.getRequestDispatcher("display.jsp");
		rD.include(request, response);
//		response.sendRedirect("display.jsp");
	}
}
