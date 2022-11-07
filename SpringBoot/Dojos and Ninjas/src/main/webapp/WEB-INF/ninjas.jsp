

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>All Ninjas Page</title>
</head>
<body>
<h1>All Ninjas</h1>
<c:forEach var="ninjas" items="${ninjas}">
    <li><a href="ninja/${ninjas.id }">${ninjas.firstName} ${ninjas.lastName}</a></li>
</c:forEach>
<a href="ninja/new">Create New Ninja</a>
</body>
</html>