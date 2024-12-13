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

    </style>
    <title>Players list</title>
</head>
<body>

<h1 style="color: sienna"><%=request.getAttribute("name")%>
</h1>

<jsp:include page="../filter/signOutButton.jsp"/>

<table>
    <tr>
        <th>ID: <%=request.getAttribute("id")%>
        </th>
    </tr>
    <tr>
        <th>Name: <%=request.getAttribute("name")%>
        </th>
    </tr>
    <tr>
        <th>Password: <%=request.getAttribute("password")%>
        </th>
    </tr>
    <tr>
        <th>Role: <%=request.getAttribute("role")%>
        </th>
    </tr>
    <tr>
        <th><a href=<t:url value="/persons"/>/> Back to list</th>
    </tr>
</table>
</body>
</html>
