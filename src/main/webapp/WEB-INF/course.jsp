<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <title>Course</title>
</head>

<body>
    <h2>Course list:</h2>
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>Course Id</th>
                <th>Course Name</th>
                <th>Course Instructor</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="course" items="${courses}">
            <tr>
                <td><c:out value="${course.id}"/> </td>
                <td><c:out value="${course.name}"/> </td>
                <td><c:out value="${course.instructor}"/> </td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>