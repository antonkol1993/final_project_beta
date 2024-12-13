<form action="${pageContext.request.contextPath}<%=request.getAttribute("url")%>" method="post">
  Username: <input name="userName" type="text"> <br>
  password: <input name="password" type="password"> <br/>
  <input value="<%=request.getAttribute("buttonName")%>" type="submit"> <br/>
</form>