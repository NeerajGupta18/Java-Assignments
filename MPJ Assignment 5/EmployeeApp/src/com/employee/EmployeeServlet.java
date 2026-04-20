package com.employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class EmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String dept = request.getParameter("department");
        double salary = Double.parseDouble(request.getParameter("salary"));

        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO employee(name,email,department,salary) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, dept);
            ps.setDouble(4, salary);

            int i = ps.executeUpdate();

            if (i > 0) {
                response.sendRedirect("success.jsp");
            } else {
                response.getWriter().println("Error in registration");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
