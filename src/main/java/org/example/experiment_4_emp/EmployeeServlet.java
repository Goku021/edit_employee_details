package org.example.experiment_4_emp;

import dao.EmployeeDAO;
import models.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

//@WebServlet("/employees")
//public class EmployeeServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Employee> employees = EmployeeDAO.getAllEmployees();
//        request.setAttribute("employees", employees);
//        request.getRequestDispatcher("index.jsp").forward(request, response);
//    }
//}
@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employees = EmployeeDAO.getAllEmployees();

        if (employees.isEmpty()) {
            System.out.println("No employees found!"); // Debugging log
        }

        request.setAttribute("employees", employees);
        request.getRequestDispatcher("employees.jsp").forward(request, response); // ✅ Redirect to correct JSP
    }
}
