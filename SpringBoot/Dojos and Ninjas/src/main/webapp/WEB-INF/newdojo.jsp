<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>New Dojo</title>
</head>
<body>
<h1>New Dojo</h1>
<%--@elvariable id="dojos" type=""--%>
<form:form action="/dojo/new" method="post" modelAttribute="dojos">
    <p>
        <form:label path="name">Name: </form:label>
        <form:input path="name"/>
        <form:errors path="name"/>
    </p>
    <input type="submit" value="Create"/>
</form:form>
</body>
</html>