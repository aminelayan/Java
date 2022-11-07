<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>New Ninja</title>
</head>
<body>

<%--@elvariable id="ninjas" type=""--%>
<form:form action="/ninja/new" method="post" modelAttribute="ninjas">
    <p>
        <form:label path="firstName">First Name: </form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">Last Name: </form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
    <p>
        <form:label path="age">Age: </form:label>
        <form:errors path="age"/>
        <form:input type="Integer" path="age"/>
    </p>
    <p>
        <form:label path="dojo">Dojo: </form:label>
        <form:errors path="dojo"/>
        <form:select path="dojo">
            <c:forEach var="dojos" items="${dojosList}">
                <option value="${dojos.id}">${dojos.name}</option>
            </c:forEach>
        </form:select>
    </p>

    <input type="submit" value="Create"/>
</form:form>
</body>
</html>
