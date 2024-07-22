package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.connector.Response;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	PrintWriter out = response.getWriter();
	out.print("I am in doGet() method for browser");//this will print in browser
	
 System.out.println("I am a doGet() Method");//this will print in console
	//super.doGet(req, resp);

}
}
