<%--
  Created by IntelliJ IDEA.
  User: Minh Duc
  Date: 11/28/2022
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View customer</title>
</head>
<body>
<h1>Customer details</h1>
<p>
  <a href="/customers">Back to customer list</a>
</p>
<table>
  <tr>
    <td>Name: </td>
    <td>${requestScope["customer"].getName()}</td>
  </tr>
  <tr>
    <td>Email: </td>
    <td>${requestScope["customer"].getEmail()}</td>
  </tr>
  <tr>
    <td>Address: </td>
    <td>${requestScope["customer"].getAddress()}</td>
  </tr>
</table>
</body>
</html>
