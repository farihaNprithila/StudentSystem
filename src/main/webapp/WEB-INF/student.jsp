<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <title>Course</title>
</head>
<style>
    .table > tbody > tr > td {
        vertical-align: middle;
    }
</style>

<body>
<h2>Course list:</h2>
<table class="table table-bordered">
    <thead class="thead-dark">
    <tr>
        <th>Student Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${students}">
        <tr>
            <td><c:out value="${student.id}"/> </td>
            <td><c:out value="${student.firstName}"/> </td>
            <td><c:out value="${student.lastName}"/> </td>
            <td><c:out value="${student.email}"/> </td>
            <td><c:out value="${student.address}"/> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>