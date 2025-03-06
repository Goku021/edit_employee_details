package org.example.experiment_4_emp;

import dao.EmployeeDAO;
import models.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/EditEmployeeServlet")
public class EditEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String position = request.getParameter("position");
        String department = request.getParameter("department");

        // Check for null values and set default values if necessary
        if (position == null || position.trim().isEmpty()) {
            position = "Unknown"; // Or handle appropriately
        }
        if (department == null || department.trim().isEmpty()) {
            department = "General"; // Or handle appropriately
        }

        Employee emp = new Employee(id, name, email, position, department);
        EmployeeDAO.updateEmployee(emp);

        response.sendRedirect("employees"); // Redirect to employee list
    }

}
