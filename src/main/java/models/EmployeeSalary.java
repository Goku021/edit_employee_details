package models;

import java.math.BigDecimal;
import java.sql.Date;

public class EmployeeSalary {
    private int id;
    private int employeeId;
    private BigDecimal salary;
    private String company;
    private Date hireDate;

    // ✅ Constructor
    public EmployeeSalary() {
    }

    // ✅ Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {  // 🔥 Fix: Ensure this method exists
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
