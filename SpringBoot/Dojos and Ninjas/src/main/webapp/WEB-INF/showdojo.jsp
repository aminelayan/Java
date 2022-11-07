<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>${thisDojo.name} Dojo</title>
</head>
<body>
<h1>${thisDojo.name} Location Ninjas</h1>
<table>
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="ninja" items="${thisDojo.ninjas}">
        <tr>
            <td>${ninja.getFirstName()}</td>
            <td>${ninja.getLastName()}</td>
            <td>${ninja.getAge()}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>