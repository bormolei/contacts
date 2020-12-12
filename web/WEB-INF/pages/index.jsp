<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Имя</th>
        <th>Инфо</th>
        <th>Номер</th>
        <th>Стим</th>
        <th>Мыло</th>
        <th>Скайп</th>

    </tr>
    <c:forEach var="row" items="${rows}">
        <tr>
            <td><a href="/user/id">${row.firstname}</a></td>
            <td>${row.info}</td>
            <td>${row.number}</td>
            <td>${row.steam}</td>
            <td>${row.mail}</td>
            <td>${row.skype}</td>
            <td>
                <input type="button" value="Удалить"
                        onClick='location.href="/deleteContact/${row.id}"'>
            </td>


        </tr>

    </c:forEach>
</table>
<input type="button" value="Добавить пользователя"
       onClick='location.href="/newContact"'>
</body>
</html>
