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
	<h1>Phones</h1>
	<table border=1>
	<c:forEach var="phone" items="${phones}">
	<tr>
		<td><c:out value="${phone.id}"/></td>
		<td><c:out value="${phone.name}"/></td>
		<td><c:out value="${phone.yearReleased}"/></td>
		<td><c:out value="${phone.software}"/></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>