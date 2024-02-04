<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Order</title>
</head>
<body>
<body>
<center>
<h1>Customer Order<h1><hr color="green">
	<div class="box">
		<div class="customer">
    <form action="req2" method="post">
		
        <label for="name">Name:</label>
			<input type="text" id="name" name="cname" required><br><br>
			
			<label for="email">Email:</label>
			<input type="email" id="email" name="cemail" required><br><br>
			
            <label for="Mobile">Mobile:</label>
			<input type="Mobile" id="Mobile" name="cphone" required><br><br>

            <label for="Address">Address:</label>
			<input type="Address" id="Address" name="caddress" required><br><br>

			<label for="product name">Product Name:</label>
			<input type="text" id="product name" name="cproductname" required><br><br>

			<label for="product name">Product Price:</label>
			<input type="text" id="product price" name="cprice" required><br><br>
			
			
			<label for="payment">Payment:</label>
			<input type="radio" id="UPI" name="cpayment" value="UPI">
			<label for="UPI">UPI</label>
			<input type="radio" id="cash on delivery" name="cpayment" value="cash on delivery">
			<label for="cash on delivery">Cash on Delivery</label><br><br>
			
			
			<input type="submit" value="Submit" name="submit">
    </form>
</div>
</div>
</center>
</body>
</html>