<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 11/29/2022
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create product</title>
    <style>
        a {
            text-decoration: none;
        }
    </style>
</head>
<body>
<form action="/products?action=create" method="post">
    <table>
        <tr>
        <th><label for="name">Name</label></th>
        <td><input type="text" id="name" name="name"></td>
        </tr>
        <tr>
            <th><label for="price">Price</label></th>
            <td><input type="text" id="price" name="price"></td>
        </tr>
        <tr>
            <th><label for="quantity">Quantity</label></th>
            <td><input type="text" id="quantity" name="quantity"></td>
        </tr>
        <tr>
            <select>
                <option value="${category.get(1)}"></option>
                <option value="${category.get(2)}"></option>
                <option value="${category.get(3)}"></option>
            </select>
        </tr>
    </table>
</form>
</body>
</html>
