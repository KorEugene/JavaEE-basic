<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product list</title>
</head>
<body>
<h2>Product list</h2>
<%--@elvariable id="products" type="java.util.List"--%>
<c:forEach items="${products}" var="product">
<%--    <p>${product.id}, ${product.title}, ${product.cost}</p>--%>
    <p>${product}</p>
</c:forEach>
</body>
</html>
