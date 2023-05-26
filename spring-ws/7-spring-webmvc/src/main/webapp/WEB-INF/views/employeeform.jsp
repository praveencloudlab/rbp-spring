<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Employee Form</h1>
	<hr />

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



</body>
</html>