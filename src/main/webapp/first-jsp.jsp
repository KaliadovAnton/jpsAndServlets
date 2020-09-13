<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="anton.Good" %>


<!doctype html>
<html>
<head>
<title>hello</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
    <h1>Hello, <%= request.getSession().getAttribute("name") %>!</h1>
    <%  ArrayList<Good> goods = (ArrayList) request.getAttribute("goods");
        request.getSession().setAttribute("check", "check");
        request.getSession().setAttribute("name", request.getParameter("name"));
        %>
    <form action="/my-app/check" method="POST" name="shop-form">
    <select multiple name="select">
        <c:forEach var="good" items="${goods}">
            <option value="${good.getName()},${good.getPrice()},${name}">${good.getName()}, ${good.getPrice()} byn
            </option>
        </c:forEach>
    </select>
    <p><input type="submit" formaction="/my-app/temp-serv" name="addBtn" value="Add item"></p>
    <p><input type="submit" name="sendBtn" value="Submit"></p>
    </form>
</body>
</html>
