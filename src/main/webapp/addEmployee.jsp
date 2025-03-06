<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Add Employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Add New Employee</h2>
    <form action="AddEmployeeServlet" method="post">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" class="form-control" name="name" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Email</label>
            <input type="email" class="form-control" name="email" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Position</label>
            <input type="text" class="form-control" name="position" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Department</label>
            <input type="text" class="form-control" name="department" required>
        </div>
        <button type="submit" class="btn btn-primary">Add Employee</button>
        <a href="index.jsp" class="btn btn-secondary">Cancel</a>
    </form>
</div>
</body>
</html>
