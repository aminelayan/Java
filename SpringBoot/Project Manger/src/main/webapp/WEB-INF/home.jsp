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
<h2>.............</h2>
<button type="submit" class="btn btn-secondary"><a href="/projects/new">Add New Project</a></button>
<button type="submit" class="btn btn-success"><a href="/logout">Log Out</a></button>
<table class="table" style="margin-top: 10px">
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
               <td><form action="/projects/${notProjectLeader.id}/delete" method="post">
                   <input type="hidden" name="_method" value="delete">
                   <button type="submit" class="btn btn-secondary" type="submit">Delete Project</button>
                   <button type="submit" class="btn btn-danger"><a href ='/projects/${notProjectLeader.id}/edit'>Edit</a></button>
               </form>

            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>