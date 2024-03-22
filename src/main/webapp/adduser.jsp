<jsp:include page ="include/header.jsp"/>



<form action="${pageContext.request.contextPath }/site" method="post" style="margin-left: 20px;">
User name: <input type="text" name="username" required="required" /><br/>
Email: <input type="email" name="Email" required="required"/><br/>
<input type="hidden" name="form" value="addUserOperation"/><br/>
<input type="submit" value="Add User"/><br/>

</form>



<div style="margin-top: 20px;">
    <jsp:include page="include/footer.jsp"/>
</div>