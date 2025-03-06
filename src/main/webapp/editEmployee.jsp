<%@ page import="dao.EmployeeDAO, models.Employee" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    Employee emp = EmployeeDAO.getEmployeeById(id);
%>
<html>
<head>
    <title>Edit Employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Edit Employee</h2>
    <form action="EditEmployeeServlet" method="post">
        <input type="hidden" name="id" value="<%= emp.getId() %>">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" class="form-control" name="name" value="<%= emp.getName() %>" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Email</label>
            <input type="email" class="form-control" name="email" value="<%= emp.getEmail() %>" required>
        </div>
        <button type="submit" class="btn btn-primary">Save Changes</button>
        <a href="index.jsp" class="btn btn-secondary">Cancel</a>
    </form>
</div>
</body>
</html>
