<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>List Customer
</h1>
<%
    class Customer {
        private String name;
        private String dob;
        private String address;
        private String img;

        public Customer(String name, String dob, String address, String img) {
            this.name = name;
            this.dob = dob;
            this.address = address;
            this.img = img;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }
    }
%>

<%
    ArrayList<Customer> customers = new ArrayList<>();
    customers.add(new Customer("abc","20/11/2022","HaNoi","D:\\Module3\\ListCustomer\\src\\main\\webapp\\thumbnail.png"));
    customers.add(new Customer("abcd","20/11/2022","HaNoi1","D:\\Module3\\ListCustomer\\src\\main\\webapp\\thumbnail.png"));
    customers.add(new Customer("abcde","20/11/2022","HaNoi2","D:\\Module3\\ListCustomer\\src\\main\\webapp\\thumbnail.png"));
%>
<table>
    <tr>
        <th>Name</th>
        <th>DOB</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
</table>
<c:forEach items="${customers}" var="c">
<tr>
    <td><c:out value="${c.getName()}"/></td>
    <td><c:out value="${c.getDob()}"/></td>
    <td><c:out value="${c.getAddress()}"/></td>
    <td><c:out value="${c.getImg()}"/></td>
</tr>
</c:forEach>

</body>
</html>