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
        .signUp {
            width: 100px;
            height: 40px;
            font-size: medium;
            font-weight: bold;
            background: burlywood;
        }
    </style>
</head>
<body>
<h1>Enter username and password for login</h1>
<jsp:include page="enterDataPerson.jsp"/>
<jsp:include page="signUpButton.jsp"/>


</body>
</html>
