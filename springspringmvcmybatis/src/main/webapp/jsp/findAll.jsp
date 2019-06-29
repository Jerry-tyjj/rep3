<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>工资</th>
    </tr>

    <c:forEach items="${accountList}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.money}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
