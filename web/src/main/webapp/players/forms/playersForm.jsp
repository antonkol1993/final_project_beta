<form action="${pageContext.request.contextPath}<%=request.getAttribute("url")%>" method="post">
    Player:<input name="name" type="text" value="<%=request.getAttribute("name")%>"><br/>
    Age:<input name="age" type="number" value="<%=request.getAttribute("age")%>"><br/>
    Country:<input name="country" type="text" value="<%=request.getAttribute("country")%>"><br/>
    Position:<input name="role" type="text" value="<%=request.getAttribute("role")%>"><br/>
    Rating:<input name="rating" type="text" value="<%=request.getAttribute("rating")%>"><br/>
    <input type="hidden" value="<%=request.getAttribute("id")%>" name="id">
    <input name="input" type="submit" value="<%=request.getAttribute("input")%>">
</form>


