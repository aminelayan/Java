<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Main Page</title>
</head>
<body>
<h1>Welcome, <span>${currentUser.userName}</span></h1>
<h2>Books from everyone's shelves:</h2>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Project</th>
        <th scope="col">Team Lead</th>
        <th scope="col">Due Date</th>
        <th scope="col">Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="notProjectLeader" items="${notProjectLeader}">
        <tr>
            <td><a href="/projects/${notProjectLeader.id}">${notProjectLeader.title}</a></td>
            <td>${notProjectLeader.projectLeader.userName}</td>
            <td>${notProjectLeader.duedate}</td>
            <td><a href ='/projects/${notProjectLeader.id}/join'>Join Team</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Project</th>
        <th scope="col">Team Lead</th>
        <th scope="col">Due Date</th>
        <th scope="col">Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="projectLeader" items="${projectLeader}">
        <tr>
            <td><a href="/projects/${projectLeader.id}">${projectLeader.title}</a></td>
            <td>${projectLeader.projectLeader.userName}</td>
            <td>${projectLeader.duedate}</td>
            <c:choose>
            <c:when test="${projectLeader.projectLeader.id==currentUser.id}">
                <td><a href ='/projects/${projectLeader.id}/edit'>edit</a></td>
            </c:when>
            <c:otherwise>
                <td><a href ='/projects/${projectLeader.id}/leave'>Leave Team</a></td>
            </c:otherwise>
            </c:choose>
            </td>
             </tr>
    </c:forEach>
</table>
<a href="/logout">Log Out</a>
<a href="/projects/new">Add New Project</a>
</body>
</html>