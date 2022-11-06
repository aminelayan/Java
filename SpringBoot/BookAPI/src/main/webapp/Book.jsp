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
        <tr>
            <td> <c:out value="${book.title}"></c:out> </td>
            <td><c:out value="${book.numberOfPages}"></c:out></td>
            <td><c:out value="${book.id}"></c:out></td>
        </tr>
</table>
</body>
</html>