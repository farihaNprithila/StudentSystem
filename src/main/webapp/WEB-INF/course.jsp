<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <title>Course</title>
</head>

<body>
    <h2>Course list:</h2>
    <table class="table table-bordered">
        <thead class="thead-dark">
            <tr>
                <th>Course Id</th>
                <th>Course Name</th>
                <th>Course Instructor</th>
                <th>Department</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="course" items="${courses}">
            <tr>
                <td><c:out value="${course.id}"/> </td>
                <td><c:out value="${course.name}"/> </td>
                <td><c:out value="${course.instructor}"/> </td>
                <td><c:out value="${course.department.name}"/></td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/addcourse" class="btn btn-outline-primary" role="button">Add New Course</a>
</body>
</html>