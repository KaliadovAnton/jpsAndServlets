<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="anton.Good" %>

<% int pre = 0 ;%>

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
        request.getServletContext().setAttribute("check", "check");
        %>
        <c:forEach var="preorder" items="${preorders}">
            <%= ++pre%>) ${preorder}
        </c:forEach>
    <form action="/my-app/temp-serv" method="POST" name="shop-form">
    <select multiple name="select">
        <c:forEach var="good" items="${goods}">
            <option value="${good.getName()} ${good.getPrice()}">${good.getName()}, ${good.getPrice()} byn
            </option>
        </c:forEach>
    </select>
    <p><input type="submit" name="item" value="Add Item"></p>
    </form>
    <form action="/my-app/check" method="POST">
        <p><input type="submit" name="select" value="Submit"></p>
    </form>
</body>
</html>
