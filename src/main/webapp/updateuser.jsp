<jsp:include page ="include/header.jsp"/>



<form action="${pageContext.request.contextPath }/site" method="post" style="margin-left: 20px;">
User name: <input type="text" name="username" value="${param.username}" required="required"/><br/>
Email: <input type="email" name="Email" value="${param.email}" required="required"/><br/>
<input type="hidden" name="form" value="updateUserOperation"/><br/>
<input type="hidden" name="userid" value="${param.userid}"/><br/>
<input type="submit" value="Update User"/><br/>

</form>



<div style="margin-top: 20px;">
    <jsp:include page="include/footer.jsp"/>
</div>