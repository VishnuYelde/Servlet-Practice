package servletPages;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/page-a")
public class PageA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet Page A is Triggered.");

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body><h1>Welcome to Servlet Page A</h1></body></html>");

		// To dispatch to--> Servlet: Enter the URL of Servlet
		// For HTML and JSP: Enter the file name (eg. index.jsp, register.html)
		RequestDispatcher rDispatcher = req.getRequestDispatcher("page-b"); 	// for HTML 	   --> filename.html
																				// for JSP 		   --> filename.jsp
																				// for Servlet URL --> /page-a
		rDispatcher.forward(req, resp);
//		rDispatcher.include(req, resp);
	}
}
