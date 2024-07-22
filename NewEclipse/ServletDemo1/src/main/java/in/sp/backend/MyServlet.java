package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.jar.Attributes.Name;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SubmitForm")
public class MyServlet extends HttpServlet {
	@Override

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String mysearch = req.getParameter("search1");
		//res.sendRedirect("https://www.google.com");
		res.sendRedirect("https://www.google.com/search?q=" +mysearch);
	}
}
