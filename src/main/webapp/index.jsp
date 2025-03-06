<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Management System</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        body {
            background: linear-gradient(to right, #4facfe, #00f2fe);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
        }

        .card {
            border-radius: 12px;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
        }

        .btn-custom {
            width: 200px;
            font-size: 18px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="card p-5 bg-light">
        <h1 class="mb-3 text-primary">Welcome to Employee Management</h1>
        <p class="mb-4 text-secondary">Manage your employees efficiently with our simple and powerful system.</p>

        <div class="d-flex justify-content-center gap-3">
            <a href="addEmployee.jsp" class="btn btn-success btn-lg btn-custom">Add Employee</a>
            <a href="employees" class="btn btn-primary btn-lg btn-custom">View Employees</a>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
