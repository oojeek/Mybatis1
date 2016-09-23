<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>欢迎</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>姓名</th>
			<th>密码</th>
			<th>年龄</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="psn" items="${persons}">
			<tr>
				<td>${psn.name}</td>
				<td>${psn.password}</td>
				<td>${psn.age}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>