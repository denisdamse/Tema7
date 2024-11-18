<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Orders</h1>
	<table border=1>
	<c:forEach var="order" items="${orders}">
	<tr>
		<td><c:out value="${order.id}"/></td>
		<td><c:out value="${order.destinationFrom}"/></td>
		<td><c:out value="${order.destinationTo}"/></td>
		<td><c:out value="${order.weight}"/></td>
		<td><a href="<c:url value='/order?id=${order.id}' />">Detalii</a>>
		</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>