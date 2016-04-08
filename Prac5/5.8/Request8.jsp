<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP PAGE</title>
</head>
<body>
<h2>Bhargavi</h2>
<h4>Enrollment No:130050131535</h4>
<form method="GET">
<center>
Name:<input type="text"name="name"placeholder="Enter Name"/><br><br>
<input type="submit"value="Submit">
</center>
</form>
<%
out.print(request.getParameter("name"));
%>

</body>
</html>