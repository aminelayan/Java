<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Product Page</title>
</head>
<body>
<h1><span>${theProduct.name}</span></h1>
<a href="/">Home</a>
<li>${theProduct.description}</li>
<li>${theProduct.price}</li>
<h2><span>Categories: </span></h2>
<c:forEach var="cat" items="${categoriesForTheProduct}">
    <li>${cat.name}</li>
</c:forEach>
<form action="/products/${theProduct.id}/addCategory" method="post">

    <label id="categories">Add Category</label>
    <select name="categories">
        <c:forEach var="category" items="${categoriesExceptTheProduct}">
            <option value="${category.id}">${category.name}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Add"/>
</form>
</body>
</html>