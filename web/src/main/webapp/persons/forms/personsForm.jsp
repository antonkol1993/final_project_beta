<form action="${pageContext.request.contextPath}
<%=request.getAttribute("servletPath")%>" method="post">
    Username:<label>
    <input name="username" type="text" value="<%=request.getAttribute("username")%>">
</label><br/>
    Password:<label>
    <input name="password" type="text" value="<%=request.getAttribute("password")%>">
</label><br/>
    <input type="hidden" value="<%=request.getAttribute("id")%>" name="id">
    <input name="input" type="submit" value="<%=request.getAttribute("input")%>">
</form>

