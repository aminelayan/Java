<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Counter</title>
    <link rel="stylesheet" type="text/css" href="/counter.css">
    <script type="text/javascript" src="js/app.js"></script>
</head>
<body>
<h1>You have visited <span><a href="/">Home Page</a> <c:out value="${counter}"/> times</span> </h1>
<h2><a href="/">Test Another Visit?</a></h2>
</body>
</html>