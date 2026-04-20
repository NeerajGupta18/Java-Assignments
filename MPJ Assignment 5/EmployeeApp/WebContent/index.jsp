<html>
<head>
    <title>Employee Registration</title>
</head>
<body>

<h2>Employee Registration Form</h2>

<form action="EmployeeServlet" method="post">
    Name: <input type="text" name="name" required><br><br>
    
    Email: <input type="email" name="email" required><br><br>
    
    Department: <input type="text" name="department" required><br><br>
    
    Salary: <input type="number" name="salary" required><br><br>
    
    <input type="submit" value="Register">
</form>

</body>
</html>
