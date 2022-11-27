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
    <title>Create a Project</title>
    <meta charset="ISO-8859-1">
    <title>Project Details</title>
</head>
<body>
<h1>Project Details</h1>


<h3>Project: ${projectDet.title}</h3>
<h3>Description: ${projectDet.description}</h3>
<h3>Due Date: ${projectDet.duedate}</h3>
<c:choose>
    <c:when test="${projectDet.projectLeader.id==currentUserId}">
        <form action="/projects/${projectDet.id}/delete" method="post">
            <input type="hidden" name="_method" value="delete">
            <button type="submit" class="btn btn-secondary" type="submit">Delete Project</button>
            <button type="submit" class="btn btn-warning" type="submit"><a href="/dashboard">Back To Dashboard</a></button>
        </form>
    </c:when>
</c:choose>

</body>
</html>