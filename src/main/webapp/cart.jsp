
<!doctype html>
<html>
<head>
<title>hello</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
    <h1>Dear ${cart.getUserName()}, your order:</h1>
    <% int i = 0; %>
    <c:forEach var="name" items="${cart.getFilling().keySet().toArray()}"><p><%= ++i%>) ${name} ${cart.getFilling().get(name)}</p></c:forEach>

    <p>Total: ${cart.getTotal()} <p>
</body>
</html>