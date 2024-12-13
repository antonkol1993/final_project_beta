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
    </style>
    <title>Players list</title>
</head>
<body>

<h1 style="color: sienna"><%=request.getAttribute("name")%>
</h1>

<jsp:include page="../filter/signOutButton.jsp"/>

<table>
    <tr>
        <th>Name: <%=request.getAttribute("name")%>
        </th>
    </tr>
    <tr>
        <th>Age: <%=request.getAttribute("age")%>
        </th>
    </tr>
    <tr>
        <th>Country: <%=request.getAttribute("country")%>
        </th>
    </tr>
    <tr>
        <th>ID: <%=request.getAttribute("id")%>
        </th>
    </tr>
    <tr>
        <th>Position: <%=request.getAttribute("pos")%>
        </th>
    </tr>
    <tr>
        <th>Rating: <%=request.getAttribute("rating")%>
        </th>
    </tr>
    <tr>
        <th>Reference: <%=request.getAttribute("ref")%>
        </th>
    </tr>
    <tr>
        <th><a href="<t:url value="/players"></t:url>"> Back to list</a></th>
    </tr>
</table>
</body>
</html>
