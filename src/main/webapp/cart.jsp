<% int iterator = 0; %>

<!doctype html>
<html>
<head>
<title>hello</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<% request.getSession().setAttribute("check", "check");
   request.getServletContext().setAttribute("check", "check"); %>
    <h1>Dear ${name}, your order:</h1>
    <c:forEach var="name" items="${cart}"><p><%= ++iterator%>) ${name} </p></c:forEach>

    <p>Total: ${total} <p>
</body>
</html>