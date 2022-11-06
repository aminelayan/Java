<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Omikuji</title>
    <link rel="stylesheet" type="text/css" href="/main.css">
</head>
<body>
<h1>Here's Your Omikuii!</h1>
<div>
    <p>
        In <c:out value="${numbers}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${name}"/> as your roommate, <c:out value="${hobby}"/> for a living.
        The next time you see a <c:out value="${thing}"/>, you will have good luck.
        Also, <c:out value="${text}"/>
    </p>
    <a href="/">Go Back</a>
</div>
</body>
</html>