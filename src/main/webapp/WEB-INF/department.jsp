<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <title>Department</title>
</head>
<style>
    .table > tbody > tr > td {
        vertical-align: middle;
    }
</style>

<body>
<h2>Department list:</h2>
<table class="table table-bordered">
    <thead class="thead-dark">
    <tr>
        <th>Department Id</th>
        <th>Department Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="department" items="${departments}">
        <tr>
            <td><c:out value="${department.id}"/> </td>
            <td><c:out value="${department.name}"/> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>