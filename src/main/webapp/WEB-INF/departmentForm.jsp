<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <title>New Department</title>
</head>
<body>
    <h3>Add a new department:</h3>
    <%--@elvariable id="departmentAdd" type="StudentSystem"--%>
    <form:form method="POST" action="/adddepartment" modelAttribute="departmentAdd">
        <div class="form-group">
            <form:label name="id" path="id">Department Id</form:label>
            <form:input path="id"/><br/>

            <form:label name="name" path="name">Department Name</form:label>
            <form:input path="name"/><br/>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="reset" class="btn btn-primary">Reset</button>
    </form:form>
</body>
</html>