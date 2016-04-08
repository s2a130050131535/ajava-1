<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@tagliburi="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h2>Bhargavi</h2>
<h4>Enrollment No:130050131535</h4>
<h4>Testing Remove Core Tag</h4>
<c:set var="Flower" scope="session" value="${'Rose'}" />
<p>Before Remove Value: <c:out value="${Flower}" /></p>
<c:remove var="Flower" />
<p>After Remove Value: <c:out value="${Fruit}" /></p>
</body>
</html>

