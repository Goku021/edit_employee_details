<%
    int id = Integer.parseInt(request.getParameter("id"));
%>
<html>
<head>
    <title>Delete Employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Are you sure you want to delete this employee?</h2>
    <form action="DeleteEmployeeServlet" method="post">
        <input type="hidden" name="id" value="<%= id %>">
        <button type="submit" class="btn btn-danger">Delete</button>
        <a href="index.jsp" class="btn btn-secondary">Cancel</a>
    </form>
</div>
</body>
</html>
