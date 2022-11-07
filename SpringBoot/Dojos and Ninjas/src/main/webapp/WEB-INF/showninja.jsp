<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>${thisNinja.firstName}</title>
</head>
<body>
<h1><span>${thisNinja.firstName} ${thisNinja.lastName}</span></h1>
<li>${thisNinja.age}</li>
<li>${thisNinja.dojo.name}</li>
</body>
</html>