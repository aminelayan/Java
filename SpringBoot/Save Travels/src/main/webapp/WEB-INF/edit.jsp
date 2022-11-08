<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="/style.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <%--    <script type="text/javascript" src="js/app.js"></script>--%>
</head>
<body>
<h1>Edit an Expense</h1>
<a href="/travels">Go Back</a>
<table class="table col-6">
    <%--@elvariable id="travel" type=""--%>
    <form:form action="/travels/${travel.id}" method="post" modelAttribute="travel">
        <input type="hidden" name="_method" value="put">
        <div>
            <form:label path="expense">Expense Name</form:label>
            <form:errors path="expense"/>
            <form:input path="expense"/>
        </div>
        <div>
            <form:label path="vendor">Vendor</form:label>
            <form:errors path="vendor"/>
            <form:input path="vendor"/>
        </div>
        <div>
            <form:label path="amount">Amount</form:label>
            <form:errors path="amount"/>
            <form:input path="amount"/>
        </div>
        <input type="submit" value="Submit"/>
    </form:form>
</table>
</body>
</html>
