package day1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/read")
public class ReadData extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {


		String username = req.getParameter("username");
		String useremail = req.getParameter("useremail");
		long phone = Long.parseLong(req.getParameter("userphone"));
		String password = req.getParameter("userpwd");
		
		System.out.println("==========User Data==========");
		System.out.println("Name: "+ username);
		System.out.println("Email: "+ useremail);
		System.out.println("Phone: "+phone);
		System.out.println("Pass: "+password);
		
		PrintWriter pw = res.getWriter();
		pw.print("<html>"
				+ "<body>"
				+ "<h1>" +username+ "Welcome to Web App, your Account is register with Email: "+useremail+"</h1></body></html>");
	}
	
}
