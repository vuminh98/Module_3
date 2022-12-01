<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <
    <style>
        h1 {
            margin-left: 450px;
        }
        a {
            text-decoration: none;
        }
    </style>
</head>
<body>
<div>
    <h1>List product</h1>
    <button>
        <a style="color: white; font-weight: bold"
           href="create-product.jsp">Add new product</a>
    </button>
    <table>
        <tr>
            <th>STT</th>
            <th>Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Category</th>
        </tr>
        <c:forEach items="${products}" var="p">
            <tr>
                <td><c:out value="${p.getId()}"/></td>
                <td><c:out value="${p.getName()}"/></td>
                <td><c:out value="${p.getPrice()}"/></td>
                <td><c:out value="${p.getQuantity()}"/></td>
                <td><c:out value="${p.getCategory()}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>