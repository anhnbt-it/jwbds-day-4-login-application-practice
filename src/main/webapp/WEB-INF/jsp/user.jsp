<%--
  Created by IntelliJ IDEA.
  User: anhnbt
  Date: 14/12/2020
  Time: 09:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>Welcome</h1>
<p>Account: <c:out value="${user.account}"/></p>
<p>Name: <c:out value="${user.name}"/></p>
<p>Email: <c:out value="${user.email}"/></p>
<p>Age: <c:out value="${user.age}"/></p>
</body>
</html>
