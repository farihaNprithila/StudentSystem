<%--
  Created by IntelliJ IDEA.
  User: Fariha Nawaz
  Date: 4/18/2020
  Time: 10:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <title>New Student</title>
</head>
<body>
    <h3>Add a new student:</h3>
    <%--@elvariable id="studentAdd" type="StudentSystem"--%>
    <form:form method="POST" action="/addstudent" modelAttribute="studentAdd">

            <form:label name="id" path="id" >Student Id</form:label>
            <form:input path="id"/><br/>

            <form:label name="firstName" path="firstName">First Name</form:label>
            <form:input path="firstName"/><br/>

            <form:label name="lastName" path="lastName">Last Name</form:label>
            <form:input path="lastName"/><br/>

            <form:label name="email" path="email">Email</form:label>
            <form:input path="email"/><br/>

            <form:label name="address" path="address">Address</form:label>
            <form:input path="address"/><br/>

            <form:label name="course" path="courses">Course</form:label>
                <form:select path="course">
                <form:option label="Select your course" value= "Select" />
                <form:options items="${courseList}" itemLabel="name"/>
        </form:select><br/>

            <form:label path="department">Department</form:label>
                <form:select path="department">
                    <form:option label="Select your department" value= "Select" />
                    <form:options items="${dropdown}" itemLabel="name"/>
                </form:select><br/>

        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="reset" class="btn btn-primary">Reset</button>

    </form:form>
</body>
</html>
