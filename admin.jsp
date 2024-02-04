	<%@ page import="com.model.Admin" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="login.css">
    <title>Admin</title>
</head>
<body>
<%
Admin a=(Admin)request.getAttribute("a");
%>
	<center>
	<div class="box">
		<div class="customer">
    <form action="req1" method="post">
		<h2>Admin Details</h2><hr color="green">
		<label for="Id">ID:</label>
			<input type="number" id="Id" name="aid" value="<%=a.getAid() %>" readonly="readonly"><br><br>
		
        <label for="name">Name:</label>
			<input type="text" id="name" name="aname" value="<%=a.getAname()%>"><br><br>
			
			<label for="email">Email:</label>
			<input type="email" id="email" name="aemail" value="<%=a.getAemail()%>"><br><br>
			
			<label for="password">Password:</label>
			<input type="password" id="password" name="apassword" value="<%=a.getApassword()%>"><br><br>
			
			<label for="gender">Gender:</label>
			<%if(a.getAgender().equalsIgnoreCase("male")){ %>
			<input type="radio" id="male" name="agender" value="<%=a.getAgender()%>" checked="checked">
			<label for="male"><%=a.getAgender() %></label>
			<input type="radio" id="female" name="agender" value="female">
			<label for="female">Female</label><%}
			else
			{%>
			<input type="radio" name="agender" value="Male"><label for="male">Male</label>
			 <input type="radio" id="female" name="agender" value="Female" checked="checked">
			<label for="female">Female</label><%} %>
			<br><br>
			
		
    </form>
</div>
</div>
<hr>

<hr>
<a href="customerlist.jsp"><h2>List Of Customer</h2></a><hr>
<a href="feedback.jsp"><h2>View Feedbacks</h2></a><hr>


<div class="box">
		<div class="customer">
    <form action="req1" method="post">
		<h2>Admin Form</h2><hr color="green">
        <label for="name">Name:</label>
			<input type="text" id="name" name="aname" required><br><br>
			
			<label for="email">Email:</label>
			<input type="email" id="email" name="aemail" required><br><br>
			
			<label for="password">Password:</label>
			<input type="password" id="password" name="apassword" required><br><br>
			
			<label for="gender">Gender:</label>
			<input type="radio" id="male" name="agender" value="male">
			<label for="male">Male</label>
			<input type="radio" id="female" name="agender" value="female">
			<label for="female">Female</label><br><br>
			
			<input type="submit" value="Submit">
    </form>
</div>
</div>

</center>
</body>
</html>