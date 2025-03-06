package org.example.experiment_4_emp;

import dao.EmployeeDAO;
import models.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Employee emp = new Employee();
        emp.setName(request.getParameter("name"));
        emp.setEmail(request.getParameter("email"));
        emp.setPosition(request.getParameter("position"));
        emp.setDepartment(request.getParameter("department"));

        EmployeeDAO.addEmployee(emp);
        response.sendRedirect("employees");
    }
}
