<%--
  Created by IntelliJ IDEA.
  User: tungdz
  Date: 08/06/2020
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<h1>Customer</h1>
<p>
    <a href="/customer?action=create">Create new Customer</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
        <tr>
            <td><a href="/customer?action=view&id=${customer.getID()}">${customer.getName()}</a></td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td><a href="/customer?action=edit&id=${customer.getID()}"></a></td>
            <td><a href="/customer?action=delete&id=${customer.getID()}"></a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
