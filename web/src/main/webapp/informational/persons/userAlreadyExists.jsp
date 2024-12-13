<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.09.2024
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        h1 {
            font-size: large;
            font-weight: bold;
            background: burlywood;
        }
    </style>
</head>
<body>
<h1>Username has already existed!</h1>
<form action="${pageContext.request.contextPath}<%=request.getAttribute("servletPath")%>" method="get">
    <input type="submit" value="Try again"/>
</form>
<form action="${pageContext.request.contextPath}/persons" method="get">
    <input type="submit" value="Main menu"/>
</form>
</body>
</html>
