<jsp:include page ="include/header.jsp"/>
<%@page import="java.util.List" %>
<%@page import="swish.java.entity.User" %>


<h1 style="margin-left: 20px;">List of Users</h1>

<table border="1" style="margin-left: 20px;">
	<thead>
		<th>UserId</th>
		<th>username</th>
		<th>email</th>
		<th>Operations</th>
	</thead>

<%
	List<User> listusers = (List)request.getAttribute("listusers");
	for(User _user: listusers){
		out.print("<tr>");
			out.print("<td>" + _user.getUserid() + "</td>");
			out.print("<td>" + _user.getUsername() + "</td>");
			out.print("<td>" + _user.getEmail() + "</td>");
			out.print("<td> <a href="+ request.getContextPath()+"/site?page=updateuser&userid="+_user.getUserid()+					
					"&username="+_user.getUsername()+"&email="+_user.getEmail()+">Update</a>");
			out.print(" | ");
			out.print("<a href="+ request.getContextPath()+"/site?page=deleteuser&userid="+_user.getUserid()+">Delete</a></td>");
		out.print("</tr>");
	}
%>
</table>

<div style="margin-top: 20px;">
    <jsp:include page="include/footer.jsp"/>
</div>