<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback Form</title>
</head>
<body>
<center>
<h2>FeedBack Form</h2><hr color="green">
 <div class="box">
        <div class="customer">
            <form action="req3" method="post">
		
                <label for="name">Name:</label>
                    <input type="text" id="name" name="fname" required><br><br>
                    
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="femail" required><br><br>
                    
                    <label for="Your Feedback">Your Feedback:</label><br>
                    <textarea rows="5" cols="20" id="your feedback" name="ffeedback" required="required"></textarea>
                    <br><br>
                    
                    <input type="submit" value="Submit" name="submit">
                
            </form>
    </div>
</div>
</center>
</body>
</html>