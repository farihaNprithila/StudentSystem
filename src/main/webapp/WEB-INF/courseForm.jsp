<%--
  Created by IntelliJ IDEA.
  User: Fariha Nawaz
  Date: 4/18/2020
  Time: 10:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <title>New course</title>
</head>
<body>
    <h3>Add a new course:</h3>
    <%--@elvariable id="courseAdd" type="StudentSystem"--%>
    <form:form method="POST" action="/addcourse" modelAttribute="courseAdd">
        <div class="form-group">
            <form:label name="id" path="id">Course Id</form:label>
            <form:input path="id"/><br/>

            <form:label name="name" path="name">Course Name</form:label>
            <form:input path="name"/><br/>

            <form:label name="instructor" path="instructor">Instructor</form:label>
            <form:input path="instructor"/><br/>

            <form:label name="department" path="department">Department</form:label>
            <form:input path="department"/><br/>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="reset" class="btn btn-primary">Reset</button>
    </form:form>
</body>
</html>

