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
	<p><c:out value="${phone.id}"/></p>
	<p><c:out value="${phone.name}"/></p>
	<p><c:out value="${phone.yearReleased}"/></p>
	<p><c:out value="${phone.software}"/></p>
</body>
</html>