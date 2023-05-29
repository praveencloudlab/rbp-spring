<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

		<form action="./saveEmployeev1" method="post">

			<div>
				<input name="firstName" placeholder="Employee First Name" />
			</div>

			<div>
				<input name="lastName" placeholder="Employee Last Name" />
			</div>
			<div>

				<input name="email" placeholder="Employee email ID" />
			</div>

			<div>

				<select name="gender">
					<option value="Male">Male</option>
					<option value="Female">Female</option>
				</select>
			</div>

			<div>
				<button>Save</button>
			</div>


		</form>
	</div>


</body>
</html>