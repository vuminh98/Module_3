<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Departments and Employees</h2>
<c:forEach items="${departments}" var="dept">
    <h3>${dept.deptName}</h3>
    <ul>
        <c:forEach items="${dept.employees}" var="emp">
            <li>
                    ${emp.empName} - (${emp.job})
            </li>
        </c:forEach>
    </ul>
</c:forEach>
</body>
</html>