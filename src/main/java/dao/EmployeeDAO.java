package dao;

import models.Employee;
import dbconnection.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    // ✅ Get all employees
    public static List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT id, name, email, position, department FROM employees";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setEmail(rs.getString("email"));
                emp.setPosition(rs.getString("position"));
                emp.setDepartment(rs.getString("department"));
                employees.add(emp);
                System.out.println("Fetched Employee: " + emp.getName()); // Debugging log
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    // ✅ Get employee by ID
    public static Employee getEmployeeById(int id) {
        Employee emp = null;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM employees WHERE id = ?")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setEmail(rs.getString("email"));
                emp.setPosition(rs.getString("position"));
                emp.setDepartment(rs.getString("department"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }

    // ✅ Add a new employee
    public static void addEmployee(Employee emp) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "INSERT INTO employees (name, email, position, department) VALUES (?, ?, ?, ?)")) {
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setString(3, emp.getPosition());
            ps.setString(4, emp.getDepartment());
            ps.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Update employee details
    public static void updateEmployee(Employee emp) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "UPDATE employees SET name=?, email=?, position=?, department=? WHERE id=?")) {
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setString(3, emp.getPosition());
            ps.setString(4, emp.getDepartment());
            ps.setInt(5, emp.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Delete an employee
    public static void deleteEmployee(int id) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("DELETE FROM employees WHERE id = ?")) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
