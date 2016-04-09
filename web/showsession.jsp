<%--
  Created by IntelliJ IDEA.
  User: govno
  Date: 05.04.2016
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%
       String value = (String) session.getAttribute("inputtext");
    %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Session:<font color="green"><%=value%></font>
</body>
</html>
