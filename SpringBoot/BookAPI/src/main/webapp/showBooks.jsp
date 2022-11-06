<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Books</title>
    <link rel="stylesheet" type="text/css" href="/main.css">
    <script type="text/javascript" src="js/app.js"></script>
</head>
<body>
<table>
    <tr>
        <th>Title</th>
        <th>Pages</th>
        <th>ID</th>
    </tr>
        <c:forEach var="books" items="${books}">
    <tr>
        <td> <a href="/${books.id}"> <c:out value="${books.title}"></c:out> </a> </td>
        <td><c:out value="${books.numberOfPages}"></c:out></td>
        <td><c:out value="${books.id}"></c:out></td>
    </tr>
        </c:forEach>
</table>
</body>
</html>