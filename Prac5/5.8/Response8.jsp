<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<h2>Bhargavi</h2>
<h3>Enrollment No:130050131535</h3>
<h4>Testing Response object</h4>

<%
Boolean x=response.isCommitted();
if(x==true){
out.println("Response is committed");
        }
else{
out.println("Response is not committed");

        }
%>

</body>
</html>