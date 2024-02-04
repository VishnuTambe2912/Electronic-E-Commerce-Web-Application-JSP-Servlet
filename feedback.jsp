<%@page import="com.dao.FeedbackDao,com.model.Feedback" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>
</head>
<body>
<center>
<h2>Feedback Details</h2><hr color="green">
<form action="req3" method="post">
<table border="1">
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Feedback</th>
<%for(Feedback f:new FeedbackDao().findAllFeedback()) { %>
<tr>
<td><%=f.getFid() %></td>
<td><%=f.getFname() %></td>
<td><%=f.getFemail() %></td>
<td><%=f.getFfeedback() %></td>
</tr>
<%} %>
</table>
</form>
</center>
</body>
</html>