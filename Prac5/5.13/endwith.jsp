<%@ tagliburi="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ tagliburi="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL Functions</title>
</head>
<body>
<h2>Bhargavi</h2>
<h4>Enrollment no:130050131535</h4>
<c:set var="theString" value="I am a test String 123"/>
<c:if test="$ {fn:endsWith(theString, '123')}">
<p>String ends with 123<p>
</c:if>
<c:if test="$ {fn:endsWith(theString, 'TEST')}">
<p>String ends with TEST<p>
</c:if>
</body>
</html>
