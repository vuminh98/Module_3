<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 11/24/2022
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Simple Dictionary</title>
</head>
<body>
<%!
  Map<String, String> dic = new HashMap<>();

%>
<%
  dic.put("hello", "xin chao");
  dic.put("goodbye", "tam biet");
  dic.put("book", "sach");
  dic.put("pen", "but");

  String search = request.getParameter("search");

  String result = dic.get(search);
  if (result != null) {
    out.println("Word: " + search);
    out.println("Result: " + result);
  } else {
    out.println("Not found");
  }
%>
</body>
</html>
