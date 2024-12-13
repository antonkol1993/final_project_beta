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
            font-size: large;
            font-weight: bold;
        }

        .delete_submit {
            background: aquamarine;
            font-weight: bold;
        }

        .edit_submit {
            background: darkseagreen;
            font-weight: bold;
        }

        .add_href {
            font-weight: bold;
            font-size: large;
        }
    </style>
    <title>Users list</title>
</head>
<body>

<jsp:include page="../filter/signOutButton.jsp"/>

<table>
    <tr>
        <th>Id</th>
        <th>User</th>
        <th>Password</th>
        <th>Role</th>

    </tr>

    <jsp:useBean id="list" scope="request" type="java.util.List"/>
    <t:forEach items="${list}" var="person">

        <tr>
            <td>${person.id }
            </td>
            <td><a class="add_submit" href=
                    <t:url value="/person/${person.id}"/>></a>${person.userName}
            </td>
            <td>${person.getPassword()}
            </td>
            <td>${person.getUserRole().name()}
            </td>

            <td>
                <form action="${pageContext.request.contextPath}/persons/edit/${person.id}" method="get">
                    <input value="Edit" type="submit" class="edit_submit">
                </form>

                <form action="${pageContext.request.contextPath}/persons/remove/${person.id}" method="post">
                    <input value="Delete" type="submit" class="delete_submit">
                </form>
            </td>
        </tr>

    </t:forEach>
    <a class="add_href" style="color: darkred" href="${pageContext.request.contextPath}/persons/add">Add a new
        person</a>


</table>
</body>
</html>
