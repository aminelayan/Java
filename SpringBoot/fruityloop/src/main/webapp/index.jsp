<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<head>
    <meta charset="UTF-8">
    <title>Fruity Loop</title>
</head>
<body>
<h1>Fruits Store</h1>
<table class="table table-striped col-6">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
    </tr>
    </thead>
    <tbody>
    </tr>
    <c:forEach var="type" items="${fruits}">
        <tr>
            <td><c:out value="${type.name}"/></td>
            <td><c:out value="${type.price}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>