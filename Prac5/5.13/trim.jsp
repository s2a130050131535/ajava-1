<%@ tagliburi="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ tagliburi="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Using JSTL Functions</title>
</head>
<body>
<h2>Bhargavi</h2>
<h3>Enrollment no:130050131535</h3>
<c:set var="string1" value="This is first String"/>
<p>String (1) Length : $ {fn:length(string1)}</p>
<c:set var="string2" value="$ {fn:trim(string1)}" />
<p>String (2) Length : $ {fn:length(string2)}</p>
<p>Final string : ${string2}</p>
</body>
</html>
