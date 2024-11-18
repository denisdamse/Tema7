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
	<p><c:out value="${order.id}"/></p>
	<p><c:out value="${order.destinationFrom}"/></p>
	<p><c:out value="${order.destinationTo}"/></p>
	<p><c:out value="${order.weight}"/></p>
</body>
</html>