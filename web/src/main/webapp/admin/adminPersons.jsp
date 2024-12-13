<%--
  Created by IntelliJ IDEA.
  User: person
  Date: 10.09.2024
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }

        .add_submit {
            width: 250px;
            height: 40px;
            background: burlywood;
            font-size: large;
            font-weight: bold;
        }

        .delete_submit {
            background: aquamarine;
            font-weight: bold;
        }

        .to_form_submit {
            background: darkseagreen;
            font-weight: bold;
        }

        .add_href {
            font-weight: bold;
            font-size: large;
        }
    </style>
    <title>List of users</title>
</head>
<body>
<table>
    <tr>
        <th>User</th>
        <th>Password</th>
        <th>Role</th>
    </tr>
    <jsp:include page="../filter/signOutButton.jsp"/>
    <jsp:useBean id="personList" scope="request" type="java.util.List"/>

    <t:forEach items="${personList}" var="person">
        <tr>
            <td>${person.userName}</td>
            <td>${person.password}</td>
            <td>${person.userRole}</td>
        </tr>
    </t:forEach>

</table>
</body>
</html>
