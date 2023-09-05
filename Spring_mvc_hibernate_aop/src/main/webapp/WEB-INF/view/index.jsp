<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>
</head>
<body>
<h1 class="top">All Employees</h1>

<table class="table_class">

    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="employee" items="${allEmployees}">
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${employee.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="empId" value="${employee.id}"/>
        </c:url>
        <tr>
            <td>${employee.name}</td>
            <td>${employee.surname}</td>
            <td>${employee.department}</td>
            <td>${employee.salary}</td>
            <td>
                <input style="margin-right: 4px;" type="button" value="Update"
                onclick="window.location.href = '/api/v1${updateButton}'"/>
                <input type="button" value="Delete"
                       onclick="window.location.href = '/api/v1${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<input type="button" value="Add"
onclick="window.location.href = 'add'"/>
<%--<a href="add">Add</a>--%>
</body>
<style>
    .top{
        margin-bottom: 30px;
    }
    .table_class{
        margin-bottom: 15px;
    }
</style>
</html>
