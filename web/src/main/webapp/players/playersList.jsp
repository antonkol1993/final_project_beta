<%@ page import="java.util.List" %>
<%@ page import="objects.Player" %>
<%@ page import="service.PlayerService" %>
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
    <title>Players list</title>
</head>
<body>

<jsp:include page="../filter/signOutButton.jsp"/>

<table>
    <tr>
        <th>Id</th>
        <th>Player</th>
        <th>Age</th>
        <th>Country</th>
        <th>Rating</th>
    </tr>

    <t:forEach items="${list}" var="person">

        <tr>
            <td>${person.id}
            </td>
            <td><a href="<t:url value="/player/${person.id}"/>">
                    ${person.name}</a>
            </td>
            <td>${person.age}
            </td>
            <td>${person.country}
            </td>
            <td>${person.rating}
            </td>

            <td>
                <form action="${pageContext.request.contextPath}/players/edit/${person.id}" method="get">
                    <input value="Edit" type="submit" class="edit_submit">
                </form>

                <form action="${pageContext.request.contextPath}/players/delete/${person.id}" method="post">
                    <input value="Delete" type="submit" class="edit_submit">
                </form>
            </td>
        </tr>

    </t:forEach>
    <a class="add_href" style="color: darkred" href="${pageContext.request.contextPath}/players/add">Add a new
        player</a>


</table>
</body>
</html>
