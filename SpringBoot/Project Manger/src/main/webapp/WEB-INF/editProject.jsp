<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <meta charset="ISO-8859-1">
    <title>Edit My Project</title>
</head>
<body>
<form:form action="/projects/${thisProject.id}/edit" method="post" modelAttribute="thisProject">
    <input type="hidden" name="_method" value="put">

    <p>
        <form:label path="title">Project Title: </form:label>
        <form:errors path="title" class="alert alert-info p-1" role="alert"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="description">Project Description: </form:label>
        <form:errors path="description" class="alert alert-info p-1" role="alert"/>
        <form:input path="description"/>
    </p>
    <p>
        <form:label path="duedate">Due Date: </form:label>
        <form:errors path="duedate" class="alert alert-info p-1" role="alert"/>
        <form:input type="date" path="duedate"/>
    </p>

    <input type="submit" value="Submit"/>
</form:form>
<button><a href="/dashboard">Cancel</a></button>
</body>
</html>