<%@ tagliburi="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ tagliburi="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL Functions</title>
</head>
<body>
<h2>Bhargavi</h2>
<h3>Enrollment no:130050131535</h3>
<c:set var="string" value="Second: This is first String."/>
<c:if test="$ {fn:startsWith(string, 'First')}">
<p>String starts with First</p>
</c:if>
<br />
<c:if test="$ {fn:startsWith(string, 'Second')}">
<p>String starts with Second</p>
</c:if>
</body>
</html>
