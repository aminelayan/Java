<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Main Page</title>
    <link rel="stylesheet" type="text/css" href="/main.css">
    <script type="text/javascript" src="js/app.js"></script>
</head>
<body>
<table class="table col-6">
    <thead>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
        <th>Action</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="ninjas" items="${ninjas}">
        <tr>
            <td><a href="/ninja/${ninjas.id}"><c:out value="${ninjas.id}"></c:out><a/></td>
            <td> <c:out value="${ninjas.firstName}"></c:out></td>
            <td> <c:out value="${ninjas.lastName}"></c:out></td>
            <td><c:out value="${ninjas.age}"></c:out></td>
            <td><a href="/ninja/${ninjas.id}/edit">edit</a>
            <td><form action="/${ninjas.id}/delete" method="post">
                <input type="hidden" name="_method" value="delete">
                <input type="submit" value="Delete">
            </form></td>
        </tr>
    </c:forEach>
    <!-- loop over all the books to show the details as in the wireframe! -->
    </tbody>
</table>
</body>
</html>
