<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 11/30/2022
  Time: 8:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users?action=create">Add New User</a>
        <div>
        <form method="post" action="/users?action=search">
        <input style="border-radius: 1px" type="text" name="search" placeholder="search by name"/>
        <button type="submit" >Search</button>
        </form>
        </div>
        <div>
        <form method="get" action="/users?action=sort">
            <button style="border-radius: 1px" type="submit">Sort</button>
        </form>
        </div>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}"/> </td>
                <td><c:out value="${user.name}"/> </td>
                <td><c:out value="${user.email}"/> </td>
                <td><c:out value="${user.country}"/> </td>
                <td>
                    <a href="users?action=edit&id=${user.id}">Edit</a>
                    <a href="users?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
