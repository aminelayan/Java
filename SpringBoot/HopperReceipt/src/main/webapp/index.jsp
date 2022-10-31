<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hopper</title>
    <style>
        *{
            font-family:"Apple Braille";
        }
    </style>
</head>
<body>
<h1>Customer name: <c:out value="${name}"/></h1>
<h2>Item name: <c:out value="${itemName}"/></h2>
<h2>Price: $<c:out value="${price}"/></h2>
<h2>Description: <c:out value="${description}"/></h2>
<h2>Vendor: <c:out value="${vendor}"/></h2>

</body>
</html>