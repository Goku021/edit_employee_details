package models;

import models.EmployeeSalary;
import dbconnection.DatabaseConnection;

import java.sql.*;

public class EmployeeSalaryDAO {

    // ✅ Get salary details for an employee
    public static EmployeeSalary getSalaryByEmployeeId(int employeeId) {
        EmployeeSalary salary = null;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM employee_salary WHERE employee_id = ?")) {
            ps.setInt(1, employeeId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                salary = new EmployeeSalary();
                salary.setId(rs.getInt("id"));
                salary.setEmployeeId(rs.getInt("employee_id"));
                salary.setSalary(rs.getBigDecimal("salary"));
                salary.setCompany(rs.getString("company"));
                salary.setHireDate(rs.getDate("hire_date"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salary;
    }

    // ✅ Add employee salary details
    public static void addEmployeeSalary(EmployeeSalary salary) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "INSERT INTO employee_salary (employee_id, salary, company, hire_date) VALUES (?, ?, ?, ?)")) {
            ps.setInt(1, salary.getEmployeeId());
            ps.setBigDecimal(2, salary.getSalary());
            ps.setString(3, salary.getCompany());
            ps.setDate(4, salary.getHireDate());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Update employee salary details
    public static void updateEmployeeSalary(EmployeeSalary salary) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "UPDATE employee_salary SET salary=?, company=?, hire_date=? WHERE employee_id=?")) {
            ps.setBigDecimal(1, salary.getSalary());
            ps.setString(2, salary.getCompany());
            ps.setDate(3, salary.getHireDate());
            ps.setInt(4, salary.getEmployeeId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Delete salary record when an employee is deleted
    public static void deleteSalaryByEmployeeId(int employeeId) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("DELETE FROM employee_salary WHERE employee_id = ?")) {
            ps.setInt(1, employeeId);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
