package in.sp.backend;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/Login")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		PrintWriter out = resp.getWriter();
		
		
		if (myemail.equals("rajumallick4152@live.com") && mypass.equals("Raju8240@")) {
			
			//req.setAttribute("name_key","Supriya Mallick");
			HttpSession session = req.getSession();
			session.setAttribute("name_key", "Supriya Mallick");
			
			RequestDispatcher rd = req.getRequestDispatcher("/Profile.jsp");
			rd.forward(req, resp);

		} else {
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'>Email Id Or Password Didn't Matched</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}
}

