<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="./header.jsp" />

	<hr />
	<p align="center">
		<jsp:include page="./menu.jsp" />
	</p>


	<div align="center">
		<table border="1">

			<thead>
				<tr>
					<th>Employee ID</th>
					<th>Employee Name</th>
					<th>Email Address</th>
					<th>Gender</th>
				</tr>
			</thead>

			<tbody>

				<c:forEach var="emp" items="${employees}">
					<tr>
						<td>${emp.id}</td>
						<td>${emp.firstName}</td>
						<td>${emp.email}</td>
						<td>${emp.gender}</td>
					</tr>

				</c:forEach>

			</tbody>

		</table>
	</div>



</body>
</html>