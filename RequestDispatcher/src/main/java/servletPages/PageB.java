package servletPages;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/page-b")
public class PageB extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Servlet Page B is Triggered");
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body><h1>Welcome to Servlet Page B</h1></body></html>");
		
	}
}
