<%@ page import="models.Employee, dao.EmployeeDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Details</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-4">
    <h2 class="text-center">Employee Details</h2>

    <%
        String idParam = request.getParameter("id");
        Employee employee = null;
        if (idParam != null) {
            int empId = Integer.parseInt(idParam);
            employee = EmployeeDAO.getEmployeeById(empId);
        }
    %>

    <% if (employee != null) { %>
    <table class="table table-bordered">
        <tr>
            <th>ID</th>
            <td><%= employee.getId() %>
            </td>
        </tr>
        <tr>
            <th>Name</th>
            <td><%= employee.getName() %>
            </td>
        </tr>
        <tr>
            <th>Email</th>
            <td><%= employee.getEmail() %>
            </td>
        </tr>
        <tr>
            <th>Position</th>
            <td><%= employee.getPosition() %>
            </td>
        </tr>
        <tr>
            <th>Department</th>
            <td><%= employee.getDepartment() %>
            </td>
        </tr>
    </table>
    <% } else { %>
    <p class="text-danger">Employee not found!</p>
    <% } %>

    <a href="employees" class="btn btn-primary">Back to List</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
