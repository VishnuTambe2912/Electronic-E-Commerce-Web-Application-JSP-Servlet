<%@page import="com.dao.CustomerDao,com.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CustomerList</title>
</head>
<body>
<center>
<h2>List Of Customer</h2><hr color="green">
<form action="req2" method="post">
<table border="1">
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Contact</th>
<th>Address</th>
<th>Product Name</th>
<th>Price</th>
<th>Payment Mode</th>
<%for(Customer c:new CustomerDao().findAllCustomer()){ %>
<tr>
<td><%=c.getCid() %></td>
<td><%=c.getCname() %></td>
<td><%=c.getCemail() %></td>
<td><%=c.getCphone() %></td>
<td><%=c.getCaddress() %></td>
<td><%=c.getCproductname()%></td>
<td><%=c.getCprice()%></td>
<td><%=c.getCpayment()%></td>
</tr>
<%} %>
</table>
</form>
</center>
</body>
</html>