<%@ page import="java.util.List, models.Employee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Management</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-4">
    <h2 class="text-center">Employee Management System</h2>
    <div class="d-flex justify-content-between mb-3">
        <h4>Employee List</h4>
        <a href="addEmployee.jsp" class="btn btn-success">Add Employee</a>
        <a href="index.jsp" class="btn btn-primary">Home</a> <!-- Link back to Home -->
    </div>

    <table class="table table-striped table-bordered">
        <thead class="table-dark">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Position</th>
            <th>Department</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Employee> employees = (List<Employee>) request.getAttribute("employees");
            if (employees != null && !employees.isEmpty()) {
                for (Employee emp : employees) { %>
        <tr>
            <td><%= emp.getId() %>
            </td>
            <td><%= emp.getName() %>
            </td>
            <td><%= emp.getEmail() %>
            </td>
            <td><%= emp.getPosition() %>
            </td>
            <td><%= emp.getDepartment() %>
            </td>
            <td>
                <a href="employeeDetails.jsp?id=<%= emp.getId() %>" class="btn btn-info btn-sm">View</a>
                <a href="editEmployee.jsp?id=<%= emp.getId() %>" class="btn btn-warning btn-sm">Edit</a>
                <a href="deleteEmployee.jsp?id=<%= emp.getId() %>" class="btn btn-danger btn-sm"
                   onclick="return confirm('Are you sure you want to delete this employee?');">Delete</a>
            </td>
        </tr>
        <% }
        } else { %>
        <tr>
            <td colspan="6" class="text-center">No employees found.</td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
