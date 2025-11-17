package day1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/page-b")
public class PageB extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String username = req.getParameter("username");
		String useremail = req.getParameter("useremail");
		long phone = Long.parseLong(req.getParameter("userphone"));
		String password = req.getParameter("userpwd");
		
		System.out.println("====================User Data====================");
		System.out.println(username);
		System.out.println(useremail);
		System.out.println(phone);
		System.out.println(password);
		
		PrintWriter pw = res.getWriter();
		pw.print("<html>"
				+ "<body>"
				+ "<h1>"+username+"  Welcome to WebApp-HttpServlet, your account is registered with email : "+useremail+ "</h1>"
						+ "</body>"
						+ "</html>");
		
	}
}
