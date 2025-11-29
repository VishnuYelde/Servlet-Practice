package mock;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mockConnectionPool.ConnectionPool;

@WebServlet("/insertdata")
public class ServletInsert extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        long phone = Long.parseLong(req.getParameter("phone"));
        String address = req.getParameter("address");
        int age = Integer.parseInt(req.getParameter("age"));

        Connection con = null;

        try {
            con = ConnectionPool.giveConnection();

            String insertQuery = 
                "INSERT INTO users (name, email, phone, address, age) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(insertQuery);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setLong(3, phone);
            ps.setString(4, address);
            ps.setInt(5, age);

            int row = ps.executeUpdate();
            System.out.println(row + " row inserted.");

            RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
            rd.forward(req, resp);

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException("Error inserting user", e);

        } finally {
            ConnectionPool.submitConnection(con);
        }
    }
}
