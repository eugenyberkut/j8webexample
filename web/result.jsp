<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yevge
  Date: 01.04.2016
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <table border="1">
        <c:forEach var="name" items="${names}">
        <tr>
            <td>${name}</td>
        </tr>
        </c:forEach>
    </table>
    <hr/>
    <table border="1">
        <c:forEach var="line" items="${longNames}">
            <tr>
                <td>${line}</td>
            </tr>
        </c:forEach>
    </table>
     <hr/>
    <table border="1">
        <c:forEach var="n" items="${lens}">
            <tr>
                <td>${n}</td>
            </tr>
        </c:forEach>
    </table>
    <h1>Sum = ${sumLen}</h1>
    <h1>Sum = ${integral}</h1>
</body>
</html>
