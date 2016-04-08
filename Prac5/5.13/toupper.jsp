<%@ tagliburi="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ tagliburi="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL Functions</title>
</head>
<body>
<h2>Bhargavi</h2>
<h3>Enrollment no:130050131535</h3>
<c:set var="string1" value="This is first String."/>
<c:set var="string2" value="$ {fn:toUpperCase(string1)}" />
<p>Final string : ${string2}</p>
</body>
</html>
