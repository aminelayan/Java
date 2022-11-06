<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Omikuji</title>
    <link rel="stylesheet" type="text/css" href="/main.css">
    <script type="text/javascript" src="js/app.js"></script>
</head>
<body>
<h1>Send an Omikuji!</h1>
<div>
    <form action='/show' method="post">
    <label>Pick any number from 5 to 25</label>
    <select name="numbers">
        <% for(int i=5;i<26;i++){;%>
        <option><%= i %></option>
        <%}%>
    </select>
        <label>Enter the name of any city.</label>
        <input type="text" name='city'>
        <label>Enter the name of any real person:</label>
        <input type='text' name='name'>
        <label>Enter professional endeavor or hobby:</label>
        <input type='text' name='hobby'>
        <label>Enter any type of living thing.</label>
        <input type='text' name='thing'>
        <label>Say something nice to someone:</label>
        <input type='text' name='text'>

        <p>Send and Show A friend</p>
        <input id="submit" type='submit' value='Send'>
    </form>

</div>
</body>
</html>